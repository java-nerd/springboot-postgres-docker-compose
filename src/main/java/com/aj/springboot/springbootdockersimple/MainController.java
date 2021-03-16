package com.aj.springboot.springbootdockersimple;

import com.aj.springboot.springbootdockersimple.entity.Person;
import com.aj.springboot.springbootdockersimple.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//we are using Thymeleaf, no need for RestController

/**
 * Simple Controller to listen to homepage, will connect to PostgreSQL running via docker-compose
 */
@Controller
public class MainController {

	private final PersonRepository personRepository;

	@Autowired
	public MainController(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@GetMapping("/")
	public String homePage(Model model) {
		Person person = new Person();
		person.setFirstName("Ajay");
		person.setLastName("Garg");
		this.personRepository.save(person);
		final List<Person> all1 = this.personRepository.findAll();
		all1.forEach(System.out::println);
		model.addAttribute("fname", all1.get(0).getFirstName());
		model.addAttribute("lname", all1.get(0).getLastName());
		return "index";
	}
}
