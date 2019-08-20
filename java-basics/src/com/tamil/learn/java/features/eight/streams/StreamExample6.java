/**
 * 
 */
package com.tamil.learn.java.features.eight.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.lang3.RandomStringUtils;

import com.tamil.learn.java.basics.vo.Department;
import com.tamil.learn.java.basics.vo.Employee;
import com.tamil.learn.java.features.eight.functions.FunctionSupplier;

import lombok.extern.slf4j.Slf4j;

/**
 * @author atpsmnn
 *
 */
@Slf4j
public class StreamExample6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RandomStringUtils randStr = new RandomStringUtils();
		FunctionSupplier supplier = new FunctionSupplier();
		
		List<Department> departments = Arrays.asList("HR", "CCD", "DEV", "QM").stream().
				map(dept -> new Department(dept, supplier.empSupplier.get())).collect(Collectors.toList());
		
		log.info(departments.size() + " Department Generated");	
		departments.forEach(dept -> System.out.println(dept));
		
		//Using FlatMap in streams - Mostly used to flatten the nested list present inside a source stream
		System.out.println("Get the list of employees in all departments");
		departments.stream().peek(dept->System.out.println("********"+dept.getName()+"********")).
			flatMap(dept -> dept.getEmployees().stream()).forEach(System.out::println);
		
		List<Employee> employees = departments.stream().flatMap(dept -> dept.getEmployees().stream()).
				sorted((e1,e2)->e1.getDob().compareTo(e2.getDob())).collect(Collectors.toList());
		System.out.println("Totally, " + employees.size() + " Employees generated");
		employees.forEach(System.out::println);			
	}

}
