package com.rakesh.adapter;


import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * @author rakkumar
 *
 */

@FunctionalInterface
interface JSONInterface
{
	//A method with single parameter
	public void jsonParse(MainParser mainParser);
}


public class StackOverFlowResult {
	
	private ObjectMapper objMapper = new ObjectMapper();

	/**
	 * Print/Display the top 5 search result
	 * @param result
	 * @param searchText
	 * @throws Exception
	 */
	public void parseStringAsJSON(String result, String searchText) throws Exception 
	{
		
		objMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
            false);

		System.out.println("Here are the top-5 results for your search "+"'"+searchText+"':");
		//parsing the result String into JSONObject
		JSONObject jsonObj = new JSONObject(result);
		JSONArray jsonArrayItems = (JSONArray) jsonObj.get("items");

		//lambda function definition
		JSONInterface jsonInterface = (parser) -> System.out.print("\tTitle: "+ parser.getTitle() + ". URL: "+ parser.getLink()+"\n");

		//iteration of JSONArray
		for(int i = 0; i < Math.min(jsonArrayItems.length(), 5); i++)
		{
			JSONObject jsonItr = (JSONObject) jsonArrayItems.get(i);
			MainParser mainParser = objMapper.readValue(jsonItr.toString(), MainParser.class);
			jsonInterface.jsonParse(mainParser);

		}
		

	}


}
