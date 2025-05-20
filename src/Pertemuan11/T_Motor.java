package Pertemuan11;

//Kelas Motor
	class T_Motor extends T_Kendaraan {
	
	 public T_Motor(String platNomor, int kapasitasMesin) {
	     super(platNomor, kapasitasMesin);
	 }
	
	 @Override
	 public double hitungPajak() {
	     return kapasitasMesin * 500;
	 }
	}

