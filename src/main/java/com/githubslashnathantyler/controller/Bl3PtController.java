package com.githubslashnathantyler.controller;

import com.githubslashnathantyler.model.Bl3Manufacturer;
import com.githubslashnathantyler.view.Bl3PTFrame;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Bl3PtController {
    public static final int FONT_SIZE_MULTIPLE = 4;

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
    private JComboBox                  typeCB;
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

    private Bl3PTFrame bl3PtFrame;

    public Bl3PtController() {
        this.bl3PtFrame = new Bl3PTFrame();
        fileChooser = new JFileChooser();
        bl3PtFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        giveCloseOperation();
        initializeJObjects();
        giveChooseFileListener();
        giveSaveEntryListener();
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
                    System.out.println("Prblem");
                }
                bl3PtFrame.dispose();
                System.exit(0);
            }
        });
    }

    private void giveSaveEntryListener() {
        saveEntryBtn.addActionListener(event -> {
            if (file != null) {
                try {
                    bw.write(wpnNameFld.getText());
                    bw.newLine();
                    bw.flush();
                    JOptionPane.showMessageDialog(null, "Wrote to file");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
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
            ;
        });
    }

    public void displayBl3PtWindow() {
        bl3PtFrame.setVisible(true);
    }

    private void initializeJObjects() {
        mainPanel = bl3PtFrame.getMainPanel();
        tabChoicesPane = bl3PtFrame.getTabChoicesPane();
        gunNamesTab = bl3PtFrame.getGunNamesTab();
        gunEntriesTab = bl3PtFrame.getGunEntriesTab();
        tableNameLbl = bl3PtFrame.getTableNameLbl();
        tableNameFld = bl3PtFrame.getTableNameFld();
        filePathFld = bl3PtFrame.getFilePathFld();
        chooseFileBtn = bl3PtFrame.getChooseFileBtn();
        manufacturerLbl = bl3PtFrame.getManufacturerLbl();
        manufacturerCB = bl3PtFrame.getManufacturerCB();
        typeLbl = bl3PtFrame.getTypeLbl();
        typeCB = bl3PtFrame.getTypeCB();
        rarityLbl = bl3PtFrame.getRarityLbl();
        rarityCB = bl3PtFrame.getRarityCB();
        canBeNoElem = bl3PtFrame.getCanBeNoElem();
        canBeFire = bl3PtFrame.getCanBeFire();
        canBeCorrosive = bl3PtFrame.getCanBeCorrosive();
        canBeShock = bl3PtFrame.getCanBeShock();
        canBeRad = bl3PtFrame.getCanBeRad();
        canBeCryo = bl3PtFrame.getCanBeCryo();
        isWorldDrop = bl3PtFrame.getIsWorldDrop();
        wpnNameLbl = bl3PtFrame.getWpnNameLbl();
        wpnNameFld = bl3PtFrame.getWpnNameFld();
        saveEntryBtn = bl3PtFrame.getSaveEntryBtn();
    }

    private void setFontSizeWithMultiple(int mult) {
        //canBeNoElem.setFont(canBeNoElem.getFont().deriveFont(canBeNoElem.getFont().getSize() * mult));
    }


}
