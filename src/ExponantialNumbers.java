import java.util.Scanner;

public class ExponantialNumbers {
    public static void main(String[] args) {

        // Kullanıcıdan aldığımız sayıya kadar olan 4 ve 5 in kuvvetleri

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı girin:");
        int num;
        num = inp.nextInt();

        for (int i = 1; i <= num; i *= 4) {
            System.out.println("4 ün kuvvetleri: " + i);
        }
        System.out.println("----------------------");
        for (int i = 1; i <= num; i *= 5) {
            System.out.println("5 in kuvvetleri: " + i);
        }
    }
}
