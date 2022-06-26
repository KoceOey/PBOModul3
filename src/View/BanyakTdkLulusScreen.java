/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.Controller;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class BanyakTdkLulusScreen {

    public BanyakTdkLulusScreen() {
        Controller c = new Controller();
        String kodeMK = JOptionPane.showInputDialog(null, "Masukkan kode mata kuliah");
        JOptionPane.showMessageDialog(null, c.banyakTdkLulusController(kodeMK));
    }
    
}
