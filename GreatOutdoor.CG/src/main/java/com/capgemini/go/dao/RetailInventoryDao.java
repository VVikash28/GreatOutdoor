package com.capgemini.go.dao;

import java.util.List;

import com.capgemini.go.dto.RetailerInventoryDTO;


public interface RetailInventoryDao {
	public List<RetailerInventoryDTO> getSoldItemsDetails();
	public List<RetailerInventoryDTO> getDeliveredItemsDetails();
	
}
