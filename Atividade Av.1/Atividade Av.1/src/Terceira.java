import java.util.Scanner;

public class Terceira {
    public static void main(String[] args)  {
        Scanner ler= new Scanner(System.in);
        
        
        System.out.println("Insira o valor total da compra: ");
        double valor= ler.nextDouble();

        valor-= valor*10/100;
        double parcela= valor/3;

        System.out.println("O valor total a ser pago é de: "+valor);
        System.out.println("O valor de cada parcela será: "+parcela);
    }
}
