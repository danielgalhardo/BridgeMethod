public class Linho  implements Material{
    @Override
    public float precoTabelado(String tamanho) {
        if (tamanho.equals("P")) {
            return 9.5f;
        } else if (tamanho.equals("M")) {
            return 15.5f;
        } else if (tamanho.equals("G")) {
            return 19.5f;
        } else if (tamanho.equals("GG")) {
            return 25.5f;
        }
        return 0;
    }
}
