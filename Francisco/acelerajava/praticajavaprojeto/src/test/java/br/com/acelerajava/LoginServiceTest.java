import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginServiceTest {
    private LoginService loginService;

    @BeforeEach
    public void setUp() {
        loginService = new LoginService();
    }

    @Test
    public void testLoginComCredenciaisCorretas() {
        // Arrange
        String email = "fulanodetall.com";
        String senha = "senha123";

        // Act
        boolean loginEfetuado = loginService.realizarLogin(email, senha);

        // Assert
        Assertions.assertTrue(loginEfetuado, "O login com credenciais corretas falhou.");
    }

    @Test
    public void testLoginComCredenciaisIncorretas() {
        // Arrange
        String email = "fulanodetall.com";
        String senha = "senhaErrada";

        // Act
        boolean loginEfetuado = loginService.realizarLogin(email, senha);

        // Assert
        Assertions.assertFalse(loginEfetuado, "O login com credenciais incorretas não falhou.");
    }
}



