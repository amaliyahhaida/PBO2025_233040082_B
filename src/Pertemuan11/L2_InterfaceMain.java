package Pertemuan11;

//Latihan 2
public class L2_InterfaceMain {
    public static void main(String[] args) {
        // Membuat objek L2_KartuElektronik dengan kode bank "IF111" dan PIN "123"
        L2_KartuElektronik kartu = new L2_KartuElektronik("IF111", "123");

        // Melakukan otentikasi dengan memasukkan PIN "123"
        System.out.println("Otentikasi: " + kartu.otentikasi("123"));
        // Output akan true karena PIN input sama dengan PIN asli
    }
}
