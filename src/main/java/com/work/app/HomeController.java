package com.work.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.work.Model.Person;
import com.work.app.Service.PersonService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	

	
	private PersonService personService;
	
	@Autowired(required=true)
	@Qualifier(value="personService")
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	

    @RequestMapping(value="/Home",method=RequestMethod.GET)
	public String homePage()
	{
		
		
		
		return"home";
	}
	
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String userRegister()
	{
		Person person = new Person();
		person.setFirstName("Kadir");
		person.setLastName("Reis");
		person.setAge("23");
		person.setEmail("kadirroi@gmail.com");
        this.personService.addPerson(person);
    
        return "home";
	}
	
	
	
	
	
	
}
