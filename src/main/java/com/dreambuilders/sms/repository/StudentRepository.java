package com.dreambuilders.sms.repository;

import com.dreambuilders.sms.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.bson.types.ObjectId;

@Repository
public interface StudentRepository extends MongoRepository<Student,ObjectId> {
}
