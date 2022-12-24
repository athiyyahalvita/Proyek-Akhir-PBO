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
            System.out.println("=======================================");
            System.out.println("====== Selamat datang di laundry ======");
            System.out.println("=======================================");

            System.out.println("[1] kilat ");
            System.out.println("[2] reguler ");
            System.out.println("[3] exit ");
            System.out.print("pilih paket diatas = ");
            choise=in.nextInt();

            switch (choise){
                case 1:
                    System.out.println("---------------------------------------");
                    System.out.println("anda memilih paket kilat");
                    klt.inputNota();
                    klt.nota();
                    break;

                case 2:
                    System.out.println("anda memilih paket reguler");
                    rglr.inputNota();
                    rglr.nota();
                    break;

                case 3:
                    System.exit(3);

                default:
                    System.out.println("paket tidak ada");
            }
        }
    }
}
