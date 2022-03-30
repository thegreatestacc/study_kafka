package com.example.kafka.service.consumer;

import com.example.kafka.model.Person;
import org.springframework.stereotype.Service;

@Service
public interface ConsumerPersonService {
    void consumePerson(Person person);
}
