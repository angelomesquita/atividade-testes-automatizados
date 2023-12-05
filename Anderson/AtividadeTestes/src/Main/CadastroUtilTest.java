package Main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

public class CadastroUtilTest {
	
	CadastroUtil cadastro = new CadastroUtil();
    UsuarioVO usuarioVO = new UsuarioVO();
	
	@Before
	public void setUp() {
		cadastro = new CadastroUtil();
        usuarioVO = new UsuarioVO();
	}

    @Test
    public void testValidaIdadeMenor() {
        
    	int idade = 17;
    	String nome = "aaa";
        usuarioVO.setIdade(idade);
        usuarioVO.setNome(nome);

        String resultado = cadastro.valida(usuarioVO);

        assertEquals(resultado, "Não é permitido o cadastro para menores de 18 anos");
    }
    
    @Test
    public void testValidaIdadeMaior() {
        
    	int idade = 26;
    	String nome = "aaa";
        usuarioVO.setIdade(idade);
        usuarioVO.setNome(nome);

        String resultado = cadastro.valida(usuarioVO);

        assertEquals(resultado, "Não é permitido o cadastro para maiores de 25 anos");
    }
    
    @Test
    public void testValidaCaracteresInsuficientes() {
        
        int idade = 20;
    	String nome = "aa";
        usuarioVO.setIdade(idade);
        usuarioVO.setNome(nome);

        String resultado = cadastro.valida(usuarioVO);

        assertEquals(resultado, "O campo nome contem caracteres insuficientes");
    }
    
    @Test
    public void testValidaCaracteresNumericos() {
        
    	int idade = 20;
    	String nome = "aa2";
        usuarioVO.setIdade(idade);
        usuarioVO.setNome(nome);

        String resultado = cadastro.valida(usuarioVO);

        assertEquals(resultado, "Não é permitido digitos numéricos ou caracteres especiais no campo nome");
    }
    
    @Test
    public void testValidaCaracteresEspeciais() {
        
    	int idade = 20;
    	String nome = "aa*";
        usuarioVO.setIdade(idade);
        usuarioVO.setNome(nome);

        String resultado = cadastro.valida(usuarioVO);

        assertEquals(resultado, "Não é permitido digitos numéricos ou caracteres especiais no campo nome");
    }
    
    @Test
    public void testValidaOk() {
        
    	int idade = 20;
    	String nome = "aaa";
        usuarioVO.setIdade(idade);
        usuarioVO.setNome(nome);

        String resultado = cadastro.valida(usuarioVO);

        assertEquals(resultado, null);
    }
    
}
