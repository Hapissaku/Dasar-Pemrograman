import java.util.Scanner;
public class Latihan5_2_15 {
    public static void main(String[] args) {
        
   int nomor;     

   Scanner input  = new Scanner(System.in);
   System.out.print("Masukkan Input Nomor (1-4) = ");
   nomor = input.nextInt();

   if (nomor == 1){
    System.out.print("Legalisir Ijazah, Loket A");
   }
   else if (nomor == 2){
    System.out.print("Surat Keterangan Aktif Kuliah, Loket B");
   }
   else if (nomor == 3){
    System.out.print("Pebayaran UKT, Loket C");
    }
   else if (nomor == 4){
    System.out.print("Pengajuan Cuti Akademik, Loket D"); 
}
    else
    System.out.print("Nomor Tidak Valid");
}
}
