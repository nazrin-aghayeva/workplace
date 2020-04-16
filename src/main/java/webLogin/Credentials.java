package webLogin;

import java.io.Serializable;

public class Credentials implements Serializable {
    final String username;
    final String email;
    final String password;

    public Credentials(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
