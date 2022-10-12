import java.text.DecimalFormat;
import java.util.Scanner;

public class Quarta {
    public static void main(String[] args)  {
        Scanner ler= new Scanner(System.in);
        
      
        int numeroMultiplicador; 

        System.out.println("Quantas broas foram vendidas?");
        numeroMultiplicador=ler.nextInt();
        double broa = 1.50*numeroMultiplicador;

        System.out.println("Quantos pães foram vendidos?");
        numeroMultiplicador=ler.nextInt();
        double pão = 0.25*numeroMultiplicador;

        double conta= broa+pão;
        double porcentagemDaPoupanca = conta*10/100;


        System.out.println("O valor do total arrecadado é: "+ conta);
        System.out.println("O valor que deve ser guardado do que foi arrecadado: "+ porcentagemDaPoupanca);
    }
}
