import java.util.Scanner;

public class biletFiyat {
    /*
    PROJE KONUSU

    Java ile mesafeye ve durumlara göre otobüs bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe
    (KM), yaş ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgileri ile mesafe başına ücret 0,10 TL / km olarak
    alın. İlk olarak yolculuğun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
    Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2)olmalıdır.
    Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
    Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
    Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
    Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafe giriniz (km)=> ");
        int mesafe = input.nextInt();
        int yas;
        do {
            System.out.print("yaş giriniz => ");
            yas = input.nextInt();
        }
        while (yas < 0);
        int tipi;
        do {
            System.out.println("Gidiş türünüz nedir ");
            System.out.println("Tek Yön (1)");
            System.out.println("Gidiş-Dönüş (2)");
            tipi = input.nextInt();
        } while (tipi != 1 && tipi != 2);
        double ucret = getUcret((double) mesafe, tipi, yas);

        System.out.println("Bilet ücretiniz " + ucret + " tl'dir");
    }

    private static double getUcret(double mesafe, int tipi, int yas) {
        double ucret = mesafe / 10;
        if (tipi == 1) {
            if (yas < 12) {
                ucret = ucret / 2;
            } else if (yas > 12 && yas <= 25) {
                ucret = ucret - ucret / 10;
            } else if (yas > 65) {
                ucret = ucret - ucret * 3 / 10;
            }
        }

        if (tipi == 2) {
            ucret = 2 * ucret;
            if (yas < 12) {
                ucret = ucret / 2;
                ucret = ucret - ucret * 2 / 10;
            } else if (yas > 12 && yas <= 25) {
                ucret = ucret - ucret / 10;
                ucret = ucret - ucret * 2 / 10;
            } else if (yas > 65) {
                ucret = ucret - ucret * 3 / 10;
                ucret = ucret - ucret * 2 / 10;
            }
        }
        return ucret;
    }
}