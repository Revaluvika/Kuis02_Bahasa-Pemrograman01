/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sorting;

/**
 *
 * @author REVA
 */

public class Sorting {
    public static void main(String[] args) {
        int data []={10000,21000,12000,15000,30000};
        System.out.println("Bubblel Sort");
        //menampilkan array sebelum diurutkan
        System.out.print("Harga Barang Awal: ");
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("");
        //pengurutan array memakai bubblel sort
        for(int i=0; i<data.length; i++){
            for(int j=0; j<data.length-1; j++){
                if(data[j]<data[j+1]){
                    //tukar data
                    int temp = data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;
                }//end if
            }//end loop j
        }//end loop i
        //mmenampilkan array setelah diurutkan
        System.out.print("Harga Barang Akhir : ");
        for(int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("");
                }
            }
