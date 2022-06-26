package Model;

import java.util.ArrayList;

public class Dosen extends Staff{
    private String departemen;
    private ArrayList <MatkulAjar> matkul;

    public Dosen(String departemen, ArrayList<MatkulAjar> matkul, String nik, String nama, String alamat, String ttl, String telepon) {
        super(nik, nama, alamat, ttl, telepon);
        this.departemen = departemen;
        this.matkul = matkul;
    }

    @Override
    public String toString() {
        String n = "";
        for(int i = 0; i < getMatkul().size(); i++){
            MatkulAjar a = getMatkul().get(i);
            n += "\nmatkul " + (i+1) + a.toString();
        }
        return super.toString() + "\ndepartemen = " + getDepartemen() + "\nmatkul=" + n;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public ArrayList<MatkulAjar> getMatkul() {
        return matkul;
    }

    public void setMatkul(ArrayList<MatkulAjar> matkul) {
        this.matkul = matkul;
    }
    
    
}
