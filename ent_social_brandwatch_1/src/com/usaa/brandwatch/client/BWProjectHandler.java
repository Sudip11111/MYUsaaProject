package com.usaa.brandwatch.client;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.ws.soap.AddressingFeature.Responses;

import org.apache.commons.lang3.StringUtils;

import com.usaa.batch.adhocPbl.dataobjects.SocialAdhocPblDataObject;
import com.usaa.brandwatch.client.constants.BrandwatchClientConstant;
import com.usaa.brandwatch.client.exception.BrandwatchClientException;
import com.usaa.brandwatch.client.vo.BWProjectIdVo;


public class BWProjectHandler extends BWHandler {

	private static final String CALSS_NAME = "BWProjectHandler";
	private static final Logger logger = Logger.getLogger(BWProjectHandler.class.getCanonicalName());
	
	

	public BWProjectHandler(String gatewayUsername, String gatewayPassword) {

		super(gatewayUsername, gatewayPassword);
		// TODO Auto-generated constructor stub
	}

	public BWProjectIdVo validateProjectId(String id,String authtoken, String gatewayHost)
			throws BrandwatchClientException {
		
		String methodName = "validateProjectId()";
		StringBuilder requestUrl = new StringBuilder(200);
		BWProjectIdVo responseObject = new BWProjectIdVo();
		logger.logp(Level.INFO, CALSS_NAME, methodName, "Failure in validateProjectId()");
		try {
			requestUrl.append(gatewayHost)
			           .append(BrandwatchClientConstant.BRANDWATCH_PROJECT_PATH)
					   .append(BrandwatchClientConstant.Slash_separator)
					   .append(id)
					   .append(authtoken);

			// cast the resposne from generic "responsefromurl" to more specific
			// responsevo
			responseObject = (BWProjectIdVo)getMethodFromURL(requestUrl, authtoken, BWProjectIdVo.class);
			
			
			
			if(StringUtils.isEmpty(responseObject.toString()))
			{
				logger.logp(Level.INFO, CALSS_NAME, methodName, "Failure in validateProjectId()"
						+ " from BrandwaatchClient with Response" + responseObject.getId());
				throw new BrandwatchClientException("ValidationOfProjectId Fail");
			}else{
				return responseObject;
			}
					
		}catch(Exception e){
			logger.logp(Level.INFO, CALSS_NAME, methodName, "Failure in validateProjectId()"
					+ " Exception in BrandwatchResponse" + responseObject.getId());	
			throw new BrandwatchClientException(500,e.getMessage());	
		}
		


		
	

	}
}


@Test

public BWProjectId validateProjectId(String id,String authToken) throws BrandwatchClientException


