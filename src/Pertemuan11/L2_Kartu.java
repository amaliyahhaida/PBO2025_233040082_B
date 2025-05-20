package Pertemuan11;

// Latihan 2
public interface L2_Kartu {
    // Metode untuk melakukan otentikasi berdasarkan PIN
    public boolean otentikasi(String pin);

    // Metode untuk mengenkripsi PIN (encode)
    public String encode(String pin);
}
