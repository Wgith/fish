package com.yy.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yy.spring.dao.CatalogueRepository;
import com.yy.spring.dao.MenuRepository;
import com.yy.spring.dao.TermRepository;
import com.yy.spring.entity.Term;
import com.yy.spring.entity.Catalogue;
import com.yy.spring.entity.Menu;

@RestController
@CrossOrigin
public class FishController {
	@Autowired
	private CatalogueRepository catalogueRepository;
	@Autowired
	private MenuRepository menuRepository;
	@Autowired
	private TermRepository termRepository;

	@PostMapping("/saveTerm")
	public Term saveTerm(Term term) {
		System.out.println("这是学期");
		System.out.println(term);
		Term save = termRepository.save(term);
		return save;

	}

	@PostMapping("/saveCatalogue")
	public Catalogue saveCata(Catalogue c) {
		return catalogueRepository.save(c);

	}

	@PostMapping("/saveMenu")
	public Menu saveMen(Menu m) {
		return menuRepository.save(m);

	}

	@GetMapping("/find")
	public List<Term> select() {
		return termRepository.findAll();
	}
}
