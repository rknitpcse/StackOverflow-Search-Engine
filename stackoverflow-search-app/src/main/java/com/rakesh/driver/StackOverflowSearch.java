package com.rakesh.driver;


import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.rakesh.adapter.StackOverFlowResult;
import com.rakesh.utils.CommonFunctions;

import java.io.IOException;

/**
 * 
 * @author rakkumar
 *
 */
public class StackOverflowSearch {

	private CloseableHttpClient httpClient = null;
	private final String baseStackOverflowApiUrl = "https://api.stackexchange.com/2.2/search?order=desc&sort=activity&site=stackoverflow&";
	
	private CommonFunctions commonFunction = new CommonFunctions();
	private StackOverFlowResult stackOverflowResult = new StackOverFlowResult();

	/**
	 * The class constructor
	 */
	public StackOverflowSearch() {
		// TODO Auto-generated constructor stub
		this.httpClient = HttpClients.custom().setDefaultRequestConfig(RequestConfig.custom().setCookieSpec(CookieSpecs.STANDARD).build()).build();
	}

	/**
	 * Close the opened HttpClient 
	 * @throws IOException
	 */
	void close() throws IOException {
		httpClient.close();
	}
	
	/**
	 * Fire HttpGet request
	 * @throws Exception
	 */
	void sendGet() throws Exception {

		HttpGet request = new HttpGet(baseStackOverflowApiUrl.concat(commonFunction.getUrlIntitle()));

		try (CloseableHttpResponse response = httpClient.execute(request)) 
		{

			if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK)
			{
				HttpEntity entity = response.getEntity();
				//Header headers = entity.getContentType();
				//System.out.println(headers);

				if (entity != null) {
					// return it as a String
					String result = EntityUtils.toString(entity);
					//System.out.println(result);
					stackOverflowResult.parseStringAsJSON(result, commonFunction.getSearchText());
				}
			}
			else
			{
				// Get HttpResponse Status
				System.out.println(response.getStatusLine().toString());
			}
		}

	}

}