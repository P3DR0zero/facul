package alpha.alphaPet.PetShop;

public class Dragon extends Animal{
            private String raçafire;
            private String cor_da_escama;
        
            public Dragon(String nome, String dono, int altura, int peso,String raçafire, String cor_da_escama) {
                super(nome, dono, altura, peso);
                this.raçafire=raçafire;
                this.cor_da_escama=cor_da_escama;
            }
        
        
        
        
            public void Voar(){
            System.out.println("Eu sou incrivel voando");
        }
        public void Fogo(){
            System.out.println("Virem pó humanos.");
        }
}
