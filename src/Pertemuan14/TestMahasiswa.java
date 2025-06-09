package Pertemuan14;

//Tugas 5
public class TestMahasiswa {
    public static void main(String[] args) {
        // Membuat beberapa objek Mahasiswa
        Mahasiswa m1 = new Mahasiswa("23001", "Andi");
        Mahasiswa m2 = new Mahasiswa("23002", "Budi");
        Mahasiswa m3 = new Mahasiswa("23003", "Citra");

        // Menampilkan info masing-masing mahasiswa
        m1.displayInfo();
        m2.displayInfo();
        m3.displayInfo();

        // Menampilkan total mahasiswa
        System.out.println("Total Mahasiswa Terdaftar: " + Mahasiswa.getTotalMahasiswa());
    }
}