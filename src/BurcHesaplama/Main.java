package BurcHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month=0,day=0;

        System.out.println("Doğduğunuz Ay'ı Giriniz :");
        month= scanner.nextInt();
        System.out.println("Doğduğunuz Gün'ü Giriniz :");
        day= scanner.nextInt();
        switch (month){
            case 1:
                if (day>=1&&day<=21){
                    System.out.println("Burcunuz => Oğlak");
                } else if (day>=22&&day<31) {
                    System.out.println("Burcunuz => Kova");
                }else{
                    System.out.println("Gün bilgisi Hatalı girildi!!!");
                }
                break;
            case 2:
                if (day>=1&&day<=19){
                    System.out.println("Burcunuz => Kova");
                } else if (day>=20&&day<29) {
                    System.out.println("Burcunuz => Balık");
                }else{
                    System.out.println("Gün bilgisi Hatalı girildi!!!");
                }
                break;
            case 3:
                if (day>=1&&day<=21){
                    System.out.println("Burcunuz => Balık");
                } else if (day>=22&&day<31) {
                    System.out.println("Burcunuz => Koç");
                }else{
                    System.out.println("Gün bilgisi Hatalı girildi!!!");
                }
                break;
            case 4:
                if (day>=1&&day<=21){
                    System.out.println("Burcunuz => Koç");
                } else if (day>=22&&day<30) {
                    System.out.println("Burcunuz => Boğa");
                }else{
                    System.out.println("Gün bilgisi Hatalı girildi!!!");
                }
                break;
            case 5:
                if (day>=1&&day<=21){
                    System.out.println("Burcunuz => Boğa");
                } else if (day>=22&&day<31) {
                    System.out.println("Burcunuz => İkizler");
                }else{
                    System.out.println("Gün bilgisi Hatalı girildi!!!");
                }
                break;
            case 6:
                if (day>=1&&day<=22){
                    System.out.println("Burcunuz => İkizler");
                } else if (day>=23&&day<30) {
                    System.out.println("Burcunuz => Yengeç");
                }else{
                    System.out.println("Gün bilgisi Hatalı girildi!!!");
                }
                break;
            case 7:
                if (day>=1&&day<=22){
                    System.out.println("Burcunuz => Yengeç");
                } else if (day>=23&&day<31) {
                    System.out.println("Burcunuz => Aslan");
                }else{
                    System.out.println("Gün bilgisi Hatalı girildi!!!");
                }
                break;
            case 8:
                if (day>=1&&day<=22){
                    System.out.println("Burcunuz => Aslan");
                } else if (day>=23&&day<31) {
                    System.out.println("Burcunuz => Başak");
                }else{
                    System.out.println("Gün bilgisi Hatalı girildi!!!");
                }
                break;
            case 9:
                if (day>=1&&day<=22){
                    System.out.println("Burcunuz => Başak");
                } else if (day>=23&&day<31) {
                    System.out.println("Burcunuz => Terazi");
                }else{
                    System.out.println("Gün bilgisi Hatalı girildi!!!");
                }
                break;
            case 10:
                if (day>=1&&day<=22){
                    System.out.println("Burcunuz => Terazi");
                } else if (day>=23&&day<31) {
                    System.out.println("Burcunuz => Akrep");
                }else{
                    System.out.println("Gün bilgisi Hatalı girildi!!!");
                }
                break;
            case 11:
                if (day>=1&&day<=21){
                    System.out.println("Burcunuz => Akrep");
                } else if (day>=22&&day<31) {
                    System.out.println("Burcunuz => Yay");
                }else{
                    System.out.println("Gün bilgisi Hatalı girildi!!!");
                }
                break;
            case 12:
                if (day>=1&&day<=21){
                    System.out.println("Burcunuz => Yay");
                } else if (day>=22&&day<31) {
                    System.out.println("Burcunuz => Oğlak");
                }else{
                    System.out.println("Gün bilgisi Hatalı girildi!!!");
                }
                break;
        }
    }
}
