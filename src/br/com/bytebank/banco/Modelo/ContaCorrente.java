package br.com.bytebank.banco.Modelo;

public class ContaCorrente extends Conta implements Tributavel {

public ContaCorrente(int agencia, int numero){
    super(agencia, numero);
}


/** 
 * @param valor
 */
@Override
public void saca(double valor) {
    System.out.println("Você terá a cobrança de uma taxa no valor de R$0,10");
    double valorASacar = valor+0.2;
    super.saca(valorASacar);
}


/** 
 * @return double
 */
@Override
public double getValorImposto() {
       return super.saldo *0.01;
}
    
}
