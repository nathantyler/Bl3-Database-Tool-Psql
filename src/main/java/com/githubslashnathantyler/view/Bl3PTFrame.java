package com.githubslashnathantyler.view;

import javax.swing.*;
import java.awt.*;

public class Bl3PTFrame extends JFrame {
    public static final String TITLE  = "BL3 Postgres Tool";
    public static final int    WIDTH  = 600;
    public static final int    HEIGHT = 600;

    private JPanel      mainPanel;
    private JTabbedPane tabChoicesPane;
    private JPanel      gunNamesTab;
    private JPanel      gunEntriesTab;
    private JLabel      tableNameLbl;
    private JTextField  tableNameFld;
    private JTextField  filePathFld;
    private JButton     chooseFileBtn;
    private JLabel      manufacturerLbl;
    private JComboBox   manufacturerCB;
    private JLabel      typeLbl;
    private JComboBox   typeCB;
    private JCheckBox   canBeNoElem;
    private JCheckBox   canBeFire;
    private JCheckBox   canBeCorrosive;
    private JCheckBox   canBeShock;
    private JCheckBox   canBeCryo;
    private JCheckBox   canBeRad;
    private JLabel      rarityLbl;
    private JComboBox   rarityCB;
    private JCheckBox   isWorldDrop;
    private JLabel      wpnNameLbl;
    private JTextField  wpnNameFld;
    private JButton     saveEntryBtn;


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

    public JTabbedPane getTabChoicesPane() {
        return tabChoicesPane;
    }

    public JPanel getGunNamesTab() {
        return gunNamesTab;
    }

    public JPanel getGunEntriesTab() {
        return gunEntriesTab;
    }

    public JTextField getWpnNameFld() {
        return wpnNameFld;
    }

    public JLabel getWpnNameLbl() {
        return wpnNameLbl;
    }

    public JCheckBox getIsWorldDrop() {
        return isWorldDrop;
    }
}
