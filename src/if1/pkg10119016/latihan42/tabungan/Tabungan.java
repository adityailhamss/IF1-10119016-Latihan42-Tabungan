package if1.pkg10119016.latihan42.tabungan;

/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan program 
 * menghitung saldo tabungan menggunakan getter setter
 */
public class Tabungan {
 private int saldo;
    public Tabungan(int saldo){
        this.saldo = saldo;
    }

    public int ambilTabungan(int jumlah){
        return saldo - jumlah;
        
    }
}
