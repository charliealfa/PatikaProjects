package Manav;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;
        double result=0.0,temp;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Armut Kilo Miktarı ?");
        result += armut*scanner.nextDouble();
        System.out.println("Elma Kilo Miktarı ?");
        result += elma*scanner.nextDouble();
        System.out.println("Domates Kilo Miktarı ?");
        result += domates*scanner.nextDouble();
        System.out.println("Muz Kilo Miktarı ?");
        result += muz*scanner.nextDouble();
        System.out.println("Patlıcan Kilo Miktarı ?");
        result += patlican*scanner.nextDouble();
        System.out.println("Toplam Ödeme : " + result);
    }
}
