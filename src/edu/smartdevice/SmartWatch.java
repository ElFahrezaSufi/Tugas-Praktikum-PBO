package edu.smartdevice;

public class SmartWatch implements Rechargeable, Connectable {
	private int batteryLevel;
	private boolean connected;
	private String ssid;

	public SmartWatch() {
		this.batteryLevel = 0;
		this.connected = false;
		this.ssid = "";
	}

	@Override
	public void chargeBattery(int menit) {
		if (menit > 0) {
			this.batteryLevel += menit;

			if (this.batteryLevel > 100) {
				this.batteryLevel = 100;
			}
		}
	}

	@Override
	public int getBatteryLevel() {
		return this.batteryLevel;
	}

	@Override
	public void connectWifi(String ssid) {
		if (ssid != null && !ssid.trim().isEmpty()) {
			this.ssid = ssid;
			this.connected = true;
		} else {
			this.ssid = "";
			this.connected = false;
		}
	}

	@Override
	public boolean isConnected() {
		return this.connected;
	}

	public String getSsid() {
		return this.ssid;
	}
}
