import java.util.Scanner;

public class Encriptacion_mensajes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true){
            String entrada = in.nextLine();
            String mensaje_codificado = entrada.substring(1); 
            String mensaje_decodificado = "";
            int cesar = ((int) entrada.charAt(0))-((int) 'p');

            for(int i = 0; i < mensaje_codificado.length(); i++){
                int a = (int) mensaje_codificado.charAt(i);
                int n = - (int) cesar;
                if(a >=97 && a <=122){
                    if(a+n >122) a=97+(n-(123-a));
                    else if(a+n <97) a=122+(n+(a-96));
                    else a=a+n;
                }
                if(a >=65 && a <=90){
                    if(a+n >90) a=65+(n-(91-a));
                    else if(a+n <65) a=90+(n+(a-64));
                    else a=a+n;
                }
                mensaje_decodificado += Character.toString((char)a);
            }
            //mensaje decodificado == FIN
            if(mensaje_decodificado.equals("FIN")){
                break;
            }

            int cantidad_vocales = 0;
            for(int i = 0; i < mensaje_decodificado.length(); i++)
                switch (mensaje_decodificado.charAt(i)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        cantidad_vocales ++;
                        break;
                }

            System.out.println(cantidad_vocales);
      
        }
    }
}
