package stasqq.nothingapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.time.LocalDateTime;

@EnableWebMvc
@Import({NothingRestController.class})
public class NothingAppConfiguration {

    @Bean
    @Scope(scopeName = "singleton")
    public HyperTimeHolder hyperTimeHolder() {
        return new HyperTimeHolder(LocalDateTime.now());
    }

}
