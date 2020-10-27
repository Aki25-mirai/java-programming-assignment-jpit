package com.mmit.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Item
 *
 */
@Entity

public class Item implements Serializable {
	
	@Id
	private int id;
	private String name;
	private int price;

	@OneToMany(mappedBy = "item")
	private List<OrderDetail> orderdetail;
	private static final long serialVersionUID = 1L;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Item() {
		super();
	}
   
}
