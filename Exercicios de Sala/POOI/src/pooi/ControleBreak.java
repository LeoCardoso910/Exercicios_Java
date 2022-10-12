package pooi;
public class ControleBreak {
        public void cont5(){
            int contador;
            for(contador=1; contador < 10; contador++){
                if(contador==5) break;
            
                System.out.println(contador);
            }
            System.out.println("saída do loop: "+contador);
        }
}
