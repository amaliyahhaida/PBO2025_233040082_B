package Pertemuan14;

//Tugas 4
public class DatabaseConnection {
    public static String connectionString;

    // Static block akan dijalankan sekali saat kelas pertama kali dimuat
    static {
        connectionString = "jdbc:mysql://localhost:3306/mydatabase";
        System.out.println("Static block executed: Connection string initialized.");
    }
}

