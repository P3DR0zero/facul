package revisaumm;
import java.util.Scanner;
public class q1b {
    public static void main(String[] args) {
        Scanner tecl=new Scanner(System.in);
        float teste[][]=new float[3][6];
        float x=0;
        float med=0;
        float med2=0;
        for ( int i=0;i<3;i++){
            for(int  j=0;j<6;j++){
             System.out.println("entre com valor: ");
             teste[i][j]=tecl.nextFloat(); 
            }
        }
        for ( int i=0;i<3;i++){
            for(int  j=0;j<6;j++){
             if (j%2==0){
                x=x+teste[i][j];
             }
             if (j==1) {
                med=med+teste[i][j];
             }
             if (j==3) {
                med2=med2+teste[i][j];
             }  
            }
        }

        for(int i=0; i<3; i++){
            teste[i][5]=teste[i][0]+teste[i][1];
        }
        for( int i=0;i<3;i++){
            for(int j=0;j<6;j++){
                System.out.print("["+teste[i][j]+"]");
                if (j==5){
                    System.out.print("\n");
                }
            }
        }

        System.out.println("soma das colunas impares:" +"  " +x);
        System.out.println("Média colunas 2 e 4:" +"  "+ (med+med2)/6);

    }
    
}
