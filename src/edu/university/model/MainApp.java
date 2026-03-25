package edu.university.model;

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
	}
}
