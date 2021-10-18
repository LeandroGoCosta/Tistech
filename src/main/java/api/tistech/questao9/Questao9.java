package api.tistech.questao9;

import java.util.Objects;
import api.tistech.questao9.dtos.BinaryTreeDto;

public class Questao9 {
	
	/*Desenvolva um método que dado um nó da árvore calcule a soma de todos os nós subsequentes*/

    private BinaryTreeDto bTree;

    public Questao9( BinaryTreeDto bTree) {
    	
    	Objects.requireNonNull( bTree, "Não pode ser nula");
        this.bTree = bTree;
        
    }

    public int SomaNodos() {
        return SomaNodos( bTree );
    }

    private int SomaNodos( BinaryTreeDto bTree) {

        if (bTree == null) {
            return 0;
        }

        return bTree.getValor() + SomaNodos(bTree.getLeft()) + SomaNodos(bTree.getRight());
    }
    
}