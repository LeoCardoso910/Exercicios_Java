/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package melao;

/**
 *
 * @author Pc27sala06
 */

import java.util.Scanner;
public class laranja {
            //IMPRIMINDO 
    /*public static void main (String[] args){
        System.out.println("imprimindo com println");
        System.out.printf("%s\n", "olá mundo!");
    }*/
    
    //SOMANDO NUMEROS INTEIROS
    
    /*public static void main(String[] Args){
        //criar um scanner, para obter entrada de comandos
        
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int resultado;
        
        System.out.println ("SOMA DE NUMEROS INTEIROS\n");
        System.out.println ("Entre com o primeiro numero:");
        num1=input.nextInt();//le o primeiro numero fornecido pelo usuario
        System.out.println ("Entre com o segundo numero:");
        num2=input.nextInt();//le o segundo numero fornecido pelo usuario
        
        resultado=num1+num2;
        
        System.out.println ("Resultado: " +resultado);
    }*/
    
    // VERIFICANDO MAIOR VALOR
    /*public static void main(String[] Args){
        //criar um scanner, para obter entrada de comandos
        
        Scanner input = new Scanner(System.in);
        int valor1;
        int valor2;
        int resultado;
        
        System.out.println ("DETERMINANDO MAIOR VALOR\n");
        System.out.println ("Digite o valor 1:");
        valor1=input.nextInt();//le o primeiro numero fornecido pelo usuario
        System.out.println ("Digite o valor 2:");
        valor2=input.nextInt();//le o segundo numero fornecido pelo usuario
        
        if(valor1 > valor2){
            System.out.println ("O valor inicial é maior que o valor final");
        }
        else if (valor1 < valor2){
            System.out.println ("O valor inicial é menor que o valor final");
        }
        else {
            System.out.println("O valor inicial é igual ao valor final");
        }     
}*/
    
    public static void main(String[] Args){
        //criar um scanner, para obter entrada de comandos
        
        Scanner input = new Scanner(System.in);
        
        System.out.println ("IDENTIFICANDO VALORES MAIORES QUE 5\n");
        System.out.println ("Informe um valor:");
        int valor=input.nextInt();//le o primeiro numero fornecido pelo usuario
        
        switch(valor) {
            case 1: System.out.println("Opção '1' menor que 5"); break;
            case 2: System.out.println("Opção '2' menor que 5"); break;
            case 3: System.out.println("Opção '3' menor que 5"); break;
            case 4: System.out.println("Opção '4' menor que 5"); break;
            case 5: System.out.println("Opção '5' igual a 5"); break;
            default: System.out.println("O valor é maior que 5"); break;
        }
        }     
}