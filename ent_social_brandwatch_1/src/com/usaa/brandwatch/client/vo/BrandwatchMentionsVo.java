package com.usaa.brandwatch.client.vo;

import java.util.List;

public class BrandwatchMentionsVo {
	private String resultsTotal;
	private String startDate;
	private String endDate;
	private String queryName;
	private String queryId;
	private String projectId;
	private String hadoopEnabled;
	private String membernumberEnabled;
	private String resultsPageSize;
	private String maxIdInResult;
	private List<ErrorVo> errors;
	private List<ResultsVo> results;

	public String getResultsTotal() {
		return resultsTotal;
	}

	public void setResultsTotal(String resultsTotal) {
		this.resultsTotal = resultsTotal;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getQueryName() {
		return queryName;
	}

	public void setQueryName(String queryName) {
		this.queryName = queryName;
	}

	public String getQueryId() {
		return queryId;
	}

	public void setQueryId(String queryId) {
		this.queryId = queryId;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getHadoopEnabled() {
		return hadoopEnabled;
	}

	public void setHadoopEnabled(String hadoopEnabled) {
		this.hadoopEnabled = hadoopEnabled;
	}

	public String getMembernumberEnabled() {
		return membernumberEnabled;
	}

	public void setMembernumberEnabled(String membernumberEnabled) {
		this.membernumberEnabled = membernumberEnabled;
	}

	public String getResultsPageSize() {
		return resultsPageSize;
	}

	public void setResultsPageSize(String resultsPageSize) {
		this.resultsPageSize = resultsPageSize;
	}

	public String getMaxIdInResult() {
		return maxIdInResult;
	}

	public void setMaxIdInResult(String maxIdInResult) {
		this.maxIdInResult = maxIdInResult;
	}

	public List<ErrorVo> getErrors() {
		return errors;
	}

	public void setErrors(List<ErrorVo> errors) {
		this.errors = errors;
	}

	public List<ResultsVo> getResults() {
		return results;
	}

	public void setResults(List<ResultsVo> results) {
		this.results = results;
	}

}
