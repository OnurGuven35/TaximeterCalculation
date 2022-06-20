/* Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir. */

import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double km, perKm, first, amount;

        // İlk olarak kullanıcıdan değer alıyoruz.

        System.out.println();
        System.out.print("Gideceginiz KM'yi giriniz : ");
        km = input.nextDouble();
        System.out.println();

        // Bize verilen değerlere göre formül oluşturuyoruz.

        perKm = 2.20;
        first = 10;
        amount = first + (km * perKm);

        // Son olarak çıkan ücreti sorgulayarak oluşan değeri ekrana yazdırıyoruz.

        double total = (amount < 20) ? 20 : amount;

        System.out.print("Toplam Odenecek Ucret : " + total);
        System.out.println();
    }
}