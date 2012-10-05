package org.springframework.social.lemon.api;

import org.codehaus.jackson.annotate.JsonProperty;

import lombok.Data;

/**
 * @author drochetti
 * @since 1.0
 */
@Data
public class AddOn {

	@JsonProperty("addOn_access_token")
	private String accessToken;

}
