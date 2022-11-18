//Fevzi ÜRETEN  (22097728)

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		System.out.println("1- Toplama");
		System.out.println("2- Çıkarma");
		System.out.println("3- Çarpma");
		System.out.println("4- Bölme");
		System.out.println("5- Mod Alma");
		System.out.println("6- Çıkış");
		System.out.print("İşlem türünü seçiniz (1,2,3,4,5,6) :");
		Scanner scanner = new Scanner(System.in);
		int islem = 0;

		while (true) {
			islem = scanner.nextInt();

			if (islem == 1) {System.out.println("Toplama");}
			if (islem == 2) {System.out.println("Çıkarma");}				
			if (islem == 3) {System.out.println("Çarpma");}				
			if (islem == 4) {System.out.println("Bölme");}				
			if (islem == 5) {System.out.println("Mod Alma");}

			int ilkSayi;
			int ikinciSayi;
			if (islem > 0 && islem < 6) {
				System.out.print("1.Sayıyı giriniz: ");
				ilkSayi = scanner.nextInt();
				System.out.print("2.Sayıyı giriniz: ");
				ikinciSayi = scanner.nextInt();

				if (islem == 1) {
					System.out.println("İşlem sonucu = " + (ilkSayi + ikinciSayi));
				} else if (islem == 2) {
					System.out.println("İşlem sonucu = " + (ilkSayi - ikinciSayi));
				} else if (islem == 3) {
					System.out.println("İşlem sonucu = " + (ilkSayi * ikinciSayi));
				} else if (islem == 4) {
					System.out.println("İşlem sonucu = " + (ilkSayi / ikinciSayi));
				} else if (islem == 5) {
					System.out.println("İşlem sonucu = " + (ilkSayi % ikinciSayi));
				}
				System.out.print("Lütfen yeni bir işlem seçiniz: ");
			} else if (islem == 6) {
				System.out.println("Güle Güle");
				break;
			} else {
				System.out.print("Lütfen (1,2,3,4,5,6) işlemlerinden birini seciniz: ");
			}
		}
	}
}