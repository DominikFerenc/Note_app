package github.krebrow.Note_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.validation.Validator;

@SpringBootApplication
public class NoteAppApplication implements RepositoryRestConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(NoteAppApplication.class, args);
	}

	@Bean
	public Validator validator() {
		return new LocalValidatorFactoryBean();
	}

	@Override
	public void configureValidatingRepositoryEventListener(ValidatingRepositoryEventListener validatingListener) {
		RepositoryRestConfigurer.super.configureValidatingRepositoryEventListener(validatingListener);
		validatingListener.addValidator("beforeCreate", validator());
		validatingListener.addValidator("beforeSave", validator());
	}
}
