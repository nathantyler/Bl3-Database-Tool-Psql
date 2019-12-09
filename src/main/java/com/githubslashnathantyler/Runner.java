package com.githubslashnathantyler;

import com.githubslashnathantyler.model.Bl3Manufacturer;

public class Runner {

    public static void main(String[] args) {
//        try {
//           // UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
//            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//        } catch (ClassNotFoundException | InstantiationException |
//                IllegalAccessException | UnsupportedLookAndFeelException e) {
//            e.printStackTrace();
//        }
//
//        Bl3PtController bl3PtController = new Bl3PtController();
//        bl3PtController.displayBl3PtWindow();
        Bl3Manufacturer man = new Bl3Manufacturer();
        man.setAll("Atlas", true, false,
                   false, true, false,
                   true, false, true);
        System.out.println(man.generateInsert("bl3_manufacturer"));

    }
}
