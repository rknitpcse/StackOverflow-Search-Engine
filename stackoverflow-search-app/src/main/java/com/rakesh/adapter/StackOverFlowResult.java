package com.rakesh.adapter;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * 
 * @author rakkumar
 *
 */
public class StackOverFlowResult {
	
	/**
	 * Print/Display the top 5 search result
	 * @param result
	 * @param searchText
	 */
	public void parseStringAsJSON(String result, String searchText) 
	{
		System.out.println("Here are the top-5 results for your search "+"'"+searchText+"':");
		//parsing the result String into JSONObject
		JSONObject jsonObj = new JSONObject(result);
		JSONArray jsonArrayItems = (JSONArray) jsonObj.get("items");
		JSONObject jsonItr = null;
		for(int i=0; i<5; i++)
		{
			jsonItr = (JSONObject) jsonArrayItems.get(i);
			System.out.print("\tTitle: "+ jsonItr.get("title") + ". ");
			System.out.println("URL: "+ jsonItr.get("link"));
			
		}
		
	}
	

}
