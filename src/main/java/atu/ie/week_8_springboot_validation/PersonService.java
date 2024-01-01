package atu.ie.week_8_springboot_validation;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
private final PersonRepo personRepo;

    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public void savePerson(Person person){
        personRepo.save(person);
    }
    public Person getPersonByEmployeeId(String employeeId){
        return personRepo.findByEmployeeId(employeeId);
    }

    public List<Person> getAllPersons() {
        return personRepo.findAll();
    }
}
