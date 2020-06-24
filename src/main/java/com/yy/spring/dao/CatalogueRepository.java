package com.yy.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.yy.spring.entity.Catalogue;

public interface CatalogueRepository extends JpaRepository<Catalogue, Integer>,JpaSpecificationExecutor<Catalogue>{

}
