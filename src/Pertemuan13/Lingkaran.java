package Pertemuan13;

//Subclass: Lingkaran
class Lingkaran extends Bentuk {
 double jariJari;

 Lingkaran(String nama, double jariJari) {
     super(nama);
     this.jariJari = jariJari;
 }

 @Override
 void gambar() {
     System.out.println("[" + nama + "] adalah LINGKARAN dengan jari-jari " + jariJari);
 }
}
