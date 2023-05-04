import java.io.IOException;
import java.util.logging.Level;

public class Calculadora {
	public float calcular(float a, float b, char operacao)  throws IOException{
		
		Log meuLogger = new Log("Log.txt");
		
		try {
			//Log meuLogger1 = new Log("Log.txt");
			meuLogger.logger.setLevel(Level.FINE);
			meuLogger.logger.info("Log de informação");
			meuLogger.logger.warning("Log de Aviso");
			meuLogger.logger.severe("Log Severo");
			

		} catch (Exception e) {


		}
		
		
		if (b == 0 && operacao == '/') {
			System.out.println("N�o � poss�vel dividir por zero.");
			return 0;
		}
		if (b > a) { 
			float temp = a;
			a = b;
			b = temp;
		}
		float resultado = 0;
		switch (operacao) {
		case '+': {
			resultado = a + b;
			break;
		}
		case '-': {
			resultado = a - b;
			break;
		}
		case '/': {
			resultado = a / b;
			break;
		}
		case '*': {
			resultado = a * b;
			break;
		}
		default: {
			System.out.println("Opera��o n�o foi");
			break;
		}
		}
		return resultado;
	}
}