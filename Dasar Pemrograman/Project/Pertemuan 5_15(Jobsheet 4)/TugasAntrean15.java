import java.util.Scanner;
public class TugasAntrean15 {
    public static void main(String[] args) {
        
   int nomor;     

   Scanner input  = new Scanner(System.in);
   System.out.print("Masukkan Input Nomor (1-4) = ");
   nomor = input.nextInt();

    switch(nomor){
        case 1:
            System.out.println("Legalisir Ijazah, Loket A");
            break;
         case 2:
            System.out.println("Surat Keterangan Aktif Kuliah, Loket B");
            break;
        case 3:
            System.out.println("Pebayaran UKT, Loket C");
            break;
         case 4:
            System.out.println("Pengajuan Cuti Akademik, Loket D");
            break;
        default :
            System.out.println("Nomor Tidak Valid");


}
}
}
