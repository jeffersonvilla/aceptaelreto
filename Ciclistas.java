import java.util.Scanner;

public class Ciclistas {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int num = in.nextInt();
            if(num == -1)break;
            boolean adentro = false;
            int l = 0, lm=0, im = 0, ind= 0, cont = 0;
            while(true){
                int num2 = in.nextInt();
                if(num2==-1)break;
                if(adentro){
                    if(num==num2) l++;
                    else {
                        adentro = false;
                        if(lm<l){
                            lm = l;
                            im = ind;
                        }
                        l = 0;
                        ind = 0;
                    }
                }else if(num ==num2){
                    adentro =true;
                    l++;
                    ind = cont;
                }
                if(lm<l){
                    lm = l;
                    im = ind;
                }   
                cont++;
                num = num2;
            }
            if(lm==0&&l==0)System.out.println("HOY NO COMEN");
            else System.out.println(im+" "+lm);
        } 
    }
}