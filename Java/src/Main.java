import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan sayıyı alıyoruz
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        int sum = 0;

        // 1'den girilen sayıya kadar olan bölenleri topluyoruz
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {  // Sayı, i'ye tam bölünüyorsa
                sum += i;  // Böleni toplama ekliyoruz
            }
        }

        // Sayı mükemmel mi kontrol ediyoruz
        if (sum == number) {
            System.out.println(number + " mükemmel sayıdır.");
        } else {
            System.out.println(number + " mükemmel sayı değildir.");
        }
    }
}
