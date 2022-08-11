package teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.Modelo.Conta;
import br.com.bytebank.banco.Modelo.ContaCorrente;

public class TesteArrayListEquals {

    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(12, 123);
        lista.add(cc);   

        Conta cc2 = new ContaCorrente(321, 1233);
        lista.add(cc2);

      


        
    }
    
}
