import java.util.Scanner;
public class GaGe {
	public static void main(String[] asdasd){
		Scanner input = new Scanner (System.in);
		int a;
		System.out.print("Masukan Bilangan :");
		a = input.nextInt();

		if (a  == 0){
			System.out.println("nol");
		} else if (a % 2 == 1){
			System.out.println("Ganjil");
		} else if (a % 2 == 0){
			System.out.println("Genap");
		}
	}
}