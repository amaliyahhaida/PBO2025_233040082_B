package Pertemuan14;

//Tugas 4
public class TestDatabaseConnection {
    public static void main(String[] args) {
        // Mengakses variabel static akan memicu eksekusi static block (jika belum terjadi)
        System.out.println("Database Connection String: " + DatabaseConnection.connectionString);
    }
}

