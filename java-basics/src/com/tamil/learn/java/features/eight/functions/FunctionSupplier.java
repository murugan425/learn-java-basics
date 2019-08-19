/**
 * 
 */
package com.tamil.learn.java.features.eight.functions;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;

/**
 * @author atpsmnn
 *
 */
public class FunctionSupplier implements Supplier<LocalDate>{

	@Override
	public LocalDate get() {
		Random rand = new Random();
		int minDay = (int) LocalDate.now().minusYears(60).toEpochDay();
		int maxDay = (int) LocalDate.now().minusYears(10).toEpochDay();
		long randomDay = minDay + rand.nextInt(maxDay - minDay);
		return LocalDate.ofEpochDay(randomDay);
	}

}
