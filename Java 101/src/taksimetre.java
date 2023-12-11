import java.util.Scanner;


public class taksimetre {
    /*
        PROJE KONUSU

        Java ile gidilen kilometre verisine göre taksimetre tutarını hesaplayıp ekrana yazdıran programı yazın.
        Taksimetre kilometre başına 2.20 TL tutmaktadır.
        Kısa mesafe tutarı 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç kilometreb'nin fiyatını öğrenmek istersiniz ==> ");
        double km = input.nextDouble();
        double ücret = 0;
        if (km <= 4.5) {
            System.out.println("Kısa mesafe oldundan sabit fiyat 20 tl dir ...");
        } else {
            ücret = km * 2.2 + 10;
            System.out.println("Ücretiniz " + km + " kilometre için   " + ücret + "   tl dir ...");
        }
    }
}
