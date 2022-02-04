package usermanagement.repository;

import usermanagement.model.User;
import org.springframework.data.repository.CrudRepository;

import javax.annotation.Resource;

@Resource
public interface UserManagementRepository extends CrudRepository<User,Long> {


}
