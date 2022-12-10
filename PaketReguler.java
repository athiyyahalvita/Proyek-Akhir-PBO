package com.company;

public class PaketReguler extends Laundry{


	@Override
	public void nota() {
		System.out.println(" = = =  NOTA LAUNDRY = = = ");
		System.out.println("atas nama : "+getNama());
		System.out.println("berat : "+getBerat());
		System.out.print("paket yang dipilih : "+getPilihan());
		System.out.println("Paket reguler (5000/kg)");
	}
}
