/**
 * 
 */
package com.tamil.learn.java.features.eight.functions;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.function.BiFunction;
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
	
	FunctionVariables fn = new FunctionVariables();
	
	//Predicates helps to minimize the complex multiple if conditions that can be passed as arguments now.
	public void filterEmployeesByAge(List<Employee> employees, Predicate<Employee> filterCond) {
		employees.forEach(emp -> {
			if(filterCond.test(emp)) {
				fn.splitName.accept(emp.getName().toUpperCase());
				System.out.println(fn.formatEmp.apply(emp));
			}
		});
	}
	
	public void filterEmployeesByAge(List<Employee> employees, Predicate<Employee> minAge, Predicate<Employee> maxAge) {
		employees.forEach(emp -> {
			if(minAge.and(maxAge).test(emp)) {
				//Nested Functions
				System.out.println(fn.formatEmpWithAge.apply(fn.formatEmpNoAge.apply(emp), emp));
				//Chained Functions				
				System.out.println(fn.calcMonthlySal.andThen(fn.formatEmpWithMonthlySal).apply(emp));
			}
		});
	}	
}
