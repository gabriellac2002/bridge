package padroesestruturais.bridge;

public class FreteConvencional extends Frete {

    public FreteConvencional(float custoBase) {
        super(custoBase);
    }

    public float calcularCusto() {
        return this.custoBase * (1 + this.regiaoEntrega.percentualAcrescimo());
    }
}
