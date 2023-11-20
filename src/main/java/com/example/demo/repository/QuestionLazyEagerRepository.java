package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AddressOneToOneUni;
import com.example.demo.model.QuestionLazyEager;

@Repository
public interface QuestionLazyEagerRepository extends JpaRepository<QuestionLazyEager, Integer>{

}
