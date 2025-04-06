package pertemuan6;

public class Mahasiswa
{
    private String NRP;
    private String nama;

    public Mahasiswa()
    {
        this.NRP = "";
        this.nama = "";
    }

    public Mahasiswa(String nRP, String nama)
    {
        super();
        NRP = nRP;
        this.nama = nama;
    }

    public String display()
    {
        return "NRP: "+ NRP+ ", Nama: "+ nama;
    }

    /* Setter & Getter */
    public void setNRP(String nRP) {
        NRP = nRP;
    }

    public String getNRP() {
        return NRP;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}