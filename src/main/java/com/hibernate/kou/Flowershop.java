package com.hibernate.kou;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "FLOWERSHOP")
public class Flowershop {
	
	@Id
	@Column(name = "ID", nullable=false)
//	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private String flowerShopId;
	
	@Column(name = "SHOPNAME", nullable=false)
	private String flowerShopName;
//	private String typesOfFlowers;
	
	@OneToMany
	@CollectionTable(name="FLOWERSHOP_FLOWER")
	private List<Flower> flowers = new ArrayList<Flower>();
	
	@OneToMany
	@CollectionTable(name="FLOWERSHOP_SHOPMANAGERS")
	private List<Manager> managers = new ArrayList<Manager>();
	
	public String getFlowerShopId() {
		return flowerShopId;
	}
	public void setFlowerShopId(String flowerShopId) {
		this.flowerShopId = flowerShopId;
	}
	public String getFlowerShopName() {
		return flowerShopName;
	}
	public void setFlowerShopName(String flowerShopName) {
		this.flowerShopName = flowerShopName;
	}
	

	public List<Manager> getManagers() {
		return managers;
	}
	public void setManagers(List<Manager> managers) {
		this.managers = managers;
	}
	public List<Flower> getFlowers() {
		return flowers;
	}
	public void setFlowers(List<Flower> flowers) {
		this.flowers = flowers;
	}
	
	

}