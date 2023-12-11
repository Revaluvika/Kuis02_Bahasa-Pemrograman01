/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraymultidimensi;

/**
 *
 * @author REVA
 */
import java.util.Scanner;
public class Arraymultidimensi {
    public static void main(String[] args) {
        // Menyiapkan array multidimensi untuk menyimpan daftar barang dan harga
 String[][] daftarBarang = {
            {"Meja", "Sofa", "Tv", "Lemari"},
            {"17000000", "38000000", "1800000", "15000000"}
        };
        Scanner scanner = new Scanner(System.in);
        // Menampilkan daftar barang
        System.out.println("Daftar Barang:");
        for (int i = 0; i < daftarBarang[0].length; i++) {
            System.out.println(daftarBarang[0][i] + ": Rp " + daftarBarang[1][i]);
        }
        // Meminta pengguna untuk memasukkan kata kunci pencarian
        System.out.print("\nMasukkan kata kunci pencarian: ");
        String kataKunci = scanner.nextLine();
// Melakukan pencarian barang
        int indeksBarang = cariBarang(daftarBarang[0], kataKunci);
        if (indeksBarang != -1) {
            // Menampilkan informasi barang jika ditemukan
            System.out.println("\nBarang ditemukan:");
            System.out.println("Nama: " + daftarBarang[0][indeksBarang]);
            System.out.println("Harga: Rp " + daftarBarang[1][indeksBarang]);
        } else {
            // Menampilkan pesan jika barang tidak ditemukan
            System.out.println("\nBarang tidak ditemukan.");
        }
        scanner.close();
 }
    // Metode untuk mencari indeks barang berdasarkan kata kunci
    private static int cariBarang(String[] daftarBarang, String kataKunci) {
        for (int i = 0; i < daftarBarang.length; i++) {
            if (daftarBarang[i].toLowerCase().contains(kataKunci.toLowerCase())) {
                return i;
            }
        }
        return -1; // Mengembalikan -1 jika barang tidak ditemukan
    }
}
