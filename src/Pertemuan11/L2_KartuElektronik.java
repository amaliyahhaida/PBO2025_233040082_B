package Pertemuan11;

//Latihan 2
public class L2_KartuElektronik implements L2_Kartu {
    private String kodeBank; // Menyimpan kode bank
    private String pin;      // Menyimpan PIN asli (belum terenkripsi)

    // Konstruktor untuk inisialisasi data kartu elektronik
    public L2_KartuElektronik(String kodeBank, String pin) {
        super();                  // Memanggil konstruktor superclass (tidak wajib karena ini bukan turunan kelas)
        this.kodeBank = kodeBank;
        this.pin = pin;
    }

    // Implementasi metode otentikasi dari interface
    @Override
    public boolean otentikasi(String pinInput) {
        // Mengecek apakah PIN yang dimasukkan sesuai dengan PIN yang tersimpan
        if (pin.equals(pinInput))
            return true;          // Jika sesuai, otentikasi berhasil
        else
            return false;         // Jika tidak sesuai, otentikasi gagal
    }

    // Implementasi metode encode (sementara belum melakukan enkripsi)
    @Override
    public String encode(String pin) {
        // melakukan enkripsi inputan PIN (belum diimplementasikan)
        return null;
    }
}


