package Pertemuan11; // Menyatakan bahwa kelas ini berada dalam package bernama 'Pertemuan11'

// Latihan 1
public class L1_Lingkaran extends L1_Bentuk {
    // Kelas L1_Lingkaran merupakan turunan (subclass) dari kelas abstrak L1_Bentuk
    // Dengan kata lain, L1_Lingkaran mewarisi semua atribut dan method dari L1_Bentuk

    // Konstruktor untuk kelas L1_Lingkaran yang menerima parameter jari-jari
    public L1_Lingkaran(int jari2) {
        // Memanggil konstruktor dari superclass (L1_Bentuk) untuk menyetel nilai jari-jari
        super(jari2);
    }

    /*
     * Override (implementasi ulang) method abstrak luas() dari kelas induk (L1_Bentuk)
     * Digunakan untuk menghitung luas lingkaran dengan rumus: PHI * r * r
     */
    @Override
    public double luas() {
        // Mengembalikan hasil perhitungan luas lingkaran
        return PHI * jari2 * jari2;
    }
}
