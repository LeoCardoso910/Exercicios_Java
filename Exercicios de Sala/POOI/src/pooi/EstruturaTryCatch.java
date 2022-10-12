package pooi;


public class EstruturaTryCatch {
    public void cont7(String s[]){    
        int valor=120;
        
        
        try{
                while(valor>Integer.parseInt(s[0])){
                    System.out.println(valor);
                    valor--;
                }
        
        }
        catch(ArrayIndexOutOfBoundsException erro){
            System.out.println("Você não forneceu argumento");
        }
        catch(NumberFormatException erro){
                System.out.println("Você não forneceu um número inteiro");
        }
    }
}
