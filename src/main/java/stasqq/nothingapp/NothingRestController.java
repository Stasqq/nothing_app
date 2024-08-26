package stasqq.nothingapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.format.DateTimeFormatter;

@RestController
public class NothingRestController {

    @Autowired
    private HyperTimeHolder hyperTimeHolder;

    @GetMapping(path = "/")
    public String get() {
        return String.format("App is doing nothing since: %s", hyperTimeHolder.getStartupTime().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }

}
