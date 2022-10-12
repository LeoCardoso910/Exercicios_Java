package comissaofuncionario;

public class ComissaoFuncionario {

    public static void main(String[] args) {
        NewClass funcionario = new NewClass("Thiago","Nicolau", "222-22-222", 1000,0.06);
        
        System.out.printf("o nome é: %s\n", funcionario.getPrimeironome());
        System.out.printf("O sobrenome é: %s \n", funcionario.getUltimonome());
        System.out.printf("O numero de segurança social é: %s\n", funcionario.getNumerosocial());
        System.out.printf("O valor bruto da semana é: %.2f \n", funcionario.getVendasbrutas());
        System.out.printf("A porcentagem de comissão é: %.2f \n", funcionario.getPorcentagemcomissao());
        
        funcionario.setVendasbrutas(500);//configuração de vendas brutas 
        funcionario.setPorcentagemcomissao(0.1);// comissao da taxa de comissão
        System.out.println("\n"+funcionario.toString());
    
    }
    
}
