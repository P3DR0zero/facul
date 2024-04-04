import java.util.Scanner;
public class hum {

    public static void main(String[] args) {
        int calc = 0;
        String op = "a";
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Entre com valor");
        int N1 = ler.nextInt();
        
        System.out.print("Entre com segundo valor");
        int N2 = ler.nextInt();

        System.out.print("Entre com terceiro valor");
        int N3 = ler.nextInt();

        while (N1<0) {
            System.out.print(" Valor incorreto Entre com numero positivo");
            N1 = ler.nextInt(); 
            }

            
        while (N2<0) {
            System.out.print(" Valor incorreto Entre com numero positivo");
            N2 = ler.nextInt(); 
            }

            
        while (N3<0) {
            System.out.print(" Valor incorreto Entre com numero positivo");
            N3 = ler.nextInt(); 
            }

            System.out.println("Escolha uma opção, M para multiplicação, S para soma e D para subtrair");
            op = ler.next();
            
            switch (op) {
                   
                    case "S":
                    calc = (N1 + N2 + N3);
                    break;
                   
                    case "M":
                    calc = (N1 * N2 * N3);
                    break;
                   
                    case "D":
                    calc = (N1 - N2 - N3);
                    break;

                   default:
                    System.out.println("Essa opção não consta como tipo de calculo, deseja continuar? S/N");
                    break;
            }
                System.out.println("O valor da sua conta é " + calc);


            ler.close();
        }
}