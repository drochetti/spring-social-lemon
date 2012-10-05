package org.springframework.social.lemon.api;

import java.math.BigDecimal;

import org.codehaus.jackson.annotate.JsonProperty;

import lombok.Data;

/**
 * @author drochetti
 */
@Data
public class TaxInformation {

	@JsonProperty("tax_amount")
	private BigDecimal taxAmount;

	@JsonProperty("taxable_amount")
	private BigDecimal taxableAmount;

	@JsonProperty("tax_percentage_value")
	private BigDecimal taxPercentage;

	@JsonProperty("tax_description")
	private String description;

}
