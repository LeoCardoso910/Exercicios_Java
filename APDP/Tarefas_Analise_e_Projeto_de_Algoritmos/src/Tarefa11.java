public class Tarefa11 {

    public static void main(String[] args) {
        long tempoInicial = System.currentTimeMillis();
        Tarefa11 a= new Tarefa11();
        System.out.println(a.recorrencia(1000, 10));

        long tempoFinal = System.currentTimeMillis();
        long tempo=tempoFinal-tempoInicial;
        
        System.out.println("O tempo de execução foi "+tempo+" milisegundos");
    
    }

    public int recursivo(int n){
        int s;
        if (n == 0) {
            return 1;
        } else {
          s= recursivo(n-1)+n+1;
        }
        return s;
    }

    public int recorrencia(int n, int x){
        int s;

        if(n==0){
            return 1;
        }else{
            s=(int) ((Math.pow(n,2)+3*n+(2*x))/2);
        }
        return s;

    }
}
