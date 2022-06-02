package TaxiMeter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double param = 2.20, mesafe, tutar;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Mesafeyi KM olarak giriniz :");
        mesafe = scanner.nextDouble();
        tutar = 10+param*mesafe;
        if(tutar<20){
            tutar=20;
        }
        System.out.println("Ödenecek Tutar : " + tutar);
    }
}
