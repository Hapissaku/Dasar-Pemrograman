import java.util.Scanner;
public class Latihan1_15 {
    public static void main(String[] args) {
        
    int bil1,bil2,bil3;
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan angka 1 = ");
    bil1 = sc.nextInt();
    System.out.print("Masukkan angka 2 = ");
    bil2 = sc.nextInt();
    System.out.print("Masukkan angka 3 = ");
    bil3 = sc.nextInt();

    if (bil1 > bil2) {
        if (bil1 > bil3) {
        System.out.println("Terbesar adalah = " + bil1);
        }
        else {
        System.out.println("Terbesar adalah = " + bil3);
        }
} 
    else {
        if (bil2 > bil3) {
        System.out.println("Terbesar adalah = " + bil2);
        }
        else {
        System.out.println("Terbesar adalah = " + bil3);
        }
}
    sc.close();
}
}
