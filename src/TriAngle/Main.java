package TriAngle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Üçgenin dik kenarını giriniz : ");
        a = scanner.nextInt();
        System.out.println("Üçgenin dik kenarını giriniz : ");
        b = scanner.nextInt();
        c = Math.sqrt(a*a+b*b);
        System.out.println("Hipotenüs : " + c);
    }
}
