package Pertemuan11; // Menyatakan bahwa kelas ini berada dalam paket bernama 'Pertemuan11'

// Latihan 1
public abstract class L1_Bentuk {
    // Mendefinisikan konstanta PHI dengan nilai 3.14, biasanya digunakan dalam perhitungan lingkaran
    protected double PHI = 3.14;

    // Variabel jari-jari (radius) dengan akses protected agar bisa diakses oleh subclass
    protected int jari2;

    // Konstruktor dengan parameter jari2 untuk menginisialisasi nilai jari-jari
    public L1_Bentuk(int jari2) {
        super(); // Memanggil konstruktor dari superclass (dalam hal ini Object), meskipun opsional
        this.jari2 = jari2; // Mengisi nilai atribut jari2 dengan nilai yang diberikan lewat parameter
    }

    // Metode abstrak yang harus diimplementasikan oleh subclass
    // Metode ini akan digunakan untuk menghitung luas bentuk
    public abstract double luas();

    // Method getter untuk mengambil nilai jari-jari
    public int getJari2() {
        return jari2;
    }

    // Method setter untuk mengubah nilai jari-jari
    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }
}
