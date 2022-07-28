package com.hokka1do.bookme.repository;

import com.hokka1do.bookme.professionals.Professional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfessionalRepository extends CrudRepository<Professional, Long> {
    Optional<Professional> findById(Long Id);
}
