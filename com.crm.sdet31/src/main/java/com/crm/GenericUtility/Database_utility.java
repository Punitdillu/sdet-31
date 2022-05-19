package com.crm.GenericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class Database_utility {
	/**
	 * this method will establish the connection between java and database
	 * @throws SQLException
	 */
	Connection connection;
	public void create_database_connection() throws SQLException {
		
		try{ 
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
		 
			connection= DriverManager.getConnection(Ipath_Constants.DATABASE_URL,Ipath_Constants.USERNAME,Ipath_Constants.PASSWORD);
			System.out.println("database connection created");
		}
		catch(SQLException e) {
		
				e.printStackTrace();
		}
		
		 
		 
	}
		
		/**
		 * this method is used to fetch all the data from the database
		 * @param querry
		 * @return
		 * @throws SQLException
		 */
		
		public ResultSet get_all_data(String querry) throws SQLException  {
			
			   ResultSet result = connection.createStatement().executeQuery(querry);
			 return result;
				
		}
		/**
		 * this method is use to insert a data to database
		 * @param querry
		 * @return 
		 * @return
		 * @throws SQLException
		 */
		public boolean insert_data_to_database(String querry) throws SQLException {
			
			int result=connection.createStatement().executeUpdate(querry);
			boolean flag=false;
			if(result==1)
			{
				System.out.println("Data added");
				flag=true;
			}
			else
			{
				System.out.println("Data not added");
			}
			return flag;
			
				
		}
		/**
		 * this method close the database connection
		 * @throws SQLException
		 */
		public void close_database_connection() throws SQLException {
			connection.close();
			System.out.println("database connection closed");
		}

}
