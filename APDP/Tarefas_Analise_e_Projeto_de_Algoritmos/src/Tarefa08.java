public class Tarefa08 {
    public static void main(String[] args) {
        long tempoInicial = System.currentTimeMillis();

        Tarefa08 a = new Tarefa08();
        int[] vetor={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,
                    31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,
                    61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,
                    92,93,94,95,96,97,98,99,100};
        System.out.println(a.soma_Dir_Esq(1,99,vetor));

        long tempoFinal = System.currentTimeMillis();
        long tempo=tempoFinal-tempoInicial;
        
        System.out.println("O tempo em milisegundos foi: "+tempo);
    }

    public int soma_Dir_Esq(int k, int n, int[] A){
        int s=0;

        if(k>n){
            s=0;

        } else{
            s= A[k]+soma_Dir_Esq(k+1, n, A);
        }

        return s;

    }
    
}



