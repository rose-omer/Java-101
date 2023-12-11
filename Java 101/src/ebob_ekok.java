import java.util.Scanner;
public class ebob_ekok {
    /*
    Proje Konusu
    Java ile kullanıcıdan alınacak iki sayı için EBOB ve EKOK hesaplanacak ve ekrana yazdırılacaktır.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz : ");
        int sayi1 = input.nextInt();
        System.out.print("İkinci sayiyi giriniz : ");
        int sayi2 = input.nextInt();
        // EBOB ve EKOK hesapla
        int ebob = ebobHesapla(sayi1, sayi2);
        int ekok = ekokHesapla(sayi1, sayi2);
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
    // EBOB hesaplama metodu
    public static int ebobHesapla(int sayi1, int sayi2) {
        while (sayi2 != 0) {
            int gecici = sayi2;
            sayi2 = sayi1 % sayi2;
            sayi1 = gecici;
        }
        return sayi1;
    }
    // EKOK hesaplama metodu
    public static int ekokHesapla(int sayi1, int sayi2) {
        return (sayi1 * sayi2) / ebobHesapla(sayi1, sayi2);
    }
}