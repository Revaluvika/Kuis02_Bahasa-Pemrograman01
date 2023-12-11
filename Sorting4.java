/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sorting4;

/**
 *
 * @author REVA
 */
import java.util.Scanner;
public class Sorting4 {
    public static void main(String[] args) {
         String barang[][] = new String[5][10];
          Scanner s = new Scanner(System.in);
          int baris=0, kolom=0, pilih;
          do {
               System.out.println("\nLoker Digital");
               System.out.println("1. Masukan Barang");
               System.out.println("2. Cari Barang");
               System.out.println("3. Status Barang");
               System.out.println("4. Selesai");
               System.out.print("Pilih = ");
               pilih = s.nextInt();
               switch(pilih) {
                      case 1 : String benda;
                    int i,j=0;
                    boolean ketemu=false;
                    System.out.print("Nama Barang = ");
                    benda = s.next();
                    System.out.println("Cari Barang...");
                    for (i = 0; i < 5; i++) {
                         baris = i;
                         for (j = 0; j < 10; j++) {
                              kolom = j;
                              if(barang[i][i]==null) {  //barang kosong
                                   ketemu = true;
                                   break;
                                     }
                         }
                         if(ketemu) break;
                    }
                    if(i==5 && j==10) {  //melebihi batas loker
                         System.out.println("Loker Penuh");
                    }
                    else {
                         barang[baris][kolom] = benda; //simpan barang
                         System.out.println(baris+"-"+kolom);
                    }
                    break;
                    case 2: benda = "";
                    ketemu = false;
                    j = 0;
                    System.out.println("Barang yang dicari = ");
                    benda = s.next();
                    System.out.println("Pencarian...");
                    for(i = 0; i < 5; i++) {
                         baris = i;
                         for (j = 0; j < 10; j++) {
                              kolom = j;
                              if(barang[i][j].compareToIgnoreCase(benda)==0) {
                                   ketemu = true;
                                   break; //hentikan loop j
                              }
                         }
                                     if(ketemu) break; //hentikan loop i
                    }
                    if(i==5) {  //pencarian melebihi batas indeks
                         System.out.println("Barang tidak ada");
                    }     
                    else {
                       System.out.println("Ada di "+baris+"-"+kolom);     
                    }
                    break;
                    case 3: int isi=0, kosong=0;
                    System.out.println("Cek Barang...");
                    for (i = 0; i < 5; i++) {
                         for (j = 0; j < 10; j++) {
                              if(barang[i][j]==null)
                                   kosong++;
                              else
                                   isi++;
                         }
                    }
                     System.out.println("Barang ada: "+isi);
               System.out.println("Barang kosong: "+kosong);
               break;
               }
    
          }while(pilih!=4);
    }//batas main
}//batas class
  
