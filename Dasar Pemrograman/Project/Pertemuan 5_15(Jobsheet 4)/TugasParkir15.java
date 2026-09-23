import java.util.Scanner;
public class TugasParkir15{
    public static void main(String[]args){   

    int tarif = 2000, lama_parkir;

    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan Jumlah Jam Parkir = ");
    lama_parkir = input.nextInt();

    if (lama_parkir <= 2) {
        System.out.println("Biaya anda adalah = " + tarif);}
    else
        System.out.println("Biaya anda adalah = " + (lama_parkir*1000));
    }
}