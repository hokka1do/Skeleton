package com.hokka1do.bookme.controller;

import com.hokka1do.bookme.professionals.Professional;
import com.hokka1do.bookme.repository.ProfessionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/professional")
public class ProfessionalController {
    @Autowired
    private ProfessionalRepository professionalRepository;

    @GetMapping("/professional/get")
    public String getProfessional(){
        return String.valueOf(new Professional("Illia","Kuznetsov"));
    }
}
