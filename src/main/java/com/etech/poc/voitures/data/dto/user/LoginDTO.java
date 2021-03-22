package com.etech.poc.voitures.data.dto.user;

import com.etech.poc.voitures.data.dto.commun.BaseDTO;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author a.safidy
 */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class LoginDTO extends BaseDTO {

	public LoginDTO(String token) {
		this.token = token;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
