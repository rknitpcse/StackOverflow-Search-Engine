package com.rakesh.driver;

/**
 * 
 * @author rakkumar
 *
 */
public class MainDriver {
	/**
	 * The main driver method
	 * @param args
	 */
	public static void main(String[] args) {
		// Creating the StackOverflowSearch Object Instance
		StackOverflowSearch stackOverflowSearch = new StackOverflowSearch();
		try {
			//Firing the HttpGet request
			stackOverflowSearch.sendGet();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		finally 
		{	
			try {
				stackOverflowSearch.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
}
