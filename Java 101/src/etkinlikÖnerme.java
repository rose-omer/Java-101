import java.util.Scanner;

public class etkinlikÖnerme {
    /*
    PROJE KONUSU

    Java ile kullanıcının girdiği sıcaklık durumuna göre aşağıda ki etkinlikleri öneren programı yazınız.
    Sıcaklık 5'den küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Tiyatro" etkinliğini öner.
    Sıcaklık 15 ve 25 arasında ise "Mangal" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hava kaç derece =>");
        int derece =input.nextInt();
        if (derece<=5){
            System.out.println("Hava "+derece+" iken bence KAYAK yapabilirsin ");
        } else if (derece>=5 && derece<=15 ) {
            System.out.println("Hava "+derece+" iken bence TİYATRO ya gidebilrisin ");
        }
        else if (derece>=15 && derece<=25 ) {
            System.out.println("Hava "+derece+" iken bence Mangal yapabilirsin ");
        }
        else System.out.println("Hava "+derece+" iken bence Yüzme ye gidebilrisin ");
        }

    }
