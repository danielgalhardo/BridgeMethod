public class Camisa extends  Roupa {
    public Camisa(float precoUnidade, String tamanho)
    {
        super(precoUnidade, tamanho);
    }

    @Override
    public float calculaValorUnidade(){
        return this.precoUnidade + (this.material.precoTabelado(tamanho));
    }
}
