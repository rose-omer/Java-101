import java.util.Scanner;

public class harfTekrarı {
    //Java ile girilen cümlenin içinde ki belirtilen harfin frekansını bulan program yazınız.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir cümle girin : ");
        String  cümle =input.nextLine();
        System.out.println("Hangi harfi saymak istersiniz ?  : ");
        char harf =input.nextLine().charAt(0);
        int kaçKere =0;
        for (int i = 0; i <cümle.length() ; i++) {
            if (harf ==cümle.charAt(i)){
                kaçKere++;
            }
        }
        System.out.println("Girilen cümlede "+harf+" harfi "+kaçKere+" kez geçmektedir.");
    }
}