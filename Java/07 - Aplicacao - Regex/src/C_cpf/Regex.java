package C_cpf;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	
	public static String adicionarMascara(String cpf) {
		Pattern pattern = Pattern.compile("(\\d{3})(\\d{3})(\\d{3})(\\d{2})");
		Matcher matcher = pattern.matcher(cpf);
		if (cpf.length() !=11) {
			System.out.println("não tem 11 digitos");
			return cpf;
		}
		else {
			return matcher.replaceAll("$1.$2.$3-$4");
		}
	}

}
