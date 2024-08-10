package com.example.demo1.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo1.dto.Branch;
import com.example.demo1.repository.BranchRepository;
@Repository
public class BranchDao {
	
	
		@Autowired
		
		private BranchRepository repo;

		public Branch saveBranch(Branch branch) {
			
			return repo.save(branch);
		}
		
		
		public List<Branch> getAllBranch(){
			
			return repo.findAll();
			}
		
		
		public Branch getBranchById(int id) {
			if(repo.findById(id).isPresent()) {
				Branch branch=repo.findById(id).get();
				return branch;
			}
			else
				return null;
			
		}
		

		public Branch updateBranch(int  id, Branch branchDetails) {
	        
	        Branch branch = repo.findById(id)
	                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));

	     
	        branch.setBranch_Name(branchDetails.getBranch_Name());
	        branch.setContact_Number(branchDetails.getContact_Number());
	        branch.setBranch_Address(branchDetails.getBranch_Address());
	        branch.setBranch_Description(branchDetails.getBranch_Description());

	      
	        return repo.save(branch);
	    }
		
		
		public Branch deleteBranch(int id) {
			Optional<Branch> optional=repo.findById(id);
			if(optional.isPresent()) {
				repo.deleteById(id);
				return optional.get();
				
			}
			else {
				return null;
				}
			
		}
		
		}
		

		
		




