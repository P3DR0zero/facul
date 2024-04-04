import java.util.Scanner;

public class peso {
    public static void main(String[] args) {
        int i , I , P ,  M ; 
        int I_ =0 ;
        int P9 = 0;
        int X = 0;
       while (X==0) {

        Scanner teclado = new Scanner(System.in);
        for (i = 0; i<7; i++){
            System.out.print("Entre com sua idade  ");
                I = teclado.nextInt();
                    I_ = (I_ + I);
            System.out.print("Entre com o seu peso:  " );
                P = teclado.nextInt();
                    if (P >= 90) {
                        P9++;
                }
            }

            M = (I_)/7;
            System.out.println("A média das idades insiridas é: "+M);
            System.out.println("O numero de pessoas com 90 quilos ou mais é: "+P9);

            System.out.println("Tecle 0 para reiniciar e 1 para sair");
                X = teclado.nextInt();
       }
    }

}
