package com.OneToOne;

import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;   
   
public class JOINTHIS
{
public static void main(String[] args) 
{   
     
    StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
     
    SessionFactory factory=meta.getSessionFactoryBuilder().build();
    Session session=factory.openSession();
     
    Transaction t=session.beginTransaction();  
     
    Employee2 e1=new Employee2();  
    e1.setEmployeeId(96);
    e1.setName(" komal");   
    e1.setEmail("komal.ranaware@compucom.com");   
       
    Address2 a1=new Address2();
    a1.setAddressId(4);
    a1.setAddressLine1("Magarpatta city");   
    a1.setCity("PUNE");   
    a1.setState("MH");   
    a1.setCountry("India");   
    a1.setPincode(411013);   
       
    e1.setAddress(a1);   
    a1.setEmployee(e1);   
    
    
       
    session.persist(e1);   
    t.commit();   
       
    session.close();   
    System.out.println("success");   
}   
}   