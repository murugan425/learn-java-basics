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
	
	Function<Employee, String> formatEmp = (emp) -> 
		String.format("%s dob is %s [age: %d] and he earns %02d $ per hour.", 
			emp.getName().toUpperCase(), emp.getDob(), Period.between(emp.getDob(), LocalDate.now()).getYears(), emp.getSalary());
	
	Function<Employee, String> formatEmpNoAge = (emp) -> 
		String.format("%s dob is %s and he earns %02d $ per hour.", emp.getName().toUpperCase(), emp.getDob(), emp.getSalary());
	
	Function<Employee, Employee> calcMonthlySal =  (emp) -> {emp.setSalary(emp.getSalary()*8*20); return emp;}; ///8hrs per day - 20 Working days

	Function<Employee, String> formatEmpWithMonthlySal = (emp) -> 
		String.format("%s dob is %s and he earns %02d $ per month.", emp.getName().toUpperCase(), emp.getDob(), emp.getSalary());
	
	//BiFunction can accept two inputs and produce one result which helps to chain multiple functions infact.
	//We can even give the output of one function as the input of BiFunction
	BiFunction<String, Employee, String> formatEmpWithAge = (empStr, emp) -> 
		empStr.concat(String.format("[Age: %d]", Period.between(emp.getDob(), LocalDate.now()).getYears()));
	
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
				//Nested Functions
				System.out.println(formatEmpWithAge.apply(formatEmpNoAge.apply(emp), emp));
				//Chained Functions				
				System.out.println(calcMonthlySal.andThen(formatEmpWithMonthlySal).apply(emp));
			}
		});
	}	
}
