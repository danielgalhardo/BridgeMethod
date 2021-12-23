public class Shorts  extends  Roupa{
    public Shorts(float precoUnidade, String tamanho)
    {
        super(precoUnidade, tamanho);
    }

    @Override
    public float calculaValorUnidade()  {
        return this.precoUnidade + (this.material.precoTabelado(tamanho));
    }
}
