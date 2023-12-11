import java.util.Scanner;

public class kdvTutari {
/*
    PROJE KONUSU

    Java dili ile kullanıcıdan alınan tutarın KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
    (Not : KDV tutarını 20% olarak alın)
    Eğer girilen tutar 0 ve 500TL arasında ise KDV oranı %20 , tutar 500TL'den büyük ise KDV oranını %8 olarak KDV hesaplayan programı yazınız.
*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kdv = 20;
        double yeniFiyat = 0;
        System.out.print("KVD'sini Hesaplamak İstedğiğniz miktarı giriniz ==>");
        int fiyat = input.nextInt();
        if (fiyat >= 0 && fiyat <= 500) {
            yeniFiyat = kdv * fiyat / 100 + fiyat;
            System.out.println("KDV si hesaplanmış ürünün yeni fiyatı ==> " + yeniFiyat);
        } else {
            kdv=8;
            yeniFiyat = kdv * fiyat / 100 + fiyat;
            System.out.println("KDV si hesaplanmış ürünün yeni fiyatı ==> " + yeniFiyat);
        }
    }
}