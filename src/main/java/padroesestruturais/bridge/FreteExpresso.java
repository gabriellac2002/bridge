package padroesestruturais.bridge;

public class FreteExpresso extends Frete {

    private int quantidadeVolumes;

    public FreteExpresso(float custoBase) {
        super(custoBase);
    }

    public void setQuantidadeVolumes(int quantidadeVolumes) {
        this.quantidadeVolumes = quantidadeVolumes;
    }

    public float calcularCusto() {
        return this.custoBase * this.quantidadeVolumes
                * (1 + this.regiaoEntrega.percentualAcrescimo());
    }
}
