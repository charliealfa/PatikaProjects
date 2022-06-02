package ArtikYil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil,kalan;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yılı Giriniz : ");
        yil = scanner.nextInt();
        kalan = yil%400;
        if (kalan<100){
           if(kalan%4==0){
               System.out.println(yil+" bir artık yıldır!");
           }else {
               System.out.println(yil+" bir artık yıl değildir!");
           }
        }else {
            System.out.println(yil+" bir artık yıl değildir!");
        }
    }
}
