package UserVerify;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanıcı Adını Giriniz :");
        String user = scanner.nextLine();
        System.out.println("Kullanıcı Şifresini Giriniz :");
        String password = scanner.nextLine();

        if (user.equals("admin")&&password.equals("12345"))
            System.out.println("Başarılı!!");
        else
            System.out.println("Kullanıcı Bilgileri Hatalı!!!");

    }
}
