package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.Modelo.Conta;
import br.com.bytebank.banco.Modelo.ContaCorrente;
import br.com.bytebank.banco.Modelo.ContaPoupanca;


public class TesteArrayReferencias {

    public static void main(String[] args) {

        Conta[] contas = new Conta[5];
        Conta cc1 = new ContaCorrente(123, 321);

        contas[0] = cc1;

        Conta cc2 = new ContaCorrente(321, 123);

        contas[1] = cc2;

        System.out.println(cc2.getNumero());
        System.out.println(contas[1].getNumero());

        Conta ref = contas[1];

        ContaPoupanca  cc3 = new ContaPoupanca(456, 654);
        contas[2] = cc3;


        System.out.println(ref.getNumero());
        System.out.println(contas[1].getNumero());


        
    }
    
}
