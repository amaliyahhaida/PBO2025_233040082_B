package Pertemuan13;

//Subclass: Tabung
class Tabung extends Bentuk {
 double tinggi, jariJari;

 Tabung(String nama, double jariJari, double tinggi) {
     super(nama);
     this.jariJari = jariJari;
     this.tinggi = tinggi;
 }

 @Override
 void gambar() {
     System.out.println("[" + nama + "] adalah TABUNG dengan jari-jari " + jariJari + " dan tinggi " + tinggi);
 }
}
