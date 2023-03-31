package motorista;

public class LimiteTrinta extends Limite{

    private int desconto;

    public LimiteTrinta(int limiteInicial) {
        super(limiteInicial);
        this.desconto = 10;
    }


    public int calcularPontos() {
        return (limiteInicial-this.desconto)-(this.infracao.infracaoPonto()*this.quantidade);
    }
}
