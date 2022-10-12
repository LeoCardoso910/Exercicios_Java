
package vetorbidimensional;

public class NewClass {
     public static void SaidaVetor( int[][] vetor){
        
        for(int linha=0; linha < vetor.length;linha++){
            for(int coluna=0; coluna < vetor.length; coluna++){
                System.out.print(vetor[linha][coluna]);
            }
            System.out.println();
        }
    }
}
