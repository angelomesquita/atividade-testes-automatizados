package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		UsuarioVO usuarioVO = new UsuarioVO();
		Scanner scanner = new Scanner(System.in);
		CadastroUtil cadastroUtil = new CadastroUtil();
		boolean repetir = false;

		try {
			
//			Simulando o cadastro de um usuário
			while (!repetir) {
				
				System.out.print("Digite o Nome: ");
				String formNome = scanner.nextLine();
				System.out.print("Digite a Idade: ");
				String formIdade = scanner.nextLine();
				
				usuarioVO.setIdade(Integer.parseInt(formIdade));
				usuarioVO.setNome(formNome);

				repetir = cadastroUtil.cadastrar(usuarioVO);
				
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		scanner.close();
	}

}
