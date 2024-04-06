package com.hibernates.OneToOneBiDirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class InsertPersonPan {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Takshil");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		Person person = new Person();
		person.setId(1);
		person.setName("Takshil");
		person.setAge(22);
		
		Pan pan = new Pan();
		pan.setId(11);
		pan.setPanNumber("xyzxd34454g");
		pan.setFatherName("kishor");
		pan.setPerson(person);
		
		
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();


	}

}
