import java.util.Scanner;

public class smsBoyutu {
    /*
    Proje Konusu
    Java ile kullanıcı girdiği metinin mesaj boyunu hesaplayan programı yazın. Her bir mesaj karakter sınırı 160 kelimedir.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mesaşınızı giriniz : ");
        String sms =input.nextLine();
        int smsBoyutu = 1;
        int uzunluk =sms.length();
        while (true){
            if (uzunluk >160){
            smsBoyutu++;
            uzunluk =uzunluk-160;
            }else break;
        }
        System.out.println("Mesajınız "+sms.length()+" karakterden oluşuyor ve "+smsBoyutu+" SMS'e bölünebilir. ");
    }
}
