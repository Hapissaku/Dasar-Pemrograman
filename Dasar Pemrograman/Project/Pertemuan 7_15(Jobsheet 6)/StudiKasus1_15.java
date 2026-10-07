import java.util.Scanner;
public class StudiKasus1_15 {
    public static void main(String[] args) {

    int hargaPerCup = 1800, jumlahCup, totalHarga, diskon = 0, totalBayar, kembalian, kurang, uangBayar;

    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan Jumlah Cup = ");
    jumlahCup = sc.nextInt();
    System.out.print("Masukkan Total Bayar = ");
    uangBayar = sc.nextInt();

    totalHarga = jumlahCup*hargaPerCup;
    System.out.println("Total Harga = "+totalHarga);

    if (totalHarga > 100000){
        diskon = totalHarga*10/100;

    }
    else{
        diskon = 0;
    }
        totalBayar = totalHarga-diskon;

    System.out.println("Diskon = "+ diskon);
    System.out.println("Total Bayar = "+ totalBayar);
    
    if (uangBayar >= totalBayar){
        kembalian = uangBayar-totalBayar;
        System.out.println("Uang Kembalian Anda = "+kembalian);
    }
    else{
        kurang = totalBayar - uangBayar;
        System.out.println("Uang Tidak Cukup, Kurang "+kurang);
    }
    sc.close();
    }
}