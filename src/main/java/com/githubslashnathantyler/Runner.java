package com.githubslashnathantyler;

import com.githubslashnathantyler.controller.Bl3PtController;

import javax.swing.*;

public class Runner {

    public static void main(String[] args) {
        try {
           // UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        Bl3PtController bl3PtController = new Bl3PtController();
        bl3PtController.displayBl3PtWindow();

    }
}
