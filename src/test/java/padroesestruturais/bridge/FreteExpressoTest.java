package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FreteExpressoTest {

    @Test
    void deveCalcularFreteExpressoLocal() {
        FreteExpresso frete = new FreteExpresso(50.0f);
        frete.setRegiaoEntrega(new EntregaLocal());
        frete.setQuantidadeVolumes(2);
        assertEquals(100.0f, frete.calcularCusto(), 0.01f);
    }

    @Test
    void deveCalcularFreteExpressoEstadual() {
        FreteExpresso frete = new FreteExpresso(50.0f);
        frete.setRegiaoEntrega(new EntregaEstadual());
        frete.setQuantidadeVolumes(2);
        assertEquals(110.0f, frete.calcularCusto(), 0.01f);
    }

    @Test
    void deveCalcularFreteExpressoNacional() {
        FreteExpresso frete = new FreteExpresso(50.0f);
        frete.setRegiaoEntrega(new EntregaNacional());
        frete.setQuantidadeVolumes(2);
        assertEquals(120.0f, frete.calcularCusto(), 0.01f);
    }

    @Test
    void deveCalcularFreteExpressoInternacional() {
        FreteExpresso frete = new FreteExpresso(50.0f);
        frete.setRegiaoEntrega(new EntregaInternacional());
        frete.setQuantidadeVolumes(2);
        assertEquals(130.0f, frete.calcularCusto(), 0.01f);
    }
}
