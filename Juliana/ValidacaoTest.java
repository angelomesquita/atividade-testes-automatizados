package junit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ValidacaoTest {
	
	static final String NUMERO_CARTAO_VALIDO = "0123456789";
	static final String NUMERO_CARTAO_INVALIDO = "0123456";
	
	Validacao validacao;
	
	@Before
	public void init() {
		validacao = new Validacao();
	}
	
	@Test
	public void sucesso_numero_cartao_valido() {
		// DADO que o tamanho do número do cartao seja 10
		// QUANDO for fazer a validação
		// ENTÃO deve retornar true
		assertTrue(validacao.isNumeroCartaoValido(NUMERO_CARTAO_VALIDO));
	}
	
	@Test
	public void falha_numero_cartao_null() {
		// DADO que o tamanho do número do cartao seja null
		// QUANDO for fazer a validação
		// ENTÃO deve retornar false
		assertFalse(validacao.isNumeroCartaoValido(null));
	}
	
	@Test
	public void falha_numero_cartao_vazio() {
		// DADO que o tamanho do número do cartao seja vazio
		// QUANDO for fazer a validação
		// ENTÃO deve retornar false
		assertFalse(validacao.isNumeroCartaoValido(""));
	}
	
	@Test
	public void falha_numero_cartao_tamanho_invalido() {
		// DADO que o tamanho do número do cartao seja menor que 10
		// QUANDO for fazer a validação
		// ENTÃO deve retornar false
		assertFalse(validacao.isNumeroCartaoValido(NUMERO_CARTAO_INVALIDO));
	}

}
