package com.info.loanframe.repository;

import com.info.loanframe.entities.Citizen;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CitizenRepository extends MongoRepository<Citizen,String> {
}
