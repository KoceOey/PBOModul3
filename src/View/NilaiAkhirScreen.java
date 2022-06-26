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
public class NilaiAkhirScreen {

    public NilaiAkhirScreen() {
        Controller c = new Controller();
        String nim = JOptionPane.showInputDialog(null, "Masukkan Nim Mahasiswa");
        String kodeMK = JOptionPane.showInputDialog(null, "Masukkan Kode Mata Kuliah");
        JOptionPane.showMessageDialog(null, c.hitungNA(nim,kodeMK));
    }
    
}
