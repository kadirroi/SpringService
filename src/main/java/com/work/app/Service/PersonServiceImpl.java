package com.work.app.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.work.Model.Person;
import com.work.app.Dao.PersonDAO;

@Service
public class PersonServiceImpl implements PersonService {

	
	private PersonDAO personDAO;

	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}

	
	
	@Transactional
	public void addPerson(Person person) {
		// TODO Auto-generated method stub
        this.personDAO.addPerson(person);		
	}


	@Transactional
	public void updatePerson(Person person) {
		// TODO Auto-generated method stub
		this.personDAO.updatePerson(person);
	}


	@Transactional
	public List<Person> listPersons() {
		// TODO Auto-generated method stub
		
		return this.personDAO.listPersons();
	}


	@Transactional
	public Person getPerson(int id) {
		// TODO Auto-generated method stub
		return this.personDAO.getPerson(id);
	}


	@Transactional
	public void removePerson(int id) {
		// TODO Auto-generated method stub
	    this.personDAO.removePerson(id);
		
	}


	
	
	
}
