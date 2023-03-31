package motorista;

public class LimiteInicial extends Limite{

    public LimiteInicial(int limiteInicial) { super(limiteInicial); }

    public int calcularPontos() {
        return limiteInicial-(this.infracao.infracaoPonto()*this.quantidade);
    }
}
