package com.work.app.Dao;


import java.util.List;

import com.work.Model.Person;

public interface PersonDAO {
  
	public void addPerson(Person person);
    public void updatePerson(Person person);
    public List<Person> listPersons();
    public Person getPerson(int id);
    public void  removePerson(int id);
	
}
