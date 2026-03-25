package edu.university.staff;

public class StaffAdministrasi extends Pegawai {
	private int jamLembur;

	public StaffAdministrasi(String nama, double gajiPokok, int jamLembur) {
		super(nama, gajiPokok);
		this.jamLembur = jamLembur;
	}

	public int getJamLembur() {
		return jamLembur;
	}

	public void setJamLembur(int jamLembur) {
		this.jamLembur = jamLembur;
	}

	@Override
	public double hitungGaji() {
		return this.gajiPokok + (this.jamLembur * 50000);
	}

	@Override
	public void tampilkanInfo() {
		System.out.println("Jenis Pegawai: Staff Administrasi");
		System.out.println("Nama: " + this.nama);
		System.out.printf("Gaji Pokok: Rp.%.2f\n", this.gajiPokok);
		System.out.println("Jam Lembur: " + this.jamLembur);
		System.out.printf("Total Gaji: Rp.%.2f\n", this.hitungGaji());
		System.out.println();
	}
}
