package com.githubslashnathantyler.controller;

import com.githubslashnathantyler.model.*;
import com.githubslashnathantyler.repositories.*;
import com.githubslashnathantyler.view.*;

import javax.persistence.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Bl3PtController {
    public static final int FONT_SIZE_MULTIPLE = 4;

    public static final String PISTOL  = "Pistol";
    public static final String SMG     = "SMG";
    public static final String AR      = "Assault Rifle";
    public static final String SHOTGUN = "Shotgun";
    public static final String SNIPER  = "Sniper";
    public static final String RL      = "Rocket Launcher";
    public static final String GRENADE = "Grenade";
    public static final String SHIELD  = "Shield";

    private JPanel                     mainPanel;
    private JTabbedPane                tabChoicesPane;
    private JPanel                     gunNamesTab;
    private JPanel                     gunEntriesTab;
    private JLabel                     tableNameLbl;
    private JTextField                 tableNameFld;
    private JTextField                 filePathFld;
    private JButton                    chooseFileBtn;
    private JLabel                     manufacturerLbl;
    private JComboBox<Bl3Manufacturer> manufacturerCB;
    private JLabel                     typeLbl;
    private JComboBox<String>          typeCB;
    private JLabel                     rarityLbl;
    private JComboBox<String>          rarityCB;
    private JCheckBox                  canBeNoElem;
    private JCheckBox                  canBeFire;
    private JCheckBox                  canBeCorrosive;
    private JCheckBox                  canBeShock;
    private JCheckBox                  canBeCryo;
    private JCheckBox                  canBeRad;
    private JCheckBox                  isWorldDrop;
    private JLabel                     wpnNameLbl;
    private JTextField                 wpnNameFld;
    private JButton                    saveEntryBtn;
    private JFileChooser               fileChooser;

    private File           file;
    private FileWriter     fw;
    private BufferedWriter bw;

    private EntityManagerFactory      managerFactory;
    private EntityManager             manager;
    private Bl3ManufacturerRepository mRep;

    private Bl3PTFrame bl3PtFrame;

    public Bl3PtController() {
        managerFactory = Persistence.createEntityManagerFactory("BL3-Items");
        manager        = managerFactory.createEntityManager();
        mRep           = new Bl3ManufacturerRepository(manager);

        this.bl3PtFrame = new Bl3PTFrame();
        fileChooser     = new JFileChooser();

        bl3PtFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        giveCloseOperation();
        initializeJObjects();

        //        Bl3Manufacturer man = new Bl3Manufacturer();
        //        man.setAll("Atlas", true, false,
        //                   false, true, false,
        //                   true, false, true);
        //        manufacturerCB.addItem(man);
        mRep.findAll().forEach(manufacturer -> manufacturerCB.addItem(manufacturer));
        giveChooseFileListener();
        giveSaveEntryListener();
        giveItemChangedListenerToManufacturerCB();
        //setFontSizeWithMultiple(FONT_SIZE_MULTIPLE);
    }

    private void giveCloseOperation() {
        bl3PtFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                exitProcedure();
            }

            private void exitProcedure() {
                try {
                    if (fw != null)
                        fw.close();
                    if (bw != null)
                        bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                bl3PtFrame.dispose();
                System.exit(0);
            }
        });
    }

    private void initializeJObjects() {
        mainPanel       = bl3PtFrame.getMainPanel();
        tabChoicesPane  = bl3PtFrame.getTabChoicesPane();
        gunNamesTab     = bl3PtFrame.getGunNamesTab();
        gunEntriesTab   = bl3PtFrame.getGunEntriesTab();
        tableNameLbl    = bl3PtFrame.getTableNameLbl();
        tableNameFld    = bl3PtFrame.getTableNameFld();
        filePathFld     = bl3PtFrame.getFilePathFld();
        chooseFileBtn   = bl3PtFrame.getChooseFileBtn();
        manufacturerLbl = bl3PtFrame.getManufacturerLbl();
        manufacturerCB  = bl3PtFrame.getManufacturerCB();
        typeLbl         = bl3PtFrame.getTypeLbl();
        typeCB          = bl3PtFrame.getTypeCB();
        rarityLbl       = bl3PtFrame.getRarityLbl();
        rarityCB        = bl3PtFrame.getRarityCB();
        canBeNoElem     = bl3PtFrame.getCanBeNoElem();
        canBeFire       = bl3PtFrame.getCanBeFire();
        canBeCorrosive  = bl3PtFrame.getCanBeCorrosive();
        canBeShock      = bl3PtFrame.getCanBeShock();
        canBeRad        = bl3PtFrame.getCanBeRad();
        canBeCryo       = bl3PtFrame.getCanBeCryo();
        isWorldDrop     = bl3PtFrame.getIsWorldDrop();
        wpnNameLbl      = bl3PtFrame.getWpnNameLbl();
        wpnNameFld      = bl3PtFrame.getWpnNameFld();
        saveEntryBtn    = bl3PtFrame.getSaveEntryBtn();
    }

    private void giveChooseFileListener() {
        chooseFileBtn.addActionListener(event -> {
            int returnVal = fileChooser.showOpenDialog(bl3PtFrame);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                file = fileChooser.getSelectedFile();
                try {
                    if (fw != null)
                        fw.close();
                    if (bw != null)
                        bw.close();
                    fw = new FileWriter(file, true);
                    bw = new BufferedWriter(fw);
                    filePathFld.setText(file.getAbsolutePath());
                    saveEntryBtn.setEnabled(true);
                    // System.out.println(file);
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "File error.");
                }
            } /*else {
                JOptionPane.showMessageDialog(null, "No file selected!");
            }*/
        });
    }

    private void giveSaveEntryListener() {
        saveEntryBtn.addActionListener(event -> {
            if (file != null) {
                try {
                    bw.write(((Bl3Manufacturer) manufacturerCB.getSelectedItem()).generateInsert("bl3_manufacturer"));
                    bw.newLine();
                    bw.flush();
                    JOptionPane.showMessageDialog(null, "Wrote to file");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void giveItemChangedListenerToManufacturerCB() {
        manufacturerCB.addItemListener(event -> {
            if (event.getStateChange() == ItemEvent.SELECTED) {
                typeCB.removeAllItems();
                Bl3Manufacturer manufacturer = (Bl3Manufacturer) manufacturerCB.getSelectedItem();
                if (manufacturer.getPistolMaker())
                    typeCB.addItem(PISTOL);
                if (manufacturer.getSmgMaker())
                    typeCB.addItem(SMG);
                if (manufacturer.getArMaker())
                    typeCB.addItem(AR);
                if (manufacturer.getShotgunMaker())
                    typeCB.addItem(SHOTGUN);
                if (manufacturer.getSniperMaker())
                    typeCB.addItem(SNIPER);
                if (manufacturer.getRlMaker())
                    typeCB.addItem(RL);
                if (manufacturer.getGrenadeMaker())
                    typeCB.addItem(GRENADE);
                if (manufacturer.getShieldMaker())
                    typeCB.addItem(SHIELD);

            }
        });
    }

    public void displayBl3PtWindow() {
        bl3PtFrame.setVisible(true);
    }

    private void setFontSizeWithMultiple(int mult) {
        //canBeNoElem.setFont(canBeNoElem.getFont().deriveFont(canBeNoElem.getFont().getSize() * mult));
    }


}
