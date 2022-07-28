package com.hokka1do.bookme.service;

import com.hokka1do.bookme.professionals.Professional;

import java.util.List;

public interface ProfessionalService {

    void create (Professional professional);

    List<Professional> readAll();

    Professional read (Long id);

    boolean delete(Long id);
}
