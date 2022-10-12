package vetor4;

public class Vetor4 {

    public static void main(String[] args) {
        int[] vetor={87,68,94,100,83,78};
        int total=0;
        
        for(int contador=0; contador<vetor.length; contador++){
            total += vetor[contador];
            System.out.println("processo de soma dos elementos do vetor: "+total);
        }
        System.out.println("Total do vetor: "+total);
    
    }
    
}
