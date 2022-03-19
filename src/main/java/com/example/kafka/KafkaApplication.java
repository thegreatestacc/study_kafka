package com.example.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaApplication.class, args);
    }

    /*@Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, Person> kafkaTemplate) {

        return args -> {
            for (int i = 0; i < 5; i++) {
                var vladimir = Person.builder()
                        .name("vladimir")
                        .age(30)
                        .count(i)
                        .build();

                Thread.sleep(1000L);
                kafkaTemplate.send("myTopic", vladimir);
                vladimir.setCount(i);
                log.info(vladimir.toString());
            }
        };
    }*/

}
