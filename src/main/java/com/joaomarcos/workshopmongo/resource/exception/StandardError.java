package com.joaomarcos.workshopmongo.resource.exception;

import java.io.Serializable;

public class StandardError implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long timestamp;
	private Integer status;
	private String error;
	private String messege;
	private String path;
	
	public StandardError() {
		
	}

	public StandardError(Long timestamp, Integer status, String error, String messege, String path) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
		this.messege = messege;
		this.path = path;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public String getError() {
		return error;
	}

	public String getMessege() {
		return messege;
	}

	public String getPath() {
		return path;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setError(String error) {
		this.error = error;
	}

	public void setMessege(String messege) {
		this.messege = messege;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
	
	
	

}
