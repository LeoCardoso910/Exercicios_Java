package exemplopolimorfismo;

public class ExemploPolimorfismo {

    public static void main(String[] args) {
        Animais animais = new Peixes();
        animais.mover();
        
        Animais animais2= new Passaro();
        animais2.mover();
        
        relatorio(animais2);
    
    }
    static void relatorio(Animais anim){
        anim.mover();
    }
}
