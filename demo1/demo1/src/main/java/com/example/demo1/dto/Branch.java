package com.example.demo1.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Branch {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int Branch_Id;
	@Column
	private String Branch_Name;
	@Column
	private String Branch_Description;
	@Column
	private String Branch_Address;
	@Column
	private long Contact_Number;
	public int getBranch_Id() {
		return Branch_Id;
	}
	public void setBranch_Id(int branch_Id) {
		Branch_Id = branch_Id;
	}
	public String getBranch_Name() {
		return Branch_Name;
	}
	public void setBranch_Name(String branch_Name) {
		Branch_Name = branch_Name;
	}
	public String getBranch_Description() {
		return Branch_Description;
	}
	public void setBranch_Description(String branch_Description) {
		Branch_Description = branch_Description;
	}
	public String getBranch_Address() {
		return Branch_Address;
	}
	public void setBranch_Address(String branch_Address) {
		Branch_Address = branch_Address;
	}
	public long getContact_Number() {
		return Contact_Number;
	}
	public void setContact_Number(long contact_Number) {
		Contact_Number = contact_Number;
	}
	

}
