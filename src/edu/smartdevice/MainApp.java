package edu.smartdevice;

public class MainApp {
	public static void main(String[] args) {
		SmartWatch smartWatch = new SmartWatch();

		smartWatch.chargeBattery(75);
		smartWatch.connectWifi("EduRoam");

		System.out.println("=== STATUS SMARTWATCH ===");
		System.out.println("Level Baterai: " + smartWatch.getBatteryLevel() + "%");
		System.out.println("Status Koneksi: " + smartWatch.isConnected());
		System.out.println("SSID: " + smartWatch.getSsid());
	}
}
