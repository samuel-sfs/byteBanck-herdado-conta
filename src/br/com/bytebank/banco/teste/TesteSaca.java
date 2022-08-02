package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.Modelo.Conta;
import br.com.bytebank.banco.Modelo.ContaCorrente;

public class TesteSaca{

    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        

    Conta n =new ContaCorrente(123,23456);
    n.deposita(100);
    n.saca(150);

    System.out.println(n.pegaSaldo());




    }







}