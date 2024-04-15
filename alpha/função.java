package alpha;
import java.util.Scanner;


public class função {
    public static void main(String[] args) {
      int o = 0;

      Scanner op = new Scanner(System.in);
       System.out.println("Escolha 1 para soma 2 para subtrair e 3 para multiplicar:  ");
         o = op.nextInt();
       
        System.out.println("Digite os numeros");
        Scanner teclado = new Scanner(System.in);  
      
       switch (o) {
        case 1 :
            int resultado =somar( teclado.nextInt(), teclado.nextInt());
             System.out.println(resultado);
            break;

        case 2 :
         int result =subtração( teclado.nextInt(), teclado.nextInt());
         System.out.println(result);
        break;

        case 3 :
         int resul =multiplicação( teclado.nextInt(), teclado.nextInt());
         System.out.println(resul);        
         break;

       
        default:
            break;
       }
      
    }

        public static int somar (int num1, int num2){
            int soma = num1 + num2;
            return soma;
        }

        public static int subtração (int num1, int num2){
            int subt = num1 - num2;
            return subt;
        }

        public static int multiplicação (int num1, int num2){
            int mult = num1 * num2;
            return mult;
        }
    
    
    
}
