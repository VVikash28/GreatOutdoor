package com.capgemini.go.dto;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class RetailerInventoryDTO {
	public String retailerId;
	public int productCategory;
	public String productId;
	public String productUniqueId;
	public LocalDate productDispatchTimestamp;
	public LocalDate productRecieveTimestamp;
	public LocalDate productSaleTimestamp;

	@Override
	public String toString() {
		return "RetailerInventoryDTO [retailerId=" + retailerId + ", productCategory=" + productCategory
				+ ", ProductId=" + productId + ", productUniqueId=" + productUniqueId + ", productDispatchTimestamp="
				+ productDispatchTimestamp + ", productRecieveTimestamp=" + productRecieveTimestamp
				+ ", productSaleTimestamp=" + productSaleTimestamp + "]";
	}

	public RetailerInventoryDTO() {
	}

	public RetailerInventoryDTO(String retailerId, int productCategory, String productId, String productUniqueId,
			LocalDate productDispatchTimestamp, LocalDate productRecieveTimestamp, LocalDate productSaleTimestamp) {
		super();
		this.retailerId = retailerId;
		this.productCategory = productCategory;
		this.productId = productId;
		this.productUniqueId = productUniqueId;
		this.productDispatchTimestamp = productDispatchTimestamp;
		this.productRecieveTimestamp = productRecieveTimestamp;
		this.productSaleTimestamp = productSaleTimestamp;
	}

	public String getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(String retailerId) {
		this.retailerId = retailerId;
	}

	public int getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(int productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductUniqueId() {
		return productUniqueId;
	}

	public void setProductUniqueId(String productUniqueId) {
		this.productUniqueId = productUniqueId;
	}

	public LocalDate getProductDispatchTimestamp() {
		return productDispatchTimestamp;
	}

	public void setProductDispatchTimestamp(LocalDate productDispatchTimestamp) {
		this.productDispatchTimestamp = productDispatchTimestamp;
	}

	public LocalDate getProductRecieveTimestamp() {
		return productRecieveTimestamp;
	}

	public void setProductRecieveTimestamp(LocalDate productRecieveTimestamp) {
		this.productRecieveTimestamp = productRecieveTimestamp;
	}

	public LocalDate getProductSaleTimestamp() {
		return productSaleTimestamp;
	}

	public void setProductSaleTimestamp(LocalDate productSaleTimestamp) {
		this.productSaleTimestamp = productSaleTimestamp;
	}
}
