package com.githubslashnathantyler.view;

import com.githubslashnathantyler.model.*;

import javax.swing.*;
import java.awt.*;


public class Bl3PTFrame extends JFrame {
    public static final String TITLE  = "BL3 Postgres Tool";
    public static final int    WIDTH  = 600;
    public static final int    HEIGHT = 600;

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
    private JCheckBox                  canBeNoElem;
    private JCheckBox                  canBeFire;
    private JCheckBox                  canBeCorrosive;
    private JCheckBox                  canBeShock;
    private JCheckBox                  canBeCryo;
    private JCheckBox                  canBeRad;
    private JLabel                     rarityLbl;
    private JComboBox                  rarityCB;
    private JCheckBox                  isWorldDrop;
    private JLabel                     wpnNameLbl;
    private JTextField                 wpnNameFld;
    private JButton                    saveEntryBtn;


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

    {
        // GUI initializer generated by IntelliJ IDEA GUI Designer
        // >>> IMPORTANT!! <<<
        // DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        tabChoicesPane = new JTabbedPane();
        mainPanel.add(tabChoicesPane, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1,
                                                                                       com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER,
                                                                                       com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH,
                                                                                       com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK |
                                                                                       com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
                                                                                       com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK |
                                                                                       com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
                                                                                       null, new Dimension(200, 200),
                                                                                       null, 0, false));
        gunNamesTab = new JPanel();
        gunNamesTab
                .setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(12, 3, new Insets(0, 0, 0, 0), -1, -1));
        tabChoicesPane.addTab("Save Weapon Names", gunNamesTab);
        tableNameLbl = new JLabel();
        tableNameLbl.setHorizontalAlignment(10);
        tableNameLbl.setText("Table Name");
        gunNamesTab.add(tableNameLbl, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1,
                                                                                       com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST,
                                                                                       com.intellij.uiDesigner.core.GridConstraints.FILL_NONE,
                                                                                       com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED,
                                                                                       com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED,
                                                                                       null, null, null, 0, false));
        tableNameFld = new JTextField();
        tableNameFld.setEditable(true);
        tableNameFld.setText("Enter table name here");
        gunNamesTab.add(tableNameFld, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1,
                                                                                       com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER,
                                                                                       com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL,
                                                                                       com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW,
                                                                                       com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED,
                                                                                       null, new Dimension(150, -1),
                                                                                       null, 0, false));
        chooseFileBtn = new JButton();
        chooseFileBtn.setText("Choose file to save to");
        chooseFileBtn.setToolTipText("Choose the file where you want to save these database insert queries.");
        gunNamesTab.add(chooseFileBtn, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1,
                                                                                        com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER,
                                                                                        com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL,
                                                                                        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK |
                                                                                        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
                                                                                        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED,
                                                                                        null, null, null, 0, false));
        manufacturerLbl = new JLabel();
        manufacturerLbl.setText("Choose Manufacturer");
        gunNamesTab.add(manufacturerLbl, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1,
                                                                                          com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTHWEST,
                                                                                          com.intellij.uiDesigner.core.GridConstraints.FILL_NONE,
                                                                                          com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED,
                                                                                          com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED,
                                                                                          null, null, null, 0, false));
        manufacturerCB = new JComboBox();
        gunNamesTab.add(manufacturerCB, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1,
                                                                                         com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST,
                                                                                         com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL,
                                                                                         com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
                                                                                         com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED,
                                                                                         null, null, null, 0, false));
        filePathFld = new JTextField();
        filePathFld.setEditable(false);
        filePathFld.setText("File path");
        gunNamesTab.add(filePathFld, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 1,
                                                                                      com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST,
                                                                                      com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL,
                                                                                      com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW,
                                                                                      com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED,
                                                                                      null, new Dimension(150, -1),
                                                                                      null, 0, false));
        typeLbl = new JLabel();
        typeLbl.setText("Choose gun Type");
        gunNamesTab.add(typeLbl, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1,
                                                                                  com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTHWEST,
                                                                                  com.intellij.uiDesigner.core.GridConstraints.FILL_NONE,
                                                                                  com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED,
                                                                                  com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED,
                                                                                  null, null, null, 0, false));
        typeCB = new JComboBox();
        gunNamesTab.add(typeCB, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 1,
                                                                                 com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST,
                                                                                 com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL,
                                                                                 com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
                                                                                 com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED,
                                                                                 null, null, null, 0, false));
        rarityLbl = new JLabel();
        rarityLbl.setText("Choose rarity (default legendary)");
        gunNamesTab.add(rarityLbl, new com.intellij.uiDesigner.core.GridConstraints(6, 0, 1, 1,
                                                                                    com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTHWEST,
                                                                                    com.intellij.uiDesigner.core.GridConstraints.FILL_NONE,
                                                                                    com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED,
                                                                                    com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED,
                                                                                    null, null, null, 0, false));
        rarityCB = new JComboBox();
        gunNamesTab.add(rarityCB, new com.intellij.uiDesigner.core.GridConstraints(7, 0, 1, 1,
                                                                                   com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST,
                                                                                   com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL,
                                                                                   com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
                                                                                   com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED,
                                                                                   null, null, null, 0, false));
        canBeNoElem = new JCheckBox();
        canBeNoElem.setText("Can spawn with no element");
        gunNamesTab.add(canBeNoElem, new com.intellij.uiDesigner.core.GridConstraints(2, 2, 1, 1,
                                                                                      com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST,
                                                                                      com.intellij.uiDesigner.core.GridConstraints.FILL_NONE,
                                                                                      com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK |
                                                                                      com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
                                                                                      com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED,
                                                                                      null, null, null, 0, false));
        canBeFire = new JCheckBox();
        canBeFire.setText("Can spawn as fire");
        gunNamesTab.add(canBeFire, new com.intellij.uiDesigner.core.GridConstraints(3, 2, 1, 1,
                                                                                    com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST,
                                                                                    com.intellij.uiDesigner.core.GridConstraints.FILL_NONE,
                                                                                    com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK |
                                                                                    com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
                                                                                    com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED,
                                                                                    null, null, null, 0, false));
        canBeCorrosive = new JCheckBox();
        canBeCorrosive.setText("Can spawn as corrosive");
        gunNamesTab.add(canBeCorrosive, new com.intellij.uiDesigner.core.GridConstraints(4, 2, 1, 1,
                                                                                         com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST,
                                                                                         com.intellij.uiDesigner.core.GridConstraints.FILL_NONE,
                                                                                         com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK |
                                                                                         com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
                                                                                         com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED,
                                                                                         null, null, null, 0, false));
        canBeShock = new JCheckBox();
        canBeShock.setText("Can spawn as shock");
        gunNamesTab.add(canBeShock, new com.intellij.uiDesigner.core.GridConstraints(5, 2, 1, 1,
                                                                                     com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST,
                                                                                     com.intellij.uiDesigner.core.GridConstraints.FILL_NONE,
                                                                                     com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK |
                                                                                     com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
                                                                                     com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED,
                                                                                     null, null, null, 0, false));
        canBeRad = new JCheckBox();
        canBeRad.setText("Can spawn as radiation");
        gunNamesTab.add(canBeRad, new com.intellij.uiDesigner.core.GridConstraints(6, 2, 1, 1,
                                                                                   com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST,
                                                                                   com.intellij.uiDesigner.core.GridConstraints.FILL_NONE,
                                                                                   com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK |
                                                                                   com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
                                                                                   com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED,
                                                                                   null, null, null, 0, false));
        canBeCryo = new JCheckBox();
        canBeCryo.setText("Can spawn as cryo");
        gunNamesTab.add(canBeCryo, new com.intellij.uiDesigner.core.GridConstraints(7, 2, 1, 1,
                                                                                    com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST,
                                                                                    com.intellij.uiDesigner.core.GridConstraints.FILL_NONE,
                                                                                    com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK |
                                                                                    com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
                                                                                    com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED,
                                                                                    null, null, null, 0, false));
        saveEntryBtn = new JButton();
        saveEntryBtn.setEnabled(false);
        saveEntryBtn.setText("Save entry to file");
        saveEntryBtn.setToolTipText(
                "Clicking this will save the database query to save the current values to the database table selected" +
                " above.");
        gunNamesTab.add(saveEntryBtn, new com.intellij.uiDesigner.core.GridConstraints(11, 0, 1, 3,
                                                                                       com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER,
                                                                                       com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL,
                                                                                       com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK |
                                                                                       com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
                                                                                       com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED,
                                                                                       null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        gunNamesTab.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 10, 1,
                                                                                  com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER,
                                                                                  com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL,
                                                                                  1,
                                                                                  com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW,
                                                                                  null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer2 = new com.intellij.uiDesigner.core.Spacer();
        gunNamesTab.add(spacer2, new com.intellij.uiDesigner.core.GridConstraints(10, 0, 1, 3,
                                                                                  com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER,
                                                                                  com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL,
                                                                                  com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW,
                                                                                  1, null, null, null, 0, false));
        wpnNameLbl = new JLabel();
        wpnNameLbl.setText("Weapon name");
        gunNamesTab.add(wpnNameLbl, new com.intellij.uiDesigner.core.GridConstraints(9, 0, 1, 1,
                                                                                     com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST,
                                                                                     com.intellij.uiDesigner.core.GridConstraints.FILL_NONE,
                                                                                     com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED,
                                                                                     com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED,
                                                                                     null, null, null, 0, false));
        wpnNameFld = new JTextField();
        gunNamesTab.add(wpnNameFld, new com.intellij.uiDesigner.core.GridConstraints(9, 2, 1, 1,
                                                                                     com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST,
                                                                                     com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL,
                                                                                     com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW,
                                                                                     com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED,
                                                                                     null, new Dimension(150, -1), null,
                                                                                     0, false));
        isWorldDrop = new JCheckBox();
        isWorldDrop.setSelected(true);
        isWorldDrop.setText("World Drop");
        gunNamesTab.add(isWorldDrop, new com.intellij.uiDesigner.core.GridConstraints(8, 2, 1, 1,
                                                                                      com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST,
                                                                                      com.intellij.uiDesigner.core.GridConstraints.FILL_NONE,
                                                                                      com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK |
                                                                                      com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
                                                                                      com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED,
                                                                                      null, null, null, 0, false));
        gunEntriesTab = new JPanel();
        gunEntriesTab
                .setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        tabChoicesPane.addTab("Create Weapon Entries", gunEntriesTab);
        tableNameLbl.setLabelFor(tableNameFld);
        manufacturerLbl.setLabelFor(manufacturerCB);
        typeLbl.setLabelFor(typeCB);
        rarityLbl.setLabelFor(rarityCB);
        wpnNameLbl.setLabelFor(wpnNameFld);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() { return mainPanel; }

}
