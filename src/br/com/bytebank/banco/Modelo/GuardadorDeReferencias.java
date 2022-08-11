package br.com.bytebank.banco.Modelo;

public class GuardadorDeReferencias {

    private Object[] referencias; 
    private int posicaolivre = 0;

    public GuardadorDeReferencias(){
        this.referencias = new Conta[10];
    }

    public void adiciona (Conta ref){
        this.referencias[posicaolivre] = ref;
        posicaolivre ++;

    }

        public int getGuardadorDeElementos() {
        return this.posicaolivre;
    }

        public Object getReferencia(int pos) {
            return this.referencias[pos];
        }


    
}
