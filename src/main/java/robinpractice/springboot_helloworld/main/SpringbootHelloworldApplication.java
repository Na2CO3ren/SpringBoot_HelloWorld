package robinpractice.springboot_helloworld.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "robinpractice.springboot_helloworld")
public class SpringbootHelloworldApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootHelloworldApplication.class, args);
    }

}
