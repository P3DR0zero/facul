package alpha.alphaPet.PetShop;

public class Ave extends Animal {
      private String raça;
      private String cor_da_pena;                    
              
              public Ave(String nome, String dono, int altura, int peso,String raça, String cor_da_pena) {
               super(nome, dono, altura, peso);
               this.raça=raça;
               this.cor_da_pena=cor_da_pena;
               }
             
              public void Voar(){
                  System.out.println("LIVRE ESTOUUU... LIVREE ESTOU, A GAIOLA NÃO VAI ME SEGURAAAAA");
              }
              
              public void Cantar(){
                System.out.println("Imagine all the people Livin' for today");
              }
}
