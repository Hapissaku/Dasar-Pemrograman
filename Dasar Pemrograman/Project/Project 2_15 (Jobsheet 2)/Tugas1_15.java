import java.util.Scanner;
public class Tugas1_15 {
    public static void main(String[] args) {
       int  jumlah_anak;
       double gaji_pokok , tunjangan_anak = 100000, potongan = 0.10 ;
       int gajipokok_pakdanur = 5000000, anak_pakdanur = 4;


Scanner input = new Scanner(System.in);

       System.out.println("Gaji Pak Danur");
       System.out.println("Gaji Pokok : "+ gajipokok_pakdanur);
       System.out.println("Potongan : "+ (gajipokok_pakdanur * potongan));
       System.out.println("Tunjangan Anak : "+ (tunjangan_anak * anak_pakdanur));
       System.out.println("Gaji Bersih : "+ ( (gajipokok_pakdanur)-(gajipokok_pakdanur*potongan) + (anak_pakdanur*tunjangan_anak)));

       System.out.println("\nPengen Coba Juga?"); 

       System.out.print("\nMasukkan gaji pokok : ");
       gaji_pokok = input.nextDouble();
       System.out.print("Masukkan jumlah anak : ");
       jumlah_anak = input.nextInt();

       double gaji =( (gaji_pokok)-(gaji_pokok*potongan) + (jumlah_anak*tunjangan_anak)); 
       System.out.println("Gaji Pokok : "+ gaji);


    }
}