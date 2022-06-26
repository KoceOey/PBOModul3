package Model;

import java.util.ArrayList;

public class MahasiswaSarjana extends Mahasiswa{
    private ArrayList <MatkulAmbil> matkul;

    public MahasiswaSarjana(ArrayList<MatkulAmbil> matkul, String nim, String jurusan, String nama, String alamat, String ttl, String telepon) {
        super(nim, jurusan, nama, alamat, ttl, telepon);
        this.matkul = matkul;
    }

    @Override
    public String toString() {
        String n = "";
        for(int i = 0; i < getMatkul().size(); i++){
            MatkulAmbil a = getMatkul().get(i);
            n += "\nmatkul " + (i+1) + a.toString();
        }
        return super.toString() + "\nmatkul=" + n;
    }

    public ArrayList<MatkulAmbil> getMatkul() {
        return matkul;
    }

    public void setMatkul(ArrayList<MatkulAmbil> matkul) {
        this.matkul = matkul;
    }
    
    
}
