package com.weblearner.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.weblearner.springboot.model.Weblearner;

@Repository
public interface WeblearnerRepository extends CrudRepository<Weblearner, Integer>{

}

