package com.Java_Class;

public class Add_twoArray {

	public static void main(String[] args) {
		
		int a[]= {2,4,1,6,3,4,3,3,3,3,3,3,3};
		int b[]= {1,5,7,3,5,6,5};
		int x=0;
		
	if(a.length>b.length)	{
		for(int i=0;i<a.length;i++)
		{
			if(i<b.length ) 
			{
			x=a[i]+b[i];
			}
			else {
				x=a[i];
			}
			System.out.print(x+" ");
			}
}
		else if(a.length<b.length)
		{
			for(int i=0;i<b.length;i++)
			{
				if(i<a.length ) 
				{
				x=a[i]+b[i];
				}
				else {
					x=b[i];
				}
				System.out.print(x+" ");
}		
}
	}
}
