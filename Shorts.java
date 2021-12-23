public class Shorts  extends  Roupa{
    public Shorts(float precoUnidade, String tamanho)
    {
        super(precoUnidade, tamanho);
    }

    @Override
    public float calculaValorUnidade() throws Exception {
        return this.precoUnidade + (this.material.precoTabelado(tamanho));
    }
}
