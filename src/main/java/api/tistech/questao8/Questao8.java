package api.tistech.questao8;

public class Questao8 {
	
    /* Questao8 - Dados dois números inteiros A e B, crie um terceiro inteiro C seguindo as seguintes regras:
     * 
	 *	- O primeiro número de C é o primeiro número de A;
	 *	- O segundo  número de C é o primeiro número de B;
	 *	- O terceiro número de C é o segundo número de A;
	 *	- O quarto   número de C é o segundo número de B; Assim sucessivamente…
     *		 
	 *	- Caso os números de A ou B sejam de tamanhos diferentes, completar C com o restante dos números do inteiro maior. Ex: A = 10256, B = 512, C deve ser 15012256.
	 *	
	 *	- Caso C seja maior que 1.000.000, retornar -1
	 *	
	 *		Desenvolva um algoritmo que atenda a todos os requisitos acima.
	 */

    public Integer montaNumeroC( int numeroA, int numeroB ) {

        StringBuilder Sb = new StringBuilder();
        int max = 0;
        
        char[] arrayA = Integer.valueOf( numeroA ).toString().toCharArray();
        char[] arrayB = Integer.valueOf( numeroB ).toString().toCharArray();
        
        if ( arrayA.length >= arrayB.length ) {
        	max = arrayA.length;
        }else {
        	max = arrayB.length;
        }

        for ( int i = 0; i < max; i++ ) {

            if ( arrayA.length > i) {
            	
            	Sb.append(arrayA[i]);
            	
            }

            if ( arrayB.length > i) {
            	
             	Sb.append(arrayB[i]);
             	
            }
        }

        Integer numeroC = Integer.valueOf( Sb.toString() );

        if ( numeroC > 1000000 ) {
            return -1;
        }

        return numeroC;
    }

}
