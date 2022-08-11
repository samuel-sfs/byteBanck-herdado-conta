package teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.Modelo.Conta;
import br.com.bytebank.banco.Modelo.ContaCorrente;

public class TesteArrayList {

    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(12, 123);
        lista.add(cc);   

        Conta cc2 = new ContaCorrente(321, 1233);
        lista.add(cc2);

        System.out.println(lista.size());

        Conta ref = (Conta) lista.get(0);

        System.out.println(ref.getNumero());

        // Checar o motivo que está imprimindo o endereço de memoria ao invez dos dados da conta

        for (Conta conta : lista){
            System.out.println(conta);
        }

        for (int i = 0; i < lista.size(); i++){
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }


        
    }
    
}
