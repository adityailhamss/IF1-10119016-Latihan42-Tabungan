package if1.pkg10119016.latihan42.tabungan;
import java.util.Scanner;
/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan program 
 * menghitung saldo tabungan menggunakan getter setter
 */
public class IF110119016Latihan42Tabungan {

    
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("======Program Penarikan Saldo");
       System.out.print("Masukkan Saldo Awal\t\t: ");
       Tabungan tabungan = new Tabungan(scan.nextInt());
       System.out.print("Jumlah Uang Yang Diambil\t: ");
       int sisaSaldo = tabungan.ambilTabungan(scan.nextInt());
       System.out.println("Saldo Anda Sekarang\t\t: " +sisaSaldo);
    }
    
}
