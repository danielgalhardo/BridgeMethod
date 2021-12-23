public class Macacao extends  Roupa {
    public Macacao(float precoUnidade, String tamanho)
    {
        super(precoUnidade, tamanho);
    }
    @Override
    public float calculaValorUnidade()  {
        return this.precoUnidade + (this.material.precoTabelado(tamanho));
    }
}
