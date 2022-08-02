package br.com.bytebank.banco.Modelo;

public class CalculadorDeImposto {

    private double totalImposto;

    
    /** 
     * @param t
     */
    public void registra(Tributavel t){
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    
    /** 
     * @return double
     */
    public double getTotalImposto(){
        return this.totalImposto;
    }
    
}
