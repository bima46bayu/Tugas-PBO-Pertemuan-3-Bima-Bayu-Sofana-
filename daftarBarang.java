import java.util.ArrayList;

public class daftarBarang {
//    membuat class daftar barang
    private ArrayList<String> Barang = new ArrayList<>();
//    membuat privat arraylist untuk daftar barang
    public daftarBarang() {
//        membuat daftar barang yang public agar bisa menggunakan fungsi add
        Barang.add("cabai");
        Barang.add("bawang");
        Barang.add("bayam");
        Barang.add("beras");
        Barang.add("tempe");
    }

        int hargaCabai = 3000;
        int hargaBayam = 2000;
        int hargaBawang = 3000;
        int hargaTempe = 5000;
        int hargaBeras = 20000;
        int hargaAyam = 20000;
        int hargaMinyak = 12000;
        int uang = 50000;
//        membuat daftar harga dalam int

        void Belanja () {
//            method belanja untuk menampilkan daftar belanja
            System.out.println(Barang.toString());
        }

        void Beli () {
//            method beli untuk menampilkan daftar barang yang di beli
//            ditambahkan dengan menghilangkan cabai dan menambahkan ayam dan minyak
            Barang.remove("cabai");
            Barang.add("ayam");
            Barang.add("minyak");
            System.out.println(Barang.toString());
        }
        void Total () {
//            method total untuk menampilkan kondisi uang dina menggunakan if dan else
            int total = hargaAyam + hargaBawang + hargaBayam + hargaMinyak + hargaBeras + hargaTempe;
//            int total digunakan untuk menghitung total belanjaan
            System.out.println("Total belanja Dina " + total);
            String keterangan = "";
            if (total > uang) {
                keterangan = "Kurang";
            } else if (total == uang) {
                keterangan = "Pas";
            } else {
                keterangan = "Lebih";
            }
            System.out.println("Uang Dina " + keterangan);

        }


}












