public class Lycra implements Material {


    public float precoTabelado(String tamanho) {

        if (tamanho.equals("P")) {
            return 5.5f;
        } else if (tamanho.equals("M")) {
            return 7.5f;
        } else if (tamanho.equals("G")) {
            return 12.5f;
        } else if (tamanho.equals("GG")) {
            return 12.5f;
        }
        return 0;
    }
}
