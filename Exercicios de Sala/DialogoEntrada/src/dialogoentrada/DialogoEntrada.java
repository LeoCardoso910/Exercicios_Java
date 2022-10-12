package dialogoentrada;

import javax.swing.JOptionPane;

public class DialogoEntrada {

    public static void main(String[] args) {
        //pede para inserir seu nome
        String nome=JOptionPane.showInputDialog("Qual é o seu nome?");

        //cria mensagem
        String mensagem = String.format("Bem-vindo %s ao curso de Java", nome);
    
        //Exibe a mensagem
        JOptionPane.showMessageDialog(null, mensagem);
        
    }
}
