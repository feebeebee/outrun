package uk.co.outrun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uk.co.outrun.model.Dog;
import uk.co.outrun.repository.DogRepository;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private DogRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }


    @Override
    public void run(String... args) {

        repository.save(new Dog("Felix"));
        repository.save(new Dog("Lance"));

        for (Dog dog : repository.findAll()) {
            System.out.println(dog);
        }
        System.out.println();

        repository.save(new Dog("Felix"));

        repository.findAll();
    }
}