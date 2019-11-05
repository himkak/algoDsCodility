package com.test.zalando;

public class MaxNumRepeatedSqrt {

	public int solution(int A, int B) {
		double ceilSqrtA = A;
		double floorSqrtB = B;
		int res = 0;
		while (ceilSqrtA <= floorSqrtB) {
			ceilSqrtA = Math.ceil(Math.sqrt(ceilSqrtA));
			floorSqrtB = Math.floor(Math.sqrt(floorSqrtB));
			if (ceilSqrtA <= floorSqrtB) {
				//System.out.println("ceilSqrtA:" + ceilSqrtA + ",floorSqrtB:" + floorSqrtB);
				res = (int) ceilSqrtA;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		MaxNumRepeatedSqrt obj = new MaxNumRepeatedSqrt();
		System.out.println(obj.solution(10,20));
	}
}
