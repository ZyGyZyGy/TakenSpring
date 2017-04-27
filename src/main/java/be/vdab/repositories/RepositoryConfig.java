package be.vdab.repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:repositories.properties")
public class RepositoryConfig {

    @Bean
    @Qualifier("CSV")
    PersoonRepositoryCSV persoonRepositoryCSV(@Value("${persoonCSV}") String bestandsPad) {
	return new PersoonRepositoryCSV(bestandsPad);
    }
    
    @Bean
    @Qualifier("TXT")
    PersoonRepositoryMeerdereRegels persoonRepositoryMeerdereRegels(@Value("${persoonTXT}") String bestandsPad) {
	return new PersoonRepositoryMeerdereRegels(bestandsPad);
    }
    
}
