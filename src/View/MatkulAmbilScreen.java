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
public class MatkulAmbilScreen {

    public MatkulAmbilScreen() {
        Controller c = new Controller();
        String nim = JOptionPane.showInputDialog(null, "Masukkan Nim Mahasiswa");
        JOptionPane.showMessageDialog(null, c.matkulAmbilController(nim));
    }
    
}
