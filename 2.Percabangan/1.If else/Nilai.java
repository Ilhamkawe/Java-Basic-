import java.util.Scanner;
public class Nilai{
	public static void main(String[] kkk){
		Scanner input = new Scanner (System.in);
		int n;
		System.out.print("Masukan Nilai :");
		n = input.nextInt();

		if (n > 50){
			System.out.println("LULUS");
		}else {
			System.out.println("Tidak LULUS");
		}
	}
}