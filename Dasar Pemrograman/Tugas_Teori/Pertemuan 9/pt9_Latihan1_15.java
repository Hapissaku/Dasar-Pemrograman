import java.util.Scanner;
public class pt9_Latihan1_15 {
    public static void main(String[] args) {
        
    int totaljam = 0, jamharian, hari = 1;
    Scanner sc = new Scanner(System.in);

    while(hari<=7) {
        System.out.print("Masukkan Jam Belajar Hari ke " + hari + " : ");
        jamharian = sc.nextInt();
        if(jamharian<=10){
            totaljam = jamharian+totaljam;
            hari++;
        }
        else{
            System.out.println("Jam Tidak Masuk Akal, Masukkan Ulang");
            continue;
        }
    }
    System.out.println("Total Jam Belajar Semminggu = " + totaljam);
    sc.close();
    }
}
