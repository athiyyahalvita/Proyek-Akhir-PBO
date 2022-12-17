package com.company;

import java.util.Scanner;

public class PaketKilat extends Laundry {

	private String nama;
	private double berat;
	private boolean paketKlt;
	private double total;
	private double totalHarga;

	Scanner in = new Scanner(System.in);

	public PaketKilat() {
		this.paketKlt = false;
	}

	@Override
	public void inputNota() {
		paketKlt =true;
		System.out.print("Nama : ");
		nama = in.nextLine();
		setNama(nama);
		System.out.print("Berat Laundryan : ");
		berat = in.nextDouble();
		setBerat(berat);


	}

	@Override
	public void nota() {
		System.out.println(" = = =  NOTA LAUNDRY = = = ");
		System.out.println("atas nama : "+getNama());
		System.out.println("berat : "+getBerat());
//		System.out.println("Paket kilat (15.000/kg)");
		System.out.println("= = = = = = =  = = = = = = = = = =");
		System.out.println("=== nota jangan sampai hilang ===");
		System.out.println("= = = = = = = = = = = = = = = = = =");
		totalHarga();
	}

	@Override
	public void totalHarga() {
		if(paketKlt ==true)
		{
			System.out.println("paket kilat = 15000/kg");
			totalHarga=PAKET_KILAT*getBerat();
			System.out.println("total harga yang harus dibayar : "+totalHarga);

		}
	}
}
