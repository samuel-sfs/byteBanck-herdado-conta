package br.com.bytebank.banco.Modelo;

public abstract class Conta {
 
       protected double saldo;
       private int agencia;
       private int numero;
       private Cliente titular;

       
      
       
       /** 
        * @return Cliente
        */
       public Cliente getTitular() {
        return titular;
        }    
       
       
      
       
       /** 
        * @return int
        */
       public int getAgencia() {
            return agencia;
        }


    
   
    
    /** 
     * @return int
     */
    public int getNumero() {
        return numero;
        }   
       
       private static int total;


        public Conta (int agencia, int numero){
            Conta.total++;
            System.out.println("o total de contas é: "+ total);
            this.agencia = agencia;
            this.numero = numero;
        }


       
      
       
       /** 
        * @param valor
        */
       public void deposita (double valor){
        this.saldo += valor;
        }

      
      
      
      /** 
       * @param valor
       */
      public void saca (double valor){
        if (this.saldo < valor){

            throw new SaldoInsuficienteException("Saldo: " + this.saldo + "Valor a Sacar: " + valor);

        }
            this.saldo -= valor;
        }         

    

    
   
    
    /** 
     * @param valor
     * @param destino
     * @return boolean
     */
    public boolean transfere (double valor, Conta destino){
        this.saca(valor);
        destino.deposita(valor);
        return true;
    }

    
       
       /** 
        * @return double
        */
       public double pegaSaldo(){
        return this.saldo;
    }

   
    
    /** 
     * @return int
     */
    public static int getTotal(){
        return Conta.total;
    }


    }

    
