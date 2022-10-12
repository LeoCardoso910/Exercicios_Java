package metodomatematica;

import java.util.Scanner;

public class MetodoMatematica {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //solicitar três valores 
        System.out.println("insira os valores");
        double numero1=input.nextDouble();
        double numero2=input.nextDouble();
        
        //determinar o valor máximo
        double resultadoMaximo = Math.max(numero1, numero2);
        double resultadoMinimo = Math.min(numero1, numero2);
        double resultadoAbsoluto = Math.abs(numero1);
        double resultadoPotencia = Math.pow(numero1, numero2);
        double resultadoRaizQuadrada = Math.sqrt(numero1);
        System.out.println("Valor máximo é: "+resultadoMaximo);
        System.out.println("Valor minimo é: "+resultadoMinimo);
        System.out.println("Valor absluto é: "+resultadoAbsoluto);
        System.out.println("Número1 elevado ao Número2 è: "+resultadoPotencia);
        System.out.println("Raiz Quadrada: "+resultadoRaizQuadrada);
        
    }
    
}
