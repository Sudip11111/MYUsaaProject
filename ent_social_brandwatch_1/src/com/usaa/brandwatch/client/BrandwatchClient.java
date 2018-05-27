package com.usaa.brandwatch.client;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.io.IOUtils;

import com.google.gson.Gson;
import com.usaa.brandwatch.client.constants.BrandwatchClientConstant;
import com.usaa.brandwatch.client.exception.BrandwatchClientException;
import com.usaa.brandwatch.client.util.BrandwatchClientUtil;
import com.usaa.brandwatch.client.vo.BrandwatchAuthVo;
import com.usaa.brandwatch.client.vo.BrandwatchMentionsVo;
import com.usaa.brandwatch.client.vo.QueryDataVo;

public class BrandwatchClient {
	private String gatewayUsername=null;
	private String gatewayPassword=null;;
	private static final Logger logger = Logger.getLogger(BrandwatchClient.class.getCanonicalName());
	//private static final String CLASS_NAME = null;
	private static final String CLASSNAME = null;
	//just fro commit


	public BrandwatchClient(String gatewayUsername, String gatewayPassword) {
		super();
		this.gatewayUsername = gatewayUsername;
		this.gatewayPassword = gatewayPassword;
	}

	/*
	 * method to return the gateay host-hard coded url
	 * 
	 */
	private String getBrandwatchAPIGatewayHost() throws Exception {
		UrlConstructorParam param = new UrlConstructorParam().builder
		.addAppname(BrandwatchClientConstant.BRANDWATCH_API_GATEWAY_HOST).build();

		String url = UrlConstructor.construct(param);

		// UrlConstructor and UrlConstructorParam is in there internal jar but
		// so just take it as way to buld url,they have methods there//

		return BrandwatchClientUtil.removeStickyParam(url);
		// removestickyparam is method in util class of project

	}
	// methiod to retreive auth token from brandwatch for making additional
	// calls

	/**
	 * @param bwApiUsername
	 * @param bwApipassword
	 * @return BrandwatchAuthVo= object containing the response data from Brandwatch
	 * @throws BrandwatchClientException
	 */
	public BrandwatchAuthVo getBrandwatchAuthVoToken(String bwApiUsername, String bwApipassword)
			throws BrandwatchClientException {
		Gson gson = new Gson();
		String methodName = "getBrandwatchoathtoken()";
		BrandwatchAuthVo brandwatchauthvo = new BrandwatchAuthVo();
		StringBuffer requestUrl = new StringBuffer(200);
		try {
			requestUrl.append(getBrandwatchAPIGatewayHost())
			        .append(BrandwatchClientConstant.BRANDWATCH_OATH_PATH)
					.append(BrandwatchClientConstant.QTN_MARK)
					.append(BrandwatchClientConstant.BRANDWATCH_USERNAME)
					.append(bwApiUsername)
					.append(BrandwatchClientConstant.Ampersand_symbol)
					.append(BrandwatchClientConstant.BRANDWATCH_PASSWORD)
					.append(bwApipassword)
					.append(BrandwatchClientConstant.Ampersand_symbol)
					.append(BrandwatchClientConstant.BRANDWATCH_GRANT_TYPE)
					.append(BrandwatchClientConstant.Ampersand_symbol)
					.append(BrandwatchClientConstant.BRANDWATCH_Client_ID);

			HttpClient httpclient = new HttpClient();
			GetMethod bwApiResponse = new GetMethod(requestUrl.toString());

			bwApiResponse.addRequestHeader("Authorization", "Basic"
					+ BrandwatchClientUtil.encode(gatewayUsername + BrandwatchClientConstant.Colon + gatewayPassword));

			int responsecode = httpclient.executeMethod(bwApiResponse);

			InputStream bwresponseStream = bwApiResponse.getResponseBodyAsStream();

			String brandwatchResponse = IOUtils.toString(bwresponseStream, BrandwatchClientConstant.UTF_Encoding);
			brandwatchauthvo = gson.fromJson(brandwatchResponse, BrandwatchAuthVo.class);

			if (responsecode == BrandwatchClientConstant.Success_code) {
				logger.logp(Level.FINEST, CLASSNAME, methodName, "Success in getAuthenticationToken()"
						+ " from BrandwaatchClient with Response" + brandwatchResponse);
			} else {
				

			}
		} catch (Exception e) {

		}
		return brandwatchauthvo;

	}

	/**
	 * 
	 * @param authToken
	 * @param QueryDataVo
	 * @param request =The request data for each request
	 * @param maskcontentflag=flag to hide PII(Personally Identifiable information DEtails
	 * @param BrandwatchMentionsVo=Object that contains data related to particular Brandwatch query
	 * throws BrandwatchClientException
	 */
	
	public BrandwatchMentionsVo getBrandwatchMentions
	(String authToken,QueryDataVo request,boolean maskcontentflag) throws BrandwatchClientException
	{
		String methodName="getBrandwatchNentions()";
		StringBuffer requestUrl=new StringBuffer(200);
		String response=null;
		BrandwatchMentionsVo responseObject=new BrandwatchMentionsVo();
		logger.logp(Level.FINEST,CLASSNAME, methodName,"Hye");
		
		logger.logp(Level.FINEST, CLASSNAME, methodName, "Calling getBrandwatchMentiion end point for query"
				+request.getQueryName()+ "with since Id:"+request.getSinceId());
		
		try{
			requestUrl.append(getBrandwatchAPIGatewayHost()).append(BrandwatchClientConstant.BRANDWATCH_OATH_PATH)
			.append(BrandwatchClientConstant.QTN_MARK)
			.append(BrandwatchClientConstant.BRANDWATCH_USERNAME)
			.append(bwApiUsername)
			.append(BrandwatchClientConstant.Ampersand_symbol)
			.append(BrandwatchClientConstant.BRANDWATCH_PASSWORD)
			.append(bwApipassword)
			.append(BrandwatchClientConstant.Ampersand_symbol)
			.append(BrandwatchClientConstant.BRANDWATCH_GRANT_TYPE)
			.append(BrandwatchClientConstant.Ampersand_symbol)
			.append(BrandwatchClientConstant.BRANDWATCH_Client_ID);

	HttpClient httpclient = new HttpClient();
	GetMethod bwApiResponse = new GetMethod(requestUrl.toString());

	bwApiResponse.addRequestHeader("Authorization", "Basic"
			+ BrandwatchClientUtil.encode(gatewayUsername + BrandwatchClientConstant.Colon + gatewayPassword));

	int responsecode = httpclient.executeMethod(bwApiResponse);

	InputStream bwresponseStream = bwApiResponse.getResponseBodyAsStream();

	String brandwatchResponse = IOUtils.toString(bwresponseStream, BrandwatchClientConstant.UTF_Encoding);
	 Gson gson=new Gson();
	 responseObject=gson.fromJson(brandwatchResponse, BrandwatchMentionsVo.class);
	 if(BrandwatchClientConstant.Success_code==responsecode){
		 logger.logp(Level.FINEST, CLASS_NAME, methodName,
	"Data Returns Successfully retreived from brandwatch mentions API Service\n\n" +response+ "\n\n");
		 if(maskcontentflag && responseObject.getResults().
		 {
			 responseObject.setResults(BrandwatchClientUtil.maskcontentflag(responseObject.getResults());
			 logger.logp(Level.FINEST, CLASS_NAME, methodName,
					 "result list size beforetwitter hydrates"+responseObject.getQueryName()+
					 ""+responseObject.getResults().size();
		 }			
		}
		
		
		
	
	
	}
}

}
