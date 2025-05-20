package Pertemuan11;

//Kelas Mobil
	class T_Mobil extends T_Kendaraan {
	
	 public T_Mobil(String platNomor, int kapasitasMesin) {
	     super(platNomor, kapasitasMesin);
	 }
	
	 @Override
	 public double hitungPajak() {
	     return kapasitasMesin * 1000;
	 }
	}