public class Latihann3_15 {
    public static void main(String[] args) {
        
        int n = 5 ;
        int jumlahkuadrat, total;

        for(int i=1; i<=n; i++){
            System.out.print("n = " + i + " -> " + "Jumlah Kuadrat = ");
            total = 0;
            for(int j=1; j<=i; j++){
                jumlahkuadrat = j*j;
                total += jumlahkuadrat;
                System.out.print(jumlahkuadrat);

                if(j < i){
                    System.out.print(" + ");
                }

            }

            if (i==1){
                System.out.println();
            }
            else{
                System.out.println(" = " + total);
            }
        }
    }
}
