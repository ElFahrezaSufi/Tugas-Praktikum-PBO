package edu.university.main;

import edu.university.model.Mahasiswa;
import edu.university.staff.Pegawai;
import edu.university.staff.Dosen;
import edu.university.staff.StaffAdministrasi;

public class MainApp {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("241401001", "Andi", 3.75);
        Mahasiswa mahasiswa2 = new Mahasiswa("241401002", "Budi", 3.20);
        Mahasiswa mahasiswa3 = new Mahasiswa("241401003", "Citra", 2.80);
        Mahasiswa mahasiswa4 = new Mahasiswa("241401004", "Dani", 2.00);

        Mahasiswa[] daftarMahasiswa = {mahasiswa1, mahasiswa2, mahasiswa3, mahasiswa4};

        for (int i = 0; i < daftarMahasiswa.length; i++) {
            System.out.println("=== Data Mahasiswa ke-" + (i + 1) + " ===");
            System.out.println("NIM: " + daftarMahasiswa[i].getNim());
            System.out.println("Nama: " + daftarMahasiswa[i].getNama());
            System.out.printf("IPK: %.2f\n", daftarMahasiswa[i].getIpk());
            System.out.println("Kategori IPK: " + daftarMahasiswa[i].getKategoriIPK());
            System.out.println();
        }

        Pegawai pegawai1 = new Dosen("Dr. Rina", 4500000, 12);
        Pegawai pegawai2 = new StaffAdministrasi("Budi", 3500000, 10);
        Pegawai pegawai3 = new Dosen("Dr. Andi", 5000000, 9);
        Pegawai pegawai4 = new StaffAdministrasi("Siska", 3200000, 6);

        Pegawai[] daftarPegawai = {pegawai1, pegawai2, pegawai3, pegawai4};

        System.out.println("=== DATA PEGAWAI UNIVERSITAS ===");
        System.out.println();

        for (int i = 0; i < daftarPegawai.length; i++) {
            System.out.println("Data Pegawai ke-" + (i + 1) + ":");
            daftarPegawai[i].tampilkanInfo();
        }
    }
}
