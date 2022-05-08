import java.util.Scanner;

public class Ventas {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean go = true;
        while(go){
            int mayor = 0;
            int menor = 0;
            double media = 0.0;
            double[] semana = new double[6];
            for(int i = 0; i<semana.length;i++){
                semana[i] = in.nextDouble();
                if(i==0 && semana[0]==-1){go = false; break;}
                if(semana[i]>semana[mayor]) mayor = i;
                if(semana[i]<semana[menor]) menor = i;
                media += semana[i]; 
            }
            if(go){
                media/= 6.0;
                String result = caso(mayor) + caso(menor) + domingo(media, semana[5]); 
                System.out.println(result);
            }
        }
    }

    private static String caso(int valor){
        String result = "";
        switch (valor){
            case 0:
                result+="MARTES ";
                break;
            case 1:
                result+="MIERCOLES ";
                break;
            case 2:
                result+="JUEVES ";
                break;
            case 3:
                result+="VIERNES ";
                break;
            case 4:
                result+="SABADO ";
                break;
            case 5:
                result+="DOMINGO ";
                break;
        }
        return result;
    }

    private static String domingo(double media, double domingo){
        return (domingo>media)?"SI":"NO";
    }
}
