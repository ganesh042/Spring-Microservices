package com.Dev4Guru.springboot.logprocess.service;

import com.Dev4Guru.springboot.logprocess.dto.CreateEmployeeDTO;
import com.Dev4Guru.springboot.logprocess.model.Employee;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.UUID;

/**
 * @author Guru Ganesh CH
 *
 */
@Service
public class ProcessService {

	// Using @Value to get value from application.properties
	@Value("${log-directory}")
	String logDirectory;

	public Employee createNewEmployee(CreateEmployeeDTO request) throws FileNotFoundException {
		String username = request.getFirstName().concat(request.getMiddleName()).concat(request.getLastName());
		// Initiate logName and Directory path.
		String logName = logDirectory + username + ".log";

		// Create new Log File
		PrintStream log = new PrintStream(new File(logName));

		// append log
		log.println("Starting Create Employee");

		// example logic create employee
		String id = UUID.randomUUID().toString();
		Employee employee = new Employee();
		employee.setId(id);
		employee.setFirstName(request.getFirstName());
		employee.setMiddleName(request.getMiddleName());
		employee.setLastName(request.getLastName());
		employee.setEmail(request.getEmail());
		employee.setUsername(username);

		log.println("Create Employee with detail : " + employee.toString());
		log.println("Employee Successfully Created with username = " + username);

		// close log file after generate log.
		log.close();

		return employee;
	}
}
