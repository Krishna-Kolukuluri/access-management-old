package usermanagement.controller;

import lombok.extern.log4j.Log4j2;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import usermanagement.Exception.CreateUserException;
import usermanagement.dto.UserDTO;
import usermanagement.model.User;
import usermanagement.service.UserManagementService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@Log4j2
public class UserManagementController {
    @Autowired
    UserManagementService userManagementService;

    private static final ModelMapper modelMapper = new ModelMapper();

    @RequestMapping("/")
    public String getUsers(Map<String, Object> model) {
         return "All Users";
    }

    @PostMapping(value = "/createUser", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity createUser(@RequestBody UserDTO userDTO) {
        try{
            userManagementService.createUser(modelMapper.map(userDTO, User.class));
        }catch(Exception e){
            log.error(e.getMessage());
            throw new CreateUserException();
        }
         return ResponseEntity.status(HttpStatus.CREATED).body("Created User");
    }
}
