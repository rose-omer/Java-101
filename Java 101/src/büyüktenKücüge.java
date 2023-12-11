import java.util.Arrays;
import java.util.Scanner;

public class büyüktenKücüge {
  /*
    PRJE KONUSU
    Java ile kullanıcının girdiği 3 sayıyı büyükten küçüğe sıralayan programı yazınız.
   */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("3 sayı giriniz =>");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        sirala(a, b, c);
    }

    private static void sirala(int a, int b, int c) {
        int sıra[] = {a, b, c};
        Arrays.sort(sıra);
        System.out.println("sıralama = " + Arrays.toString(sıra));

    }
}