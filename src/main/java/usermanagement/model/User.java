package usermanagement.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter @NoArgsConstructor
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "is_admin")
    private Boolean isAdmin;

    public User(String firstName, String lastName, String userName,LocalDateTime createdDate,Boolean isAdmin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.createdDate = createdDate;
        this.isAdmin=isAdmin;
    }
}
