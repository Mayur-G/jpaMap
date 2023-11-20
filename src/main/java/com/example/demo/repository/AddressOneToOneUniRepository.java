package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AddressOneToOneUni;

@Repository
public interface AddressOneToOneUniRepository extends JpaRepository<AddressOneToOneUni, Long>{

}
