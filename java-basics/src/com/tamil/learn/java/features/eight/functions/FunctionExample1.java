package com.tamil.learn.java.features.eight.functions;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;
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
		
		@SuppressWarnings("static-access")
		List<Employee> employees = IntStream.range(0, 10).
				mapToObj(o -> new Employee(randStr.randomAlphabetic(10), Integer.valueOf(randStr.randomNumeric(2)), generateDate())).collect(Collectors.toList()); 
		log.info(employees.size() + " Employees Generated");	
		employees.forEach(emp -> System.out.println(emp));

		int age = 25;
		log.info("********Employees > "+ age +" Years old********");
		predicates.filterEmployeesByAge(employees, emp -> emp.getDob().isBefore(ageCondition(age)));
		
		log.info("********Employees < "+ age +" Years old********");
		predicates.filterEmployeesByAge(employees, emp -> emp.getDob().isAfter(ageCondition(age)));
		
	}
	
	public static LocalDate ageCondition(Integer age) {		
		return LocalDate.now().minusYears(age);
	}
	
	public static LocalDate generateDate() {
		Random rand = new Random();
		int minDay = (int) LocalDate.now().minusYears(60).toEpochDay();
		int maxDay = (int) LocalDate.now().minusYears(10).toEpochDay();
		long randomDay = minDay + rand.nextInt(maxDay - minDay);
		return LocalDate.ofEpochDay(randomDay);
	}
}
