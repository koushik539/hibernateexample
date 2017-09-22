package com.hibernate.kou;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MANAGER")
@Embeddable
public class Manager {
	
	@Id
	@Column(name = "MID", nullable=false)
	private String managerId;
	
	@Column(name = "MANAGER_FIRST_NAME", nullable=false)
	private String managerFirstName;
	
	@Column(name = "MANAGER_LAST_NAME", nullable=false)
	private String managerLastName;
	
	
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getManagerFirstName() {
		return managerFirstName;
	}
	public void setManagerFirstName(String managerFirstName) {
		this.managerFirstName = managerFirstName;
	}
	public void setManagerLastName(String managerLastName) {
		this.managerLastName = managerLastName;
	}
	public String getManagerLastName(String managerLastName) {
		return managerLastName;
	}
	
	

}
