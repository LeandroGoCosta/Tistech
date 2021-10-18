package api.tistech.questao9;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import api.tistech.questao9.dtos.BinaryTreeDto;

class Questao9Test {
	
    @Test
    public void SomaTest1() {

        int soma = 2;
        BinaryTreeDto bTree = new BinaryTreeDto();
        bTree.setValor(soma);

        Questao9 q9 = new Questao9(bTree);

        assertEquals(soma, q9.SomaNodos());

    }


    @Test
    public void SomaTest2() {

        int soma = 15;
        
        BinaryTreeDto bTree = new BinaryTreeDto();
        bTree.setValor(5);

        BinaryTreeDto bTree1 = new BinaryTreeDto();
        bTree1.setValor(5);

        BinaryTreeDto bTree2 = new BinaryTreeDto();
        bTree2.setValor(5);

        bTree.setLeft(bTree1);
        bTree.setRight(bTree2);

        Questao9 q9 = new Questao9(bTree);

        assertEquals( soma, q9.SomaNodos());

    }


    @Test
    public void SomaTest3() {

        int soma = 57;
        
        BinaryTreeDto bTree = new BinaryTreeDto();
        bTree.setValor(15);

        BinaryTreeDto bTree1 = new BinaryTreeDto();
        bTree1.setValor(18);

        BinaryTreeDto bTree2 = new BinaryTreeDto();
        bTree2.setValor(10);
        
        BinaryTreeDto bTree3 = new BinaryTreeDto();
        bTree3.setValor(14);
        
        bTree.setLeft(bTree1);

        bTree1.setLeft(bTree2);
        
        bTree2.setLeft(bTree3);

        Questao9 q9 = new Questao9(bTree);

        assertEquals( soma, q9.SomaNodos());

    }

}
