package Pertemuan__9;

public class Main {
    public static void main(String[] args) {
        Mobil mbl = new Mobil("Toyota", 2020, 4);

        System.out.println("Merk: " + mbl.getMerk());
        System.out.println("Tahun: " + mbl.getTahun());
        System.out.println("Jumlah Pintu: " + mbl.getJumlahPintu());
    }
}

