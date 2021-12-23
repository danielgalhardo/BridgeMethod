public class Camisa extends  Roupa {
    public Camisa(float precoUnidade, String tamanho)
    {
        super(precoUnidade, tamanho);
    }

    @Override
    public float calculaValorUnidade() throws Exception {
        return this.precoUnidade + (this.material.precoTabelado(tamanho));
    }
}
