package Pertemuan11;

//Kelas Main
public class T_MainTugas {
 public static void main(String[] args) {
     T_Kendaraan mobil = new T_Mobil("D 1234 AB", 1500);
     T_Kendaraan motor = new T_Motor("D 5678 CD", 250);

     System.out.println("Mobil:");
     System.out.println("Plat Nomor: " + mobil.getPlatNomor());
     System.out.println("Pajak: Rp " + mobil.hitungPajak());

     System.out.println("\nMotor:");
     System.out.println("Plat Nomor: " + motor.getPlatNomor());
     System.out.println("Pajak: Rp " + motor.hitungPajak());
 }
}

