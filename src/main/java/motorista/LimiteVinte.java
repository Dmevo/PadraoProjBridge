package motorista;

public class LimiteVinte extends Limite{

    private int desconto;

    public LimiteVinte(int limiteInicial) {
        super(limiteInicial);
        this.desconto = 20;
    }

    public int calcularPontos() {
        return (limiteInicial-this.desconto)-(this.infracao.infracaoPonto()*this.quantidade);
    }
}
