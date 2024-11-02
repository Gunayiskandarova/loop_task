
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = scanner.nextInt();

        if (a > 0) {
            System.out.println("Musbet");
            if (a % 2 == 0) {
                System.out.println("Cut eded");
            } else {
                System.out.println("Tek eded");
            }
        } else if (a == 0) {
            System.out.println("ededin qiymeti 0-a beraberdir");
        } else {
            System.out.println("Menfi eded");
        }

        scanner.close();
    }
}