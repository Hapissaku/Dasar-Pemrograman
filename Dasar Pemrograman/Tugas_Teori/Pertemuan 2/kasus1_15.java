/* Algoritma Menghitung Keliling Persegi Panjang
   1. Masukkan panjang
   2. Masukkan lebar
   3. Hitung keliling dengan rumus: keliling = 2 * (panjang + lebar)
   4. Tampilkan hasil keliling */

import java.util.Scanner;
public class kasus1_15 {
    public static void main(String[] args) {

      
@SuppressWarnings("resource")
Scanner input = new Scanner(System.in);


        int panjang, lebar, keliling;

        System.out.print("Masukkan panjang: ");
        panjang = input.nextInt();
        System.out.print("Masukkan lebar: ");
        lebar = input.nextInt();
        keliling = 2 * (panjang + lebar);

        System.out.println("Keliling persegi panjang adalah: " + keliling);
    
        
    }
    

}