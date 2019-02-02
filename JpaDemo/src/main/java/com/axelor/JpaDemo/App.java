package com.axelor.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Student student=new Student();
    	student.setId(3);
    	student.setStudentName("Tushar Devkar");
    	EntityManagerFactory factory=Persistence.createEntityManagerFactory("jpa-example");
    	EntityManager manager=factory.createEntityManager();
    	
    	manager.getTransaction().begin();
    	manager.persist(student);
    	
    	manager.getTransaction().commit();
    	
    	
    }
}
