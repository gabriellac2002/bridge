package padroesestruturais.bridge;

public class RetiradaNaLoja extends Frete {

    public RetiradaNaLoja(float custoBase) {
        super(custoBase);
    }

    public float calcularCusto() {
        return this.custoBase;
    }
}
