package be.vdab.presentation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import be.vdab.services.PersoonService;

@Configuration
public class PresentationConfig {

    @Bean
    PersoonViewer persoonViewer(PersoonService persoonService) {
	return new PersoonViewer(persoonService);
    }
    
}
