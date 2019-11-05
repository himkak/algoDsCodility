package com.test.zemoso;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class ZemosoTest {
	
	@Test
	public void test1() {
		ZemosoTest obj = new ZemosoTest();
		Assert.assertEquals(7, obj.solution(8, 0));
	}
	
	@Test
	public void test2() {
		ZemosoTest obj = new ZemosoTest();
		Assert.assertEquals(6, obj.solution(18, 2));
	}

	public int solution(int N, int K) {
		 List<Integer> validNumbers=calculatesValidFullGameChips(N);
		 validNumbers=validNumbers.subList(0, K);
		int roundsPlayed = 0;
		int chipsInHand = 1;
		do {

			int chipsToPlayWith = calculateNoOfChipsToPlayWith(chipsInHand, K, N, validNumbers);
			
			if (chipsInHand != 1 && chipsToPlayWith == chipsInHand) {
				K--;
			}
			
			int chipsWon = chipsToPlayWith * 2;
			chipsInHand = (chipsInHand - chipsToPlayWith) + chipsWon;
			roundsPlayed++;
			//System.out.println("after " + roundsPlayed +" round, chipsInHand:" + chipsInHand + ", chipsToPlayWith:"+chipsToPlayWith);
		} while (chipsInHand < N);

		return roundsPlayed;
	}

	private int calculateNoOfChipsToPlayWith(int chipsInHand, int pendingAllInGames, int totalChipsToCollect, List<Integer> validNumbersForFullGame) {
		if(chipsInHand==1) {
			return 1;
		}else {
			if(pendingAllInGames>0 && validNumbersForFullGame.contains(chipsInHand)) {
				validNumbersForFullGame.remove( Integer.valueOf(chipsInHand));
				return chipsInHand;
			}else {
				
				return 1;
			}
		}
	}
	
	private List<Integer> calculatesValidFullGameChips(int totalChipsToWin) {
		List<Integer> validNumbers=new ArrayList<>();
		do {
			int number=totalChipsToWin%2;
		if(number==0) {
			totalChipsToWin=totalChipsToWin/2;
			validNumbers.add(totalChipsToWin);
		}else {
			totalChipsToWin =totalChipsToWin-1;
		}
		}while(totalChipsToWin>1);
		return validNumbers;
	}
	
}
