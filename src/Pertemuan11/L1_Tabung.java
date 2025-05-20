package Pertemuan11; // Menyatakan bahwa kelas ini berada dalam package bernama 'Pertemuan11'

// Latihan 1
public class L1_Tabung extends L1_Bentuk {
    // Kelas L1_Tabung adalah subclass dari L1_Bentuk yang merepresentasikan bentuk tabung

    // Atribut tinggi untuk menyimpan nilai tinggi tabung
    private int tinggi;

    // Konstruktor default (tanpa parameter)
    public L1_Tabung() {
        super(0); // Memanggil konstruktor superclass dengan nilai jari-jari 0
    }

    // Konstruktor dengan parameter jari-jari dan tinggi
    public L1_Tabung(int jari2, int tinggi) {
        super(jari2);         // Mengatur nilai jari-jari melalui konstruktor superclass
        this.tinggi = tinggi; // Menyimpan nilai tinggi ke atribut lokal
    }

    /*
     * Override method luas() dari L1_Bentuk
     * Menghitung luas permukaan tabung dengan rumus:
     * Luas = 2 * π * r * (r + t), di mana:
     * r = jari-jari, t = tinggi
     */
    @Override
    public double luas() {
        return 2 * Math.PI * jari2 * (jari2 + tinggi);
    }

    // Getter untuk mengambil nilai tinggi
    public int getTinggi() {
        return tinggi;
    }

    // Setter untuk mengatur nilai tinggi
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
}
