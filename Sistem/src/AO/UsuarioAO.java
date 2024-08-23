package AO;

import conexao.Conexao;
import entidade.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioAO {

    public void cadastrarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuario (name, email, senha, documento_identificacao, rg, cpf, numero_passaporte, telefone_contato, telefone_emergencia) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getDocumentoIdentificacao());
            ps.setString(5, usuario.getRg());
            ps.setString(6, usuario.getCpf());
            ps.setString(7, usuario.getNumeroPassaporte());
            ps.setString(8, usuario.getTelefoneContato());
            ps.setString(9, usuario.getTelefoneEmergencia());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT name, email, senha, documento_identificacao, rg, cpf, numero_passaporte, telefone_contato, telefone_emergencia FROM usuario";

        try (Connection conn = Conexao.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setNome(rs.getString("name"));
                usuario.setEmail(rs.getString("email"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setDocumentoIdentificacao(rs.getString("documento_identificacao"));
                usuario.setRg(rs.getString("rg"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setNumeroPassaporte(rs.getString("numero_passaporte"));
                usuario.setTelefoneContato(rs.getString("telefone_contato"));
                usuario.setTelefoneEmergencia(rs.getString("telefone_emergencia"));
                usuarios.add(usuario);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarios;
    }
}
