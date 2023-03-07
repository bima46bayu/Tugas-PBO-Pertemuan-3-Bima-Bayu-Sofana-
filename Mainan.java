import java.util.Scanner;

public class Mainan {
    int mainanToko;
    int mainanBeli;
    int total;

    int mainanToko() {
//        atribut input mainan di toko
        System.out.println("Masukan jumlah mainan di toko :");
        Scanner input = new Scanner(System.in);
        int toko = input.nextInt();
        return toko;
    }
    int mainanBeli(){
//        atribut mainan yang dibeli
        System.out.println("Masukan jumlah mainan yang dibeli :");
        Scanner input = new Scanner(System.in);
        int beli = input.nextInt();
        return beli;
    }
    void kondisi(){
//        method kondisi mainan di toko setelah di beli
        int toko = mainanToko();
        int beli = mainanBeli();
        int total = toko - beli;
        if (beli < toko){
            System.out.println("Mainan di toko sisa " + total);
        }else if (total == 0) {
            System.out.println("Mainan di toko habis " );
        }else {
            System.out.println("Mainan di toko kurang " );
        }
    }
}


