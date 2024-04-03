import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //unos broja
        System.out.println("Unesite broj:");
        Scanner Skener = new Scanner(System.in);
        int broj = Skener.nextInt();

        //provjera da li je broj djeljiv sa 3 ili 7
        if (broj % 3 == 0 || broj % 7 == 0){
            int kvadrat = broj * broj;
            System.out.println("Kvadrat broja je: " + kvadrat);
        } else {
            int kub = broj * broj * broj;
            System.out.println("KubBroja je: " + kub);
        }
    }
}