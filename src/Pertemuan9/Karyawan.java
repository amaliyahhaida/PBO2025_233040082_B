package Pertemuan9;

//Tugas Praktek
public class Karyawan {
 protected String nama;
 protected double gaji;

 public Karyawan(String nama, double gaji) {
     this.nama = nama;
     this.gaji = gaji;
 }

 public void tampilInfo() {
     System.out.println("Nama: " + nama);
     System.out.println("Gaji: " + gaji);
 }
}
