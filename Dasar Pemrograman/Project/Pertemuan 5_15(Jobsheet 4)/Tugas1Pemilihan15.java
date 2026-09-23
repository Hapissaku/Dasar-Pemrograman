import java.util.Scanner;
public class Tugas1Pemilihan15{
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);

    System.out.println("-----Sistem Cetak KRS-----");
    System.out.println("Apakah UKT Lunas?  (True/False");
    boolean uktlunas = sc.nextBoolean();

  String pesan = uktlunas
            ? "Pembayaran UKT terverifikasi. Silahkan cetak KRS dan minta tanda tangan DPA" 
            : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
        
            System.out.println(pesan);

    }
}