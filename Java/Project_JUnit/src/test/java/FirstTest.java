import org.junit.After;
import org.junit.Test;

public class FirstTest {
	
	//Sempre deixar o nome do teste mais explicado possivel
	//A anotação deve ser pública e não pode ter return.
	
	@Test
	public void metodoDeExemploDeTesteValido() {
		
	}

	//@Test
	//public void String metodoDeExemploDeTesteInvalidoReturnString() {
		//return "";
	//}

	//@Test
	//private void metodoDeExemploDeTesteInvalidoTipoPrivate() {
		//return"";
	//}
	
	//@Test
	//protected void metodoDeExemploDeTesteInvalidoTipoProtected() {
		
	//}
	
	@After
	public void metodoDeExemploDeTesteImpressaoNaTela() {
		System.out.println("Teste 1 executado!");
	}
	
	@Test
	public void metodoDeExemploDeTesteImpressaoNaTela2() {
		System.out.println("Teste 2 executado!");
	}
	
	
	//@Test //Se o @Test estiver comentado, mesmo o codigo estando correto, o teste não será rodado, se descomentar, o teste roda normalmente
	public void metodoNaoEUmTeste() {
		System.out.println("Essa mensagem não deve aparecer");
	}

}
