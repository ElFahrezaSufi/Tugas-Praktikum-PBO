package edu.university.staff;

public class Pegawai {
	protected String nama;
	protected double gajiPokok;

	public Pegawai(String nama, double gajiPokok) {
		this.nama = nama;
		this.gajiPokok = gajiPokok;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public double getGajiPokok() {
		return gajiPokok;
	}

	public void setGajiPokok(double gajiPokok) {
		this.gajiPokok = gajiPokok;
	}

	public double hitungGaji() {
		return this.gajiPokok;
	}

	public void tampilkanInfo() {
		System.out.println("Nama: " + this.nama);
		System.out.println("Gaji Pokok: Rp." + this.gajiPokok);
		System.out.printf("Total Gaji: Rp.%.2f\n", this.hitungGaji());
		System.out.println();
	}
}
