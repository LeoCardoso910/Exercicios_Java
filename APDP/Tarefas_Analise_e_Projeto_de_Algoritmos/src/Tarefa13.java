public class Tarefa13{


    public static void main(String[] args) {
        long tempoInicial = System.currentTimeMillis();
        Tarefa13 a = new Tarefa13();
        
        System.out.print(a.recursivo(100));
        long tempoFinal = System.currentTimeMillis();
        long tempo=tempoFinal-tempoInicial;
        System.out.println();
        System.out.println("O tempo em milisegundos foi: "+tempo);
    }

    public long recursivo(long n){
        if(n>=2){
            return (recursivo(n-1)+recursivo(n-2));
        }
        return n;
    }


    public long iterativo(long n){
            long i=1, atual =0, ultimo=0, penultimo=1;

            while(i<=n){
                atual=ultimo+penultimo;
                penultimo=ultimo;
                ultimo=atual;
                i++;
            }
        return atual;
    }

}