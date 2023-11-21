package com.verinon.output;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class PostOfficeResponseBean {
	@JsonProperty("Message")
	private String message;
	@JsonProperty("Status")
	private String status;
	@JsonProperty("PostOffice")
	private List<PostOfficeDetailsBean> postOffice;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<PostOfficeDetailsBean> getPostOffice() {
		return postOffice;
	}

	public void setPostOffice(List<PostOfficeDetailsBean> postOffice) {
		this.postOffice = postOffice;
	}

}
