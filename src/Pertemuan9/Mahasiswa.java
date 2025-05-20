package Pertemuan9;

//Latihan 2, 3, 4
public class Mahasiswa extends Orang {
    private String nrp;

    public Mahasiswa(String nama, String alamat, String nrp) {
        super(nama, alamat);
        this.nrp = nrp;
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("NRP: " + nrp);
    }
}
