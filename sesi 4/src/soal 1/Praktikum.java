public class Praktikum //ini adalah nama class yang harus sama dengan nama filenya, filenya: Praktikum.java
{
	public static void main(String[] args)//ini adalah method utama yang akan di eksekusi oleh java
{
		int number1, number2, results;
		boolean number;//inisialisasi variabel number dengan tipe data boolean
		number1 = 20;//memberi nilai 20 dan 10 pada variabel number1 dan number2
		number2 = 10;

		results = number1 / number2;
			System.out.println(results);//proses running pada pembagian variabel: 20/10 yang akan mencetak 2
		results = number1 + number2;
			System.out.println(results);//proses running pada penjumlahan variabel: 20 + 10 yang akan mencetak 30
		number = (20 != 10);
			System.out.println(number);//proses running untuk menghasilkan TRUE karna 20 != 10 adalah benar
		number = (20 == 10);
			System.out.println(number);proses running yang menghasilkan FALSE karna 20 == 10 adalah salah
	}
		
}