import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DigitoFactorial {
    private static FastReader in = new FastReader();

    public static void main(String[] args) {
        int n = in.nextInt();
        for(int i = 0; i<n; i++){
            String m = in.next();
            switch(m){
                case "0":
                    System.out.println(1);
                    break;
                case "1":
                    System.out.println(1);
                    break;
                case "2":
                    System.out.println(2);
                    break;
                case "3":
                    System.out.println(6);
                    break;
                case "4":
                    System.out.println(4);
                    break;
                default:
                    System.out.println(0);
                    break;
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
