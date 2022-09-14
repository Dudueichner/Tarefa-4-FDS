public class ContaCorrente {
    String numConta;
    String nomeCorr;
    double saldo;
    String cat;

    public ContaCorrente(){
        this.saldo=0;
        this.cat="Silver";
    }

    public void setNome(String nome){
        this.nomeCorr=nome;
    }

    public void setNum(String num){
        this.numConta=num;
    }

    public String getNumeroConta(){
        return this.numConta;
    }
    public String getNomeCorrentista(){
        return this.nomeCorr;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public String getCategoria(){
        return this.cat;
    }
    public boolean deposito(double valor){
        this.saldo+=valor;
        return true;
    }
    public boolean retirada(double valor){
        if(this.saldo-valor<0)
            return false;
        this.saldo-=valor;
        return true;
    }
}