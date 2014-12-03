package de.gaffa.tools.mail.restmail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.subethamail.wiser.Wiser;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class RestMail {

    public static void main(String[] args) {
        SpringApplication.run(RestMail.class, args);
    }

    @Bean
    public Wiser mailServer() {

        Wiser wiser = new Wiser(1025);
        wiser.start();
        return wiser;
    }
}
