package ru.mpei.persons.services;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.mpei.persons.models.Mood;
import ru.mpei.persons.models.Person;
import ru.mpei.persons.repo.PeopleRepository;

import java.util.Date;
import java.util.List;
@Service
@Transactional(readOnly = true)
public class PeopleService {
    private final PeopleRepository peopleRepository;
    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }
    public List<Person> findAll(){
        return peopleRepository.findAll();
    }
    public Person findOne(int id){
        return peopleRepository.findById(id).orElse(null);
    }
    @Transactional
    public void save(Person person){
        peopleRepository.save(person);
    }
    @Transactional
    public void update(int id, Person personToBeUpdated){
        personToBeUpdated.setId(id);
        peopleRepository.save(personToBeUpdated);
    }
    @Transactional
    public void delete(int id){
        peopleRepository.deleteById(id);
    }
}
