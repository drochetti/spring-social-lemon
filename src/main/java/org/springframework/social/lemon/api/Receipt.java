package org.springframework.social.lemon.api;

import java.util.Date;
import java.util.List;

import lombok.Data;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author drochetti
 */
@Data
public class Receipt {

	@JsonProperty("lemon_tracking_id")
	private String lemonTrackingId;

	@JsonProperty("vendor_tracking_id")
	private String vendorTrackingId;

	@JsonProperty("receipt_status")
	private String status;

	@JsonProperty("receipt_image_URL")
	private String imageUrl;

	@JsonProperty("currency_ISO3")
	private String currency;

	private Date date;

	@JsonProperty("line_items")
	private List<ReceiptLineItem> lineItems;

	@JsonProperty("payment_information")
	private List<PaymentInformation> paymentInformation;

	@JsonProperty("tax_information")
	private List<TaxInformation> taxInformation;

}
