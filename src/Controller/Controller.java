package Controller;

import Model.*;
import java.util.ArrayList;

public class Controller implements Status {
    
    ArrayList <User> user = new ArrayList<>();
    
    public Controller() {
        //inisialisasi mata kuliah
        MataKuliah mk1 = new MataKuliah("IF-101", 4, "Algoritma dan Pemrograman");
        MataKuliah mk2 = new MataKuliah("IF-102", 3, "Web Desain");
        MataKuliah mk3 = new MataKuliah("IF-301", 3, "Pemrograman Berbasis Objek");
        MataKuliah mk4 = new MataKuliah("IF-3P1", 1, "Praktikum Pemrograman Berbasis Objek");
        
        //data dummy 1 (Mahasiswa Magister)
        Presensi p1 = new Presensi("13/6/2022",1);
        Presensi p2 = new Presensi("14/6/2022",0);
        Presensi p3 = new Presensi("15/6/2022",1);
        ArrayList <Presensi> presensi1 = new ArrayList<>();
        presensi1.add(p1);
        presensi1.add(p2);
        presensi1.add(p3);
        MatkulAmbil matkulAmbil1 = new MatkulAmbil(mk1,presensi1,80,75,95);
        Presensi p4 = new Presensi("10/6/2022",0);
        Presensi p5 = new Presensi("11/6/2022",0);
        Presensi p6 = new Presensi("12/6/2022",1);
        ArrayList <Presensi> presensi2 = new ArrayList<>();
        presensi2.add(p4);
        presensi2.add(p5);
        presensi2.add(p6);
        MatkulAmbil matkulAmbil2 = new MatkulAmbil(mk2,presensi2,60,85,90);
        ArrayList <MatkulAmbil> ambilMK = new ArrayList<>();
        ambilMK.add(matkulAmbil1);
        ambilMK.add(matkulAmbil2);
        MahasiswaMagister mhs1 = new MahasiswaMagister(ambilMK, "Pentingnya indentasi", "1121001", "Informatika", "Nicholas Chrisandy", "Jl. Musang No.3A", "Bandung, 25-05-2003", "081221456486");
        
        //data dummy 2 (Mahasiswa Sarjana)
        p1 = new Presensi("13/6/2022",1);
        p2 = new Presensi("14/6/2022",0);
        p3 = new Presensi("15/6/2022",1);
        presensi1 = new ArrayList<>();
        presensi1.add(p1);
        presensi1.add(p2);
        presensi1.add(p3);
        matkulAmbil1 = new MatkulAmbil(mk3,presensi1,70,90,85);
        p4 = new Presensi("10/6/2022",0);
        p5 = new Presensi("11/6/2022",1);
        p6 = new Presensi("12/6/2022",1);
        presensi2 = new ArrayList<>();
        presensi2.add(p4);
        presensi2.add(p5);
        presensi2.add(p6);
        matkulAmbil2 = new MatkulAmbil(mk4,presensi1,75,95,65);
        ambilMK = new ArrayList<>();
        ambilMK.add(matkulAmbil1);
        ambilMK.add(matkulAmbil2);
        MahasiswaSarjana mhs2 = new MahasiswaSarjana(ambilMK, "1120001", "Informatika", "Lutfi Triatmojo", "Holis", "Bandung, 03-07-1994", "08122145805");
        
        //data dummy 3 (Mahasiswa Doktor)
        MahasiswaDoktor mhs3 = new MahasiswaDoktor("Guna dari framework", 40, 80, 85, "1119001", "Informatika", "Christopher Richard", "PM 11", "Bandung, 28-10-2002", "08134527653");
        
        //data dummy 4 (Dosen Tetap)
        PresensiStaff ps1 = new PresensiStaff("13.00", "13/6/2022",1);
        PresensiStaff ps2 = new PresensiStaff("15.00", "14/6/2022",1);
        PresensiStaff ps3 = new PresensiStaff("11.00", "15/6/2022",0);
        ArrayList <PresensiStaff> presensi3 = new ArrayList<>();
        presensi3.add(ps1);
        presensi3.add(ps2);
        presensi3.add(ps3);
        MatkulAjar mkAjar1 = new MatkulAjar(mk1,presensi3);
        PresensiStaff ps4 = new PresensiStaff("09.00", "13/6/2022",1);
        PresensiStaff ps5 = new PresensiStaff("11.00", "14/6/2022",0);
        PresensiStaff ps6 = new PresensiStaff("16.00", "15/6/2022",1);
        ArrayList <PresensiStaff> presensi4 = new ArrayList<>();
        presensi4.add(ps4);
        presensi4.add(ps5);
        presensi4.add(ps6);
        MatkulAjar mkAjar2 = new MatkulAjar(mk2,presensi4);
        ArrayList <MatkulAjar> mkAjar = new ArrayList<>();
        mkAjar.add(mkAjar1);
        mkAjar.add(mkAjar2);
        DosenTetap dsn1 = new DosenTetap(300000, "Informatika", mkAjar, "212932163001", "Laurentius Rex", "Jl. Pungkur", "26-7-2002", "08122345231");
        
        //data dummy 5 (Dosen Honorer)
        ps1 = new PresensiStaff("13.00", "13/6/2022",1);
        ps2 = new PresensiStaff("15.00", "14/6/2022",1);
        ps3 = new PresensiStaff("11.00", "15/6/2022",1);
        presensi3 = new ArrayList<>();
        presensi3.add(ps1);
        presensi3.add(ps2);
        presensi3.add(ps3);
        mkAjar1 = new MatkulAjar(mk3,presensi3);
        ps4 = new PresensiStaff("08.00", "13/6/2022",1);
        ps5 = new PresensiStaff("11.00", "14/6/2022",0);
        ps6 = new PresensiStaff("09.00", "16/6/2022",1);
        presensi4 = new ArrayList<>();
        presensi4.add(ps4);
        presensi4.add(ps5);
        presensi4.add(ps6);
        mkAjar2 = new MatkulAjar(mk4,presensi4);
        mkAjar = new ArrayList<>();
        mkAjar.add(mkAjar1);
        mkAjar.add(mkAjar2);
        DosenHonorer dsn2 = new DosenHonorer(250000, "", mkAjar, "231421345001", "Jonathan Abi", "Jl. Mahoni", "Bandung, 13-10-2003", "082134536237");
        
        //data dummy 6 (Karyawan)
        ps1 = new PresensiStaff("13.00", "13/6/2022",1);
        ps2 = new PresensiStaff("15.00", "14/6/2022",1);
        ps3 = new PresensiStaff("11.00", "15/6/2022",0);
        ps4 = new PresensiStaff("08.00", "13/6/2022",1);
        ps5 = new PresensiStaff("11.00", "14/6/2022",0);
        ps6 = new PresensiStaff("09.00", "16/6/2022",1);
        presensi3 = new ArrayList<>();
        presensi3.add(ps1);
        presensi3.add(ps2);
        presensi3.add(ps3);
        presensi3.add(ps4);
        presensi3.add(ps5);
        presensi3.add(ps6);
        presensi3.add(ps1);
        presensi3.add(ps2);
        presensi3.add(ps3);
        presensi3.add(ps4);
        presensi3.add(ps5);
        presensi3.add(ps6);
        presensi3.add(ps1);
        presensi3.add(ps2);
        presensi3.add(ps3);
        presensi3.add(ps4);
        presensi3.add(ps5);
        presensi3.add(ps6);
        presensi3.add(ps1);
        presensi3.add(ps2);
        presensi3.add(ps3);
        presensi3.add(ps4);
        Karyawan karyawan = new Karyawan(150000, presensi3, "245123521002", "Devata Vaddha", "Jl. Muara", "23-05-2003", "081233257328");
        user.add(mhs1);
        user.add(mhs2);
        user.add(mhs3);
        user.add(dsn1);
        user.add(dsn2);
        user.add(karyawan);
    }
    
    public int cariUser(String cari){
        for (int i = 0; i < user.size(); i++) {
            User temp = user.get(i);
            if(temp.getNama().equals(cari)){
                return i;
            }
        }
        return -1;
    }
    
    public String userDataController(String cari){
        int index = cariUser(cari);
        if(index == -1){
            return "Tidak ditemukan data user dengan nama " + cari;
        }else{
            User temp = user.get(index);
            String txtHasil = "Nama : " + temp.getNama() +
                    "\nAlamat : " + temp.getAlamat() +
                    "\nTelepon : " + temp.getTelepon() +
                    "\nTempat Tanggal Lahir : " + temp.getTtl();
            if(temp instanceof MahasiswaMagister){
                txtHasil += "\nStatus : Mahasiswa Magister";
            }else if(temp instanceof MahasiswaDoktor){
                txtHasil += "\nStatus : Mahasiswa Doktor";
            }else if(temp instanceof MahasiswaSarjana){
                txtHasil += "\nStatus : Mahasiswa Sarjana";
            }else if(temp instanceof Karyawan){
                txtHasil += "\nStatus : Karyawan";
            }else if(temp instanceof DosenTetap){
                txtHasil += "\nStatus : Dosen Tetap";
            }else if(temp instanceof DosenHonorer){
                txtHasil += "\nStatus : Dosen Honorer";
            }
            return txtHasil;
        }
        
    }
    
    public int cariIndexMahasiswa(String nim){
        for (int i = 0; i < user.size(); i++) {
            User temp = user.get(i);
            if(temp instanceof Mahasiswa){
                Mahasiswa mhs = (Mahasiswa) temp;
                if(mhs.getNim().equals(nim)){
                    return i;
                }
            }
        }
        return -1;
    }
    
    public String hitungNA(String nim, String kodeMK){
        int index = cariIndexMahasiswa(nim);
        if(index==-1){
            return "Tidak ditemukan mahasiswa dengan nim " + nim;
        }
        User temp = user.get(index);
        if(temp instanceof MahasiswaMagister){
            MahasiswaMagister mhs = (MahasiswaMagister) temp;
            int hasil = hitungNilaiAkhir(mhs.getMatkul(),kodeMK);
            if(hasil==-1){
                return "Mahasiswa dengan nim " + nim + " tidak mengambil mata kuliah dengan kode " + kodeMK;
            }
            return "Nilai Akhir Mata Kuliah " + kodeMK + " Mahasiswa dengan nim " + nim + " : " + hasil;
        }else if(temp instanceof MahasiswaSarjana){
            MahasiswaSarjana mhs = (MahasiswaSarjana) temp;
            int hasil = hitungNilaiAkhir(mhs.getMatkul(),kodeMK);
            if(hasil==-1){
                return "Mahasiswa dengan nim " + nim + " tidak mengambil mata kuliah dengan kode " + kodeMK;
            }
            return "Nilai Akhir Mata Kuliah " + kodeMK + " Mahasiswa dengan nim " + nim + " : " + hasil;
        }else{
            MahasiswaDoktor mhs = (MahasiswaDoktor) temp;
            int total = mhs.getNilaiSidang1() + mhs.getNilaiSidang2() + mhs.getNilaiSidang3();
            int hasil = total/3;
            return "Nilai Akhir Mahasiswa dengan nim " + nim + " : " + hasil;
        }
    }
    
    public int hitungNilaiAkhir(ArrayList<MatkulAmbil> matkul, String kodeMK){
        for (int i = 0; i < matkul.size(); i++) {
            MatkulAmbil temp = matkul.get(i);
            if(kodeMK.equals(temp.getMatkul().getKode())){
                return (temp.getN1() + temp.getN2() + temp.getN3())/3;
            }
        }
        return -1;
    }
    
    public String rataNAController(String kodeMK){
        int counter = 0;
        int total = 0;
        for (int i = 0; i < user.size(); i++) {
            User temp = user.get(i);
            if(temp instanceof MahasiswaMagister){
                MahasiswaMagister mhs = (MahasiswaMagister) temp;
                int hasil = hitungNilaiAkhir(mhs.getMatkul(),kodeMK);
                if(hasil != -1){
                    counter++;
                    total += hasil;
                }
            }else if(temp instanceof MahasiswaSarjana){
                MahasiswaSarjana mhs = (MahasiswaSarjana) temp;
                int hasil = hitungNilaiAkhir(mhs.getMatkul(),kodeMK);
                if(hasil != -1){
                    counter++;
                    total += hasil;
                }
            }
        }
        return "Rata-rata nilai mata kuliah " + kodeMK + " akhir = " + total/counter;
    }
    
    public String banyakTdkLulusController(String kodeMK){
        int counter = 0;
        int total = 0;
        for (int i = 0; i < user.size(); i++) {
            User temp = user.get(i);
            if(temp instanceof MahasiswaMagister){
                MahasiswaMagister mhs = (MahasiswaMagister) temp;
                int hasil = hitungNilaiAkhir(mhs.getMatkul(),kodeMK);
                if(hasil != -1){
                    counter++;
                    if(hasil < 56){
                        total++;
                    }
                }
            }else if(temp instanceof MahasiswaSarjana){
                MahasiswaSarjana mhs = (MahasiswaSarjana) temp;
                int hasil = hitungNilaiAkhir(mhs.getMatkul(),kodeMK);
                if(hasil != -1){
                    counter++;
                    if(hasil < 56){
                        total++;
                    }
                }
            }
        }
        return total + " dari " + counter + " mahasiswa tidak lulus matakuliah " + kodeMK;
    }
    
    public String matkulAmbilController(String nim){
        int index = cariIndexMahasiswa(nim);
        if(index == -1){
            return "Tidak ditemukan mahasiswa dengan nim " + nim;
        }
        User temp = user.get(index);
        String hasil = "";
        if(temp instanceof MahasiswaMagister){
            MahasiswaMagister mhs = (MahasiswaMagister) temp;
            ArrayList <MatkulAmbil> mkAmbil = mhs.getMatkul();
            for (int i = 0; i < mkAmbil.size(); i++) {
                MatkulAmbil mk = mkAmbil.get(i);
                hasil += mk.toString();
                hasil += "\n==================================";
            }
            return hasil;
        }else if(temp instanceof MahasiswaSarjana){
            MahasiswaSarjana mhs = (MahasiswaSarjana) temp;
            ArrayList <MatkulAmbil> mkAmbil = mhs.getMatkul();
            for (int i = 0; i < mkAmbil.size(); i++) {
                MatkulAmbil mk = mkAmbil.get(i);
                hasil += mk.toString();
                hasil += "\n==================================";
            }
            return hasil;
        }else{
            return "Mahasiswa Doktor tidak memiliki mata kuliah yang di ambil";
        }
    }
    
    public int cariIndexStaff(String nik){
        for (int i = 0; i < user.size(); i++) {
            User temp = user.get(i);
            if(temp instanceof Staff){
                Staff staff = (Dosen) temp;
                if(nik.equals(staff.getNik())){
                    return i;
                }
            }
        }
        return -1;
    }
    
    public int hitungKehadiran(ArrayList<PresensiStaff> p){
        int hadir = 0;
        for (int j = 0; j < p.size(); j++) {
            PresensiStaff presensi = p.get(j);
            if(presensi.getStatus() == HADIR){
                hadir++;
            }
        }
        return hadir;
    }
    
    public String totalJamController(String nik){
        int index = cariIndexStaff(nik);
        if(index == -1){
            return "Tidak ditemukan dosen dengan nik " + nik;
        }
        User temp = user.get(index);
        if(temp instanceof Dosen){
            Dosen dsn = (Dosen) temp;
            ArrayList <MatkulAjar> mkAjar = dsn.getMatkul();
            int jam = 0;
            for (int i = 0; i < mkAjar.size(); i++) {
                MatkulAjar mk = mkAjar.get(i);
                ArrayList<PresensiStaff> p = mk.getPresensi();
                jam += hitungKehadiran(p)*2;
            }
            return "Total jam dosen mengajar : " + jam;
        }
        return "Tidak ditemukan dosen dengan nik " + nik;        
    }
    
    public String hitungGajiController(String nik){
        int index = cariIndexStaff(nik);
        if(index == -1){
            return "Tidak ditemukan staff dengan nik " + nik;
        }
        User temp = user.get(index);
        int gaji = 0;
        if(temp instanceof DosenTetap){
            DosenTetap dsn = (DosenTetap) temp;
            ArrayList <MatkulAjar> mkAjar = dsn.getMatkul();
            int unit = 0;
            for (int i = 0; i < mkAjar.size(); i++) {
                MatkulAjar mk = mkAjar.get(i);
                ArrayList<PresensiStaff> p = mk.getPresensi();
                unit += hitungKehadiran(p);
            }
            gaji = dsn.getSalary() + (unit*25000);
        }else if(temp instanceof DosenHonorer){
            DosenHonorer dsn = (DosenHonorer) temp;
            ArrayList <MatkulAjar> mkAjar = dsn.getMatkul();
            int unit = 0;
            for (int i = 0; i < mkAjar.size(); i++) {
                MatkulAjar mk = mkAjar.get(i);
                ArrayList<PresensiStaff> p = mk.getPresensi();
                unit += hitungKehadiran(p);
            }
            gaji = unit * dsn.getHonorPerSKS();
        }else{
            Karyawan karyawan = (Karyawan) temp;
            ArrayList<PresensiStaff> p = karyawan.getPresensi();
            int unit = hitungKehadiran(p);
            gaji = (unit/22) * karyawan.getSalary();
        }
        return "Gaji : " + gaji;
    }
}