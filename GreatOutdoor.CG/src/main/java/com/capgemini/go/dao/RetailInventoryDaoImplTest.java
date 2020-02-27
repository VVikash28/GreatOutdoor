package com.capgemini.go.dao;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class RetailInventoryDaoImplTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testGetSoldItemsDetails() {
RetailInventoryDaoImpl test=new RetailInventoryDaoImpl();
assertNotNull(test.getSoldItemsDetails());
	}

	@Test
	public void testGetDeliveredItemsDetails() {
		RetailInventoryDaoImpl test=new RetailInventoryDaoImpl();
		assertNotNull(test.getDeliveredItemsDetails());
	}

}
