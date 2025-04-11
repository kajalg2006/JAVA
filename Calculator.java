import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("enter your input  ");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.next().charAt(0);

        switch (c) {
            case '+':
                System.out.println("addition " + (a + b));
                break;
            case '-':
                System.out.println("subtraction " + (a - b));
                break;
            case '*':
                System.out.println("multiplication " + (a * b));
                break;
            case '/':
                System.out.println("division " + (a / b));
                break;

            default:
                System.out.println("invalid input ");
                break;
        }
    }
}
