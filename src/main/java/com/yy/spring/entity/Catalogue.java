package com.yy.spring.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@Entity
public class Catalogue {
	@Id
	@GeneratedValue
	private int id;
	private String text;
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name="cid_mid",referencedColumnName = "id")
	private  List<Menu> children;
}
