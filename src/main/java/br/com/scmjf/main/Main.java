package br.com.scmjf.main;
import java.util.Scanner;

import br.com.scmjf.clearconsole.Cconsole;
import br.com.scmjf.conexao.Conexao;
import br.com.scmjf.dao.UsuarioDao;
import br.com.scmjf.model.User;

public class Main{
    public static void main(String[] args){

        boolean Sair = false;

        while(!Sair) {

            UsuarioDao usuario = new UsuarioDao();
            Scanner input = new Scanner(System.in);
            Cconsole ccleaner = new Cconsole();

            System.out.println("--------Cadastro--------");
            System.out.println("1 - Cadastrar\n2 - Deletar usuário\n3 - Sair");
            int option = input.nextInt();

            if (option == 1){
                System.out.println("Digite o nome de usuário dê ENTER e digite a senha dê ENTER e digite o id.");
                usuario.adicionar(new User(input.next(), input.next(),input.next()));
                System.out.println("Pressione ENTER para confirmar!");
                input.next();
                ccleaner.clearConsole();
            }
            else if(option == 2){
                System.out.println("Digite o id do usuário que deseja deletar");
                usuario.deletar(input.nextInt());
                System.out.println("Pressione ENTER para confirmar!");
                input.nextLine();
                ccleaner.clearConsole();
            }
            else if(option == 3){
                Sair = true;
            }
        }
    }
}