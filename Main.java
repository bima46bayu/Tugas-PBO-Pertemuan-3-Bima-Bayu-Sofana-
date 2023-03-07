import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        memanggil method daftar belanja
        System.out.println("daftar belanjaan Dina");
        daftarBarang daftar = new daftarBarang();
        daftar.Belanja();
//        memanggil method barang yang di beli
        System.out.println("barang yang di beli Dina");
        daftarBarang beli = new daftarBarang();
        beli.Beli();
//        memanggil metthod kondisi uang dina
        daftarBarang total = new daftarBarang();
        total.Total();
    }
}