import java.util.Scanner;
public class PemilihanIF15{
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);

    System.out.println("-----Sistem Cetak KRS-----");
    System.out.println("Apakah UKT Lunas?  (True/False");
    boolean uktlunas = sc.nextBoolean();

    if (uktlunas){
        System.out.println("Pembayaran UKT Terverivikasi");
        System.out.println("Cetak KRS dan Minta Tanda Tangan DPA");
    }
    else{
        System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
    }



        

    }
}