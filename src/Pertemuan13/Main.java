package Pertemuan13;

public class Main {
    public static void main(String[] args) {
        // Polymorphism: Semua bertipe Bentuk
        Bentuk[] daftarBentuk = new Bentuk[3];
        daftarBentuk[0] = new Lingkaran("Bentuk A", 7);
        daftarBentuk[1] = new Tabung("Bentuk B", 5, 10);
        daftarBentuk[2] = new Lingkaran("Bentuk C", 3.5);

        // Proses semua bentuk
        for (Bentuk b : daftarBentuk) {
            b.gambar();  // Method override akan dipanggil sesuai jenis objek aslinya
        }
    }
}


