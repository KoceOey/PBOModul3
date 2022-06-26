/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.*;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class UserDataScreen {
    
    public UserDataScreen(){
        Controller c = new Controller();
        String nama = JOptionPane.showInputDialog(null, "Masukkan nama user yang ingin di print");
        JOptionPane.showMessageDialog(null, c.userDataController(nama));
    }
}
