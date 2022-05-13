import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class LigaPadel {
	private static FastReader in = new FastReader();
	public static void main(String[] args) {
	
		Map<String, Integer> mapPadel = new HashMap<String, Integer>();
		Boolean ban = false;
		int cont = 0;
		while (true) {
			String entrada = in.nextLine();
			if(!ban && entrada.equals("FIN")) break;
			else if(!ban && !entrada.equals("FIN")) ban = true;
			else if(ban && entrada.equals("FIN")) {
				ban = false;
				Iterator it = mapPadel.keySet().iterator();
				int mayor = 0;
				String equMay = "";
				boolean banEm = false;
				while(it.hasNext()){
					String key = (String) it.next();
					if(mapPadel.get(key) > mayor) {
						equMay = key;
						mayor = mapPadel.get(key);
					}
				}
				Iterator it2 = mapPadel.keySet().iterator();
				while(it2.hasNext()){
					String key = (String) it2.next();
					if(mapPadel.get(key)==mayor && !key.equals(equMay)) {
						banEm = true;
					}
				}
				int n = mapPadel.size();
				if(banEm) System.out.println("EMPATE"+" "+(((n*n)-n)-cont));
				else System.out.println(equMay+" "+(((n*n)-n)-cont));
				cont = 0;
				mapPadel.clear();
			}
			else {
				cont++;
				String[] vector = entrada.split(" ");
				if(mapPadel.containsKey(vector[0])) {
					if(Integer.parseInt(vector[1]) > Integer.parseInt(vector[3])) {
						int acum = mapPadel.get(vector[0]);
						acum += 2;
						mapPadel.remove(vector[0]);
						mapPadel.put(vector[0], acum);
					}else {
						int acum = mapPadel.get(vector[0]);
						acum += 1;
						mapPadel.remove(vector[0]);
						mapPadel.put(vector[0], acum);
					}
				}else {
					mapPadel.put(vector[0], 0);
					if(Integer.parseInt(vector[1]) > Integer.parseInt(vector[3])) {
						int acum = mapPadel.get(vector[0]);
						acum += 2;
						mapPadel.remove(vector[0]);
						mapPadel.put(vector[0], acum);
					}else {
						int acum = mapPadel.get(vector[0]);
						acum += 1;
						mapPadel.remove(vector[0]);
						mapPadel.put(vector[0], acum);
					}
				}
				if(mapPadel.containsKey(vector[2])) {
					if(Integer.parseInt(vector[3]) > Integer.parseInt(vector[1])) {
						int acum = mapPadel.get(vector[2]);
						acum += 2;
						mapPadel.remove(vector[2]);
						mapPadel.put(vector[2], acum);
					}else {
						int acum = mapPadel.get(vector[2]);
						acum += 1;
						mapPadel.remove(vector[2]);
						mapPadel.put(vector[2], acum);
					}
				}else {
					mapPadel.put(vector[2], 0);
					if(Integer.parseInt(vector[3]) > Integer.parseInt(vector[1])) {
						int acum = mapPadel.get(vector[2]);
						acum += 2;
						mapPadel.remove(vector[2]);
						mapPadel.put(vector[2], acum);
					}else {
						int acum = mapPadel.get(vector[2]);
						acum += 1;
						mapPadel.remove(vector[2]);
						mapPadel.put(vector[2], acum);
					}
				}
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