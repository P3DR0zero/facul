package alpha.alphaPet.PetShop;

public class Animal {
            private String dono;
            private String nome;
            private int altura;
            private int peso;
              
               public Animal(String nome, String dono, int altura, int peso){
                  this.dono=dono;
                  this.nome=nome;
                  this.altura=altura;
                  this.peso=peso; 
               }
     public void Comer(){
        System.out.println("O seu animal já comeu.");
     }
     public void Beber(){
        System.out.println("O seu animal bebeu água.");
      }
public static void main(String[] args) {
   Ave k = new Ave("Karl","Pedro",30, 50, "calopsita", "vermelha");
    k.Comer();
    k.Beber();
    k.Cantar();
    k.Voar();
    
    Cachorro e = new Cachorro("Enzo", "PL", 1, 90, "PitBull", "Albino");
    e.Latir();
    e.Beber();
    e.Comer();
    e.Correr();
    e.Andar();

    Dragon m=new Dragon("Manel", "Alex", 2, 1000, "Noildiana", "Azul com verde");
    m.Voar();
    m.Fogo();

    Gato a=new Gato("Arthur", "PL", 15, 666, "Vira Lata", "Preto pra branco não da pra saber");
    a.Andar();
    a.Correr();
    a.Correr();
    a.Pular();

    Peixe y=new Peixe("Yuri", "Crack", 10, 1, "Dory", "Azul");
    y.Nadar();
}

}
