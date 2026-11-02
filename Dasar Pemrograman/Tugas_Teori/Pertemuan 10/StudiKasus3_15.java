import java.util.Scanner;

public class StudiKasus3_15{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int totalsemua=0;

        for(int i=1; i<=3; i++){
            System.out.println("Produk " + i);
            int totalproduk = 0;
            for(int j = 1; j<=4; j++){
                System.out.print("Hari " + j + " = ");
                int jumlah = sc.nextInt();
                totalproduk += jumlah;

            }
            System.out.println("Total Produk " + i + " =" + totalproduk);
            totalsemua += totalproduk;
        }
        System.out.println("Total Semua Produk = " + totalsemua);

        sc.close();

    }
    
}
