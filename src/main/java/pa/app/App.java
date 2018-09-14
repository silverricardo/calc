package pa.app;

import java.util.logging.Logger;

public class App 
{
	private static final Logger logger = Logger.getLogger( App.class.getName() );
    public static void main( String[] args )
    {
    	  logger.info( "Maven JUnit 5 - Hello World!" );
    }
	
	// String concatenation method example
	String concat(String s1, String s2) {
		return s1+s2;
	}
	
	//soma
	int soma(int num1, int num2) {
		return num1+num2;
	}
	//subtracao
	int subtracao(int num1, int num2) {
		return num1-num2;
	}
	//multiplicacao
	int multiplicacao(int num1, int num2) {
			return num1*num2;
	}
	//divisao
	int divisao(int num1, int num2) {
			return num1*num2;
	}
}
