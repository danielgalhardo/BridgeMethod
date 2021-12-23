public class Moletom implements Material {
    @Override
    public float precoTabelado(String tamanho) {
        if (tamanho.equals("P")) {
            return 10.5f;
        } else if (tamanho.equals("M")) {
            return 12.5f;
        } else if (tamanho.equals("G")) {
            return 15.5f;
        } else if (tamanho.equals("GG")) {
            return 17.5f;
        }
        return 0;
    }
}
