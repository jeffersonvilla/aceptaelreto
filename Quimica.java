import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quimica {
    
    private static FastReader in = new FastReader();
    public static void main(String[] args) {
        boolean adentro = false;
        while(true){
            String entrada = in.nextLine();
            if(!adentro) 
                if(entrada.equals("Exit")) break;
                else adentro = true;
            else{
                int z = Integer.parseInt(entrada);
                String res = "";
                if(z==0) res = "1s0";
                else if(z>0&&z<=2) res = "1s"+z;
                else if(z>2&&z<=4) res = "1s2 2s"+(z-2);
                else if(z>4&&z<=10) res = "1s2 2s2 2p"+(z-4);
                else if(z>10&&z<=12) res = "1s2 2s2 2p6 3s"+(z-10);
                else if(z>12&&z<=18) res = "1s2 2s2 2p6 3s2 3p"+(z-12);
                else if(z>18&&z<=20) res = "1s2 2s2 2p6 3s2 3p6 4s"+(z-18);
                else if(z>20&&z<=30) res = "1s2 2s2 2p6 3s2 3p6 4s2 3d"+(z-20);
                else if(z>30&&z<=36) res = "1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p"+(z-30);
                else if(z>36&&z<=38) res = "1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6 5s"+(z-36);
                else if(z>38&&z<=48) res = "1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6 5s2 4d"+(z-38);
                else if(z>48&&z<=54) res = "1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6 5s2 4d10 5p"+(z-48);
                else if(z>54&&z<=56) res = "1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6 5s2 4d10 5p6 6s"+(z-54);
                else if(z>56&&z<=70) res = "1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6 5s2 4d10 5p6 6s2 4f"+(z-56);
                else if(z>70&&z<=80) res = "1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6 5s2 4d10 5p6 6s2 4f14 5d"+(z-70);
                else if(z>80&&z<=86) res = "1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6 5s2 4d10 5p6 6s2 4f14 5d10 6p"+(z-80);
                else if(z>86&&z<=88) res = "1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6 5s2 4d10 5p6 6s2 4f14 5d10 6p6 7s"+(z-86);
                else if(z>88&&z<=102) res = "1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6 5s2 4d10 5p6 6s2 4f14 5d10 6p6 7s2 5f"+(z-88);
                else if(z>102&&z<=112) res = "1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6 5s2 4d10 5p6 6s2 4f14 5d10 6p6 7s2 5f14 6d"+(z-102);
                else if(z>112&&z<=118) res = "1s2 2s2 2p6 3s2 3p6 4s2 3d10 4p6 5s2 4d10 5p6 6s2 4f14 5d10 6p6 7s2 5f14 6d10 7p"+(z-112);
                System.out.println(res);
                adentro=false;
            }   
        }
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
