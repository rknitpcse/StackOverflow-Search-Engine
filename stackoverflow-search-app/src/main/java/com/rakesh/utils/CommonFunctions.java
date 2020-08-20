package com.rakesh.utils;

import java.util.Scanner;

/**
 * 
 * @author rakkumar
 *
 */

public class CommonFunctions {

	private Scanner scan = null;
	private String textSearch = null;
	
	/**
	 * Returns input String
	 * @return String
	 */
	public String takeInputSearchText() {
		System.out.print("Please enter your search query: ");
		scan = new Scanner(System.in);
		String searchText = scan.nextLine();
		scan.close();
		return searchText;
	}
	
	/**
	 * Returns entered search text
	 * @return String
	 */
	public String getSearchText()
	{
		return textSearch;
	}
	
	/**
	 * Returns URL type entered search text
	 * @return String
	 */
	public String getUrlIntitle() 
	{
		String searchText = takeInputSearchText().trim();
		textSearch = searchText;
	    searchText = searchText.replaceAll("\\s", "%20");
		return ("intitle=".concat(searchText));
	}
	
}
