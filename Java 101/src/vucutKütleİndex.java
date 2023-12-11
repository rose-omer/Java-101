import java.util.Scanner;

public class vucutKütleİndex {
   /*
    PROJE KONUSU

    Java ile kullanıcıdan boy ve kilo değerlerini alarak aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
    Eğer Vücut Kitle İndeksi .
    18.5'ten küçükse ekrana "Zayıf"
    18.5 ile 24.9 arasında ise ekrana "İdeal"
    25 ile 29.9 arasında ise ekrana "Şişman"
    30 ile 34.9 arasında ise ekrana "Obez"
    35'ten büyükse ise ekrana "Aşırı Obez" yazsın
*/

    //Formül : Kilo (kg) / Boy(m) * Boy(m)
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Lütfen boyunuzu giriniz (cm) ==> ");
       double boy = input.nextDouble();
       System.out.print("Kilonuzu giriniz (kg) ==> ");
       double kilo = input.nextDouble();
       double formul=0;
       formul = kilo/(boy*boy);
       formul=formul*10000;
       if (formul<=18.5){
           System.out.println("ZARGANA ==> "+formul);
       } else if (formul>=18.5 && formul<=24.9) {
           System.out.println("İDEAL ==> "+formul);
       } else if (formul>=25 && formul<=29.9) {
           System.out.println("ŞİŞMANNN ==> "+formul);
       } else if (formul>=30 && formul<=34.9) {
           System.out.println("OBEZZ ==> "+formul);
       } else if (formul>=35 ) {
           System.out.println("AŞIRI OBEZ ölcen yağ tulumu ==> "+formul);

       }
   }
}