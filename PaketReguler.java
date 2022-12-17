package com.company;

import java.util.Scanner;

public class PaketReguler extends Laundry{

	private String nama;
	private double berat;
	private boolean paketRglr;
	private double total;
	private double totalHarga;


	Scanner in = new Scanner(System.in);

	public PaketReguler() {
		this.paketRglr = false;
	}

	@Override
	public void inputNota() {
		paketRglr=true;
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
//		System.out.println("Paket reguler (8000/kg)");
		System.out.println("= = = = = = =  = = = = = = = = = =");
		System.out.println("=== nota jangan sampai hilang ===");
		System.out.println("= = = = = = = = = = = = = = = = = =");
		totalHarga();
	}
