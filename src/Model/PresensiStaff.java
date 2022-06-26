package Model;

public class PresensiStaff extends Presensi{
    private String jam;

    public PresensiStaff(String jam, String tanggal, int status) {
        super(tanggal, status);
        this.jam = jam;
    }

    @Override
    public String toString() {
        return super.toString() + "\njam=" + jam;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }
    
    
}
