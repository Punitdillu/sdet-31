package com.section1_javacode;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		int count1=0;
		
		for (int i = 10;true; i++) {

			int temp=i;
			int count=0;
			int temp1=i;
			int sum=0;
			
		while(temp>0) {
			temp=temp/10;
			count++;
		}
			
				while(temp1>0) {
					int r=0;
					r=temp1%10;
					int a=1;
					for(int j=1;j<=count;j++) 
					{
						a=a*r;
					}
					sum=sum+a;
					temp1=temp1/10;
					
				}
			if(sum==i) {
			System.out.println(i +" Number is armstrong number");
			count1++;
			}
		if(count1==20)
		{
			break;
		}
		}
	}
		
}

