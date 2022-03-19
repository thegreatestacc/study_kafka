package com.example.kafka.service.producer;

import com.example.kafka.model.Person;
import org.springframework.stereotype.Service;

@Service
public interface ProducerPersonService {
    void sendPerson(Person person);
}
