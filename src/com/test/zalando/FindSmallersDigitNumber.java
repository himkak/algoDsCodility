package com.test.zalando;

public class FindSmallersDigitNumber {
	public int solution(int n) {

		int numberOfDigits = Integer.toString(n).length();
		int smallestNum = (int) Math.pow(10, numberOfDigits - 1);
		/*
		 * for(int i=0;i<numberOfDigits;i++) { smallestNum=smallestNum*10; }
		 */
		return smallestNum != 1 ? smallestNum : 0;
	}

	public static void main(String[] args) {
		FindSmallersDigitNumber obj = new FindSmallersDigitNumber();
		System.out.println(obj.solution(9000));
	}

}
