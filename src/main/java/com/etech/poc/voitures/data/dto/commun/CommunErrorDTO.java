package com.etech.poc.voitures.data.dto.commun;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author a.safidy
 */

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class CommunErrorDTO extends BaseDTO {
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private boolean isError = false;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private boolean isInfo = false;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private boolean isWarning = false;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String uuid;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String errorCode = null;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String errorMessage = null;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String message = null;

	public CommunErrorDTO() {
		super();
	}

	public CommunErrorDTO(boolean isError, String errorCode, String errorMessage, String message) {
		super();
		this.isError = isError;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.message = message;
	}

	public CommunErrorDTO(boolean isError, boolean isInfo, boolean isWarning, String errorCode, String errorMessage, String message, String uuid) {
		super();
		this.isError = isError;
		this.isInfo = isInfo;
		this.isWarning = isWarning;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.message = message;
		this.uuid = uuid;
	}

	public CommunErrorDTO(String uuid, String errorMessage, String message) {
		this.uuid = uuid;
		this.errorMessage = errorMessage;
		this.message = message;
	}

	public boolean isError() {
		return isError;
	}

	public void setError(boolean error) {
		isError = error;
	}

	public boolean isInfo() {
		return isInfo;
	}

	public void setInfo(boolean info) {
		isInfo = info;
	}

	public boolean isWarning() {
		return isWarning;
	}

	public void setWarning(boolean warning) {
		isWarning = warning;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
}
