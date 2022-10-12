public class Tarefa12 {
    public static void main(String[] args) {
     Tarefa12 a = new Tarefa12();

     System.out.print(a.segundaQuestao(2));
        

    }

    public int segundaQuestao(int n){
        int x=0;
        if( n==0){
            return 0;
        }
        x= segundaQuestao(n-1) + 2*n-1;
        return x;

    }
    
    
    
    public int primeiraQuestao(int n){
        int x;
 
         if(n==0){
             return 1;
         }
         x= primeiraQuestao(n-1)+n+1;
         
         return x;
     }

}
