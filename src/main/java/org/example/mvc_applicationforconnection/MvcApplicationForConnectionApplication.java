package org.example.mvc_applicationforconnection;

import lombok.SneakyThrows;
import org.example.mvc_applicationforconnection.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.ResultSet;
import java.sql.Statement;

@SpringBootApplication
public class MvcApplicationForConnectionApplication {

    @SneakyThrows
    public static void main(String[] args) {
        SpringApplication.run(MvcApplicationForConnectionApplication.class, args);



    }

}
