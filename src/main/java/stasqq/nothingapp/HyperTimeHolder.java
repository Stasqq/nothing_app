package stasqq.nothingapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@AllArgsConstructor
@Getter
public class HyperTimeHolder {

    private LocalDateTime startupTime;

}
