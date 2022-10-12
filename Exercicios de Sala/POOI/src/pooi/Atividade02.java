package pooi;

import java.text.DecimalFormat;


public class Atividade02 {
        public float conta =0 ;
   
        public void tulipa(){
            conta+=2.80; 
        }
        public void pizzaMistaGrande(){
            conta+=10.00 ; 
      
        }
         public void cobertura(){
            conta+=1.50 ; 
        }
        public void pagamento(int pessoas){
            DecimalFormat formatador = new DecimalFormat("0.00");
            
            float gorjeta =conta/10;
            
            System.out.println("O preço total da conta é de "+ formatador.format(conta+gorjeta));
            
            float paga = conta/pessoas;
            System.out.println("O valor pago por cada pessoa será "+formatador.format(paga));
        }
         public static void main(String[] args) {
            Atividade02 calculo = new Atividade02();
      
            calculo.pizzaMistaGrande();
            calculo.tulipa();
            calculo.cobertura();
            calculo.cobertura();
      
            calculo.pagamento(3);
        }
}
