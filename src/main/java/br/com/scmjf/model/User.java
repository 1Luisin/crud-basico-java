package br.com.scmjf.model;

public class User {

    public  User(){}

    public  User(String username, String password, String id){
        this.password = password;
        this.username = username;
        this.id = id;
    }
    private String password;
    private String username;
    private String id;

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    @Override
    public String toString() {
        return "Usuário [usuario=" + username + ", senha=" +  password + "]";
    }
}
