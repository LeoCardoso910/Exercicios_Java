package Tarefa17;

public class ListaEncadeada<T>{

    private No<T> inicio;
    private int tamanho=0;

    public void adiciona(T elemento){
        No<T> celula = new No<T>(elemento);
        this.inicio = celula;
        this.tamanho++;
    }
    


    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }



    @Override
    public String toString() {
        return "ListaEncadeada [inicio=" + inicio + "]";
    }
    
}
