package usermanagement.serviceImpl;

import usermanagement.service.UserManagementService;
import usermanagement.dto.UserDTO;
import usermanagement.model.User;
import usermanagement.repository.UserManagementRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@Service
public class UserManagementServiceImpl implements UserManagementService {
    @Resource
    private UserManagementRepository userManagementRepository;

    @Override
    public UserDTO createUser(User user) {
        user.setCreatedDate(LocalDateTime.now());
        return new UserDTO(userManagementRepository.save(user));
    }
}
