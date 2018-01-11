package com.stackroute.JPADemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.stackroute.employee_jpa.repository.Employee;

public class App 
{
	@PersistenceContext
	static EntityManager entitymanager;//emfactory;
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
       //EntityManagerFactory emfactory = Persistence.createEntityManagerFactory();
        
//        EntityManager entitymanager = emfactory.createEntityManager( );
        entitymanager.getTransaction( ).begin( );

        Employee employee = new Employee( ); 
        employee.setEid( 1201 );
        employee.setEname( "TOM" );
        employee.setSalary( 40000 );
        employee.setDesignation( "Technical Manager" );
        
        entitymanager.persist( employee );
        entitymanager.getTransaction( ).commit( );

        entitymanager.close( );
//        emfactory.close( );
    }
}
