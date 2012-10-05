package org.springframework.social.lemon.api;

import java.math.BigDecimal;

import lombok.Data;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author drochetti
 */
@Data
public class ReceiptLineItem {

	@JsonProperty("SKU")
	private String sku;

	@JsonProperty("UPC")
	private String upc;

	@JsonProperty("product_category_id")
	private String productCategoryId;

	private String description;

	@JsonProperty("department_SIC_code")
	private String departmentSIC;

	@JsonProperty("category_SIC_code")
	private String categorySIC;

	private BigDecimal discount;

	@JsonProperty("qty")
	private Integer quantity;

	@JsonProperty("line_total")
	private BigDecimal lineTotal;

	@JsonProperty("unit_price")
	private BigDecimal unitPrice;

	@JsonProperty("line_tax_amount")
	private BigDecimal taxAmount;

}
