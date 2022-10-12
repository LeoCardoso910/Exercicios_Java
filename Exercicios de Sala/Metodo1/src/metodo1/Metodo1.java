package metodo1;
public class Metodo1 {
    public static void main(String[] args) {
       Metodo1 mt1 = new Metodo1();
        mt1.metodoUm();
        System.out.println(mt1.metodoDois());
        double total=mt1.metodo3(10, 5);
        System.out.println(""+ total);
        
    }
    
    void metodoUm(){
            System.out.println("Método Sem Argumentos");
    }
    
    int metodoDois(){
        int valor1=10,valor2=13;
        int total = valor1*valor2;
        
        return total;
    }
    double metodo3(int arg1, int arg2 ){
        double total;
        total = (double)arg1 / (double) arg2;
        return total;
    }
    
}
