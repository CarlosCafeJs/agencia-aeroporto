import entidade.Usuario;

import java.util.List;

import AO.UsuarioAO;

public class App {
    public static void main(String[] args) throws Exception {

        Usuario passageiro = new Usuario();

        passageiro.setNome("Carlos");
        passageiro.setEmail("carloscafe.js@gmail.com");

        new UsuarioAO().cadastrarUsuario(passageiro);

        // LER OS DADOS:

        UsuarioAO usuarioAO = new UsuarioAO();
        List<Usuario> usuarios = usuarioAO.listarUsuarios();

        for (Usuario usuario : usuarios) {

            String nome = usuario.getNome();
            String emails = usuario.getEmail();

            System.out.println("Nome: " + nome);
            System.out.println("Email: " + emails);
            System.out.println("---------------");
        }
    }
}
