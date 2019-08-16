/**
 * 
 */
package com.tamil.learn.java.features.eight.lambda;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.lang3.RandomStringUtils;

import com.tamil.learn.java.basics.inheritance.UpperConcat;
import com.tamil.learn.java.basics.vo.Employee;

import lombok.extern.slf4j.Slf4j;

/**
 * @author atpsmnn
 *
 */
@Slf4j
public class LambdaExample4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RandomStringUtils randStr = new RandomStringUtils();
		
		List<Employee> employees = IntStream.range(0, 10).
				mapToObj(o -> new Employee(randStr.randomAlphabetic(10), Integer.valueOf(randStr.randomNumeric(2)), LocalDate.now())) .collect(Collectors.toList()); 
		log.info(employees.size() + " Employees Generated");	
		employees.forEach(emp -> System.out.println(emp));
		
		//Pass function as an argument to a method in a lambda expression
		/*
		UpperConcat uc = new UpperConcat() {		
			@Override
			public String upperAndConcat(String empName, String empDob) {
				return "Name: " + empName.toUpperCase() + " / Date of Birth: " + empDob;
			}
		};	
		*/
		
		//Modified the function to a lambda expression
		UpperConcat uc = (empName, empDob) -> "Name: " + empName.toUpperCase() + " / Date of Birth: " + empDob;
	
		employees.forEach(emp -> System.out.println(printEmployee(uc, emp)));	
		
	}

	public final static String printEmployee(UpperConcat uc, Employee emp) {
		return uc.upperAndConcat(emp.getName(), emp.getDob().toString());
	}
}
