package com.tamil.learn.java.features.eight.functions;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.lang3.RandomStringUtils;

import com.tamil.learn.java.basics.vo.Employee;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FunctionExample1 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RandomStringUtils randStr = new RandomStringUtils();
		FunctionPredicate predicates = new FunctionPredicate();
		FunctionSupplier suppliers = new FunctionSupplier();
		
		@SuppressWarnings("static-access")
		List<Employee> employees = IntStream.range(0, 10).
				mapToObj(o -> new Employee(randStr.randomAlphabetic(10), Integer.valueOf(randStr.randomNumeric(2)), suppliers.get())).collect(Collectors.toList()); 
		log.info(employees.size() + " Employees Generated");	
		employees.forEach(emp -> System.out.println(emp));

		int age = 25;
		Predicate<Employee> empGt25 = emp -> emp.getDob().isBefore(ageCondition(age));
		log.info("********Employees > "+ age +" Years old********");
		predicates.filterEmployeesByAge(employees, empGt25);
		
		log.info("********Employees < "+ age +" Years old********");
		predicates.filterEmployeesByAge(employees, empGt25.negate());
		
		log.info("********Employees > 25 && < 50  Years old********");
		Predicate<Employee> empLt50 = emp -> emp.getDob().isAfter(ageCondition(50));		
		//Chaining Predicates
		predicates.filterEmployeesByAge(employees, empGt25.and(empLt50));
		//Method overloading
		log.info("********Employees > 25 && < 50  Years old********");
		predicates.filterEmployeesByAge(employees, empGt25, empLt50);
	}
	
	public static LocalDate ageCondition(Integer age) {		
		return LocalDate.now().minusYears(age);
	}

}
