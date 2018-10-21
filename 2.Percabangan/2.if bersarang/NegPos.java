import java.util.Scanner;
public class NegPos{
	public static void main(String[] kkk){
		Scanner input = new Scanner (System.in);
		int b;
		System.out.print("Masukan Bilangan : ");
		b = input.nextInt();

		if (b  > 0){
		 	System.out.println("Bilangan Positif");
		} else if (b < 0) {
			System.out.println("Bilangan Negatif");
		} else {
			System.out.println("Bilganan 0");
		}
	}
}