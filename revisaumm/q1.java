package revisaumm;
import java.util.Scanner;

public class q1 {
  
    public static void main(String[] args) {
        Scanner tecl=new Scanner(System.in);
        
        int teste[][]=new int[3][3];
        int x=0;
       
        //Entrando com valores na matriz
        for ( int i=0;i<3;i++){
            for(int  j=0;j<3;j++){
             System.out.println("entre com valor: ");
             teste[i][j]=tecl.nextInt(); 
            }
        }
        //Realizando soma diagonal
        for ( int i=0;i<3;i++){
            for(int  j=0;j<3;j++){
                if (i==j) {
                    x=x+teste[i][j];  
                }
            }
        }
        //Mostra da soma diagonal
        System.out.println(x);
        
        //Print da matriz
        for( int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("["+teste[i][j]+"]");
                if (j==2){
                    System.out.print("\n");
                }
            }
        }
    }
}

