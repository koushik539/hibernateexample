package com.hibernate.kou;

import javax.persistence.Column;
//import javax.persistence.Embeddable;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FLOWER")
public class Flower {

	//public FlowerShop name;
	
	@Id
	@Column(name = "FID", nullable=false)
	private String flowerId;
	
	@Column(name = "FLOWER_TYPE", nullable=false)
	private String flowerType;
	
	@Column(name = "WEEKLY_SALES", nullable=false)
	private String weeklySales;
	
	
	
	public String getFlowerId() {
		return flowerId;
	}
	public void setFlowerId(String flowerId) {
		this.flowerId = flowerId;
	}
	public String getFlowerType() {
		return flowerType;
	}
	public void setFlowerType(String flowerType) {
		this.flowerType = flowerType;
	}
	public String getWeeklySales() {
		return weeklySales;
	}
	public void setWeeklySales(String weeklySales) {
		this.weeklySales = weeklySales;
	}
	
	
}
