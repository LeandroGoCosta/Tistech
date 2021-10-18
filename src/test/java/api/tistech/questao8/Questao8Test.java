package api.tistech.questao8;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Questao8Test {

	@Test
    public void MontaNumeroCTeste1() {
		
		Questao8 q8 = new Questao8();
		
        Integer c = -1;
        Integer a = 10256;
        Integer b = 512;
       
        assertEquals( c , q8.montaNumeroC(a, b));

    }


    @Test
    public void MontaNumeroCTeste2() {

        Questao8 q8 = new Questao8();
       
        Integer c = 1501;
        Integer a = 10;
        Integer b = 51;

        assertEquals( c , q8.montaNumeroC(a, b));

    }

}
