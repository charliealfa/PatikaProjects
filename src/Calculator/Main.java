package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2;
        String operator;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen 1. Sayıyı Giriniz : ");
        n1 = scanner.nextDouble();
        System.out.println("Lütfen 2. Sayıyı Giriniz : ");
        n2 = scanner.nextDouble();
        System.out.println("Lütfen İşlem Operatörünü Giriniz : ");
        operator = scanner.next();
        switch (operator) {
            case "+":
                System.out.println("Sonuç : " + (n1 + n2));
                break;
            case "-":
                System.out.println("Sonuç : " + (n1 - n2));
                break;
            case "/":
                System.out.println("Sonuç : " + (n1 / n2));
                break;
            case "*":
                System.out.println("Sonuç : " + (n1 * n2));
                break;
            default:
                System.out.println("Hatalı Operatör Girdiniz!!!");
                break;
        }
    }
}
