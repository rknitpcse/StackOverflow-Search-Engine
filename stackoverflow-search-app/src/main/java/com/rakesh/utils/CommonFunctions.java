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
	 * take user input String
	 */
	private void takeInputSearchText() {
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.print("Please enter your search query: ");
			this.textSearch = scan.nextLine();
			if(!this.textSearch.isEmpty())
				break;
		}
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
