package com.persado.assignment.project.repository;

import com.persado.assignment.project.domain.LoanDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<LoanDetails,Long> {
}
