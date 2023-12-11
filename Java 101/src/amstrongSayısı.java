import java.util.Scanner;

/*
    Java ile girilen N sayınının bir Armstrong sayısı olup olmadığını bulan programı yazın.
    Armstrong Sayısı
    N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
    Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
    1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.
    1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634
    54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748
*/
public class amstrongSayısı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Amstrong sayımı kontrol edelim : ");
        int sayi = input.nextInt();
        int basamak = 0;
        int temp1 = sayi;
        int geçici =sayi;
        while (temp1 > 0) {
            temp1 /= 10;
            basamak++;
        }
        int toplam = 0;
        int rakam;
        while (sayi > 0) {
            rakam = sayi % 10;
            toplam += Math.pow(rakam, basamak);
            sayi /= 10;
        }
        if(toplam == geçici) {
            System.out.println(geçici + " sayisi armstrong bir sayidir.");
        }
        else {
            System.out.println(geçici + " sayisi armstrong bir sayi degildir.");
        }
    }
}