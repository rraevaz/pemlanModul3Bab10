package Menulislah;
import java.io.File;

public class NamaFile {
    public static void main(String[] args) {
        var direktori = new File(".");

        if (direktori.exists() && direktori.isDirectory()) {
            // Menggunakan method listFiles() untuk mengambil array objek File
            File[] daftarFile = direktori.listFiles();

            System.out.println("Daftar file di dalam direktori " + direktori.getAbsolutePath() + ":");
            System.out.println("-----------------------------------");

            if (daftarFile != null) {
                for (File f : daftarFile) {
                    // Hanya menampilkan file, bukan sub direktori
                    if (f.isFile()) {
                        System.out.println(f.getName());
                    }
                }
            }
        } else {
            System.out.println("Direktori tidak ditemukan atau bukan sebuah folder!");
        }
    }
}
