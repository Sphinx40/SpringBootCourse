package sphinx.demo.data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sphinx.demo.domain.Capability;
import sphinx.demo.repositories.CapabilityRepository;

@Configuration
public class InitialDataLoad {

    @Bean
    CommandLineRunner LoadDB (CapabilityRepository capabilityRepository) {
        return args -> { // lambda expression
            capabilityRepository.save(new Capability("React", 200, 100));
            capabilityRepository.save(new Capability("Kotlin", 200, 100));
            capabilityRepository.save(new Capability("Node", 200, 100));
        };
    }
}