import java.util.Scanner;

public class Gauss {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String entrada = in.nextLine();
        while(!entrada.equals("0 0")){
            String[] values = entrada.split(" ");
            int n = Integer.parseInt(values[0]);
            int m = Integer.parseInt(values[1]);
            double errorGauss = Math.abs(((double)nprimos(n)/(double)n)-((double)1/(double)Math.log(n)));
            double errorMax = ((double)1)/((double)Math.pow(10.0,(double)m));
            if(errorGauss>errorMax)System.out.println("Mayor");
            else if(errorGauss==errorMax) System.out.println("Igual");
            else System.out.println("Menor");
            entrada = in.nextLine();
        }
    }

    private static boolean[] primos(){
        boolean[] primos = new boolean[100001];
        primos[0] = false; primos[1] = false; primos[2] = true;
        for(int i = 3; i<100001;i++) if(i%2==0)primos[i] = false; else primos[i] = true;
        for(int i = 3; i<Math.sqrt(100000); i+=2)
            for(int j = i; j<=(100000/i); j++)
                primos[j*i] = false;
        return primos;
    }

    private static int nprimos(int n){
        int sum = 0;
        boolean[] primos = primos();
        for(int i = 0; i<=n; i++) if(primos[i]) sum++;
        return sum;
    }
}
