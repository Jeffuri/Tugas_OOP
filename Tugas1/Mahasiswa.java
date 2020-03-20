package Tugas1;

/**
 *
 * @author Jefri
 */
public class Mahasiswa {
    String nim,nama,kelas;
    public static void main(String[] args) {
        
        Mahasiswa j = new Mahasiswa();
        
        j.nim = "18090025";
        j.nama = " Jefri Haris Laksamana";
        j.kelas = "4D";
        
        System.out.println("NIM = "+j.nim);
        System.out.println("NAMA = "+j.nama);
        System.out.println("KELAS = "+j.kelas);
    }
}
