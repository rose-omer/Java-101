import java.util.Scanner;

public class notOrtalamsi {
    /*
      PROJE KONUSU

      Java ile Fizik, Matematik, Türkçe, Kimya, Müzik, Tarih derslerinin sınav
      puanlarını kullanıcıdan alan ve bu derslerin ortalamalarını hesaplayıp
      ekrana bastırılan programı yazın.Derselerin etkileme oranı matematik türkçe 6 kredi,
      fizik kimya 4 kredi ,müzik tarih 2 kredi .
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("FİZİK notu nedir ==> ");
        int fizik = input.nextInt();
        System.out.print("MATEMATİK notu nedir ==> ");
        int matematik = input.nextInt();
        System.out.print("TÜRKÇE notu nedir ==> ");
        int türkce = input.nextInt();
        System.out.print("KİMYA notu nedir ==> ");
        int kimya = input.nextInt();
        System.out.print("MÜZİK notu nedir ==> ");
        int müzik = input.nextInt();
        System.out.print("TARİH notu nedir ==> ");
        int tarih = input.nextInt();
        double toplam = 0;
        toplam = (double) ((matematik * 6) + (türkce * 6) + kimya * 4 + fizik * 4 + tarih * 2 + müzik * 2) / 24;
        System.out.println("Not Ortalaması ==>" + toplam + "   (gecer not 50 üstü )");
        if (toplam <= 50) {
            System.out.println("öğrencimiz sınıfta kalmıştır");
        } else System.out.println("öğrencimiz sınıfı geçmiştir ");


    }
}