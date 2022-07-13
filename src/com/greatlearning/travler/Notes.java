package com.greatlearning.travler;

public class Notes {
	public static void numberOfnotes(int notes[],int amount) {
		int [] counter = new int[notes.length];
		
		for(int i=0;i<notes.length;i++) {
			if(amount >= notes[i]) {
				counter[i] = amount / notes[i];
				amount = amount - notes[i] * counter[i];
			}
		}
		if(amount > 0) {
			System.out.println("Exact amount can not be given with heighest denominations");
		}else {
			System.out.println("Your payment approach in order to given minimum number of denominations");
			for(int i=0;i<counter.length;i++) {
				if(counter[i] != 0) {
					System.out.println(notes[i] + " : " + counter[i]);
				}
			}
		}
	}
}
