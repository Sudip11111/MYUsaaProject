package com.usaa.brandwatch.client.vo;

import java.util.Arrays;

public class QueryValidationResponseVo {
	
	String query;
	String[] language;
	String[] errors;
	String[] issues;
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public String[] getLanguage() {
		return language;
	}
	public void setLanguage(String[] language) {
		this.language = language;
	}
	public String[] getErrors() {
		return errors;
	}
	public void setErrors(String[] errors) {
		this.errors = errors;
	}
	public String[] getIssues() {
		return issues;
	}
	public void setIssues(String[] issues) {
		this.issues = issues;
	}
	@Override
	public String toString() {
		return "QueryValidationResponseVo [query=" + query + ", language=" + Arrays.toString(language) + ", errors="
				+ Arrays.toString(errors) + ", issues=" + Arrays.toString(issues) + "]";
	}
	
	

	
	

}
