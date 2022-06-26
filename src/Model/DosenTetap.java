package Model;

import java.util.ArrayList;

public class DosenTetap extends Dosen {
    private int salary;

    public DosenTetap(int salary, String departemen, ArrayList<MatkulAjar> matkul, String nik, String nama, String alamat, String ttl, String telepon) {
        super(departemen, matkul, nik, nama, alamat, ttl, telepon);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nsalary=" + getSalary();
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    
}
