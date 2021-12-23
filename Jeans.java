public class Jeans implements Material{
    @Override
    public float precoTabelado(String tamanho) {
        if (tamanho.equals("P")) {
            return 3.5f;
        } else if (tamanho.equals("M")) {
            return 5.5f;
        } else if (tamanho.equals("G")) {
            return 7.5f;
        } else if (tamanho.equals("GG")) {
            return 10.0f;
        }
        return 0;
    }
}
