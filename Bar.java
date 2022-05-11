import java.util.Scanner;

public class Bar {
    private static Scanner in = new Scanner(System.in);

    private static String[] tipo = {"DESAYUNOS#", "COMIDAS#", "MERIENDAS#", "CENAS#", "COPAS#" };
    public static void main(String[] args) {
        double suma = 0.0;
        int n = 0, m = 0;
        double[] ventas = {0.0, 0.0, 0.0, 0.0, 0.0};

        while(in.hasNextLine()){ 
            String entrada = in.nextLine();
            String[] values = entrada.split(" ");
            double valorVenta = Double.parseDouble(values[1]);
            switch(values[0].charAt(0)){
                case 'D':
                    ventas[0] += valorVenta;
                    break;
                case 'A':
                    ventas[1] += valorVenta; m++;
                    break;
                case 'M':
                    ventas[2] += valorVenta;
                    break;
                case 'I':
                    ventas[3] += valorVenta;
                    break;
                case 'C':
                    ventas[4] += valorVenta;
                    break;
            }   
            
            if(entrada.equals("N 0")) {
                System.out.println(mayor(ventas)+menor(ventas)+((ventas[1]/m>suma/n)? "SI": "NO"));
                suma = 0.0; n = 0; m = 0;
                for(int i = 0; i<ventas.length;i++) ventas[i] = 0.0;
            }else{ suma += valorVenta; n++;}
        }
    }

    private static String mayor(double[] ventas){
        int mayor = 0;
        for(int i = 0; i<ventas.length; i++)
            if(ventas[i]>ventas[mayor]) 
                mayor = i;
        for(int i = 0; i<ventas.length; i++)
            if(i!=mayor && ventas[i]==ventas[mayor]) 
                return "EMPATE#";
        return tipo[mayor];
    }

    private static String menor(double[] ventas){
        int menor = 0;
        for(int i = 0; i<ventas.length; i++)
            if(ventas[i]<ventas[menor]) 
                menor = i;
        for(int i = 0; i<ventas.length; i++)
            if(i!=menor && ventas[i]==ventas[menor]) 
                return "EMPATE#";
        return tipo[menor];
    }  
}
