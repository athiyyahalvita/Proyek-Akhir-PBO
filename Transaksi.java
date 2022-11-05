package Laundry;

public class Transaksi {
	private int hargaPaket;
	private int totalHarga;

	public int getHargaPaket() {
		return hargaPaket;
	}

	public int getTotalHarga() {
		return totalHarga;
	}

	public void setHargaPaket(int hargaPaket) {
		this.hargaPaket = hargaPaket;
	}

	public void setTotalHarga(int totalHarga) {
		this.totalHarga = totalHarga;
	}

	public void hitungTotal()
	{
		System.out.println("total harga = ");
	}

}
