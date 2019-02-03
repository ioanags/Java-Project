package com.persado.assignment.project.repository;

import com.persado.assignment.project.domain.Books;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Books,Long> {
}
