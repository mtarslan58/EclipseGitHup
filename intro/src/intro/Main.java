package intro;

public class Main {

	public static void main(String[] args) {
		// camelCase
		// Don't repeat yourself
		String internetSubeButonu = "İnternet Şubesi";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		
		System.out.println(internetSubeButonu);

		if (dolarBugun > dolarDun) {
			System.out.println("Dolar düştü");
		} else if (dolarBugun < dolarDun) {
			System.out.println("Dolar yükseldi");
		} else {
			System.out.println("Dolar eşittir");
		}

		String kredi1 = "Hızlı Kredi";
		String kredi2 = "Mutlu emekli kredisi";
		String kredi3 = "Konut kredisi";
		String kredi4 = "Çiftci kredi";
		String kredi5 = "Msb kredisi";
		String kredi6 = "Meb kredisi";
		String kredi7 = "Kültür bakanlığı";

		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		System.out.println(kredi7);

		String[] krediler = { "Hızlı Kredi", "Mutlu emekli kredisi", "Konut kredisi", "Çiftci kredi", "Msb kredisi",
				"Meb kredisi", "Kültür bakanlığı" };
		// foreach
		for (String kredi : krediler) {
			System.out.println(kredi);
		}

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

		String sehir1 = "Ankara";
		String sehir2 = "İstanbul";
		sehir1 = sehir2;
		sehir2 = "İzmir";
		System.out.println(sehir1);

		// ----------
		int sayi1 = 150;
		int sayi2 = 180;
		int sayi3 = 130;

		if (sayi1 > sayi2 && sayi1 > sayi3) {
			System.out.println("En büyük sayi : " + sayi1);
		} else if (sayi2 > sayi1 && sayi2 > sayi3) {
			System.out.println("En büyük sayı : " + sayi2);
		} else {
			System.out.println("En büyük sayi : " + sayi3);
		}

		// -----------

		char grade = 'A';
		switch (grade) {
		case 'A':
			System.out.println("Geçtiniz");
			break;
		case 'B':
			System.out.println("Geçtiniz");
			break;
		case 'C':
			System.out.println("Geçtiniz");
			break;
		case 'F':
			System.out.println("Kaldınız");
			break;
		default:
			System.out.println("Geçersiz Not Girdiniz");
		}

		// -----------

		for (int i = 0; i <= 100; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}

		System.out.println("----------");

		int i = 0;
		while (i < 100) {
			i++;
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}

		System.out.println("----------");

		String[] ogrenci = new String[4];
		ogrenci[0] = "Engin";
		ogrenci[1] = "Talha";
		ogrenci[2] = "Mehmet";
		ogrenci[3] = "Sinan";

		for (int j = 0; j < ogrenci.length; j++) {
			System.out.println(ogrenci[j]);
		}

		System.out.println("----------");

		for (String ogrenciler : ogrenci) {
			System.out.println(ogrenciler);
		}

		System.out.println("----------");

		double[] myList = { 1.1, 2.1, 3.1, 4.1 };
		double total = 0;
		double max = myList[0];
		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Toplam : " + total);
		System.out.println("En büyük : " + max);

		System.out.println("----------");

		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Kocaeli";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Nevşehir";
		sehirler[1][2] = "Sivas";
		sehirler[2][0] = "Trabzon";
		sehirler[2][1] = "Rize";
		sehirler[2][2] = "Sinop";

		for (int a = 0; a <= 2; a++) {
			System.out.println("----------");
			for (int b = 0; b <= 2; b++) {
				System.out.println(sehirler[a][b]);
			}
		}

	}

}
