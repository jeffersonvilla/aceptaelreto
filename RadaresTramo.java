import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class RadaresTramo {
    private static FastReader in = new FastReader();

    public static void main(String[] args) {
        while(true){
            double distancia = in.nextDouble();
            double vmax = in.nextDouble();
            double tiempo = in.nextDouble();
            if(distancia==0 && vmax==0 && tiempo==0)break;
            if(distancia<=0 || vmax<=0 || tiempo<=0)System.out.println("ERROR");
            else{
                double v = (distancia/tiempo)*3.6;
                if(v<=vmax) System.out.println("OK");
                else if(v-((vmax)*0.2)>vmax) System.out.println("PUNTOS");
                else System.out.println("MULTA");
            }
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {return Integer.parseInt(next());}

        long nextLong() {return Long.parseLong(next());}

        double nextDouble() {return Double.parseDouble(next());}

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
