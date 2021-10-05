package com.prodian.SpringJpaMapping.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Customer {
	@Id
	@GeneratedValue
	private int id;
	private String name;

	public Customer(String name) {
		this.name = name;

	}

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "customer_item", joinColumns = { @JoinColumn(name = "customer_fk") }, inverseJoinColumns = {
			@JoinColumn(name = "item_fk") })

	private Set<Item> items = new HashSet<>();

}
