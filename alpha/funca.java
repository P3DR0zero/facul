package alpha;
import java.util.Scanner;

public class funca {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        int x = teclado.nextInt();
        int y = teclado.nextInt();
        int resul = maior( x, y);
        System.out.println(resul);
    }

    public static int maior (int n1,int n2)  {
       if (n1>n2) {
         int resultado=n1;
        return resultado;
       }
       else {
        int resultado=n2;
        return resultado;
       }
    }
}
