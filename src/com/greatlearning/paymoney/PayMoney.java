package com.greatlearning.paymoney;

public class PayMoney {
	
	private int targetToBeAcheived;

	public PayMoney(int targetToBeAcheived) {
		super();
		this.targetToBeAcheived = targetToBeAcheived;
	}

	public PayMoney() {
		super();
	}
	
	
	public void targetAcheived(int [] targets) {
		int sum = 0;
		int days = 0;
		boolean isTargetAcheived = false;
		for (int i : targets) {
			sum += i;
			days++;
			if(targetToBeAcheived <= sum) {
				isTargetAcheived = true;
				System.out.println("Target of  - "+targetToBeAcheived + " acheived in  : " + (days));
				break;
			}
			if( i == targetToBeAcheived || targetToBeAcheived < i) {
				isTargetAcheived = true;
				System.out.println("Target of  - "+targetToBeAcheived + " acheived in  : " + (days));
				break;
			}
		}
		if(!isTargetAcheived) {
			System.out.println("Target : "+ targetToBeAcheived + " is not acheived in the : "+ days + " transactions.");
		}
	}

}
