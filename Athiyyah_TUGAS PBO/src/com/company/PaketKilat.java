package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class PaketKilat extends Laundry {

	private String nama;
//	private int pilihLayanan;
	private double berat;
	private boolean paketKlt;
	private double total;
	private double totalHarga;

	Scanner in = new Scanner(System.in);


	public PaketKilat() {
		this.paketKlt = false;
	}

	public double getTotalHarga() {
		return totalHarga;
	}

	public void setTotalHarga(double totalHarga) {
		this.totalHarga = totalHarga;
	}

	@Override
	public void inputNota() {
		paketKlt =true;
		System.out.print("Nama pelanggan  : ");
		nama = in.nextLine();
		setNama(nama);
		System.out.print("Berat Laundryan : ");
		berat = in.nextDouble();
		setBerat(berat);
	}

	@Override
	public void nota() {
		java.io.File file2 =new java.io.File("nota.txt");
		try{
			java.io.PrintWriter out = new java.io.PrintWriter(file2);
			out.print("\n ====      NOTA LAUNDRY     ==== ");
			out.print("\n\tatas nama   = "+getNama());
			out.print("\n\tberat       = "+getBerat());
			out.print("\n\tPaket kilat = "+PAKET_KILAT);
			out.print("\n==================================");
			out.print("\n=== nota jangan sampai hilang  ===");
			out.print("\n==================================");
			totalHarga();
			out.close();
		}
		catch (FileNotFoundException e){
			System.out.println("file yang dicari tidak ada");
		}
	}

	@Override
	public void totalHarga() {
		if(paketKlt ==true)
		{
			totalHarga=PAKET_KILAT*getBerat();
			System.out.println("total           : "+totalHarga);
		}
	}

}
