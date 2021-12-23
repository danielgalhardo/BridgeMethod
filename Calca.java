public class Calca extends  Roupa{

    public Calca(float precoUnidade, String tamanho)
    {
        super(precoUnidade, tamanho);
    }

    @Override
    public float calculaValorUnidade() {
        return this.precoUnidade + (this.material.precoTabelado(tamanho));
    }
}
