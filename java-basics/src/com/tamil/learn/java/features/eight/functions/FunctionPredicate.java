/**
 * 
 */
package com.tamil.learn.java.features.eight.functions;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Random;
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RandomStringUtils randStr = new RandomStringUtils();
		
		List<Employee> employees = IntStream.range(0, 10).
				mapToObj(o -> new Employee(randStr.randomAlphabetic(10), Integer.valueOf(randStr.randomNumeric(2)), generateDate())).collect(Collectors.toList()); 
		log.info(employees.size() + " Employees Generated");	
		employees.forEach(emp -> System.out.println(emp));

		log.info("********Employees > 25 Years old********");
		employees.forEach(emp -> {
			if(emp.getDob().isBefore(LocalDate.now().minusYears(25))) {
				System.out.println(emp + " / Age is : " + getAge(emp.getDob()));
			}
		});
		
		log.info("********Employees < 25 Years old********");
		employees.forEach(emp -> {
			if(emp.getDob().isAfter(LocalDate.now().minusYears(25))) {
				System.out.println(emp + " / Age is : " + getAge(emp.getDob()));
			}
		});
		
	}
	
	public static LocalDate generateDate() {
		Random rand = new Random();
		int minDay = (int) LocalDate.now().minusYears(60).toEpochDay();
		int maxDay = (int) LocalDate.now().minusYears(10).toEpochDay();
		long randomDay = minDay + rand.nextInt(maxDay - minDay);
		return LocalDate.ofEpochDay(randomDay);
	}
	
	public static Integer getAge(LocalDate empDob) {
		Period period = Period.between(empDob, LocalDate.now());
		return period.getYears();
	}

}
