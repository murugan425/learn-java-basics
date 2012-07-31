/**
 * LearnJavaBasics
 */
package org.learnjavabasics.operators;

/**
 * @author Murugan Nagarajan
 * @created date 28-Jul-2012 / 8:42:47 AM
 */
import java.lang.Math;
public class BasicFormulas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float pi = 3.14f;
		float r = 0, h = 0, m1 = 0, m2 = 0, g = 0, a = 0, b = 0,
				x = 0, mass = 0, acceleration = 0, height = 0, velocity = 0;
		
		r = 2.5f; h = 2; m1 = 4.5f; m2 = 3.2f; g = 6.4f; a = 2.2f; b = 4.7f;
		x = 1.5f; mass = 3.2f; acceleration = 30.25f; height = 8; velocity = 23.3f;
		
		// Avoid using unnecessary braces if u r too constrained about prgm size.
		//(pi*Math.pow(r,2)) + (2*pi*r*h)
		double Area = pi*Math.pow(r,2) + 2*pi*r*h;
		//((2*m1*m2)/(m1+m2))*g)
		double Torque = 2*m1*m2/(m1+m2)*g;
		double Side = Math.sqrt(Math.pow( a, 2)+Math.pow(b, 2)-2*a*b*Math.cos(x));
		double Energy = mass*(acceleration*height+Math.pow(velocity,2)/2);
		
		System.out.println("Area	:"+Math.abs(Area));
		System.out.println("Torque	:"+Torque);
		//Truncated value of Torque
		System.out.println("Torque	:"+Math.rint(Torque));
		System.out.println("Side	:"+Side);
		System.out.println("Energy	:"+Energy);
	}

}
