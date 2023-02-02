package preisler.main;

import jakarta.persistence.*;

public class Users {
    @Entity
    @Table(name = "users")
    public class User {
        @Column(name = "username")
        private String username;

        @Column(name = "password")
        private String password;

        @Column(name = "email")
        private String email;
    }
}
