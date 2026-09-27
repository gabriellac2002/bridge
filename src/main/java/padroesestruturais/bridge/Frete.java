package padroesestruturais.bridge;

public abstract class Frete {

    protected RegiaoEntrega regiaoEntrega;
    protected float custoBase;

    public Frete(float custoBase) {
        this.custoBase = custoBase;
    }

    public void setRegiaoEntrega(RegiaoEntrega regiaoEntrega) {
        this.regiaoEntrega = regiaoEntrega;
    }

    public void setCustoBase(float custoBase) {
        this.custoBase = custoBase;
    }

    public abstract float calcularCusto();
}
