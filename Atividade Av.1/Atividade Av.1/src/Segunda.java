import java.text.DecimalFormat;
import java.util.Scanner;

public class Segunda {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00");
      
        int numeroMultiplicador; 

        System.out.println("Quantos chopes?");
        numeroMultiplicador=ler.nextInt();
        double chope = 2.80*numeroMultiplicador;

        System.out.println("Quantas pizzas?");
        numeroMultiplicador=ler.nextInt();
        double pizza = 10*numeroMultiplicador;

        System.out.println("Quantas coberturas?");
        numeroMultiplicador=ler.nextInt();
        double cobertura = 1.50*numeroMultiplicador;

        double conta= pizza+chope+cobertura;
        double porcentagemDoGarcon = conta*10/100;
        double total=conta+porcentagemDoGarcon;

        System.out.println("O valor da conta é: "+ conta);
        System.out.println("O valor que deve ser pago ao garçon é: "+ porcentagemDoGarcon);
        System.out.println("O valor a ser cobrado é: "+ d.format(total));

    }
}
