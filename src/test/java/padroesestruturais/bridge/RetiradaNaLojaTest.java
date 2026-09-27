package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RetiradaNaLojaTest {

    @Test
    void deveManterCustoDaRetiradaLocal() {
        RetiradaNaLoja retirada = new RetiradaNaLoja(1000.0f);
        retirada.setRegiaoEntrega(new EntregaLocal());
        assertEquals(1000.0f, retirada.calcularCusto(), 0.01f);
    }

    @Test
    void deveManterCustoDaRetiradaEstadual() {
        RetiradaNaLoja retirada = new RetiradaNaLoja(1000.0f);
        retirada.setRegiaoEntrega(new EntregaEstadual());
        assertEquals(1000.0f, retirada.calcularCusto(), 0.01f);
    }

    @Test
    void deveManterCustoDaRetiradaNacional() {
        RetiradaNaLoja retirada = new RetiradaNaLoja(1000.0f);
        retirada.setRegiaoEntrega(new EntregaNacional());
        assertEquals(1000.0f, retirada.calcularCusto(), 0.01f);
    }

    @Test
    void deveManterCustoDaRetiradaInternacional() {
        RetiradaNaLoja retirada = new RetiradaNaLoja(1000.0f);
        retirada.setRegiaoEntrega(new EntregaInternacional());
        assertEquals(1000.0f, retirada.calcularCusto(), 0.01f);
    }
}
