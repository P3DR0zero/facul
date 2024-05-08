package charlie;
//Importação de biblioteca de Sacanner
import java.util.Scanner;
public class q2_a1 {
  public static void main(String[] args) {
    //Criação de objeto do tipo Scanner 
    Scanner teclado=new Scanner(System.in);

        //Repetição ligada enquanto idade recebida for positiva.
        while (true) {
            //Entrada de Idade
            System.out.println("\nEntre com idade do eleitor: \ncaso deseje sair entre com idade negativa: ");
            int idade = teclado.nextInt();
                //Teste para saber se é negativa.
                if (idade<0) {
                    System.out.println("Programa encerrado");
                    break;
                }
                //Teste para saber se é apto a votar.
                if (idade<16) {
                    System.out.println("Você ainda não pode votar");
                }
                //Teste para saber se tem obrigação de votar.
                else if (idade==16&&idade<18||idade>=70) {
                    System.out.println("Você não tem obrigação de votar");
                }
                //Situação final onde a idade do eleitor o obriga a votar.
                else{
                    System.out.println("Seu voto é obrigatório");
                }
                
        }//Fechamento do Scanner
        teclado.close();
  }
    

}
