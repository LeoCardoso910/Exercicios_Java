package laranja;

import java.util.Scanner;

public class Laranja {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TesteGetSet lj1 = new TesteGetSet();
        System.out.println("O nome do curso incialmente é:"+lj1.getLaranja());
        
        System.out.println("Informe o nome  do curso: ");
        String onome = input.nextLine();
        lj1.setLaranja(onome);
        System.out.println();
        lj1.display();
    
    }
    
}
