package ActivitySelection;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Hava Sıcaklığını Giriniz :");
        int c = scanner.nextInt();
        if (c<=5)
            System.out.println("Kayağa Gidin!");
        else if (c>5&&c<=15)
            System.out.println("Sinemaya Gidin!");
        else if (c>15&&c<=25)
            System.out.println("Pikniğe Gidin!");
        else if (c>25)
            System.out.println("Yüzmeye Gidin!");
    }
}
