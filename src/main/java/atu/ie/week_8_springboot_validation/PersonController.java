package atu.ie.week_8_springboot_validation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/person")
@RestController
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) { this.personService = personService};

    @GetMapping("/{employeeId}")
    public ResponseEntity<?> getPerson(@PathVariable) String emplpyeeId){
        if (employeeId.length() > 5 || employeeID.isBlank()) {
            return ResponseEntity.badRequest().body("Employee is invalid");

            Person person = personService.getPersonByEmplyeeId(employeeId);

            if (person == null) {
                return ResponseEntity.notFound().build();
            }


        }
        }
}
