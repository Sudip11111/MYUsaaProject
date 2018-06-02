package com.usaa.brandwatch.client.util;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

import com.thoughtworks.xstream.core.util.Base64Encoder;
import com.usaa.brandwatch.client.constants.BrandwatchClientConstant;
import com.usaa.brandwatch.client.vo.ResultsVo;

public class BrandwatchClientUtil {
	private static final String CLASS_NAME = null;
	private static String applicationId = "";
	private static Logger logger = Logger.getLogger(BrandwatchClientUtil.class.getCanonicalName());

	// method to set uo application id for applicationused
	/**
	 * 
	 * @param applicationId
	 * @return
	 */
	public static void setApplicationId(String applicationId) {
		BrandwatchClientUtil.applicationId = applicationId;
	}

	// method to get application id for applicationused
	/**
	 * 
	 * 
	 * @return String
	 */
	public static String getApplicationId() {

		if (isNullorEmpty(applicationId)) {
			BrandwatchClientUtil.applicationId = BrandwatchClientConstant.SMLISTEN_BRANDWATCH_API_ID;
		}
		return applicationId;
	}

	public static boolean isNullorEmpty(String str) {
		boolean isNullorEmpty = false;
		if (StringUtils.isBlank(str)) {
			isNullorEmpty = true;
		}
		return isNullorEmpty;
	}

	public static String encode(String value) {
		String result = "";
		if (!StringUtils.isBlank(value)) {
			Base64Encoder encoder = new Base64Encoder();
			result = encoder.encode(value.getBytes());

		}
		return result;

	}

	public static String encodeurl(String url) {
		String methodname = "encodeUrl()";
		String encodeUrl = StringUtils.EMPTY;
		try {
			encodeUrl = URLEncoder.encode(url, BrandwatchClientConstant.UTF_Encoding).replace("+",
					BrandwatchClientConstant.Encrpted_whitespace_char);
		} catch (Exception e) {
			logger.logp(Level.FINEST, CLASS_NAME, methodname, "Error encoding the url for value:" + url, e);

		}
		return encodeUrl;

	}
	public static String sanitizeOutgoingContent(String input) {
		String methidName = "sanitizeOutgoingContent()";
		String output=StringUtils.EMPTY;
		if (isNullorEmpty(input))
		{
			return StringUtils.EMPTY;
		}
		Output=StringEscapeUtils.escapeHtml3(StripXSSChars(replace))
		

		
	
	
	
	
	
	
	

	public static String removeStickyParam(String hostUrl) {
		String hostUrlVal = hostUrl;
		if (hostUrlVal.contains(BrandwatchClientConstant.QTN_MARK)) {
			int index = hostUrlVal.indexOf(BrandwatchClientConstant.QTN_MARK);
			if (-1 != index) {
				hostUrlVal = hostUrlVal.substring(0, index);
			}
		}
		return hostUrlVal;

	}
	
	public static List<ResultsVo> masksenSitiveContent(List<ResultsVo> responseObject){
		List<ResultsVo> maskedResults=new ArrayList<ResultsVo>();
		for(ResultsVo resultvo:responseObject){
			String replaceEntry="";
			String maskedStr=resultvo.getSnippet();
			if(!StringUtils.isBlank(maskedStr)){
				for(int count=0;count<(BrandwatchClientConstant.MASKED_PATTERNS).length;count++){
					
					Pattern scriptpattern=BrandwatchClientConstant.MASKED_PATTERNS[count];
					
					switch(count){
					case 0:
					replaceEntry="cvv *";
					break;
					case 1:
					replaceEntry="ext *";
					break;
					default:
					replaceEntry="*";
					break;
					}
					maskedStr=scriptpattern.matcher(maskedStr).replaceAll(replaceEntry);
				}
				
				resultvo.setFullname(BrandwatchClientUtil.S(resultvo.getFullname());
				resultvo.setFullname(BrandwatchClientUtil.S(resultvo.getAuthor());
				resultvo.setFullname(BrandwatchClientUtil.S(resultvo.getTitle());
				resultvo.setFullname(BrandwatchClientUtil.S(resultvo.getFullname()));
				
				
				
					
					}
					
					
					
					
		
		return responseObject;
		
	}
public static String stripXSSChars(String value){
	String newValue=null;
	if(value!=null)
	{
		newValue=value.replaceAll("\0", "");
		//for(int count=0;count<(BrandwatchClientConstant.XSS))
	}

		
		
		
	

	}}
