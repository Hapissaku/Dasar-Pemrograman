public class ContohOperator15 {

    public static void main(String[] args) {
    int x = 10;
    System.out.println("x++ = " + x++);
    System.out.println("Setelah Evaluasi =" +x); 
    x = 10;
    System.out.println("++x = " + ++x);
    System.out.println("Setelah Evaluasi =" +x);
    int y = 12;
    //x = 11 dan y = 12
    System.out.println( x > y || y ==  x && y <= x);
    int z = x^y;
    /*11 = 1011, 12 = 1100
      1011
      1100
      ------ ^
      0111
      jadi 0111 = 7*/
     System.out.println("Hasil x^y =" +z);
     z %= 2;
     System.out.println("Hasil Akhir =" +z);



    }
    
}
