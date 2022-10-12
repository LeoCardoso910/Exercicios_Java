package vetorbidimensional;

public class VetorBidimensional {

    public static void main(String[] args) {
       
        int [][] vetor1 ={ {1,2,3},{4,5,6}};
        int [][] vetor2={{1,2},{3},{4,5,6}};
        
        System.out.println("vetor 1");
        SaidaVetor(vetor1);
         System.out.println("vetor 2");
        SaidaVetor(vetor2);
    
        
       
    }
     public static void SaidaVetor( int[][] vetor){
        
        for(int linha=0; linha < vetor.length;linha++){
         
            for(int coluna=0; coluna < vetor.length; coluna++){
                System.out.print(vetor[linha][coluna]);
            }
            System.out.println();
        }
    }
   
    
    
    
}
