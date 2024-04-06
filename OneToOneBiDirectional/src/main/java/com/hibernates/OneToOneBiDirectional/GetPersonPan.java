package com.hibernates.OneToOneBiDirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetPersonPan {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Takshil");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Person p = entityManager.find(Person.class, 1);
		System.out.println(p);
		
		//we get an error that is stack over flow error bcz of an toString() repeatitly calling so that.
		//we can remove this error by removing person from toString() pan class

	}

}
