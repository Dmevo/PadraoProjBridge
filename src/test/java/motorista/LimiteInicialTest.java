package motorista;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LimiteInicialTest {

    @Test
    void deveRetornarPontosLimiteInicialInfracaoLeve() {
        Infracao infracao = new Leve();
        LimiteInicial limiteInicial = new LimiteInicial(40);
        limiteInicial.setInfracao(infracao);
        limiteInicial.setQuantidade(3);

        assertEquals(31, limiteInicial.calcularPontos());

    }

    @Test
    void deveRetornarPontosLimiteInicialInfracaoMedia() {
        Infracao infracao = new Media();
        LimiteInicial limiteInicial = new LimiteInicial(40);
        limiteInicial.setInfracao(infracao);
        limiteInicial.setQuantidade(2);

        assertEquals(32, limiteInicial.calcularPontos());

    }

    @Test
    void deveRetornarPontosLimiteInicialInfracaoGrave() {
        Infracao infracao = new Grave();
        LimiteInicial limiteInicial = new LimiteInicial(40);
        limiteInicial.setInfracao(infracao);
        limiteInicial.setQuantidade(1);

        assertEquals(35, limiteInicial.calcularPontos());

    }

    @Test
    void deveRetornarPontosLimiteInicialInfracaoGravissima() {
        Infracao infracao = new Gravissima();
        LimiteInicial limiteInicial = new LimiteInicial(40);
        limiteInicial.setInfracao(infracao);
        limiteInicial.setQuantidade(1);

        assertEquals(33, limiteInicial.calcularPontos());

    }

}
