package com.prodian.SpringJpaMapping.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Item {

	@Id
	@GeneratedValue
	private int id;
	private String name;

	public Item(String name) {
		this.name = name;

	}

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "items")
	private Set<Customer> customer = new HashSet<>();

}
