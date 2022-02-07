package com.example.springkeycloak.repository;


import com.example.springkeycloak.model.springkeycloak;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface spring_repository extends JpaRepository<springkeycloak, Integer> {
}
