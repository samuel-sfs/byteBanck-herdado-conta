
package br.com.bytebank.banco.teste;

class TesteArrayPrimitivos {  

    public static void main(String[] args) {

        int[] idades = new int[5];

        for (int i = 0; i < idades.length; i++){
            idades[i] = i * i;
        }

        for ( int i = 0; i < idades.length; i++){
            System.out.println("A idade na posição " + i + " é " + idades[i]);
        }

       
                  

    
    }

}