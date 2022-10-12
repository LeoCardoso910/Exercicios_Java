import java.text.DecimalFormat;
import java.util.Scanner;

public class Sexta {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00");

        int numeroMultiplicador; 

        System.out.println("Quantas latas de 350ml foram vendidas?");
        numeroMultiplicador=ler.nextInt();
        double lata = 0.350*numeroMultiplicador;

        System.out.println("Quantas garrafas de 600ml foram vendidas?");
        numeroMultiplicador=ler.nextInt();
        double garrafaDeSeis = 0.600*numeroMultiplicador;

        System.out.println("Quantas garrafas de 2 litros foram vendidas?");
        numeroMultiplicador=ler.nextInt();
        double garrafaDeDois = 2*numeroMultiplicador;

        double quantidade= lata+garrafaDeDois+garrafaDeSeis;

        System.out.println("A quantidade de refrigerante consumida foi de: "+ d.format(quantidade) +" litros");


    }
}
