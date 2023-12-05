package Main;

import java.util.regex.Pattern;

public class CadastroUtil {

	public boolean cadastrar(UsuarioVO usuario) {

		String mensagem = valida(usuario);
		if (mensagem == null) {

			try {
//				Aqui viria a chamada da classe/metodo para insert no banco de dados
				System.out.println("Cadastrar usuário");
				return true;

			} catch (Exception e) {
				// TODO: handle exception
			}
		} else {
			System.out.println(mensagem);
		}

		return false;
	}

	public String valida(UsuarioVO usuario) {

		int idade = usuario.getIdade();
		String nome = usuario.getNome();

		if (idade < 18) {
			return "Não é permitido o cadastro para menores de 18 anos";

		} else if (idade > 25) {
			return "Não é permitido o cadastro para maiores de 25 anos";

		} else if (nome.length() < 3) {
			return "O campo nome contem caracteres insuficientes";

		} else if (Pattern.compile("[0-9!@#$%^&*(),.?\":{}|<>]").matcher(nome).find()) {
			return "Não é permitido digitos numéricos ou caracteres especiais no campo nome";
		}

		return null;
	}
}
