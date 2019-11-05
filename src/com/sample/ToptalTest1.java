package com.sample;

public class ToptalTest1 {

//	public boolean solution(int[] A) {
//		// sum all the elements of the array
//		//check if it is divisible by 3, and find the next smaller number divisible by 3
//		for (int i=0 ; i< A.length;i++) {
//			for (int j=i;j<A.length;j++) {
//				if((A[i]+A[j])%3==0) {
//					return true;
//				}
//			}
//		}
//		
//		return false;
//	}

	
	
	public String solution(int U, int L, int[] C) {
		int col=C.length;
		int[][] M=new int[2][col];
		
		
		for(int i=0;i<col;i++) {
			if(C[i]==2) {
				M[0][i]=1;
				M[1][i]=1;
				U--;
				L--;
			}else if(C[i]==0) {
				M[0][i]=0;
				M[1][i]=0;
				
			}else if(C[i]==1) {
				if(U>0) {
					M[0][i]=1;
					U--;
				}else if(L>0) {
					M[1][i]=1;
					L--;
				}else {
					return "IMPOSSIBLE"; 
				}
				
			}else if(C[i]>2){
				return "IMPOSSIBLE";
			}
			
			printArray(M);
		}
		if(U!=0 || L!=0) {
			return "IMPOSSIBLE";
		}
		return printArray(M);

		//return "IMPOSSIBLE";
	}
	private String printArray(int[][] c) {
		String res="";
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				System.out.print(c[i][j]+",");
				res=res+c[i][j];
			}
			System.out.println();
			if(c.length-i!=1)
			res=res+",";
		}
		System.out.println("--------------------");
		return res;
	}
	public static void main(String[] args) {
		//2, 3, [0, 0, 1, 1, 2]
		int[] c= {0, 0, 1, 1, 2};
		System.out.println(new ToptalTest1().solution(2, 3, c));
	}
}
