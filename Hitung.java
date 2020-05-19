
package Tugas5;

import java.util.Scanner;


public class Hitung {
   Scanner input = new Scanner(System.in);
   
   public void Output(){
        System.out.println("--- MENGHITUNG GEOMETRI ---");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("-- 1. Cari Luas Persegi Panjang");
        System.out.println("-- 2. Cari Keliling Lingkaran");
        System.out.println("-- 3. Cari Volume Balok");
        System.out.println("---------------------------------------");
        System.out.print("-- Pilihan Anda : ");
        int pilihan = input.nextInt();
        
        if(pilihan == 1){
            System.out.print("-- Masukan Panjang Persegi :  ");
            int panjang = input.nextInt();
            System.out.print("-- Masukan Lebar Persegi :  ");
            int lebar =  input.nextInt();
            int luas = panjang * lebar;
            System.out.println("-- Luas Persegi Panjang Adalah :  "+ luas);
        }else if(pilihan == 2){
            System.out.print("-- Masukan Radius Lingkaran :  ");
            int radius = input.nextInt();
            double keliling = 2 * 3.14 * radius;
            System.out.println("-- Keliling Lingkaran Tersebut Adalah : "+keliling);
        }else if(pilihan == 3){
            System.out.print("-- Masukan Panjang Balok :");  
            int p = input.nextInt();
            System.out.print("-- Masukan Lebar Balok : ");
            int l = input.nextInt();
            System.out.print("-- Masukan Tinggi Balok : ");
            int t = input.nextInt();
            int volume = p * l * t;
            System.out.println("-- Volume Balok Adalah : "+volume);
        }
   }
   
   
}
