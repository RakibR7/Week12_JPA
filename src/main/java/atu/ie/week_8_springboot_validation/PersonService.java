package atu.ie.week_8_springboot_validation;

import org.springframework.stereotype.Service;

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
        //fetch data from a database in future lab
        //For simplicity we return a dummy person
        return new Person();
    }
}
