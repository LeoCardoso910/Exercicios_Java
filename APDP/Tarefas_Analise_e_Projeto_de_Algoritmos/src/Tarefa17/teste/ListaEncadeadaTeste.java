package Tarefa17.teste;

import Tarefa17.Lista;
public class ListaEncadeadaTeste {
    
    public static void main(String[] args){
        Lista lista1 = new Lista(); //Instancia o objeto do Vertice 0
        lista1.insereInicio(2);     // arco b (0-2)
        lista1.insereInicio(0);     // laço a (0-0)
        System.out.println(lista1.exibeLista("0 :"));

        Lista lista2 = new Lista(); //Instancia o objeto do Vertice 1
        lista2.insereInicio(3); // arco g (1-3)
        lista2.insereInicio(3); // arco h (1-3)
        System.out.println(lista2.exibeLista("1 :"));

        Lista lista3 = new Lista(); // Instancia o objeto do Vertice 2
        lista3.insereInicio(6); // arco c (2-6) 
        System.out.println(lista3.exibeLista("2 :"));

        Lista lista4 = new Lista(); // Instancia o objeto do Vertice 3
        lista4.insereInicio(7);// arco i (3-7)
        System.out.println(lista4.exibeLista("3 :"));

        Lista lista5 = new Lista(); // Instancia o objeto do Vertice 4
        System.out.println(lista5.exibeLista("4 :"));
        
        Lista lista6 = new Lista();// Instancia o objeto do Vertice 5
        System.out.println(lista6.exibeLista("5 :"));

        Lista lista7 = new Lista();// Instancia o objeto do Vertice 6
        lista7.insereInicio(2); //arco e (6-2)
        lista7.insereInicio(4); //arco f (6-4)
        lista7.insereInicio(0); //arco d (6-0)
        System.out.println(lista7.exibeLista("6 :"));

        Lista lista8 = new Lista();// Instancia o objeto do Vertice 7
        System.out.println(lista8.exibeLista("7 :"));

        Lista lista9 = new Lista();// Instancia o objeto do Vertice 8
        lista9.insereInicio(5);//arco j (8-5)
        System.out.println(lista9.exibeLista("8 :"));
    }
}
