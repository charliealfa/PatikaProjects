package BiletHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mesafe=0,yas=0, discountRate1=0,discountRate2=0,travelType=0,ratePerMile=0.1;
        double normalPrice=0, ageDiscount=0,travelTypeDiscount=0,result=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden giriniz : ");
        mesafe = scanner.nextDouble();
        if(mesafe<0){
            System.out.println("Yanlış veri girildi!");
        }
        System.out.println("Yolcu yaşını giriniz : ");
        yas = scanner.nextDouble();
        if(yas<0){
            System.out.println("Yanlış veri girildi!");
        }else if(yas>=0&&yas<12){
            discountRate1=0.5;
        }else if (yas>=12&&yas<24) {
            discountRate1=0.1;
        }else if (yas>=65) {
            discountRate1=0.3;
        }
        System.out.println("Yolculuk Tipini Giriniz --> 1-Tek Yön ---- 2-->Gidiş Dönüş");
        travelType= scanner.nextDouble();

        if (travelType==2){
            discountRate2=0.2;
        }

        normalPrice=mesafe*ratePerMile;
        ageDiscount=normalPrice*discountRate1;
        result=normalPrice-ageDiscount;
        result=result-(result*discountRate2);
        System.out.println("Toplam Tutar : "+result+" TL");

    }
}
