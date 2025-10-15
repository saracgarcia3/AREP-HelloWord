package co.edu.escuelaing.services;

public class User {
    private String username;
    private String password;

    public User(){}

    public String getName() {
        return username;
}

public void setUsername(String username){
    this.username=username;
}

public String getPassword(){
    return password;
}

public void setPassword(String password){
    this.password = password;
}

}
