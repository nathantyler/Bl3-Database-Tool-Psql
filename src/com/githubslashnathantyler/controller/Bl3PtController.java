package com.githubslashnathantyler.controller;

import com.githubslashnathantyler.view.Bl3PTFrame;

import javax.swing.*;

public class Bl3PtController {
    public static final int FONT_SIZE_MULTIPLE = 4;
    private JPanel mainPanel;
    private JTabbedPane tabChoicesPane;
    private JPanel gunNamesTab;
    private JPanel gunEntriesTab;
    private JLabel tableNameLbl;
    private JTextField tableNameFld;
    private JTextField filePathFld;
    private JButton chooseFileBtn;
    private JLabel manufacturerLbl;
    private JComboBox manufacturerCB;
    private JLabel typeLbl;
    private JComboBox typeCB;
    private JLabel rarityLbl;
    private JComboBox rarityCB;
    private JCheckBox canBeNoElem;
    private JCheckBox canBeFire;
    private JCheckBox canBeCorrosive;
    private JCheckBox canBeShock;
    private JCheckBox canBeCryo;
    private JCheckBox canBeRad;
    private JTextField wpnNameFld;
    private JLabel wpnNameLbl;
    private JButton saveEntryBtn;

    private Bl3PTFrame bl3PtFrame;

    public Bl3PtController() {
        this.bl3PtFrame = new Bl3PTFrame();
        bl3PtFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initializeJObjects();
        //setFontSizeWithMultiple(FONT_SIZE_MULTIPLE);
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
        wpnNameFld = bl3PtFrame.getWpnNameFld();
        wpnNameLbl = bl3PtFrame.getWpnNameLbl();
        saveEntryBtn = bl3PtFrame.getSaveEntryBtn();
    }

    private void setFontSizeWithMultiple(int mult) {
        //canBeNoElem.setFont(canBeNoElem.getFont().deriveFont(canBeNoElem.getFont().getSize() * mult));
    }


}
