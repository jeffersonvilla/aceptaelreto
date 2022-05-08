import java.util.Scanner;

public class Moviles {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int peso = 0;
        while(true){
            peso = linea();
            if(peso == -2) break;
            if(peso == -1) System.out.println("NO");
            else System.out.println("SI");
        }

    }    

    private static int linea(){
        int[] line = readLine();
        if(line[0]==0&&line[1]==0&&line[2]==0&&line[3]==0)
            return -2;
        if(line[0]!=0 && line[2]!=0) {
            if(line[0]*line[1]==line[2]*line[3])
                return line[0]+line[2];
            else return -1;
        }
        if(line[0]==0 && line[2]!=0){
            int pi = linea();
            if(pi==-1) return -1;
            else if(pi*line[1]==line[2]*line[3])
                return pi+line[2];
            else return -1;
        }
        if(line[0]!=0 && line[2]==0){
            int pd = linea();
            if(pd==-1) return -1;
            else if(line[0]*line[1]==pd*line[3])
                return line[0]+pd;
            else return -1;
        }
        if(line[0]==0 && line[2]==0){
            int pi = linea();
            int pd = linea();
            if(pi==-1 || pd==-1) return -1;
            else if(pi*line[1]==pd*line[3])
                return pi+pd;
            else return -1;
        }
        return -1;
    }

    private static int[] readLine(){
        int[] line = new int[4];
        for(int i=0; i<line.length;i++) line[i]=in.nextInt();
        return line;
    }

}
