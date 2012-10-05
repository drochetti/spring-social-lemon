package org.springframework.social.lemon.api;

import java.math.BigDecimal;

import lombok.Data;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author drochetti
 */
@Data
public class PaymentInformation {

    @JsonProperty("creditcard_name")
    private String creditcardName;

	@JsonProperty("creditcard_number")
	private String creditcardNumber;

	@JsonProperty("payment_method")
	private String paymentMethod;

	@JsonProperty("paid_amount")
	private BigDecimal paidAmount;

}
