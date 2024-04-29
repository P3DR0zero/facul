package alpha.beta;
import java.util.Scanner;
public class retangulo {
    public static void main(String[] args) {
        float x=0;
        float y=0;

        Scanner t = new Scanner(System.in);

        System.out.println("Entre com a base");
            x= t.nextFloat();
        System.out.println("Entre com altura:");
            y= t.nextFloat();
        
        rectangle r= new rectangle(x, y);
        r.Area();
        r.Perimetro();
        
    }    
}
class rectangle  {
    float b=0;
    float h = 0;

    public rectangle(float b, float h){
        this.b=b;
        this.h=h;
    }
    public void Area(){
    System.out.println(b*h);    
    }
    public void Perimetro(){
        System.out.println(2*(b+h));
    }
        public float getb(){
            return b;
        }
        public float geth(){
            return h;
        }
        
}

       
