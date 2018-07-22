package com.oocl.springboot; /**
 * @author Dylan Wei
 * @date 2018-07-22 13:02
 */
import com.oocl.springboot.controller.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public GreetingController greetingController(){
        return new GreetingController();
    }

}
