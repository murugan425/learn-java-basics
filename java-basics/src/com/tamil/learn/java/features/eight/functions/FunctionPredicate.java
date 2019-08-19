/**
 * 
 */
package com.tamil.learn.java.features.eight.functions;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import com.tamil.learn.java.basics.vo.Employee;

import lombok.extern.slf4j.Slf4j;

/**
 * @author atpsmnn
 *
 */
@Slf4j
public class FunctionPredicate {
	
	Function<Employee, String> formatEmp = (emp) -> 
		String.format("%s dob is %s [age: %d] and he earns %02d $ per hour.", 
			emp.getName().toUpperCase(), emp.getDob(), Period.between(emp.getDob(), LocalDate.now()).getYears(), emp.getSalary());
	
	Function<Employee, String> formatEmpNoAge = (emp) -> 
		String.format("%s dob is %s and he earns %02d $ per hour.", 
			emp.getName().toUpperCase(), emp.getDob(), emp.getSalary());
	
	//Predicates helps to minimize the complex multiple if conditions that can be passed as arguments now.
	public void filterEmployeesByAge(List<Employee> employees, Predicate<Employee> filterCond) {
		employees.forEach(emp -> {
			if(filterCond.test(emp)) {
				System.out.println(formatEmp.apply(emp));
			}
		});
	}
	
	public void filterEmployeesByAge(List<Employee> employees, Predicate<Employee> minAge, Predicate<Employee> maxAge) {
		employees.forEach(emp -> {
			if(minAge.and(maxAge).test(emp)) {
				System.out.println(formatEmpNoAge.apply(emp));
			}
		});
	}	
}
