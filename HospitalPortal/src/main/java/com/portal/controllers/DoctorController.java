package com.portal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portal.services.DoctorServices;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired
	DoctorServices service;
}