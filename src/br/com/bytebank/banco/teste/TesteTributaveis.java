package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.Modelo.CalculadorDeImposto;
import br.com.bytebank.banco.Modelo.ContaCorrente;
import br.com.bytebank.banco.Modelo.SeguroDeVida;

public class TesteTributaveis {

    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(123, 321);
        cc.deposita(100);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registra(cc);
        calc.registra(seguro);

        System.out.println(calc.getTotalImposto());

    }
    
}
