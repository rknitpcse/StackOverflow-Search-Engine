package com.rakesh.utils;

import java.util.Scanner;

/**
 * 
 * @author rakkumar
 *
 */

public class CommonFunctions {
	
	private String textSearch = null;
	
	/**
	 * Returns input String
	 * @return String
	 */
	private void takeInputSearchText() {
		System.out.print("Please enter your search query: ");
		Scanner scan = new Scanner(System.in);
		this.textSearch = scan.nextLine();
		scan.close();
	}
	
	/**
	 * Returns entered search text
	 * @return String
	 */
	public String getSearchText()
	{
		return this.textSearch;
	}
	
	/**
	 * Returns URL type entered search text
	 * @return String
	 */
	public String getUrlIntitle() 
	{
		this.takeInputSearchText();
		String searchText = this.textSearch.trim();
	    searchText = searchText.replaceAll("\\s", "%20");
		return ("intitle=".concat(searchText));
	}
	
}
