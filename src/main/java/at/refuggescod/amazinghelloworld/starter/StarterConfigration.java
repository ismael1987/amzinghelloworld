package at.refuggescod.amazinghelloworld.starter;

import at.refuggescod.amazinghelloworld.helloworld.HelloWorld;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StarterConfigration {
    @Bean
    ApplicationRunner strter(HelloWorld helloWorld){
        return  args -> {
            String sayhelloworld = helloWorld.sayhelloworld();
            System.out.println(sayhelloworld);
        };

    }
}
