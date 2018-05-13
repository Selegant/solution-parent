package xin.selegant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import xin.selegant.solutioncore.annotation.EnableBeetlSql;
import xin.selegant.solutionservice.annotation.EnableService;

@SpringBootApplication
@EnableBeetlSql
public class SolutionWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(SolutionWebApplication.class, args);
    }
}
