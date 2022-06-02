package BodyMassIndex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double length, weight, bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Boyunuzu \"metre\" Olarak Giriniz : ");
        length = scanner.nextDouble();
        System.out.println("Kilonuzu Giriniz : ");
        weight = scanner.nextDouble();
        bmi = weight/(length*length);
        System.out.println("Vücut Kitle İndeksiniz : " + bmi);
    }
}
