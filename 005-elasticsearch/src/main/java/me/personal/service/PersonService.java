package me.personal.service;

import lombok.extern.slf4j.Slf4j;
import me.personal.model.Person;
import me.personal.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PersonService {
    @Autowired
    private PersonRepository repository;

    public void save() {
        Person person = Person.builder().id(1L).name("zhangsan").age(20).build();
        Person save = repository.save(person);
        log.info("【save】= {}", save);
    }

    public void get() {
        Person person = repository.findById(1L).orElse(null);
        log.info("【get】= {}", person);
    }

    public void update() {
        repository.findById(1L).ifPresent(person -> {
            person.setAge(22);
            Person update = repository.save(person);
            log.info("【update】= {}", update);
        });
    }

    public void delete() {
        repository.findById(1L).ifPresent(person -> {
            repository.delete(person);
        });
    }
}
