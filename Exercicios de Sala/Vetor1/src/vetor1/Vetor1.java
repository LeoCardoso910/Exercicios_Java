package vetor1;

public class Vetor1 {

    public static void main(String[] args) {
        int[] vetor={32,27,64,18,95,14};
        
        System.out.println("index, value");
        
        for(int contador=0; contador<vetor.length; contador++){
            System.out.printf("%d %8d \n", contador, vetor[contador]);
        }
    }
}

