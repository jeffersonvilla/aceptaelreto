import java.util.Scanner;

public class ProblemasHerencia {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true){
            int grado = in.nextInt();
            if(grado == 20) break;
            int[] coeficientes = new int[grado+1];
            for(int i = 0; i<=grado;i++) coeficientes[i] = in.nextInt();
            int n = in.nextInt();
            double cain = 0.0;
            double ndiv = (1.0/(double)n);
            for(int i=0; i<n;i++){
                double f = f(((double)i)*ndiv, coeficientes);
                if(f>0 && f<1) cain+=ndiv*f;
                if(f>=1) cain+=ndiv;
            }
            double abel = 1 - cain;
            double diff = Math.abs(abel - cain);
            if(diff <= 0.001) System.out.println("JUSTO");
            else if(abel > cain) System.out.println("ABEL");
            else if(cain > abel) System.out.println("CAIN");
        }
    }

    private static double f(double num, int[]coeficientes){
        double result = 0.0;
        int n = coeficientes.length;
        for(int i = coeficientes.length-1; i>=0;i--)
            result += coeficientes[n-i-1] * Math.pow(num, i);      
        return result;
    }
}
