package Pertemuan9;

//Tugas Praktek
public class Manager extends Karyawan {
    private String departemen;

    public Manager(String nama, double gaji, String departemen) {
        super(nama, gaji);
        this.departemen = departemen;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Departemen: " + departemen);
    }
}
