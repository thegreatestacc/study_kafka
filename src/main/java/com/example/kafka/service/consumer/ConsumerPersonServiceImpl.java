package com.example.kafka.service.consumer;

import com.example.kafka.model.Person;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class ConsumerPersonServiceImpl implements ConsumerPersonService {

    private static final String TOPIC = "myTopic";

    private List<Person> persons = new ArrayList<>();

    @Override
    @SneakyThrows
    @KafkaListener(topics = TOPIC, groupId = "group_person")
    public void consumePerson(Person person) {
        persons.add(person);
        log.info(String.format("***** person consumed from topic %s. %s.", TOPIC, person.toString()));
    }
}
