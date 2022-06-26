package Model;

public class MatkulPilihan extends MataKuliah{
    private int minimumMahasiswa;

    public MatkulPilihan(int minimumMahasiswa, String kode, int SKS, String nama) {
        super(kode, SKS, nama);
        this.minimumMahasiswa = minimumMahasiswa;
    }

    public int getMinimumMahasiswa() {
        return minimumMahasiswa;
    }

    public void setMinimumMahasiswa(int minimumMahasiswa) {
        this.minimumMahasiswa = minimumMahasiswa;
    }
    
    
}
