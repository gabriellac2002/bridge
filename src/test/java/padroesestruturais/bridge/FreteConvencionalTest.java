package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FreteConvencionalTest {

    @Test
    void deveCalcularFreteConvencionalLocal() {
        FreteConvencional frete = new FreteConvencional(2000.0f);
        frete.setRegiaoEntrega(new EntregaLocal());
        assertEquals(2000.0f, frete.calcularCusto(), 0.01f);
    }

    @Test
    void deveCalcularFreteConvencionalEstadual() {
        FreteConvencional frete = new FreteConvencional(2000.0f);
        frete.setRegiaoEntrega(new EntregaEstadual());
        assertEquals(2200.0f, frete.calcularCusto(), 0.01f);
    }

    @Test
    void deveCalcularFreteConvencionalNacional() {
        FreteConvencional frete = new FreteConvencional(2000.0f);
        frete.setRegiaoEntrega(new EntregaNacional());
        assertEquals(2400.0f, frete.calcularCusto(), 0.01f);
    }

    @Test
    void deveCalcularFreteConvencionalInternacional() {
        FreteConvencional frete = new FreteConvencional(2000.0f);
        frete.setRegiaoEntrega(new EntregaInternacional());
        assertEquals(2600.0f, frete.calcularCusto(), 0.01f);
    }
}
