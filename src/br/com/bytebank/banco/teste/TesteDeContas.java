package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.Modelo.ContaCorrente;
import br.com.bytebank.banco.Modelo.ContaPoupanca;

public class TesteDeContas {
    
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente(123, 222);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(222, 333);
        cp.deposita(200);

        cc.transfere(10, cp);

        System.out.println("Saldo CC " + cc.pegaSaldo());
        System.out.println("Saldo PP " + cp.pegaSaldo());
        
    }
}
