package Model;

import java.util.ArrayList;

public class MahasiswaMagister extends MahasiswaSarjana {
    private String judulTesis;

    public MahasiswaMagister(ArrayList<MatkulAmbil> matkul, String judulTesis, String nim, String jurusan, String nama, String alamat, String ttl, String telepon) {
        super(matkul,nim, jurusan, nama, alamat, ttl, telepon);
        this.judulTesis = judulTesis;
    }

    @Override
    public String toString() {
        return super.toString() + "\njudulTesis=" + getJudulTesis();
    }


    public String getJudulTesis() {
        return judulTesis;
    }

    public void setJudulTesis(String judulTesis) {
        this.judulTesis = judulTesis;
    }
    
    
}
