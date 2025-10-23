package br.com.scmjf.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import br.com.scmjf.model.User;
import br.com.scmjf.conexao.Conexao;

public class UsuarioDao {

    //Função para adicionar usuário
    public void adicionar(User user) {
        String sql = "INSERT INTO USUARIO (user_name, pass_word, id) VALUES (?,?,?)";

        try (Connection con = Conexao.Conectar();
             PreparedStatement stmt = con.prepareStatement(sql)) {
            if (con == null) {
                System.out.println("❌ Erro: conexão retornou nula!");
                return;
            }

            System.out.println("✅ Conexão bem-sucedida!");
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getId());

            stmt.executeUpdate();

            System.out.println("Usuário adicionado com sucesso!");
        }
        catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Não foi possível adicionar o usuário!");
        }
    }
// Função para deletar usuário

    public void deletar(int id) {
        String sql = "DELETE FROM usuario WHERE id=?";
        try (Connection con = Conexao.Conectar();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

            System.out.println("Usuário removido!");
        }
        catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Não foi possível remover o usuário!");
        }
    }
    //Metodo para listar os usuários

   /* public List<User> listar() {
        List<User> lista = new ArrayList<>();
        String sql = "SELECT * FROM usuario";
        try (Connection con = Conexao.Conectar();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                user u = new user(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("email")
                );
                lista.add(u);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    */
}
