package Pertemuan14;

//Tugas 5
public class Mahasiswa {
    // NIM adalah final: tidak bisa diubah setelah objek dibuat
    private final String nim;

    // Nama bisa diubah setelah inisialisasi
    private String nama;

    // Variabel static: dimiliki bersama oleh seluruh objek Mahasiswa
    private static int totalMahasiswa = 0;

    // Konstanta global: batas maksimum SKS
    public static final int MAX_SKS = 24;

    // Konstruktor: menginisialisasi nim dan nama, serta meningkatkan total mahasiswa
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        totalMahasiswa++; // Setiap kali objek dibuat, jumlah total bertambah
    }

    // Method untuk menampilkan info mahasiswa
    public void displayInfo() {
        System.out.println("NIM        : " + nim);
        System.out.println("Nama       : " + nama);
        System.out.println("Max SKS    : " + MAX_SKS);
        System.out.println("-------------------------");
    }

    // Method static untuk mengakses total mahasiswa
    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }

    // Optional: setter jika ingin ubah nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Optional: getter
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }
}
