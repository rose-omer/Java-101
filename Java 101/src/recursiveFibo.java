import java.util.Scanner;

public class recursiveFibo {
    //Proje Konusu
    //Java ile Recursive kullanarak Fibonacci serisi hesaplayan program yazınız.

    static  int fibo (int n){
        if ( n ==1 || n==2 ) {
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 1 1 2 3 5 8 13 21
        // f(6) = f(4)+ f(5)
        System.out.print("Kaçıncı elemanı hesaplamak istiyorsunuz : ");
        int  n =input.nextInt();
        System.out.println(fibo(n));
    }
}