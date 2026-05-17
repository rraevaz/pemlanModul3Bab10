package Menulislah;
import java.io.File;

public class HapusDirektori {
    public static void main(String[] args) {
        var direktori = new File("Otw_Dihapus");

        if(direktori.exists() && direktori.isDirectory()) {
            File[] fileDalam = direktori.listFiles();

            if (fileDalam != null) {
                for (File adalah : fileDalam) {
                    if (adalah.isFile()) {
                        adalah.delete();
                    }
                }
            }
            if (direktori.delete()) {
                System.out.println("Direktori yang dipilih dan semua file di dalamnya berhasil dihapus.");
            } else {
                System.out.println("Gagal menghapus direktori yang dipilih.");
            }
        } else {
            System.out.println("Direktori tidak ditemukan.");
        }
    }
}
