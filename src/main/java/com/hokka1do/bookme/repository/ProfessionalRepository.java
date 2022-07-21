package com.hokka1do.bookme.repository;

import com.hokka1do.bookme.professionals.Professional;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProfessionalRepository  extends CrudRepository<Professional,Long> {
    List<Professional> findByLastName(String lastName);
}
