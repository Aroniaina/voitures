package com.etech.poc.voitures.data.dto.commun;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author a.safidy
 */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public abstract class BaseDTO {
	private CommunErrorDTO responseInfo;

	public BaseDTO() {
		super();
	}

	public BaseDTO(boolean isError, String errorCode, String errorMessage, String message) {
		super();
		responseInfo = new CommunErrorDTO(isError, errorCode, errorMessage, message);
	}

	public BaseDTO(boolean isError, boolean isInfo, boolean isWarning, String errorCode, String errorMessage, String message, String uuid) {
		super();
		responseInfo = new CommunErrorDTO(isError, isInfo, isWarning, errorCode, errorMessage, message, uuid);
	}

	public BaseDTO(String uuid, String errorMessage, String message) {
		responseInfo = new CommunErrorDTO(uuid, errorMessage, message);
	}
	
	public CommunErrorDTO getResponseInfo() {
		return responseInfo;
	}

	public void setResponseInfo(CommunErrorDTO responseInfo) {
		this.responseInfo = responseInfo;
	}
	
}
