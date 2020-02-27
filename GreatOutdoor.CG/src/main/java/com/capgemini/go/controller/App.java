package com.capgemini.go.controller;

import java.util.List; 
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.capgemini.go.bean.RetailerInventoryBean;
import com.capgemini.go.dao.RetailInventoryDaoImpl;
import com.capgemini.go.exception.DateInvalidException;
import com.capgemini.go.exception.IDValidator;
import com.capgemini.go.exception.InvalidIDException;
//import com.capgemini.go.exception.RetailerInventoryException;
import com.capgemini.go.utility.DateValidator;

public class App {

	private static Logger logger=Logger.getLogger(App.class);
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the retailer id 2 alpha, 2 numeric: ");
		String retId=sc.nextLine();
		
		if(!IDValidator.validateID(retId)){
			try {
				throw new InvalidIDException("Invalid ID format");
			} catch (InvalidIDException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Enter the date MM/dd/yyyy: ");
		String date=sc.next();
		
		if(!DateValidator.validateJavaDate(date)){
			try {
				throw new DateInvalidException("Invalid Date");
			} catch (DateInvalidException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Enter report type \n1. Monthly\n2. Quarterly\n3. Yearly");
		int reportType=sc.nextInt();
		try {
			System.out.println(RetailerInventoryController.getShelfTimeReport(reportType,retId));
		} catch (RetailerInventoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter report type \n1. Outlier\n2. Item\n3. Category");
		int reportType1=sc.nextInt();
		try {
			System.out.println("enter the Product Name: ");
			String ProductName=sc.next();
			System.out.println("enter the Product Number: ");
			int ProductNumber=sc.nextInt();
			System.out.println(RetailerInventoryController.getDeliveryTimeReport(reportType1,retId,ProductName,ProductNumber));
		} catch (RetailerInventoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("Details: "+retId+" "+date);
	}

}
