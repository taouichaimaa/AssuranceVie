package com.example.AssuranceVie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AssuranceVie.dao.FormuleDao;

@Service
public class FormuleService {

	@Autowired
	FormuleDao formuleDao;
}
