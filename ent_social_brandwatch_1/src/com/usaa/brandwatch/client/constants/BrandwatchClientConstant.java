package com.usaa.brandwatch.client.constants;

import java.util.regex.Pattern;

public class BrandwatchClientConstant {
	public static final String BRANDWATCH_API = "BrandwatchAPI";
	public static final String BRANDWATCH_API_QUERIES = "/queries";
	public static final String BRANDWATCH_QUERY = "query=";
	public static final String BRANDWATCH_API_Summary = "/summary";
	public static final String SMLISTEN_BRANDWATCH_API_ID = "EAEntBrandwatchClient";
	public static final String BRANDWATCH_MENTIONS_API = "MentionsAPI";
	public static final String BRANDWATCH_OATH_PATH = "/Oath/token";
	public static final String BRANDWATCH_PROJECT_PATH = "/projects";
	public static final String BRANDWATCH_MENTIONS_PATH = "/data/mentions";
	public static final String BRANDWATCH_USERNAME = "username=";
	public static final String BRANDWATCH_PASSWORD = "password=";
	public static final String BRANDWATCH_Client_ID = "Client_id=brandwatch_api_client";
	public static final String BRANDWATCH_GRANT_TYPE = "grant_type=api_password";
	public static final String BRANDWATCH_QUERY_ID = "queryId=";
	public static final String BRANDWATCH_access_token = "access_token=";
	public static final String BRANDWATCH_START_DATE = "startDate=";
	public static final String BRANDWATCH_END_DATE = "endDate=";
	public static final String BRANDWATCH_ORDER_DIR = "orderDirection=";
	public static final String BRANDWATCH_ORDER_BY = "orderBy=";
	public static final String BRANDWATCH_Since_ID = "sinceId=";
	public static final String BRANDWATCH_Page_Size = "pagesize=";
	public static final String BRANDWATCH_Page_Type = "pageType=";
	public static final String BRANDWATCH_API_GATEWAY_HOST = "BrandwatchAPI_BatchGateway";

	public static final String BRANDWATCH_QUERIES = "queries";
	public static final String BRANDWATCH_QUERY_SUMMARY = "summary";
	public static final String BRANDWATCH_SUMMARY_TYPE = "summaryandtype=";
	public static final String BRANDWATCH_QUERY_VALIDATION = "query-validation";
	public static final String BRANDWATCH_LANGUAGE = "language=en";
	public static final String BRANDWATCH_QUERY_TYPE = "type";
	public static final String BRANDWATCH_SEARCH_TYPE = "search string";
	public static final String BRANDWATCH_LANGUAGEAGNOSTIC = "languageagnostic";
	public static final String BRANDWATCH_LAN_AGN = "false";
	public static final String BRANDWATCH_SAMPLE_PER_RES = "100";
	public static final String BRANDWATCH_LANGUAGES = "languages";
	public static final String BRANDWATCH_DESCRIPTION = "description";
	public static final String BRANDWATCH_INDUSTRY = "industry";
	public static final String BRANDWATCH_GENERAL = "general-(recommended)";
	public static final String BRANDWATCH_QUERY_GROPUS = "querygroups";

	// twitterConstants
	public static final String Twitter = "twitter";
	public static final String Tw_lookup_API_limit = "100";

	// HttpCode
	public static final int Success_code = 200;
	public static final int Bad_Request = 400;
	public static final int Unauthorized = 401;
	public static final int Forbidden = 403;
	public static final int Internal_Server_Error = 500;

	// twitterErrrCode
	public static final int Twitter_Api_error_code = 130;
	public static final int Twitter_too_many_request = 429;
	public static final int Twitter_File_not_Found = 404;
	public static final int Twitter_Forbidden = 403;
	public static final int Unknown_code = 180;

	public static final String method_expn_msg = "Exceptionin method=";

	public static final String Http_Get = "GET";
	public static final String Http_Post = "POST";

	public static final int Zero_start_index = 0;
	public static final int Single_count = 1;
	public static final int mounce_Bytes = 130;
	public static final int mounce_charles = 32;
	public static final long Thousandssec = 1000l;

	// charactersConstants
	public static final String QTN_MARK = "?";
	public static final String Colon = ":";
	public static final String Ampersand_symbol = "&";
	public static final String Quotes = "\"";
	public static final String Commas_Esc = "\",";
	public static final String Equery = "=";
	public static final String Slash_separator = "/";
	public static final String Encrpted_whitespace_char = "%.20";
	public static final String UTF_Encoding = "UTF-8";
	// public static final String non_printable_char=
	// "[^\\xoo\\xoA\\xoD\x20-\\x7E\\x7f]";

	// STRING PATTERN TO SERACH FOR IN ORDER TO APPLY MASK
	public static final Pattern[] MASKED_PATTERNS=new Pattern[]{
			Pattern.compile("cvv?[0-9]{1,4}",Pattern.CASE_INSENSITIVE),
			Pattern.compile("ext?[0-9]{1,4}",Pattern.CASE_INSENSITIVE),
			Pattern.compile("[-\\d.)(1][-\\d.)(1]{3,28}[-\\d.)(/]",Pattern.CASE_INSENSITIVE),
			
	};
	

}
