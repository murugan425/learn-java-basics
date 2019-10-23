/**
 * 
 */
package com.tamil.learn.java.features.eight.functions;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.lang3.RandomStringUtils;

import com.tamil.learn.java.basics.vo.Employee;

/**
 * @author atpsmnn
 *
 */
public class FunctionSupplier {

	Random rand = new Random();
	RandomStringUtils randStr = new RandomStringUtils();
	int minDay = (int) LocalDate.now().minusYears(60).toEpochDay();
	int maxDay = (int) LocalDate.now().minusYears(10).toEpochDay();
	
	public Supplier<LocalDate> dateSupplier = () -> {		
		long randomDay = minDay + rand.nextInt(maxDay - minDay);
		return LocalDate.ofEpochDay(randomDay);
	};
	
	@SuppressWarnings("static-access")
	public Supplier<List<Employee>> empSupplier = () -> IntStream.range(0, Integer.valueOf(randStr.randomNumeric(2))+1).
			mapToObj(o -> new Employee(randStr.randomAlphabetic(10), Integer.valueOf(randStr.randomNumeric(2)), dateSupplier.get())).collect(Collectors.toList()); 
	
}
