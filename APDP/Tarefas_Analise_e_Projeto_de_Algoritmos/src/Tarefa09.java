public class Tarefa09 {
   

    public int max_I(int[] A, int n){
       int x=A[1];

       for(int i=2; i < n;i++){
            if(A[i]>x){
                x=A[i];
            }
       }
        return x;
    }

    public int max_r(int[] A, int n){
        int x = 0;
    
        if(n==1){
            return A[1];

        } else {
            x= max_r(A, n-1);
            if( x<A[n]){
                return A[n];
            }else{
                return x;
            }
        }

    }

    public static void main(String[] args) {
        
        long tempoInicial = System.currentTimeMillis();
        Tarefa09 maiorNumero = new Tarefa09();
        int[] vetor1={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,
            31,32,33,34,35,36,37,38,39,40,411,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,
            61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,
            92,93,94,95,96,97,98,99,100};
        
        System.out.println(maiorNumero.max_r(vetor1, 99));  

        long tempoFinal = System.currentTimeMillis();
        long tempo=tempoFinal-tempoInicial;
        
        System.out.println("O tempo em milisegundos foi: "+tempo);
    
    }
}
