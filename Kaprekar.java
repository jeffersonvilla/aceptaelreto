import java.util.Scanner;
import java.util.Arrays;

public class Kaprekar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int contador = 0;
        while(contador < n){
            int entrada = in.nextInt();

            if(entrada==6174){
                System.out.println(0);
                contador++;
                continue;
            }

            int d, c, m, M;
            int cant = 0;
            int asc, desc, diff = 0;

            d = entrada % 10;
            c = (entrada % 100)/10;
            m = (entrada % 1000)/100;
            M = (entrada % 10000)/1000;

            
            if(d == c && c == m && m == M){
                System.out.println(8);
                contador ++;
                continue;
            }
            
            while(diff != 6174){

                if(cant > 0){
                    d = diff % 10;
                    c = (diff % 100)/10;
                    m = (diff % 1000)/100;
                    M = (diff % 10000)/1000;
                }

                int[] nums = {d, c, m, M};
                Arrays.sort(nums);
                asc = (nums[0]*1000)+(nums[1]*100)+(nums[2]*10)+nums[3];
                desc = (nums[3]*1000)+(nums[2]*100)+(nums[1]*10)+nums[0];
                diff = (asc>desc)?asc-desc:desc-asc;
                cant++;
                if(diff == 6174) break;
            }

            System.out.println(cant); 

            contador++;
        }
    }
    
}
