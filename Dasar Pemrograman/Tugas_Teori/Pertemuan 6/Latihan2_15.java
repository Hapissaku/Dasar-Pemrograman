import java.util.Scanner;

public class Latihan2_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int diskon = 0, jumlahbuku;
    String hari, jenisbuku;

    System.out.print("Beli dihari apa yah (contoh = senin) = ");
    hari = sc.nextLine();
    System.out.print("Masukkan jenis buku (contoh = novel) = ");
    jenisbuku = sc.nextLine();
    System.out.print("Masukkan jumlah buku (contoh = 3)= ");
    jumlahbuku = sc.nextInt();

    hari.toLowerCase();
    jenisbuku.toLowerCase();
    
    if (hari.equals("rabu")){
        if (jenisbuku.equals("kamus")){
            diskon = 10;}
            if (jumlahbuku > 2 ){
                diskon += 2;}

        else if (jenisbuku.equals("novel"));{
            diskon = 7;}
            if (jumlahbuku > 3 ){
                diskon += 2;}
            else if (jumlahbuku <=3){
                diskon +=1;}

        else {
            if (jumlahbuku > 3){
                diskon = 5;
            }
        }
            
        }
    else {
        System.out.println("Promo Hanya Ada Dihari Rabu");;
    }

        System.out.println("Diskon yang anda peroleh adalah = " + diskon + "%");
        sc.close();
        }
    }

    
    


