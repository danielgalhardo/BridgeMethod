import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class BridgeTest {
    @Test
    void retornaPrecoCalcaDeLycra() {
        Material calcaLycra = new Lycra();
        Calca novaCalca = new Calca(10.f, "P");
        novaCalca.setMaterial(calcaLycra);
        assertEquals(15.5f, novaCalca.calculaValorUnidade(), 0.01f);
    }

    @Test
    void retornaPrecoCalcaDeLycraM() {
        Material calcaLycra = new Lycra();
        Calca novaCalca = new Calca(10.f, "M");
        novaCalca.setMaterial(calcaLycra);
        assertEquals(17.5f, novaCalca.calculaValorUnidade(), 0.01f);
    }

    @Test
    void retornaPrecoCalcaDeLycraG()  {
        Material calcaLycra = new Lycra();
        Calca calca = new Calca(10.f, "G");
        calca.setMaterial(calcaLycra);
        assertEquals(22.5f, calca.calculaValorUnidade(), 0.01f);
    }


    @Test
    void retornaPrecoMacacaoJeansM() {
        Material macacaoJeans = new Jeans();
        Macacao novoMacacao = new Macacao(60.f, "M");
        novoMacacao.setMaterial(macacaoJeans);
        assertEquals(65.5, novoMacacao.calculaValorUnidade(), 0.01f);
    }

    @Test
    void retornaPrecoMacacaoMoletomM(){
        Material macacaoMoletom = new Moletom();
        Macacao novoMacacao = new Macacao(60.f, "M");
        novoMacacao.setMaterial(macacaoMoletom);
        assertEquals(72.5f, novoMacacao.calculaValorUnidade(), 0.01f);
    }


    @Test
    void retornaExcecaoTamanhoInvalido()  {
        try {
            Material shortsMoletom = new Moletom();
            Shorts novoShort = new Shorts(60.f, "XL");
            novoShort.setMaterial(shortsMoletom);
        }
        catch(IllegalArgumentException ex)
        {
            assertEquals("Você digitou um tamanho indisponível", ex.getMessage());
        }
    }


}