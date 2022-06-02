package NumberSort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c,max=0,mid=0,min=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Sayıyı Giriniz :");
        a= scanner.nextInt();
        System.out.println("2. Sayıyı Giriniz :");
        b= scanner.nextInt();
        System.out.println("3. Sayıyı Giriniz :");
        c= scanner.nextInt();
        if (a>b&&a>c){
            max=a;
            if (b>c){mid=b;min=c;}else{mid=c;min=b;}
        }else if (b>a&&b>c){
            max=b;
            if (a>c){mid=a;min=c;}else{mid=c;min=a;}
        }else if (c>b&&c>a){
            max=c;
            if (b>a){mid=b;min=a;}else{mid=a;min=b;}
        }
        System.out.println("Sayıların sıralaması: " + min +" "+mid+" "+max);

    }
}
