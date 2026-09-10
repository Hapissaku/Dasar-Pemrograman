import java.util.Scanner;

public class Tugas2_15 {
    public static void main(String[] args) {

        int lembar, HargaPerLembar = 500, Biayajilid = 5000, TotalBayar;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Lembar: ");
        lembar = input.nextInt();  
        
        TotalBayar = (lembar * HargaPerLembar) + Biayajilid;
        System.out.println("******************************");
        System.out.println("Harga Per Lembar    : " + HargaPerLembar);
        System.out.println("Biaya Jilid         : " + Biayajilid);
        System.out.println("Total Bayar         : " + TotalBayar);
        System.out.println("***********************************");












    }
}
