package com.Java_Class;

public class Find_first_and_second_maximum {
		public static void main(String[] args) {
			
			int a[]= {9,9,4,3,1,5,9,8};
			int a1=0;
			int fmax=a[a1];
			int smax=0;
			
			
			for(int i=0;i<a.length;i++)
			{
				if(a[i]>fmax)
				{
					smax=fmax;      
					fmax=a[i];
				}
				else if(a[i]>smax )
				{
				  if(a[i]!=fmax) {
					  
				  
					smax=a[i];
					}
				}
				
			}
				System.out.println(fmax+" "+smax);
		}
		

}
