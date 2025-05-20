package Pertemuan9;

public class Main {
    public static void main(String[] args) {

        // Latihan 1
        System.out.println("- Latihan 1:");
        Orang org = new Orang("Ade Sukendar", "Bandung");
        org.tampilData();

        System.out.println();

        // Latihan 2
        System.out.println("- Latihan 2:");
        Mahasiswa mhs1 = new Mahasiswa("Budi", "Jakarta", "225040100");
        mhs1.tampilData();

        System.out.println();

        // Latihan 3
        System.out.println("- Latihan 3:");
        Mahasiswa mhs2 = new Mahasiswa("Citra", "Yogyakarta", "225040101");
        mhs2.tampilData();

        System.out.println();

        // Latihan 4
        System.out.println("- Latihan 4:");
        Mahasiswa mhs3 = new Mahasiswa("Rina", "Sumedang", "123456");
        mhs3.tampilData();

        System.out.println();

        // Tugas Praktek
        System.out.println("- Tugas:");
        Manager mgr = new Manager("Sari", 8500000, "Keuangan");
        mgr.tampilInfo();
    }
}
