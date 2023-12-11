import java.util.*;

public class tekraredensayi {
    // bir dizideki tekrar eden sayıları bulan programı yazınız.
    public static void main(String[] args) {
        int[] dizi = {4, 2, 7, 8, 3, 7, 2, 1, 4, 6, 9, 3};
        Map<Integer, Integer> tekrarEdenSayilar = new HashMap<>();

        for (int sayi : dizi) {
            if (tekrarEdenSayilar.containsKey(sayi)) { // Eğer sayı daha önce eklenmişse, sayacı bir arttırılır.
                tekrarEdenSayilar.put(sayi, tekrarEdenSayilar.get(sayi) + 1);
            } else {// Eğer sayı daha önce eklenmemişse, sayacı 1 olarak eklenir.
                tekrarEdenSayilar.put(sayi, 1);
            }
        }
        System.out.println("Dizideki tekrar eden sayılar ve tekrar etme sayıları:");
        for (Map.Entry<Integer, Integer> entry : tekrarEdenSayilar.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " tekrar ediyor " + entry.getValue() + " kere.");
            }
        }

    }
}