package com.usaa.brandwatch.client.vo;

public class BWProjectIdVo {
	String id;
    String name;
    String description;
    String billableClientId;
    String billableClientName;
    String timezone;
    String billableClientIsPitch;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBillableClientId() {
		return billableClientId;
	}
	public void setBillableClientId(String billableClientId) {
		this.billableClientId = billableClientId;
	}
	public String getBillableClientName() {
		return billableClientName;
	}
	public void setBillableClientName(String billableClientName) {
		this.billableClientName = billableClientName;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getBillableClientIsPitch() {
		return billableClientIsPitch;
	}
	public void setBillableClientIsPitch(String billableClientIsPitch) {
		this.billableClientIsPitch = billableClientIsPitch;
	}
	@Override
	public String toString() {
		return "BWProjectIdVo [id=" + id + ", name=" + name + ", description=" + description + ", billableClientId="
				+ billableClientId + ", billableClientName=" + billableClientName + ", timezone=" + timezone
				+ ", billableClientIsPitch=" + billableClientIsPitch + "]";
	}
    
    
	

}
