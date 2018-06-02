package com.usaa.brandwatch.client;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.io.IOUtils;

import com.google.gson.Gson;
import com.usaa.brandwatch.client.constants.BrandwatchClientConstant;
import com.usaa.brandwatch.client.util.BrandwatchClientUtil;

public class BWHandler {
	private String gatewayUsername;
	private String gatewayPassword;
	
	public BWHandler(String gatewayUsername, String gatewayPassword) {
		super();
		this.gatewayUsername = gatewayUsername;
		this.gatewayPassword = gatewayPassword;
	}
	
	
	//use a url and Gson to cast a response from a given BWApi call to expected object
	//return generic object to be casted into propervo
	public Object getMethodFromURL(StringBuilder requestUrl,String authtoken,Class c) throws HttpException,IOException{
		HttpClient httpclient = new HttpClient();
		GetMethod bwApiResponse = new GetMethod(requestUrl.toString());

		bwApiResponse.addRequestHeader("Authorization", "Basic"
				+ BrandwatchClientUtil.encode(gatewayUsername + BrandwatchClientConstant.Colon + gatewayPassword));

		int responsecode = httpclient.executeMethod(bwApiResponse);

		InputStream bwresponseStream = bwApiResponse.getResponseBodyAsStream();

		String brandwatchResponse = IOUtils.toString(bwresponseStream, BrandwatchClientConstant.UTF_Encoding);
		
		Gson gson=new Gson();
		return gson.fromJson(brandwatchResponse, c);
	}

}
