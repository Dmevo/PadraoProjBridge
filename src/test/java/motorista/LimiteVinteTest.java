package motorista;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LimiteVinteTest {

    @Test
    void deveRetornarPontosLimiteVinteInfracaoLeve() {
        Infracao infracao = new Leve();
        LimiteVinte limiteVinte = new LimiteVinte(40);
        limiteVinte.setInfracao(infracao);
        limiteVinte.setQuantidade(4);

        assertEquals(8, limiteVinte.calcularPontos());

    }

    @Test
    void deveRetornarPontosLimiteVinteInfracaoMedia() {
        Infracao infracao = new Media();
        LimiteVinte limiteVinte = new LimiteVinte(40);
        limiteVinte.setInfracao(infracao);
        limiteVinte.setQuantidade(2);

        assertEquals(12, limiteVinte.calcularPontos());

    }

    @Test
    void deveRetornarPontosLimiteVinteInfracaoGrave() {
        Infracao infracao = new Grave();
        LimiteVinte limiteVinte = new LimiteVinte(40);
        limiteVinte.setInfracao(infracao);
        limiteVinte.setQuantidade(1);

        assertEquals(15, limiteVinte.calcularPontos());

    }

    @Test
    void deveRetornarPontosLimiteVinteInfracaoGravissima() {
        Infracao infracao = new Gravissima();
        LimiteVinte limiteVinte = new LimiteVinte(40);
        limiteVinte.setInfracao(infracao);
        limiteVinte.setQuantidade(1);

        assertEquals(13, limiteVinte.calcularPontos());

    }
}
