/**
 * 
 */
package com.tamil.learn.java.features.eight.functions;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;

import com.tamil.learn.java.basics.vo.Employee;

/**
 * @author atpsmnn
 *
 */
public class FunctionVariables {

	//Consumers just performs a specific operation, and doesn't returns any output or result
	Consumer<String> splitName = (empName) -> System.out.println(empName.substring(0, empName.length()/2) +" "+ empName.substring(empName.length()/2, empName.length()));
			
	Function<Employee, String> formatEmp = (emp) -> 
		String.format("%s dob is %s [age: %d] and he earns %02d $ per hour.", 
				emp.getName().toUpperCase(), emp.getDob(), Period.between(emp.getDob(), LocalDate.now()).getYears(), emp.getSalary());
	
	Function<Employee, String> formatEmpNoAge = (emp) -> 
		String.format("%s dob is %s and he earns %02d $ per hour.", emp.getName().toUpperCase(), emp.getDob(), emp.getSalary());
	
	IntUnaryOperator calcMonthSal = salPerhr -> salPerhr * 8 * 20; //Unary operators helps to create more granular level/simple fn's
		
	Function<Employee, Employee> calcMonthlySal =  (emp) -> {emp.setSalary(calcMonthSal.applyAsInt(emp.getSalary())); return emp;}; ///8hrs per day - 20 Working days
	
	Function<Employee, String> formatEmpWithMonthlySal = (emp) -> 
		String.format("%s dob is %s and he earns %02d $ per month.", emp.getName().toUpperCase(), emp.getDob(), emp.getSalary());
	
	//BiFunction can accept two inputs and produce one result which helps to chain multiple functions infact.
	//We can even give the output of one function as the input of BiFunction
	BiFunction<String, Employee, String> formatEmpWithAge = (empStr, emp) -> 
		empStr.concat(String.format("[Age: %d]", Period.between(emp.getDob(), LocalDate.now()).getYears()));
	
	
	
}
