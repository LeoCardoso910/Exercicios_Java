package comissaofuncionario;

public class NewClass extends Object {
    private String primeironome;
    private String ultimonome;
    private String numerosocial;
    private double vendasbrutas;
    private double porcentagemcomissao;
    
    public  NewClass(String primeironome, String ultimonome, String numerosocial, double vendasbrutas, double porcentagemcomissao){
            this.primeironome= primeironome;
            this.ultimonome=ultimonome;
            this.numerosocial=numerosocial;
            this.vendasbrutas= vendasbrutas;
            this.porcentagemcomissao= porcentagemcomissao;
    }

    public String getPrimeironome() {
        return primeironome;
    }

    public void setPrimeironome(String primeironome) {
        this.primeironome = primeironome;
    }

    public String getUltimonome() {
        return ultimonome;
    }

    public void setUltimonome(String ultimonome) {
        this.ultimonome = ultimonome;
    }

    public double getPorcentagemcomissao() {
        return porcentagemcomissao;
    }

    public void setPorcentagemcomissao(double porcentagemcomissao) {
        this.porcentagemcomissao = (porcentagemcomissao>0.0 && porcentagemcomissao<1.0)?porcentagemcomissao:0.0;
    }

    public String getNumerosocial() {
        return numerosocial;
    }

    public void setNumerosocial(String numerosocial) {
        this.numerosocial = numerosocial;
    }

    public double getVendasbrutas() {
        return vendasbrutas;
    }

    public void setVendasbrutas(double vendasbrutas) {
        this.vendasbrutas = (vendasbrutas<0.0)?0.0:vendasbrutas;
    }
    
    public double calculalucros(){
        return porcentagemcomissao*vendasbrutas;
    }
    
}
