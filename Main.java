package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choise;
        double berat;
        String nama;

        PaketKilat klt=new PaketKilat();
        PaketReguler rglr=new PaketReguler();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("====== Selamat datang ======");
            System.out.print("Nama : ");
            nama = in.nextLine();
            System.out.print("Berat Laundryan : ");
            berat = in.nextDouble();

            System.out.println("==== daftar paket ====");
            System.out.println("[1] reguler ");
            System.out.println("[2] kilat ");
            System.out.print("pilih paket diatas = ");
            choise=in.nextInt();



            switch (choise){
                case 1:
                    System.out.println("anda memilih paket kilat");
                    klt.nota();
                case 2:
                    System.out.println("anda memilih paket reguler");
                    rglr.nota();
                default:
                    System.out.println("paket tidak ada");
            }
        }
    }
}
