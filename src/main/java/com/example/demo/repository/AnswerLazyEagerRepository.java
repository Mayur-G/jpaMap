package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AddressOneToOneUni;
import com.example.demo.model.AnswerLazyEager;

@Repository
public interface AnswerLazyEagerRepository extends JpaRepository<AnswerLazyEager, Integer>{

}
