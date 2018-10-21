import java.util.Scanner;
public class KonversiSatuanPanjang {
	public static void main(String[] hhh){
		double yard, kaki, inchi, meter;
		Scanner input = new Scanner (System.in);
		System.out.println("Masukan Satuan Yard : ");
		yard = input.nextInt();
		System.out.println("Masukan Satuan Kaki : ");
		kaki = input.nextInt();
		System.out.println("Masukan Satuan Inchi : ");
		inchi = input.nextInt();

		meter = (0.9144 * yard) + (0.3048 * kaki) + (0.0254 * inchi);

		System.out.println(yard + " yard , " + kaki + " kaki , " + inchi + " inchi ,  Sama dengan " + meter + " Meter ");

	}
}