package metodo3teste;
    
import MetodoIII.Metodo3;
import java.util.Scanner;

public class Metodo3teste {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Metodo3 mte =new Metodo3();
        System.out.println("Informe seu nome: ");
        String nome = input.nextLine();
        mte.display(nome);
    
    }
    
}
