import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {

        Scanner girdi =new Scanner(System.in);

        System.out.println("1.sayi girin");
        int n = girdi.nextInt();

        System.out.println("2.sayi girin");
        int r = girdi.nextInt();

        int prodn = 1; int prodr=1; int prodnr =1;

        for (int i=n; i>=1; i--){
            prodn *= i;
            }

        for (int i=r; i>=1; i--){
            prodr *= i;
            }

        for (int i=(n-r); i>=1; i--){
            prodnr *= i;
            }

        double sonuc = prodn / (prodr*prodnr);

        System.out.println(sonuc);
    }
}
