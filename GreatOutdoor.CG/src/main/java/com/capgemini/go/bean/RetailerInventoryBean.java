package com.capgemini.go.bean;

import java.time.Period;

public class RetailerInventoryBean {

private String retailerId;
private String retailerName;
private int ProductCategoryNumber;
private String ProductCategoryName;
private String ProductName;
private String ProductUniqueId;
public Period deliveryTimePeriod;
private Period ShelfTimePeriod;
/**
 * @return the retailerId
 */
public String getRetailerId() {
	return retailerId;
}
public RetailerInventoryBean() {
	
}
public RetailerInventoryBean(String retailerId, String retailerName, int ProductCategoryNumber,
		String productCategoryName, String productName, String productUniqueId, Period deliveryTimePeriod,
		Period shelfTimePeriod) {
	this.retailerId = retailerId;
	this.retailerName = retailerName;
	ProductCategoryNumber = this.ProductCategoryNumber;
	this.ProductCategoryName = productCategoryName;
	this.ProductName = productName;
	this.ProductUniqueId = productUniqueId;
	this.deliveryTimePeriod = deliveryTimePeriod;
	this.ShelfTimePeriod = shelfTimePeriod;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "\nRetailerInventoryBean [retailerId=" + retailerId + ", retailerName=" + retailerName
			+ ", ProductCategoryNumber=" + ProductCategoryNumber + ", ProductCategoryName=" + ProductCategoryName
			+ ", ProductName=" + ProductName + ", ProductUniqueId=" + ProductUniqueId + ", deliveryTimePeriod="
			+ deliveryTimePeriod + ", ShelfTimePeriod=" + ShelfTimePeriod + "]";
}

/**
 * @param retailerId the retailerId to set
 */
public void setRetailerId(String retailerId) {
	this.retailerId = retailerId;
}
/**
 * @return the retailerName
 */
public String getRetailerName() {
	return retailerName;
}
/**
 * @param retailerName the retailerName to set
 */
public void setRetailerName(String retailerName) {
	this.retailerName = retailerName;
}
/**
 * @return the productCategoryNumber
 */
public int getProductCategoryNumber() {
	return ProductCategoryNumber;
}
/**
 * @param productCategoryNumber the productCategoryNumber to set
 */
public void setProductCategoryNumber(byte productCategoryNumber) {
	ProductCategoryNumber = productCategoryNumber;
}

public String getProductCategoryName() {
	return ProductCategoryName;
}
/**
 * @param productCategoryName the productCategoryName to set
 */
public void setProductCategoryName(String productCategoryName) {
	ProductCategoryName = productCategoryName;
}
/**
 * @return the productName
 */
public String getProductName() {
	return ProductName;
}
/**
 * @param productName the productName to set
 */
public void setProductName(String productName) {
	ProductName = productName;
}
/**
 * @return the productUniqueId
 */
public String getProductUniqueId() {
	return ProductUniqueId;
}
/**
 * @param productUniqueId the productUniqueId to set
 */
public void setProductUniqueId(String productUniqueId) {
	ProductUniqueId = productUniqueId;
}
/**
 * @return the deliveryTimePeriod
 */
public Period getDeliveryTimePeriod() {
	return deliveryTimePeriod;
}
/**
 * @param deliveryTimePeriod the deliveryTimePeriod to set
 */
public void setDeliveryTimePeriod(Period deliveryTimePeriod) {
	this.deliveryTimePeriod = deliveryTimePeriod;
}
/**
 * @return the shelfTimePeriod
 */
public Period getShelfTimePeriod() {
	return ShelfTimePeriod;
}
/**
 * @param shelfTimePeriod the shelfTimePeriod to set
 */
public void setShelfTimePeriod(Period shelfTimePeriod) {
	ShelfTimePeriod = shelfTimePeriod;
}

}
