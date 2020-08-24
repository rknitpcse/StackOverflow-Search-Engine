package com.rakesh.adapter;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * 
 * @author rakkumar
 *
 */

@FunctionalInterface
interface JSONInterface
{
	//A method with single parameter
	public void jsonParse(JSONObject jsonObj);
}


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
		
		//lambda function definition
		JSONInterface jsonInterface = (jsonElement) -> System.out.print("\tTitle: "+ jsonElement.get("title") + ". URL: "+ jsonElement.get("link")+"\n");
		
		//for iteration of JSONArray
		JSONObject jsonItr = null;
		for(int i = 0; i < Math.min(jsonArrayItems.length(), 5); i++)
		{
			jsonItr = (JSONObject) jsonArrayItems.get(i);
			jsonInterface.jsonParse(jsonItr);
			
		}
		
	}


}
