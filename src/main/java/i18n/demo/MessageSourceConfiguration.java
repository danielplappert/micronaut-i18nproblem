package i18n.demo;

import io.micronaut.context.MessageSource;
import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.i18n.ResourceBundleMessageSource;

import java.util.Locale;

@Factory
public class MessageSourceConfiguration {

    @Bean
    public MessageSource messageSource() {
        return new ResourceBundleMessageSource("messages", Locale.UK);
    }

}
