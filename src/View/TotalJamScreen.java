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
public class TotalJamScreen {

    public TotalJamScreen() {
        Controller c = new Controller();
        String nik = JOptionPane.showInputDialog(null, "Masukkan NIK Dosen");
        JOptionPane.showMessageDialog(null, c.totalJamController(nik));
    }
    
}
