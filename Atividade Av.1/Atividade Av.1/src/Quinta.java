import java.util.Scanner;

public class Quinta {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
        System.out.println("Quantos quilos?");
        double quilo= ler.nextDouble();

        double valor = quilo*12.0;

        System.out.println("O valor a pagar é: "+valor);

    }
}
