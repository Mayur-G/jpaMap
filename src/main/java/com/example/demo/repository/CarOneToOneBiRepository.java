package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CarOneToOneBi;
import com.example.demo.model.UserOneToOneUni;

@Repository
public interface CarOneToOneBiRepository extends JpaRepository<CarOneToOneBi, Long>{

}

