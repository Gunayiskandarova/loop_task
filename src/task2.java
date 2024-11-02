import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");

        int a = scanner.nextInt();
        switch (a){
            case 1:
                System.out.print("Fesil:Qish, Ay: Yanvar");
                break;
            case 2:
                System.out.print("Fesil:Qish, Ay: Fevral");
                break;
            case 3:
                System.out.print("Fesil:Yaz, Ay: Mart");
                break;
            case 4:
                System.out.print("Fesil:Yaz, Ay: Aprel");
                break;
            case 5:
                System.out.print("Fesil:Yaz, Ay: May");
                break;
            case 6:
                System.out.print("Fesil:Yay, Ay: Iyun");
                break;
            case 7:
                System.out.println("Fesil:Yay, Ay: Iyul");
                break;
            case 8:
                System.out.print("Fesil:Yay, Ay: Avqust");
                break;
            case 9:
                System.out.print("Fesil:Payiz, Ay: Sentyabr");
                break;
            case 10:
                System.out.print("Fesil:Payiz, Ay: Oktyabr");
                break;
            case 11:
                System.out.print("Fesil:Payiz, Ay: Noyabr");
                break;
            case 12:
                System.out.print("Fesil:Qish, Ay: Dekabr");

        }

        if (a>12){
            System.out.println("Zehmet olmasa duzgun nomreni qeyd edin");
        }

    }
}

