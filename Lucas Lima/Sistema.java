
import java.util.ArrayList;
import java.util.List;

public class Sistema {

    private List<UsuarioTeste> usuarios;

    public Sistema() {
        usuarios = new ArrayList<UsuarioTeste>();
    }

    public void adicionarUsuario(UsuarioTeste usuarios) {
        usuarios.add(usuario);
    }

    public List<UsuarioTeste> getUser() {
        return usuarios;
    }
}
