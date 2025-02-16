import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        System.out.println("input 1st user");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        switch (a) {
            case 1: System.out.println("One");break;
            case 2: System.out.println("Two");break;
            case 3: System.out.println("Three");break;
            default: System.out.println("Invalid");break;
        }

        }

    }

