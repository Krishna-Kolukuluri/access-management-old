package usermanagement.service;

import usermanagement.dto.UserDTO;
import usermanagement.model.User;

public interface UserManagementService {

    UserDTO createUser(User user);
}
