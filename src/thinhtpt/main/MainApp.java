package thinhtpt.main;

import thinhtpt.ui.PrepareUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ThinhTPT
 */
public class MainApp {

    public static void main(String[] args) {
        PrepareUI gui = new PrepareUI();
        gui.getWeather().setVisible(true);
    }
}
