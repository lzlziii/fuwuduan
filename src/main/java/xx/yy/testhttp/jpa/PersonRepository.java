package xx.yy.testhttp.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import xx.yy.testhttp.Person;

@Controller
public interface PersonRepository extends JpaRepository<Person, Long> {

}
