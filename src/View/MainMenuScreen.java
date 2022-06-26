package View;

import javax.swing.JOptionPane;

public class MainMenuScreen {
    
    public MainMenuScreen() {
        showMainMenu();
    }
    
    private void showMainMenu() {
        Boolean menu = true;
        while(menu) {
            int choosen = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Menu: \n1.Print User Data \n2.Print Nilai Akhir \n3.Print Rata-Rata nilai Akhir \n4.Print Mahasiswa Tdk Lulus \n5.Print Matkul Mahasiswa\n6.Print total jam ajar\n7.Print Gaji\n8.Exit"));
            switch(choosen) {
                case 1: new UserDataScreen();
                    break;
                case 2: new NilaiAkhirScreen();
                    break;
                case 3: new RataNAScreen();
                    break;
                case 4: new BanyakTdkLulusScreen();
                    break;
                case 5: new MatkulAmbilScreen();
                    break;
                case 6: new TotalJamScreen();
                    break;
                case 7: new GajiScreen();
                    break;
                case 8:menu=false;
                    break;
            }
        }
    }

}
