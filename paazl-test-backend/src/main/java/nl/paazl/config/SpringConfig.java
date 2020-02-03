package nl.paazl.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringConfig {

	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
}
