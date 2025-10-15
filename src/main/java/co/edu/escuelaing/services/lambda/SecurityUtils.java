package co.edu.escuelaing.services.lambda;

import co.edu.escuelaing.services.User;

public class SecurityUtils {
    public static User Login(User u) {
        System.out.println("Username: " + u.getName());
        System.out.println("password: " + u.getPassword());
        return u;


    }
    
}
