import java.util.Scanner;

public class hipotenüsHesabı {
/*
    PROJE KONUSU

    Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve üçgene ait Hipotenüsü hesaplayan programı yazın.
    Hipotenüs teoremi ile bulduğunuz 3. kenar uzunluğu ile birlikte üçgenin alanını hesaplayan programı yazınız.
    Üçgenin Çevresi = 2u
    u = (a+b+c) / 2
    Alan * Alan = u * (u - a) * (u - b) * (u - c)
 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1. dik kenar nedir ==>");
        int kenar1 = input.nextInt();
        System.out.print("2. dik kenar nedir ==>");
        int kenar2 = input.nextInt();
        double hipotenüs = 0;
        hipotenüs = Math.pow(kenar1, 2) + Math.pow(kenar2, 2);
        double hipotenüsSon = Math.sqrt(hipotenüs);
        System.out.println("3. kenar ==>" + hipotenüsSon);
        System.out.println("***BONUS***");
        double u = 0;
        int cevre = (int) (kenar1 + kenar2 + hipotenüsSon);
        u = (hipotenüsSon + kenar2 + kenar1) / 2;
        double alan = 0;
        alan = u * (u - kenar1) * (u - kenar2) * (u - hipotenüsSon);
        double alanson = Math.sqrt(alan);
        System.out.println("Üçgenin alanı ==> " + alanson);
        System.out.println("çevresi ==> " + cevre);
    }
}

