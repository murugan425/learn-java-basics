/**
 * 
 */
package com.tamil.learn.java.basics.vo;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author atpsmnn
 *
 */
@Data
@AllArgsConstructor
public class Employee {

	private String name;
	private Integer salary;
	private LocalDate dob;

}
