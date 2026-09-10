import java.util.Scanner;
public class MenghitungTotalBayar15 {
    public static void main(String [] args) {
    double Harga;
    double potongan, jumlah_bayar, Diskon = 0.15;
Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan Harga = ");
    Harga = sc.nextInt();
    potongan = Harga*Diskon;
    jumlah_bayar = Harga-potongan;
    System.out.println("Jumlah yang Harus Anda Bayarkan = "+jumlah_bayar);

    }
    
}
