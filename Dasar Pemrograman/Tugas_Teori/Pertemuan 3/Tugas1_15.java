import java.util.Scanner;

public class Tugas1_15 {
    public static void main(String[] args) {

        int HargaAwal, DP, Bulan, HargaSetelahDP, Cicilan;
        double bunga = 0.02;

    Scanner input = new Scanner(System.in);   
    
    System.out.print("Masukkan Harga Awal: ");  
    HargaAwal = input.nextInt();
    System.out.print("Masukkan DP: ");  
    DP = input.nextInt();
    System.out.print("Masukkan Lama Cicilan (Bulan): ");
    Bulan = input.nextInt();

    System.out.println("******************************");
    System.out.println("Harga Setelah DP    : " + (HargaAwal - DP));
    System.out.println("Bunga               : " + bunga);
    System.out.println("Cicilan Tiap  Bulan : " + (((HargaAwal - DP) / Bulan) + ((HargaAwal - DP) * bunga)));
    System.out.println("***********************************");
    
    }
}
    