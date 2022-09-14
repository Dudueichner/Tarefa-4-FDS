public class ContaCorrente {
    String numConta;
    String nomeCorr;
    double saldo;
    String cat;

    public ContaCorrente(String num, String nome){
        this.saldo=0;
        this.cat="Silver";
        this.nomeCorr=nome;
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
        if(this.cat.equals("Silver")){
            this.saldo+=valor;
        } else if (this.cat.equals("Gold")){
            this.saldo+=(valor*1.01);
        } else if (this.cat.equals("Platinum")){
            this.saldo+=(valor*1.025);
        }

        if(this.saldo>50000&&this.cat.equals("Silver")){
            this.cat="Gold";
        } else if (this.saldo>200000&&this.cat.equals("Gold")){
            this.cat="Platinim";
        }

        return true;
    }
    public boolean retirada(double valor){
        if(this.saldo-valor<0)
            return false;
            this.saldo-=valor;

        if (this.saldo<100000&&this.cat.equals("Platinum")){
            this.cat="Gold";
        } else if(this.saldo<25000&&this.cat.equals("Gold")) {
            this.cat="Silver";
        }
        return true;
    }
}