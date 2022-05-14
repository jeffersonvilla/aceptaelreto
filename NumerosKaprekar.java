import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumerosKaprekar {
    private static FastReader in = new FastReader();
    public static void main(String[] args) {
    	while (true) {
			String entrada = String.valueOf(in.nextInt());
			if(entrada.equals("0")) break;
			if(recursion("",String.valueOf((long) Math.pow(Integer.parseInt(entrada), 2)),Long.parseLong(entrada))
            || entrada.equals("1")) System.out.println("SI");
			else System.out.println("NO");
		}
	}

	private static boolean recursion(String x, String elevado, long numInicial) {
		if(elevado.equals("")) return false;
        else if(Long.parseLong(elevado) == 0) return false;
		else if(x.equals("")) 
			return recursion(x.concat(elevado.substring(0,1)), 
            elevado.substring(1), numInicial);
		else if(Long.parseLong(elevado) + Long.parseLong(x) == numInicial) return true;
        return recursion(x.concat(elevado.substring(0,1)), elevado.substring(1), numInicial);
		
	}

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
