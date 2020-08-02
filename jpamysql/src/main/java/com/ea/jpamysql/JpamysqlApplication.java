package com.ea.jpamysql;

import com.ea.jpamysql.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class JpamysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpamysqlApplication.class, args);
    }

}