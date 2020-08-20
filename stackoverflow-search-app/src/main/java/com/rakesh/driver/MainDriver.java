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
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		
		// Creating the StackOverflowSearch Object Instance
		StackOverflowSearch stackOverflowSearch = new StackOverflowSearch();

		try {
			//Firing the HttpGet request
			stackOverflowSearch.sendGet();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		finally {
			stackOverflowSearch.close();
		}

	}
	

}
