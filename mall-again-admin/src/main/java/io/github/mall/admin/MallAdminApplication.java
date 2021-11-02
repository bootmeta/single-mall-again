package io.github.mall.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"io.github.mall.persist.service",
        "io.github.mall.security",
        "io.github.mall.admin"})
public class MallAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallAdminApplication.class, args);
    }
}
