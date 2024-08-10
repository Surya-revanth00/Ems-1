package com.example.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo1.dto.Branch;

public interface BranchRepository extends JpaRepository<Branch, Integer> {

	Branch findByEmail(String email);

}
