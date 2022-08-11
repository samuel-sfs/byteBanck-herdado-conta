package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.Modelo.Conta;
import br.com.bytebank.banco.Modelo.ContaCorrente;
import br.com.bytebank.banco.Modelo.GuardadorDeReferencias;

public class Teste {
    
    public static void main(String[] args) {
        

        GuardadorDeReferencias g = new GuardadorDeReferencias();

        Conta cc = new ContaCorrente(12, 123);
        g.adiciona(cc);   

        Conta cc2 = new ContaCorrente(321, 1233);
        g.adiciona(cc2);

        int tamanho = g.getGuardadorDeElementos();

        System.out.println(tamanho);

        Conta ref = (Conta) g.getReferencia(1);
        System.out.println(ref.getNumero());

        
    }
}
