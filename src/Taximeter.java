import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {

        double km, perKm, baslangıc, ucret;

        Scanner input = new Scanner(System.in);

        System.out.print("Gideceginiz KM'yi giriniz : ");
        km = input.nextDouble();

        perKm = 2.20;
        baslangıc = 10;
        ucret = baslangıc + (km * perKm);

        double toplam = (ucret < 20) ? 20 : ucret;

        System.out.print("Toplam Odenecek Ucret : " + toplam);

    }
}
