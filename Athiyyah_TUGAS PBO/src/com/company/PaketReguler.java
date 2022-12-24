package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class PaketReguler extends Laundry{

//	private int pilihLayanan;
	private String nama;
	private double berat;
	private boolean paketRglr;
	private double total;
	private double totalHarga;

	Scanner in = new Scanner(System.in);

//	public int getPilihLayanan() {
//		return pilihLayanan;
//	}
//
//	public void setPilihLayanan(int pilihLayanan) {
//		this.pilihLayanan = pilihLayanan;
//	}

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
		java.io.File file2 =new java.io.File("nota.txt");
		try{
			java.io.PrintWriter out = new java.io.PrintWriter(file2);
			out.print("\n ====      NOTA LAUNDRY     ==== ");
			out.print("\n\tatas nama   = "+getNama());
			out.print("\n\tberat       = "+getBerat());
			out.print("\n\tPaket kilat = "+PAKET_REGULER);
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
		if(paketRglr ==true)
		{
			System.out.println("paket reguler = 8000/kg");
			totalHarga=PAKET_REGULER*getBerat();
		}
	}

//	@Override
//		public void pilihLayanan() {
//			System.out.println("[1] CUCI STRIKA");
//			System.out.println("[2] CUCI LIPAT");
//			System.out.println("[3] CUCI ");
//			System.out.println("pilih layanan : ");
//			pilihLayanan =in.nextInt();
//			setPilihLayanan(pilihLayanan);
//			if (getPilihLayanan() ==1){
//				System.out.println("anda memilih layanan cuci+strika");
//				System.out.println("harga layanan :"+CUCI_STRIKA);
//			}
//
//		}
	}
