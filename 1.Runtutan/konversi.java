import java.util.Scanner;
public class konversi{
	public static void main(String[] kawe){
		Scanner input = new Scanner(System.in);
		double tc, tf, tr;
		System.out.println("KONVERSI");
		System.out.println("Masukan Derajat Celcius :");
		tc = input.nextInt();

		tf = ((9/5) * tc) + 32;
		tr = 0.8 * tc;

		System.out.println("Hasil konversi");
		System.out.println("Derajat Fahrenheit :" + tf);
		System.out.println("Derajat Reamur :" + tr);
	}
} 