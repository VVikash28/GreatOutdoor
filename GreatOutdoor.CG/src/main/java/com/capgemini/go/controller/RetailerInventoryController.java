package com.capgemini.go.controller;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.go.bean.RetailerInventoryBean;
import com.capgemini.go.service.RetailInventoryServiceImpl;
import com.capgemini.go.service.RetailerInventoryService;

public class RetailerInventoryController {

	public static RetailInventoryServiceImpl retailerInventoryService=new RetailInventoryServiceImpl();

		
	public static List<RetailerInventoryBean> getShelfTimeReport (int reportType,String retailerId) throws RetailerInventoryException {
		List<RetailerInventoryBean> result = new ArrayList<RetailerInventoryBean>();
		switch (reportType) {
			case 1: {
				result = retailerInventoryService.getMonthlyShelfTimeReport(retailerId);
				break;
			}
			case 2: {
				result = retailerInventoryService.getQuarterlyShelfTimeReport(retailerId);
				break;
			}
			case 3: {
				result = retailerInventoryService.getYearlyShelfTimeReport(retailerId);
				break;
			}
			default: {
				System.out.println("Invalid Argument recieved");
			}
		}
		if (result == null) {
			System.out.println("Data could not obtained");
		}
		return result;
	}
	public static List<RetailerInventoryBean> getDeliveryTimeReport (int reportType,String retailerId,String productCategoryName,int productCategoryNumber) throws RetailerInventoryException {
		List<RetailerInventoryBean> result = new ArrayList<RetailerInventoryBean>();
		switch(reportType)
		{
//			case 1: {
//				result = retailerInventoryService.getOutlierCategoryItemWiseDeliveryTimeReport(retailerId,productCategory);
//				break;
//			}
			case 2: {
				result = retailerInventoryService.getItemWiseDeliverytimeReport(retailerId,productCategoryName);
				break;
			}
			case 3: {
				result = retailerInventoryService.getCategoryWiseDeliveryTimeReport(retailerId,productCategoryNumber);
				break;
			}
			default: {
				System.out.println("Invalid Argument recieved");
			}
		}
		if (result == null) {
			System.out.println("Data could not obtained");
		}
		return result;
	}
	
	
}
