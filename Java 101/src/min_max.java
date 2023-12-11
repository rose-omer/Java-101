import java.util.ArrayList;
import java.util.Scanner;

public class min_max {
    /*
    Proje Konusu
    Java dilinde girilen sayılardan min ve max değerleri bulan bir program örneği verilmiştir. Kullanıcıdan alınan sayılar arasında döngü ile gezinilerek min ve max değerler bulunacaktır.

    Örnek Çıktı
    Kaç adet sayı gireceksiniz: 5
    1. sayıyı giriniz: 12
    2. sayıyı giriniz: 25
    3. sayıyı giriniz: 6
    4. sayıyı giriniz: 17
    5. sayıyı giriniz: 9
    Girilen sayılar arasında en küçük sayı: 6
    Girilen sayılar arasında en büyük sayı: 25
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kac adet sayi değeri girilecek : ");
        int n = input.nextInt();
        int[] sayilar = new int[n];
        int max = sayilar[0];
        int min = sayilar[0];
        for (int i = 0; i < n; i++) {
            System.out.println(i+1 + "Sayıyı giriniz : ");
            sayilar[i] = input.nextInt();
        }
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] > max) {
                max = sayilar[i];
            }
            if (sayilar[i] < min) {
                min = sayilar[i];
            }
        }
        System.out.println("En Büyük Değer: " + max);
        System.out.println("En Küçük Değer: " + min);
    }
}
