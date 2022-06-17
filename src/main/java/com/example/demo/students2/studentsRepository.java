package com.example.demo.students2;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface studentsRepository extends MongoRepository <students, String>{

}
