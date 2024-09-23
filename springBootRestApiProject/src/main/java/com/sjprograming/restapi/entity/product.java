package com.sjprograming.restapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "product")
public class product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int proNo;
	@Column(name = "product_name")
	private String name;
	@Column(name="product_percentage")
	private float procategory;
	@Column(name="product_branch")
	private String branch;
	
	public product() {
		//todo
	}
	
	



	public product(String name, float procategory, String branch) {
		super();
		this.name = name;
		this.procategory = procategory;
		this.branch = branch;
	}





	public int getProNo() {
		return proNo;
	}
	public void setProNo(int proNo) {
		this.proNo = proNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getProcategory() {
		return procategory;
	}
	public void setProcategory(float procategory) {
		this.procategory = procategory;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "product [proNo=" + proNo + ", name=" + name + ", procategory=" + procategory + ", branch=" + branch
				+ "]";
	}
	
	
	
}



