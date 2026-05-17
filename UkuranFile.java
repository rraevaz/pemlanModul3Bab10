package Menulislah;
import java.io.File;

public class UkuranFile {
    public static void main(String[] args) {
        var file = new File("test.txt");

        if (file.exists()) {
            long bytes = file.length();

            //1 kb = 1024 byte, 1 mb = 1048576 byte
            if (bytes < 1048576) {
                double kb = bytes/1024.0;
                System.out.printf("Ukuran file: %.2f KB%n", kb);
            } else {
                double mb = bytes/1048576.0;
                System.out.printf("Ukuran file: %.2f MB%n", mb);
            }
        } else {
            System.out.println("File tidak ditemukan");
        }
    }
}
