package com.work.app.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.work.Model.Person;

@Repository
public class PersonDAOImpl implements PersonDAO {

	
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addPerson(Person person) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(person);

	}

	@Override
	public void updatePerson(Person person) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(person);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Person> listPersons() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Person> listPersons = session.createQuery("from Person").list();
		return listPersons;
	}

	@Override
	public Person getPerson(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Person person = (Person) session.get(Person.class, new Integer(id));

		return person;
	}

	@Override
	public void removePerson(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Person person = (Person) session.get(Person.class, new Integer(id));
		if (person != null) {
          
			session.delete(person);
		}
	}

}
