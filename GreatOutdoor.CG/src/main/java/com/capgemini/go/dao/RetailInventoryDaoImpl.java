package com.capgemini.go.dao;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;

import com.capgemini.go.bean.RetailerInventoryBean;
import com.capgemini.go.controller.App;
import com.capgemini.go.controller.RetailerInventoryException;
import com.capgemini.go.data.DataBaseEntry;
import com.capgemini.go.dto.RetailerInventoryDTO;
//import com.capgemini.go.exception.RetailerInventoryException;

public class RetailInventoryDaoImpl implements RetailInventoryDao{
	
	public List<RetailerInventoryDTO> getSoldItemsDetails()
	{	
		LocalDate today=LocalDate.now();
		List<RetailerInventoryDTO> ret=new ArrayList<RetailerInventoryDTO>();
		
		for (Iterator iterator = ret.iterator(); iterator.hasNext();) {
			RetailerInventoryDTO re = (RetailerInventoryDTO) iterator.next();
			if(today.isAfter((ChronoLocalDate) re.productSaleTimestamp)){
				ret.add(re);
			}
			
		}
		return ret;
	}
	public List<RetailerInventoryDTO> getDeliveredItemsDetails()
	{	
		LocalDate today=LocalDate.now();
		List<RetailerInventoryDTO> ret=new ArrayList<RetailerInventoryDTO>();
		
		for (Iterator iterator = ret.iterator(); iterator.hasNext();) {
			RetailerInventoryDTO re = (RetailerInventoryDTO) iterator.next();
			if(today.isAfter((ChronoLocalDate) re.productRecieveTimestamp)){
				ret.add(re);
			}
			
		}
		return ret;
	}
	
	
}
