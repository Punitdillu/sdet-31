package com.Practice;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;

import com.crm.GenericUtility.Database_utility;

public class Database_sql_codes {
	
	//@Test
	public static void main(String args[]) throws SQLException {
		
		Database_utility dutils= new Database_utility();
		
		dutils.create_database_connection();
		
		dutils.insert_data_to_database("insert into student_info values(15,'Amar','Prasad','Singh')");
		ResultSet result = dutils.get_all_data("select *from student_info");
		while(result.next())
		{
			System.out.println(result.getInt(1)+" "+result.getString(2)+" "+result.getString(3)+" " +result.getString(4));
		}
		dutils.close_database_connection();
	}
}
