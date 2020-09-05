package com.rakesh.driver;

import com.rakesh.adapter.StackOverFlowResult;
import com.rakesh.utils.CommonFunctions;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * 
 * @author rakkumar
 *
 */
public class StackOverflowSearch {

	private final String baseStackOverflowApiUrl = "https://api.stackexchange.com/2.2/search?order=desc&sort=activity&site=stackoverflow&";
	private final OkHttpClient httpClient = new OkHttpClient();

	private final CommonFunctions commonFunction = new CommonFunctions();
	private final StackOverFlowResult stackOverflowResult = new StackOverFlowResult();

	/**
	 * Fire HttpGet request
	 */
	void sendGet() throws Exception{

		Request request = new Request.Builder().url(baseStackOverflowApiUrl.concat(commonFunction.getUrlIntitle())).build();

		httpClient.newCall(request).enqueue(new Callback() {
			@Override
			public void onFailure(Call call, IOException e) {
				e.printStackTrace();
			}

			@Override
			public void onResponse(Call call, final Response response) throws IOException {
				if (!response.isSuccessful()) {
					throw new IOException("Unexpected code " + response.code());
				} else {
					// do something with the result
					try {
						stackOverflowResult.parseStringAsJSON(response.body().string(), commonFunction.getSearchText());
					}  catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//System.out.println(response.body().string());

				}
			}

		});

	}
}
