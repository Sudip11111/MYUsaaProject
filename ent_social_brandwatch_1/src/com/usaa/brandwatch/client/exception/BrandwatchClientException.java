package com.usaa.brandwatch.client.exception;

public class BrandwatchClientException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int responsecode=200;
	private String responseMessage=null;
	private Throwable throwobj=null;
	
	public int getResponsecode() {
		return responsecode;
	}
	public void setResponsecode(int responsecode) {
		this.responsecode = responsecode;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public Throwable getThrowobj() {
		return throwobj;
	}
	public void setThrowobj(Throwable throwobj) {
		this.throwobj = throwobj;
	}
	public BrandwatchClientException(int status,String response){
		responsecode=status;
		responseMessage=response;
	}
	public BrandwatchClientException(int status,String addlMsg,Throwable exp){
		responsecode=status;
		responseMessage=addlMsg;
		throwobj=exp;
	}
	
	public BrandwatchClientException(String message){
		super(message);
	}
	public String str(){
		StringBuffer msgbuffer=new StringBuffer(200);
				msgbuffer.append("BranwatchClientException with code:");
				msgbuffer.append(responsecode);
			//	msgbuffer.append(message);
				msgbuffer.append(responseMessage);
				
				if(null!=throwobj){
					msgbuffer.append(",expmsg:");
					msgbuffer.append(throwobj.getMessage());
				}
				return responseMessage.toString();
				
				
				
				
		
	}
	
	
	
	
	
	
}
