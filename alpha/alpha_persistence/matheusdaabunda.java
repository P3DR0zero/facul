package alpha.alpha_persistence;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class matheusdaabunda {
public static void main(String[] args) throws IOException {

    File arquivo = new File("C:\\Users\\12824125995\\Desktop/Arquivo.txt");
    FileWriter tecl = new FileWriter( arquivo, true );
    //BufferedWriter bw = new BufferedWriter( tecl );
    try {
        if ( arquivo.createNewFile()) {
            System.out.println("Arquivo criado");
        } else{
            System.out.println("EiItTaA");  
        }
    } 
    catch (IOException e) {
        System.out.println("Ocorreu um erro ao cria o aquivo");
        e.printStackTrace();
    }
   
    try {
        tecl.write("Foda que a vida é uma montanha" + "\n"+ "russa cheia de subidas e decidas" + "\n"+ "e quem tá lendo isso me deve 5 reais" );
        tecl.close();
    } catch (IOException e) {
        System.out.println("Rapaz");
        e.printStackTrace();
    }

}
    }

    

