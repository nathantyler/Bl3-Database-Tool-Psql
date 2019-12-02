package com.githubslashnathantyler.view;

import javax.swing.*;
import java.awt.*;

public class Bl3PTFrame extends JFrame {
    public static final String TITLE = "BL3 Postgres Tool";
    public static final int WIDTH = 400;
    public static final int HEIGHT = 400;

    private JTextField tableNameFld;
    private JLabel tableNameLbl;
    private JPanel mainPanel;
    private JComboBox manufacturerCB;
    private JComboBox typeCB;
    private JLabel manufacturerLbl;
    private JLabel typeLbl;
    private JCheckBox canBeNoElem;
    private JCheckBox canBeFire;
    private JCheckBox canBeCorrosive;
    private JCheckBox canBeShock;
    private JCheckBox canBeCryo;
    private JCheckBox canBeRad;
    private JComboBox rarityCB;
    private JLabel rarityLbl;
    private JTextField filePathFld;
    private JButton chooseFileBtn;
    private JButton saveEntryBtn;
    private JTabbedPane gunNamesPane;
    private JPanel gunNamesTab;
    private JPanel gunEntriesTab;

    public Bl3PTFrame() throws HeadlessException {
        setSize(WIDTH, HEIGHT);
        setTitle(TITLE);
        setContentPane(mainPanel);
        setLocationRelativeTo(null);
    }

    public JTextField getTableNameFld() {
        return tableNameFld;
    }

    public JLabel getTableNameLbl() {
        return tableNameLbl;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JComboBox getManufacturerCB() {
        return manufacturerCB;
    }

    public JComboBox getTypeCB() {
        return typeCB;
    }

    public JLabel getManufacturerLbl() {
        return manufacturerLbl;
    }

    public JLabel getTypeLbl() {
        return typeLbl;
    }

    public JCheckBox getCanBeNoElem() {
        return canBeNoElem;
    }

    public JCheckBox getCanBeFire() {
        return canBeFire;
    }

    public JCheckBox getCanBeCorrosive() {
        return canBeCorrosive;
    }

    public JCheckBox getCanBeShock() {
        return canBeShock;
    }

    public JCheckBox getCanBeCryo() {
        return canBeCryo;
    }

    public JCheckBox getCanBeRad() {
        return canBeRad;
    }

    public JComboBox getRarityCB() {
        return rarityCB;
    }

    public JLabel getRarityLbl() {
        return rarityLbl;
    }

    public JTextField getFilePathFld() {
        return filePathFld;
    }

    public JButton getChooseFileBtn() {
        return chooseFileBtn;
    }

    public JButton getSaveEntryBtn() {
        return saveEntryBtn;
    }

    public JTabbedPane getGunNamesPane() {
        return gunNamesPane;
    }

    public JPanel getGunNamesTab() {
        return gunNamesTab;
    }

    public JPanel getGunEntriesTab() {
        return gunEntriesTab;
    }

}
