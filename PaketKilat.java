package com.company;

import java.util.Scanner;

public class PaketKilat extends Laundry {
//	private double bera= ;
//	Scanner in = new Scanner(System.in);

	@Override
	public void nota() {
		System.out.println(" = = =  NOTA LAUNDRY = = = ");
		System.out.println("atas nama : "+getNama());
		System.out.println("berat : "+getBerat());
		System.out.print("paket yang dipilih : "+getPilihan());
		System.out.println("Paket kilat (10000/kg)");
	}

}
