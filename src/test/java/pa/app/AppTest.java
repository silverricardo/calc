package pa.app;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for Maven JUnit 5 - Hello world!
 * @author  Paulo Araújo
 * @version 1.0
 */
public class AppTest 
{
	@BeforeEach 
	public void init() {
		System.out.println("@BeforeEach - Runbefore Each method");
	}	
	
    @DisplayName("First Test - concat")
	@Test
	void testConcat() {
		App ap = new App();
		String res = ap.concat("Hello"," world!");
		// Test concat example method
		assertEquals("Hello world!", res);
	}	
    
    @DisplayName("Secund Test - main")
	@Test
	void tsetMain() {
    	App.main(null);
    	assertTrue(true);
    }
    
    @DisplayName("Terceiro Test - soma")
	@Test
	void testSoma() {
		App ap = new App();
		int soma = ap.soma(1,1);
		assertEquals(2, soma);
	}
    
    @DisplayName("Quarto Test - soma")
	@Test
	void testSubtracao() {
		App ap = new App();
		int sub = ap.subtracao(1,1);
		assertEquals(0, sub);
	}
    
    @DisplayName("Quinto Test - soma")
	@Test
	void testMultiplicacao() {
		App ap = new App();
		int mult = ap.multiplicacao(1,1);
		assertEquals(1, mult);
	}
    
    @DisplayName("Sexto Test - soma")
	@Test
	void testDivisao() {
		App ap = new App();
		int div = ap.divisao(1,1);
		assertEquals(1, div);
	}
}
