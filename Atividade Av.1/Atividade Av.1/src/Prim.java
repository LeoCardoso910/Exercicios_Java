import java.util.Scanner;

public class Prim {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        String nome;
        double velocidade;
        double distancia;
        double tempo;
        System.out.println("Informe o nome do piloto: ");
        nome= ler.next();

        System.out.println("Informe a distância: ");
        distancia= ler.nextDouble(); 

        
        System.out.println("Informe o tempo: ");
        tempo= ler.nextDouble(); 


        velocidade= distancia/tempo;
        System.out.println("A velocidade média do "+nome+" foi "+velocidade+" km/h");

    }
    
}
