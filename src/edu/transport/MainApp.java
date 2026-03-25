package edu.transport;

public class MainApp {
	public static void main(String[] args) {
		double jarak = 120;

		Mobil mobil = new Mobil("Mobil", 120);
		Motor motor = new Motor("Motor", 80);

		double waktuMobil = mobil.hitungWaktuTempuh(jarak);
		double waktuMotor = motor.hitungWaktuTempuh(jarak);

		System.out.println("=== PERHITUNGAN WAKTU TEMPUH ===");
		System.out.println("Jarak: " + jarak + " km");
		System.out.println();

		System.out.println("Kendaraan: " + mobil.getNama());
		System.out.println("Kecepatan Maksimum: " + mobil.getKecepatanMaks() + " km/jam");
		System.out.printf("Waktu Tempuh: %.2f jam\n", waktuMobil);
		System.out.println();

		System.out.println("Kendaraan: " + motor.getNama());
		System.out.println("Kecepatan Maksimum: " + motor.getKecepatanMaks() + " km/jam");
		System.out.printf("Waktu Tempuh: %.2f jam\n", waktuMotor);
	}
}
