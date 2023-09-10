package com.example.bruteforce.Repo;

import com.example.bruteforce.Entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepo extends JpaRepository<Request, Long> {
}
