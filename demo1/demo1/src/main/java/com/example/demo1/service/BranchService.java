package com.example.demo1.service;

import java.util.Map;
import java.util.Optional;

import com.example.demo1.dto.Branch;
import com.example.demo1.repository.BranchRepository;

public class BranchService {
    private final BranchRepository branchRepository;

    public BranchService(BranchRepository branchRepository) {
        this.branchRepository = branchRepository;
    }

    public void addBranch(Branch branch) {
        if (branchRepository.getBranchById(branch.getId()).isPresent()) {
            throw new IllegalArgumentException("Branch with id " + branch.getId() + " already exists.");
        }
        branchRepository.addBranch(branch);
    }

    public Branch getBranch(int id) {
        return branchRepository.getBranchById(id)
            .orElseThrow(() -> new IllegalArgumentException("Branch with id " + id + " not found."));
    }

    public void updateBranch(Branch branch) {
        if (!branchRepository.getBranchById(branch.getId()).isPresent()) {
            throw new IllegalArgumentException("Branch with id " + branch.getId() + " not found.");
        }
        branchRepository.updateBranch(branch);
    }

    public void deleteBranch(int id) {
        if (!branchRepository.getBranchById(id).isPresent()) {
            throw new IllegalArgumentException("Branch with id " + id + " not found.");
        }
        branchRepository.deleteBranch(id);
    }

    public Map<Integer, Branch> getAllBranches() {
        return branchRepository.getAllBranches();
    }
}
