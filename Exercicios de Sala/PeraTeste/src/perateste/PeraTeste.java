package perateste;

import java.util.Scanner;

public class PeraTeste {

    public static void main(String[] args) {

        Pera pr1 = new Pera(50.00);
        Pera pr2 = new Pera(-7.53);
        
        System.out.println("Objeto 1 Saldo: "+pr1.getSaldo());
        System.out.println("Objeto 1 Saldo: "+pr2.getSaldo());
        
        //obter entrada
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com a quantia para depositar");
        double quantiadeposito= input.nextDouble();
        System.out.println("Saldo conta: "+quantiadeposito);
        
        pr1.credito(quantiadeposito);//adiciona o saldo no objeto 1
        
        //exibe saldo
        System.out.println("Saldo 1: "+ pr1.getSaldo());
        System.out.println("Salodo 2: "+ pr2.getSaldo());
    
    }
    
}
