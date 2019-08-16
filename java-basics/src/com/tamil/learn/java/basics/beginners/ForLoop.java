/**
 * @author	: Murugan_Nagarajan
 * @date	: Jun 12, 2015
 * @time	: 12:58:00 AM
 */
package com.tamil.learn.java.basics.beginners;

/**
 * @author Murugan_Nagarajan
 *
 */
public class ForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("=======================================");
		/*Post Count Loop*/
		for(int ipostLoopCount = 0; ipostLoopCount<5; ipostLoopCount++) {
			System.out.println("=======================================");
			System.out.println("Loop Count is :" + ipostLoopCount);
			System.out.println("=======================================");
		}
		System.out.println("=======================================");
		/*Post Count Loop*/
		for(int ipreLoopCount = 0; ipreLoopCount<5; ++ipreLoopCount) {
			System.out.println("=======================================");
			System.out.println("Loop Count is :" + ipreLoopCount);
			System.out.println("=======================================");
		}
		System.out.println("=======================================");

		getPrimeNumber(100);
		System.out.println(sumOdd(100,1000));
	}


	public static void getPrimeNumber(int maxNum) {
		int count = 0;
		for(int i = 1; i < maxNum; i++) {
			if(isPrime(i)) {
				System.out.println(i +" \t");
				count++;
			}
			if(count == 3) {
				break;
			}
		}
	}

	public static boolean isPrime(int num) {
		if(num == 1) {
			return false;
		}
		for(int i = 2; i <= num/2; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int sumOdd(int numStart, int numEnd) {
		if(numStart < 0 || numEnd < 0 || numEnd < numStart) {
			return -1;
		}
		int sum = 0;
		for(int i=numStart; i<=numEnd; i++) {
			if(isOdd(i)) {
				sum += i;
			}
		}
		return sum;
	}

	public static boolean isOdd(int num) {
		if(num < 0) {
			return false;
		}
		if(num % 2 == 0) {
			return false;
		}
		return true;
	}
}
