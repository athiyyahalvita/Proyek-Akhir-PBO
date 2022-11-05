import java.util.Scanner;

public class Customer {
	private String namaKonsumen;
	private String noHp;
	private String Alamat;


	public String getNamaKonsumen() {
		return namaKonsumen;
	}

	public void setNamaKonsumen(String namaKonsumen) {
		this.namaKonsumen = namaKonsumen;
	}

	public String getNoHp() {
		return noHp;
	}

	public void setNoHp(String noHp) {
		this.noHp = noHp;
	}

	public String getAlamat() {
		return Alamat;
	}

	public void setAlamat(String alamat) {
		Alamat = alamat;
	}



	protected void display()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Nama konsumen : ");
		String namaKonsumen = in.nextLine();
		System.out.print("No hp : ");
		String noHp = in.nextLine();
		System.out.print("Alamat : ");
		String Alamat = in.nextLine();

	}

}
