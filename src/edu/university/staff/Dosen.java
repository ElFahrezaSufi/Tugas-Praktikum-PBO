package edu.university.staff;

public class Dosen extends Pegawai {
	private int jumlahSKS;

	public Dosen(String nama, double gajiPokok, int jumlahSKS) {
		super(nama, gajiPokok);
		this.jumlahSKS = jumlahSKS;
	}

	public int getJumlahSKS() {
		return jumlahSKS;
	}

	public void setJumlahSKS(int jumlahSKS) {
		this.jumlahSKS = jumlahSKS;
	}

	@Override
	public double hitungGaji() {
		return this.gajiPokok + (this.jumlahSKS * 150000);
	}

	@Override
	public void tampilkanInfo() {
		System.out.println("Jenis Pegawai: Dosen");
		System.out.println("Nama: " + this.nama);
		System.out.printf("Gaji Pokok: Rp.%.2f\n", this.gajiPokok);
		System.out.println("Jumlah SKS: " + this.jumlahSKS);
		System.out.printf("Total Gaji: Rp.%.2f\n", this.hitungGaji());
		System.out.println();
	}
}
