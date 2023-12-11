import java.util.Scanner;

public class fibonatci {
/*  Proje Konusu
    Fibonacci serisi, her bir sayının kendinden önceki iki sayının toplamı şeklinde oluşturduğu bir sayı dizisidir.
    Örneğin, ilk iki sayı 0 ve 1 ise, Fibonacci serisi aşağıdaki gibi olacaktır: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, vb.
    Java ile Fibonacci serisi hesaplayan program aşağıdaki gibidir:
    Örnek Çıktı
    Sayı Giriniz : 8
    Fibonacci Serisi : 0, 1, 1, 2, 3, 5, 8, 13
*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int sayi = input.nextInt();
        int sayi1 =0, sayi2=1 ,toplam=0;
        System.out.print(toplam);
        for (int i = 1; i <sayi ; i++) {
            toplam =sayi1+sayi2;
            sayi2=sayi1;
            sayi1=toplam;
            System.out.print(" "+toplam);
        }

    }
}
