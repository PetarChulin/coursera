package project.coursera.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationBeanConfiguration {

    @Bean
    StringBuilder builder() {
        return new StringBuilder();
    }
}
