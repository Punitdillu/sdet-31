package com.Java_Class;

public class Addnum {

		public static void main(String[] args) {
			int num=1;
			for (int i = 1; i <=5; i++) {
				
				for (int j= 1; j <=i; j++) {
					
					if(num>9)
					{
						num=1;
					}
					System.out.print(num);
					num++;
				}
				System.out.println();
			}
		}
}
