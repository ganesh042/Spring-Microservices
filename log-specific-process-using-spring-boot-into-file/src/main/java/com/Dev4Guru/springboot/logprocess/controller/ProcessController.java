package com.Dev4Guru.springboot.logprocess.controller;

import com.Dev4Guru.springboot.logprocess.dto.CreateEmployeeDTO;
import com.Dev4Guru.springboot.logprocess.model.Employee;
import com.Dev4Guru.springboot.logprocess.service.ProcessService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

/**
 * @author Guru Ganesh CH
 *
 */
@RestController
@RequestMapping("process")
public class ProcessController {

	@Autowired
	ProcessService processService;

	@PostMapping("employee")
	public Employee createNewEmployee(@RequestBody CreateEmployeeDTO requestPayload) throws FileNotFoundException {
		return processService.createNewEmployee(requestPayload);
	}
}
