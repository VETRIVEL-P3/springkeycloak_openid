package com.example.springkeycloak.controller;


import com.example.springkeycloak.model.springkeycloak;
import com.example.springkeycloak.repository.spring_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
public class spring_controller {

@Autowired
    private spring_repository Spring_Repo;

@PostMapping("/saves")
@RolesAllowed("spadmin")
public ResponseEntity<springkeycloak> save(@RequestBody springkeycloak sk)
{
    return ResponseEntity.ok(Spring_Repo.save(sk));
}

@GetMapping("/displays")
@RolesAllowed("spuser")
public ResponseEntity<List<springkeycloak>> findAll()
{
return ResponseEntity.ok(Spring_Repo.findAll());
}
}
