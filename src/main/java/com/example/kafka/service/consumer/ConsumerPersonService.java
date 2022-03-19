package com.example.kafka.service.consumer;

import com.example.kafka.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ConsumerPersonService {
    void consumePerson(Person person);
}
