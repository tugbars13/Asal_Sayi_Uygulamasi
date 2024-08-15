import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ASAL SAYI UYGULAMASI
        int number = 2;
        int remainder = number % 2 ;
        //% = kalan operatörü
        System.out.println(remainder);
        boolean isPrime = true;

        if (number<2){
            System.out.println("Geçersiz sayı girdiniz");
        }
        if (number==1){
            System.out.println("Sayı asal değildir");
            return;
        }
        for (int i =2;i<number;i++){
            if (number%i==0){
                isPrime = false;
            }

        }
    if (isPrime){
        //isPrime == true -- ile aynı şey
        System.out.println("Sayımız asladır");

    }else{
        System.out.println("Sayımız asal değildir");
    }
    }
}