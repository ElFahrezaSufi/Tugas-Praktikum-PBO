package edu.university.staff;

public class MainApp {
	public static void main(String[] args) {
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
