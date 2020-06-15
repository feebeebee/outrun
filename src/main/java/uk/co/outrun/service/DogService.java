package uk.co.outrun.service;

import org.springframework.stereotype.Service;
import uk.co.outrun.model.Dog;
import uk.co.outrun.model.SearchRequest;

import java.util.List;

@Service
public interface DogService {
    List<Dog> getAllDogs();

//    Dog getDogByDogId(int id);

    List<Dog> getDogByRegName(String regName);

    List<Dog> searchByRegName(String regName);

    List<Dog> search(SearchRequest req);

//    void newDog(Dog dog);

//    void editDogById(int id, Dog dog);
}