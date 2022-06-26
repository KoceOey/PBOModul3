package Model;

import java.util.ArrayList;

public class MatkulAjar {
    private MataKuliah matkul;
    private ArrayList <PresensiStaff> presensi;

    public MatkulAjar(MataKuliah matkul, ArrayList<PresensiStaff> presensi) {
        this.matkul = matkul;
        this.presensi = presensi;
    }

    @Override
    public String toString() {
        String n = "";
        for(int i = 0; i < presensi.size(); i++){
            PresensiStaff x = presensi.get(i);
            n += x.toString();
        }
        return matkul.toString() + "\npresensi=" + n;
    }

    public MataKuliah getMatkul() {
        return matkul;
    }

    public void setMatkul(MataKuliah matkul) {
        this.matkul = matkul;
    }

    public ArrayList <PresensiStaff> getPresensi() {
        return presensi;
    }

    public void setPresensi(ArrayList <PresensiStaff> presensi) {
        this.presensi = presensi;
    }
    
    
}
