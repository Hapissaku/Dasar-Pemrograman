import java.util.Scanner;
public class GajiKaryawan15 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int gaji_pokok, tj_transport = 600000, tj_mkn = 400000;
    double bonus, tot_gaji;
    System.out.print("Masukkan Gaji = " );
    gaji_pokok = sc.nextInt();
    bonus = 0.05*gaji_pokok;
    System.out.println("Bonus Anda = "+bonus);
    tot_gaji = gaji_pokok+tj_transport+tj_mkn+bonus-0.1*gaji_pokok;
    System.out.println("Total Gaji Anda = " + (int)tot_gaji);

    }
    
}
