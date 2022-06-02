package KdvTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvParam=0.18,kdvTutar;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ürünün fiyatını giriniz : ");
        tutar = scanner.nextDouble();
        kdvTutar = tutar*kdvParam;

        System.out.println("KDV'siz tutar : " + tutar);
        System.out.println("KDV'li tutar : " + (tutar*1.18));
        System.out.println("KDV oranı : " + 0.18);
        System.out.println("KDV tutarı : " + (tutar*0.18));

    }

}
