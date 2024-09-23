package com.sjprograming.restapi.ropository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sjprograming.restapi.entity.product;

public interface productRepository extends JpaRepository<product, Integer>{

}
 