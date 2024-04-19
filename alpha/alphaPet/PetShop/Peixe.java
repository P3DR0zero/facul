package alpha.alphaPet.PetShop;

public class Peixe extends Animal {
   private String raçaf;
   private String cor_da_escamaf;
      
   public Peixe(String nome, String dono, int altura, int peso, String raçaf, String cor_da_escamaf) {
      super(nome, dono, altura, peso);
      this.raçaf=raçaf;
      this.cor_da_escamaf=cor_da_escamaf;
   }
     
            public void Nadar(){
             System.out.println("Me esqueci o que ia fazer vou continuar a nadar");
            }
}
