package pooi;

public class ControleContinue {
     public void cont6(){
            int contador;
            for(contador=1; contador < 6; contador++){
                if(contador==4) continue;
            
                System.out.println(contador);
            }
            System.out.println("pula o valor de 4");
        }
}
