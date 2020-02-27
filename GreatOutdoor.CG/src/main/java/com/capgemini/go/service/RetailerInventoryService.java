package com.capgemini.go.service;

import java.util.Calendar;
import java.util.List;

import com.capgemini.go.bean.RetailerInventoryBean;

public interface RetailerInventoryService {

	List<RetailerInventoryBean> getMonthlyShelfTimeReport(String retailerId);

	List<RetailerInventoryBean> getQuarterlyShelfTimeReport(String retailerId);

	List<RetailerInventoryBean> getYearlyShelfTimeReport(String retailerId);

}
