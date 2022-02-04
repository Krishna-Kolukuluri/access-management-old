package usermanagement;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication(scanBasePackages = {"usermanagement"})
@EnableJpaRepositories("usermanagement.repository")
//@EntityScan("usermanagement.model")
public class UserManagementMain extends SpringBootServletInitializer implements CommandLineRunner{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(UserManagementMain.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(UserManagementMain.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }


    @Override
    public void run(String... args) throws Exception {
//		LocalDateTime date = LocalDateTime.now();
//       jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS user(id INTEGER PRIMARY KEY AUTOINCREMENT,first_name VARCHAR(200),last_name VARCHAR(200),user_name VARCHAR(200) NOT NULL UNIQUE,is_admin Boolean,created_date DATETIME DEFAULT CURRENT_TIMESTAMP)");

    }
}
