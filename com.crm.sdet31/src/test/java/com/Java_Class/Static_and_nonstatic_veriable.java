package com.Java_Class;

public class Static_and_nonstatic_veriable {
	
		int x=10;
		static int y=20;
		
		public void m1(){
				
			Static_and_nonstatic_veriable st=new Static_and_nonstatic_veriable();
			System.out.println(x);
			System.out.println(st.x);
			System.err.println(this.x);
			
			
			System.out.println(st.y);
			System.out.println(this.y);
			System.out.println(y);
			System.err.println(Static_and_nonstatic_veriable.y);
			
		}
		
		public static void m2()
		{
			System.out.println(y);
			System.out.println(Static_and_nonstatic_veriable.y);
			Static_and_nonstatic_veriable st=new Static_and_nonstatic_veriable();
			System.out.println(st.x);


			
		}

			public static void main(String[] args) {
				
				Static_and_nonstatic_veriable st=new Static_and_nonstatic_veriable();
				st.m1();
				//m2();
			}
}
