public class Malha implements  Material{
    @Override
    public float precoTabelado(String tamanho) {
        if (tamanho.equals("P")) {
            return 6.5f;
        } else if (tamanho.equals("M")) {
            return 8.5f;
        } else if (tamanho.equals("G")) {
            return 9.5f;
        } else if (tamanho.equals("GG")) {
            return 11.5f;
        }
        return 0;
    }
}
