package pooi;

public class Atividade01 {
        public String nome;
        public float distancia;
        public float tempo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public float getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
        
    public void velocidadeMedia(){
        float velocidade= this.getDistancia()/this.getTempo();
        System.out.println("A velocidade média do "+ this.getNome() +" foi "+ velocidade + "km/h");
        
    }
   
    public static void main(String[] args) {
       Atividade01 calculo = new Atividade01();
       
       calculo.setNome("leo");
       calculo.setDistancia(9);
       calculo.setTempo(2);
       calculo.velocidadeMedia();
    }
}
