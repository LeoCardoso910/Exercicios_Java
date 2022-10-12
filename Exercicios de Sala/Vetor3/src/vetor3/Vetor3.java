package vetor3;

public class Vetor3 {

    public static void main(String[] args) {
        int elementos=5;
        
        int[] vetor = new int[elementos];//cria o array
        
        int contador;
        //calcula os elementos do vetor
        for(contador=0; contador< vetor.length; contador++){
            vetor[contador]=2+(2*contador);
            System.out.println("INDEX, VALOR");
        }
        //gera a saida do valor de cada elemento
        for(contador=0; contador<vetor.length;contador++){
            System.out.printf("%d %8d \n",contador,vetor[contador]);
        }
        
    }
    
}
