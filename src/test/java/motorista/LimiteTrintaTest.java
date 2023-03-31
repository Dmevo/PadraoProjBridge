package motorista;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LimiteTrintaTest {

    @Test
    void deveRetornarPontosLimiteTrintaInfracaoLeve() {
        Infracao infracao = new Leve();
        LimiteTrinta limiteTrinta = new LimiteTrinta(40);
        limiteTrinta.setInfracao(infracao);
        limiteTrinta.setQuantidade(4);

        assertEquals(18, limiteTrinta.calcularPontos());

    }

    @Test
    void deveRetornarPontosLimiteTrintaInfracaoMedia() {
        Infracao infracao = new Media();
        LimiteTrinta limiteTrinta = new LimiteTrinta(40);
        limiteTrinta.setInfracao(infracao);
        limiteTrinta.setQuantidade(2);

        assertEquals(22, limiteTrinta.calcularPontos());

    }

    @Test
    void deveRetornarPontosLimiteTrintaInfracaoGrave() {
        Infracao infracao = new Grave();
        LimiteTrinta limiteTrinta = new LimiteTrinta(40);
        limiteTrinta.setInfracao(infracao);
        limiteTrinta.setQuantidade(1);

        assertEquals(25, limiteTrinta.calcularPontos());

    }

    @Test
    void deveRetornarPontosLimiteTrintaInfracaoGravissima() {
        Infracao infracao = new Gravissima();
        LimiteTrinta limiteTrinta = new LimiteTrinta(40);
        limiteTrinta.setInfracao(infracao);
        limiteTrinta.setQuantidade(1);

        assertEquals(23, limiteTrinta.calcularPontos());

    }
}
