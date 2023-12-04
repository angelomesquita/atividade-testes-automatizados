package junit;

public class Validacao {
	
	public boolean isNumeroCartaoValido(String numeroCartao) {
		if((numeroCartao == null) || numeroCartao.isEmpty() || numeroCartao.length() < 10) {
			return false;
		}
		
		return true;
	}

}
