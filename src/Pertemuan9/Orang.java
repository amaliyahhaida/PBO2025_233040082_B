package Pertemuan9;

//Latihan 1, 2, 3, 4
public class Orang {
 protected String nama;
 protected String alamat;

 public Orang(String nama, String alamat) {
     this.nama = nama;
     this.alamat = alamat;
 }

 public void tampilData() {
     System.out.println("Nama: " + nama);
     System.out.println("Alamat: " + alamat);
 }
}
