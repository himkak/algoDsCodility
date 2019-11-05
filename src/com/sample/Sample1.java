package com.sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample1 {

	public int solution(int[] A) {
		List<Integer> aInt = Arrays.stream(A).boxed().collect(Collectors.toList());
		for (int i = 1; i < 100000; i++) {
			if(!aInt.contains(i)) {
				return i;
			}
//	           for(int j=0;j<A.length;j++) {
//	        	   if(i==A[j]) {
//	        		   break;
//	        	   }
//	           }
		}
		return 0;
	}

}
