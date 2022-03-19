package com.example.kafka.service.producer;

import com.example.kafka.model.Person;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProducerPersonServiceImpl implements ProducerPersonService {

    private static final String TOPIC = "myTopic";

    private final KafkaTemplate<String, Person> kafkaTemplate;

    @Override
    public void sendPerson(Person person) {
        kafkaTemplate.send(TOPIC, person);
        log.info(String.format("***** person send from producer. %s", person.toString()));
    }
}
