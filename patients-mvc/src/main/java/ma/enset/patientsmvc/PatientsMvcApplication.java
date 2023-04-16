package ma.enset.patientsmvc;

import ma.enset.patientsmvc.entities.Patient;
import ma.enset.patientsmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientsMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientsMvcApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(
                    new Patient(null, "Khalid", new Date(), false, 12));
            patientRepository.save(
                    new Patient(null, "Sara", new Date(), true, 152));
            patientRepository.save(
                    new Patient(null, "Badr", new Date(), true, 32));
            patientRepository.save(
                    new Patient(null, "Siham", new Date(), false, 2));
            patientRepository.findAll().forEach(p->{
                System.out.println(p.getNom());
            });
        };
    }

}
