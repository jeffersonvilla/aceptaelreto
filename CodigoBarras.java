import java.util.Scanner;

public class CodigoBarras {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        
        while(true){
            String s = in.nextLine();
            if(s.equals("0")) break;

            if(verificar(s)){
                if(s.length()<=8) System.out.println("SI");
                else if(s.length()<13) System.out.println("SI EEUU");
                else System.out.println("SI "+pais(s));
            }else System.out.println("NO");
        }
    }

    private static boolean verificar(String s){
        int suma = 0;
        boolean par = false;
        for(int i = s.length()-2; i>=0;i--){
            int value = Character.getNumericValue(s.charAt(i));
            if(!par) {suma+=(value*3); par = true;}
            else {suma+=(value); par = false;}
        }
        suma+=Character.getNumericValue(s.charAt(s.length()-1));
        return (suma%10==0)? true: false;
    }

    private static String pais(String s){
        if(s.substring(0,1).equals("0")) return "EEUU";
        else if(s.substring(0, 3).equals("380")) return "Bulgaria";
        else if(s.substring(0, 2).equals("50")) return "Inglaterra";
        else if(s.substring(0, 3).equals("539")) return "Irlanda";
        else if(s.substring(0, 3).equals("560")) return "Portugal";
        else if(s.substring(0, 2).equals("70")) return "Noruega";
        else if(s.substring(0, 3).equals("759")) return "Venezuela";
        else if(s.substring(0, 3).equals("850")) return "Cuba";
        else if(s.substring(0, 3).equals("890")) return "India";
        return "Desconocido";
    }

}
