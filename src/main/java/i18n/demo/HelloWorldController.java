package i18n.demo;

import io.micronaut.context.MessageSource;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;
import java.util.Locale;

@Controller
public class HelloWorldController {

    private final MessageSource messageSource;

    @Inject
    public HelloWorldController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Get
    public String main() {
        return messageSource
                .getMessage("hello.world",
                        MessageSource.MessageContext.of(Locale.ITALY),
                        "Translation missing");
    }

}
