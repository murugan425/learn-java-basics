/**
 * 
 */
package com.tamil.learn.java.basics.vo;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author atpsmnn
 *
 */
@Data
@AllArgsConstructor
public class Department {
	
	private String name;
	private List<Employee> employees;
	
}
