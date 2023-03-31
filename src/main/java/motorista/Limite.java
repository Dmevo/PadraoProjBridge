package motorista;

public abstract class Limite {

    protected Infracao infracao;

    protected int limiteInicial;

    protected int quantidade;

    public Limite(int limiteInicial) { this.limiteInicial = limiteInicial; }

    public void setInfracao(Infracao infracao) { this.infracao = infracao; }

    public void setLimiteInicial(int limiteInicial) { this.limiteInicial = limiteInicial; }

    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public abstract int calcularPontos();
}
