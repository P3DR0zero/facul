import java.util.Scanner;

import javafx.beans.binding.FloatExpression;

public class q1_list02 {
    
    
        public static void main(FloatExpression[] args) {
        int X = 0;
        float ID = 0;
        while (X == 0  ) {
        Scanner ler = new Scanner(System.in);
            System.out.print("Entre com indice atual:  " );
            ID = ler.nextFloat();
               System.out.println(ID);
              
                   if (ID==0.3 && ID<0.4) {
                      System.out.print("Teste1"); 
                  } 
                
                  else if (ID == 0.4 && ID<0.5) {
                      System.out.print("Teste2");
                  }
                
                  else {
                      System.out.print("teste");
                 }

                   

                 System.out.print("Deseja continuar? tecle 0 para colocar outro indice e 1 para sair.");
                 X = ler.nextInt();   
                ler.close();
            } 
    }
}
