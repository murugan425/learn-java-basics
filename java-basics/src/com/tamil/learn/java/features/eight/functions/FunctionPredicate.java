/**
 * 
 */
package com.tamil.learn.java.features.eight.functions;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.lang3.RandomStringUtils;

import com.tamil.learn.java.basics.vo.Employee;

import lombok.extern.slf4j.Slf4j;

/**
 * @author atpsmnn
 *
 */
@Slf4j
public class FunctionPredicate {
	
	//Predicates helps to minimize the complex multiple if conditions that can be passed as arguments now.
	public void filterEmployeesByAge(List<Employee> employees, Predicate<Employee> filterCond) {
		employees.forEach(emp -> {
			if(filterCond.test(emp)) {
				System.out.println(emp + " / Age is : " + getAge(emp.getDob()));
			}
		});
	}
	
	public void filterEmployeesByAge(List<Employee> employees, Predicate<Employee> minAge, Predicate<Employee> maxAge) {
		employees.forEach(emp -> {
			if(minAge.and(maxAge).test(emp)) {
				System.out.println(emp + " / Age is : " + getAge(emp.getDob()));
			}
		});
	}
	
	public Integer getAge(LocalDate empDob) {
		Period period = Period.between(empDob, LocalDate.now());
		return period.getYears();
	}
	
}
