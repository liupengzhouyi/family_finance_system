package cn.liupengstudy.family_finance_system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
//@ComponentScan("cn.liupengstudy")
@SpringBootApplication
@MapperScan("cn.liupengstudy.family_finance_system.mapper")
@EnableAutoConfiguration(exclude = {MultipartAutoConfiguration.class})
public class FamilyFinanceSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(FamilyFinanceSystemApplication.class, args);
    }

}

// http://localhost:8080/swagger-ui.html
