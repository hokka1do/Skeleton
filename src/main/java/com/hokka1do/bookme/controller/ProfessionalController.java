package com.hokka1do.bookme.controller;

import com.hokka1do.bookme.professionals.Professional;
import com.hokka1do.bookme.repository.ProfessionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/professional")
public class ProfessionalController {
    @Autowired
    private ProfessionalRepository professionalRepository;

    @GetMapping
    public List<Professional> getAllProfessionals() {
        return (List<Professional>) professionalRepository.findAll();
    }

    @GetMapping("/id")
    public ResponseEntity<Professional> findProfessionalById(@PathVariable(value = "id") Long professionalId) {
        Professional professional = professionalRepository.findById(professionalId).orElseThrow(() ->
                new NoSuchElementException(("Professional not available for Id :" + professionalId)));
        return ResponseEntity.ok().body(professional);
    }
}
