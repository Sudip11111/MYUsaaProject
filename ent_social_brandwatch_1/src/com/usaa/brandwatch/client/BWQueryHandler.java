package com.usaa.brandwatch.client;

import java.util.Arrays;
import java.util.logging.Logger;

import com.usaa.brandwatch.client.constants.BrandwatchClientConstant;
import com.usaa.brandwatch.client.exception.BrandwatchClientException;
import com.usaa.brandwatch.client.vo.QueryValidationResponseVo;

public class BWQueryHandler extends BWHandler{

	public BWQueryHandler(String gatewayUsername, String gatewayPassword) {
		super(gatewayUsername, gatewayPassword);
		// TODO Auto-generated constructor stub
	}
	
	private static final Logger logger = Logger.getLogger(BrandwatchClient.class.getCanonicalName());
	private static final String CALSS_NAME = "BWQueryHandler";
	
	
	//call B/W api /queryValidation
	//uses function from method calss BWHandler
	
	
/**
 * @param authtoken authenticationtoken
 *@param query Query to validate
 *@param gatewayHost GatewayUrl
 *@return
 *@throws BrandwatchClientException
 */
public QueryValidationResponseVo validateQuery(String authtoken,String query,String gatewayHost) throws BrandwatchClientException{
	String methodName="validateQuey(authToken,query)";
	StringBuilder requestUrl=new StringBuilder(200);
	String response=null;
	gatewayHost = "";
	QueryValidationResponseVo responseObject=new QueryValidationResponseVo();
	try{
		requestUrl.append(gatewayHost)
		.append(BrandwatchClientConstant.BRANDWATCH_QUERY_VALIDATION)
		.append(BrandwatchClientConstant.Ampersand_symbol)
		.append(BrandwatchClientConstant.BRANDWATCH_QUERY)
		.append(query)
		.append(BrandwatchClientConstant.Ampersand_symbol)
		.append(BrandwatchClientConstant.BRANDWATCH_LANGUAGE);
		
		
		//cast the resposne from generic "responsefromurl" to more specific responsevo
		responseObject=(QueryValidationResponseVo)getMethodFromURL(requestUrl,authtoken,QueryValidationResponseVo.class);
		
	}
	catch(Exception e){
		throw new BrandwatchClientException(500,e.getMessage());	
	}
	if(responseObject.getIssues().length!=0){
		throw new BrandwatchClientException(400,Arrays.toString(responseObject.getIssues()));
	}else if(responseObject.getErrors().length!=0)
	{
		throw new BrandwatchClientException(400,Arrays.toString(responseObject.getErrors()));
	}
	return responseObject;
		
}

}
