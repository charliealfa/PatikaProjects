package Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r, area, circumference;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dairenin yarıçapını giriniz : ");
        r = scanner.nextDouble();
        System.out.println("Dairenin alanı : " + Math.PI*r*r);
        System.out.println("Dairenin çevresi : " + Math.PI*r*2);
    }
}
