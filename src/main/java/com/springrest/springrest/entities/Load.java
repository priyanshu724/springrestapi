package com.springrest.springrest.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Load {
	@Id

	private long shipperId;
	private String loadingpoint;
	private String unloadingpoint;
	private String productType;
	

	private long noOftrucks;
	

	    private Long weight;
	

	private String comment;
	

	private Date date ;
	public Load() {
		super();
		
	}
	public Load(long shipperId, String loadingpoint, String unloadingpoint, String productType, long noOftrucks,
			long weight, String comment, Date date) {
		super();
		this.shipperId = shipperId;
		this.loadingpoint = loadingpoint;
		this.unloadingpoint = unloadingpoint;
		this.productType = productType;
		this.noOftrucks = noOftrucks;
		this.weight = weight;
		this.comment = comment;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Load [shipperid=" + shipperId + ", loadingpoint=" + loadingpoint + ", unloadingpoint=" + unloadingpoint
				+ ", productType=" + productType + ", noOftrucks=" + noOftrucks + ", weight=" + weight + ", comment="
				+ comment + ", date=" + date + "]";
	}
	public long getShipperId() {
		return shipperId;
	}
	public void setShipperId( long shipperId) {
		this.shipperId = shipperId;
	}
	public String getLoadingpoint() {
		return loadingpoint;
	}
	public void setLoadingpoint(String loadingpoint) {
		this.loadingpoint = loadingpoint;
	}
	public String getUnloadingpoint() {
		return unloadingpoint;
	}
	public void setUnloadingpoint(String unloadingpoint) {
		this.unloadingpoint = unloadingpoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public long getNoOftrucks() {
		return noOftrucks;
	}
	public void setNoOftrucks(long noOftrucks) {
		this.noOftrucks = noOftrucks;
	}
	public long getWeight() {
		return weight;
	}
	public void setWeight(long weight) {
		this.weight = weight;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
