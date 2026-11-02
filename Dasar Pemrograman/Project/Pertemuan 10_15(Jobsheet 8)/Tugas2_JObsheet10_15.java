import java.util.Scanner;
public class Tugas2_JObsheet10_15 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        int i = 1;
        int total = 0;

        System.out.print("Masukkan Nilai n (Minimal 3)= ");
        n = sc.nextInt();

        while(i<=n){
            int j = 1;
            int kali = 0;
            while(j<=n){
                kali = j*i;
                System.out.print(kali + "\t");
                total += kali;
                j++;

            }

            System.out.println();
            i++;
        }
        System.out.println("Total Semua = " + total);

        sc.close();

    }
}
