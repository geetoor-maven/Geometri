
package Tugas5;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
         boolean kondisi = false;
        
         Hitung obj = new Hitung();
       
         Scanner input = new Scanner(System.in);
        
         obj.Output();
         System.out.println("---------------------------------------");
        
         
         do { 
              System.out.print("-- Apakah Anda Ingin Menghitung Kembali ? Y/T : ");
              String memilih = input.next();
            if(memilih.equals("Y")){
                obj.Output();
                kondisi = false;
            }else if(memilih.equals("T")){
                kondisi = true;
            }
        } while (!(kondisi));
    }
    
}
