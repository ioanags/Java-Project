package com.persado.assignment.project.repository;

import com.persado.assignment.project.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
