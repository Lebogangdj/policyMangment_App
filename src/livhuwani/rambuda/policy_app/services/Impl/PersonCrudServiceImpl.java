/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package livhuwani.rambuda.policy_app.services.Impl;

import java.util.ArrayList;
import java.util.List;
import livhuwani.rambuda.policy_app.domain.Intermediary;
import livhuwani.rambuda.policy_app.domain.Person;
import livhuwani.rambuda.policy_app.repository.PersonRepository;
import livhuwani.rambuda.policy_app.services.crud.PersonCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author E939964
 */

@Service
public class PersonCrudServiceImpl implements PersonCrudService
{
    @Autowired
    private PersonRepository personRepository;
    
    @Override
    public Person createPerson(Intermediary user) 
    {
        Person newCust = new Person();
        newCust.setId(Long.MAX_VALUE+1);
        newCust.setName("Rudzani");
        newCust.setSName("Nengovhela");
        newCust.setMemberNumber("200907118");
        newCust.setUser(user);
        
        Person savedCust = personRepository.saveAndFlush(newCust);
        return savedCust;
    }

    @Override
    public List<Person> getAllCustomers() 
    {
       List<Person> customers = new ArrayList<>();
       List<Person> allCustomers = personRepository.findAll();
       
       for (Person person : allCustomers) 
       {
           customers.add(person);
       }
        return customers;
    }
    
    @Override
    public List<Person> getIntermediaryCustomers(Intermediary user)
    {
        List<Person> customers = new ArrayList<>();
        List<Person> allCustomers = personRepository.findAll();
        
        for (Person person : allCustomers) 
        {
            if(person.getUser() == user)
            {
                customers.add(person);
            }
        }
        return customers;
    }
}
