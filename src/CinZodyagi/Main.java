package CinZodyagi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] calendar = {"Maymun","Horoz","Köpek","Domuz","Fare","Öküz","Kaplan","Tavşan","Ejderha","Yılan","At","Koyun"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Doğum Yılınızı Giriniz : ");
        int year = scanner.nextInt();
        System.out.println("Çin Zodyağı Burcunuz : " + calendar[year%12]);
    }
}
