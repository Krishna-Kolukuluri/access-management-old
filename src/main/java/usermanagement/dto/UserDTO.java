package usermanagement.dto;

import usermanagement.model.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private LocalDateTime createdDate;
    private Boolean isAdmin;

    public UserDTO(User user){
        this.id = user.getId();
        this.firstName=user.getFirstName();
        this.lastName=user.getLastName();
        this.userName=user.getUserName();
        this.createdDate=user.getCreatedDate();
        this.isAdmin=user.getIsAdmin();
    }

}
