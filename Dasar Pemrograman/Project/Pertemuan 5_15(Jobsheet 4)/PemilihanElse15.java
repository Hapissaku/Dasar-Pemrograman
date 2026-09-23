import java.util.Scanner;
public class PemilihanElse15{
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);

    System.out.println("-----Sistem Cetak KRS-----");
    System.out.print("Masukan Semester Saat Ini = ");
    int semester = sc.nextInt();

         if(semester == 1){
            System.out.println("KRS Semester 1 Ditampilkan");
         }
         else if(semester == 2){
            System.out.println("KRS Semester 2 Ditampilkan");}

         else if(semester == 3)
            System.out.println("KRS Semester 3 Ditampilkan");

         else if(semester == 4)
            System.out.println("KRS Semester 4 Ditampilkan");

         else if(semester == 5)
            System.out.println("KRS Semester 5 Ditampilkan");

         else if(semester == 6)
            System.out.println("KRS Semester 6 Ditampilkan");

         else if(semester == 7)
            System.out.println("KRS Semester 7 Ditampilkan");

         else if(semester == 8)
            System.out.println("KRS Semester 8 Ditampilkan");
         else{
            System.out.println("semester tidak valid");
         }

    }



    



        

    }

