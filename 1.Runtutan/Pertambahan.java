import java.util.Scanner; //import untuk input scanner
public class Pertambahan {

	public static void main(String[] kawe){
		int a, b, tambah;
		Scanner input = new Scanner (System.in);
		System.out.print("Masukan Angka :");
		a = input.nextInt();
		System.out.print("Masukan Angka :");
		b = input.nextInt();

		tambah = a + b ;

		System.out.print("Jumlah :" + tambah);
		
	}
}