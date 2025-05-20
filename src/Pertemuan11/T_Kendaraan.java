package Pertemuan11;

//Kelas Abstrak Kendaraan
	abstract class T_Kendaraan implements T_Identifikasi {
	 protected String platNomor;
	 protected int kapasitasMesin;
	
	 public T_Kendaraan(String platNomor, int kapasitasMesin) {
	     this.platNomor = platNomor;
	     this.kapasitasMesin = kapasitasMesin;
	 }
	
	 public String getPlatNomor() {
	     return platNomor;
	 }
	
	 public abstract double hitungPajak();
	}