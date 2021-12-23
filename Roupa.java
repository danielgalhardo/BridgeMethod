public abstract class Roupa {

    protected Material material;
    protected float precoUnidade;
    protected String tamanho;

    public Roupa(float precoUnidade, String tamanho)
    {
        this.precoUnidade = precoUnidade;
        if (tamanho.equals("P") || tamanho.equals("M") || tamanho.equals("G") || tamanho.equals("GG") )
        {
        this.tamanho = tamanho;
        }
        else{
            throw new IllegalArgumentException("Você digitou um tamanho indisponível");
        }
    }

    public void setMaterial(Material material)
    {
        this.material = material;
    }



    public void setPrecoUnidade(float precoUnidade) {
        this.precoUnidade = precoUnidade;
    }

    public abstract float calculaValorUnidade() throws Exception;
}
