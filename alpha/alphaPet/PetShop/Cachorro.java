package alpha.alphaPet.PetShop;

public class Cachorro extends Animal{
            private String raçadog;
            private String cor_do_pelo;
            
            public Cachorro(String nome, String dono, int altura, int peso, String raçadog, String cor_do_pelo) {
              super(nome, dono, altura, peso);
              this.raçadog=raçadog;
              this.cor_do_pelo=cor_do_pelo;
            }      
      
      
      
      public void Latir(){
        System.out.println("Au,Au");
      }       
      public void Correr(){
        System.out.println("Eu vou pegar o gato");
      }       
      public void Andar(){
        System.out.println("Cansei");
      }  
          
}
