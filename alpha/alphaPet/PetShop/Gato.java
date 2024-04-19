package alpha.alphaPet.PetShop;

public class Gato extends Animal {
            private String raçacat;
            private String cor_do_pelocat;
            
            
            public Gato(String nome, String dono, int altura, int peso, String raçacat, String cor_do_pelocat) {
              super(nome, dono, altura, peso);
              this.raçacat=raçacat;
              this.cor_do_pelocat=cor_do_pelocat;
            }
      
      
      
      
      public void Miar(){
        System.out.println("Miau");
      }       
      public void Correr(){
        System.out.println("Miau, ninguém me pega");
      }       
      public void Andar(){
        System.out.println("Miau,sou elegante andando");
      }  
      public void Pular(){
        System.out.println("Miau,parkourMIAU");
      }         
}
