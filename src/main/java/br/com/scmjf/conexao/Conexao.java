package br.com.scmjf.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    //public static void main(String[] args) {
    public static Connection Conectar() {
        String url = "jdbc:mysql://localhost:3306/scmjf";
        String usuario = "root";
        String senha = "1234";

        try {
            Connection Conectar = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão bem-sucedida!");
            return Conectar;
        }
        catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao conectar" + e.getMessage());
        }
        return null;
    }

}