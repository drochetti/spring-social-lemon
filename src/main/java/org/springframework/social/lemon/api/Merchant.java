package org.springframework.social.lemon.api;

import org.codehaus.jackson.annotate.JsonProperty;

import lombok.Data;

/**
 * @author drochetti
 */
@Data
public class Merchant {

	@JsonProperty("id_merchant")
	private String id;

	private String name;

	@JsonProperty("id_main_category")
	private String mainCategoryId;

	@JsonProperty("id_sub_category")
	private String subCategoryId;

}
