package com.githubslashnathantyler.controller;

import com.githubslashnathantyler.view.Bl3PTFrame;

public class Bl3PtController {

    private Bl3PTFrame bl3PtFrame;

    public Bl3PtController() {
        this.bl3PtFrame = new Bl3PTFrame();
    }

    public void displayBl3PtWindow() {
        bl3PtFrame.setVisible(true);
    }
}
