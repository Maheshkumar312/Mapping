package com.prodian.SpringJpaMapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodian.SpringJpaMapping.entity.Item;

public interface ItemRepository extends JpaRepository<Item,Integer> {

}
