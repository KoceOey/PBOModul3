package Model;

public class MahasiswaDoktor extends Mahasiswa{
    private String judulDisertasi;
    private int nilaiSidang1;
    private int nilaiSidang2;
    private int nilaiSidang3;

    public MahasiswaDoktor(String judulDisertasi, int nilaiSidang1, int nilaiSidang2, int nilaiSidang3, String nim, String jurusan, String nama, String alamat, String ttl, String telepon) {
        super(nim, jurusan, nama, alamat, ttl, telepon);
        this.judulDisertasi = judulDisertasi;
        this.nilaiSidang1 = nilaiSidang1;
        this.nilaiSidang2 = nilaiSidang2;
        this.nilaiSidang3 = nilaiSidang3;
    }

    @Override
    public String toString() {
        return super.toString() + "\njudulDisertasi=" + getJudulDisertasi() + "\nnilaiSidang1=" + getNilaiSidang1() + "\nnilaiSidang2=" + getNilaiSidang2() + "\nnilaiSidang3=" + getNilaiSidang3();
    }

    public String getJudulDisertasi() {
        return judulDisertasi;
    }

    public void setJudulDisertasi(String judulDisertasi) {
        this.judulDisertasi = judulDisertasi;
    }

    public int getNilaiSidang1() {
        return nilaiSidang1;
    }

    public void setNilaiSidang1(int nilaiSidang1) {
        this.nilaiSidang1 = nilaiSidang1;
    }

    public int getNilaiSidang2() {
        return nilaiSidang2;
    }

    public void setNilaiSidang2(int nilaiSidang2) {
        this.nilaiSidang2 = nilaiSidang2;
    }

    public int getNilaiSidang3() {
        return nilaiSidang3;
    }

    public void setNilaiSidang3(int nilaiSidang3) {
        this.nilaiSidang3 = nilaiSidang3;
    }
    
    
}
