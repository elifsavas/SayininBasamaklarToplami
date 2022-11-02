import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k ;


        Scanner input = new Scanner(System.in) ;

        System.out.print("Sayı Giriniz: ");
        k = input.nextInt();

        int sumNumber = 0;
        
        while (k != 0) {
            sumNumber += k % 10;

            k /=10 ;

        }

       System.out.println("Basamakları Toplamı: " + sumNumber);


    }
}
