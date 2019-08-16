/**
 * 
 */
package com.tamil.learn.java.features.eight.lambda;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.lang3.RandomStringUtils;

import com.tamil.learn.java.basics.vo.Employee;

import lombok.extern.slf4j.Slf4j;


// No opencsv

/**
 * @author atpsmnn
 *
 */
@Slf4j
public class LambdaExample3 {

	/**
	 * @param args
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		RandomStringUtils randStr = new RandomStringUtils();
		
		List<Employee> employees = IntStream.range(0, 10).
				mapToObj(o -> new Employee(randStr.randomAlphabetic(10), Integer.valueOf(randStr.randomNumeric(2)), generateDate())) .collect(Collectors.toList()); 
		log.info(employees.size() + " Employees Generated");	
		employees.forEach(emp -> System.out.println(emp));
		
		/*Collections.sort(employees, new Comparator<Employee>() {
			@Override
			public int compare(Employee emp1, Employee emp2) {
				return emp1.getDob().compareTo(emp2.getDob());
			}			
		});*/
		
		log.info(employees.size() + " Employees Sorted - Normal way");	
		employees.forEach(emp -> System.out.println(emp));
		
		Collections.sort(employees, (emp1, emp2) -> emp1.getDob().compareTo(emp2.getDob()));		
		log.info(employees.size() + " Employees Sorted using Lambda Expression");	
		employees.forEach(emp -> System.out.println(emp));
	}
	
	public static LocalDate generateDate() {
		Random rand = new Random();
		int minDay = (int) LocalDate.now().minusYears(60).toEpochDay();
		int maxDay = (int) LocalDate.now().minusYears(10).toEpochDay();
		long randomDay = minDay + rand.nextInt(maxDay - minDay);
		return LocalDate.ofEpochDay(randomDay);
	}

}
