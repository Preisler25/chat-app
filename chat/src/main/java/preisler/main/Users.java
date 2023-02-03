package preisler.main;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class Users {

        @Id
        @Column(name = "id")
        private int id;

        @Column(name = "username")
        private String username;

        @Column(name = "password")
        private String password;

        @Column(name = "email")
        private String email;

}