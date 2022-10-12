package laranja2;

import java.util.Scanner;

public class Laranja2 {
    
    
    private String nomecurso;

    //o construtor inicializa nomecurso com o argumento String
    public Laranja2(String nome){
        nomecurso=nome;
    }

    public String getNomecurso() {
        return nomecurso;
    }

    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }

    public void display(){
        System.out.println("Bem-vindo ao curso "+ getNomecurso());
    }

    
    
    
    
}
