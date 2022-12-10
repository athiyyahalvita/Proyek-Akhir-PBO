package com.company;

public abstract class Laundry {

	private String nama;
	private double berat;
	private int pilihan;

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public double getBerat() {
		return berat;
	}

	public void setBerat(double berat) {
		this.berat = berat;
	}

	public int getPilihan() {
		return pilihan;
	}

	public void setPilihan(int pilihan) {
		this.pilihan = pilihan;
	}

	abstract public void nota();
}

