import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);

		Customer cos = new Customer();
		Pegawai pgw =new Pegawai();
		Laundry laundry=new Laundry();
		Kilat klt = new Kilat();
		Normal nrml=new Normal();

		int berat;
		int harga;

		System.out.println("***********************************");
		System.out.println("* selamat datang di tempat laundry *");
		System.out.println("***********************************");
		System.out.println("=== Masukan data customer=== ");
		cos.display();
		System.out.println("\n***********************************");
		System.out.println("Masukan berat laundry");
		berat= input.nextInt();
		pgw.getBeratLaundry();
		if (berat==1)
		{
			harga=5000;
		}
		else if (berat==2)
		{
			harga=10000;
		}
		else {
			harga=20000;
		}




//		System.out.println();




	}
}
