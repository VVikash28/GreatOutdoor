package com.capgemini.go.data;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.capgemini.go.bean.RetailerInventoryBean;
import com.capgemini.go.dto.RetailerInventoryDTO;

public class DataBaseEntry {
	public static List<RetailerInventoryBean> retailInventory=new ArrayList<RetailerInventoryBean>();
	public static List<RetailerInventoryDTO> retailInventoryDTO = new ArrayList<RetailerInventoryDTO>();
	static {
		retailInventory.add(new RetailerInventoryBean("IN11","Golu",1,"Rough","Ball","1234",
				Period.of(0, 0, 10),Period.of(0, 0, 2)));
		retailInventory.add(new RetailerInventoryBean("IN12","Molu",2,"Sleet","Bat","6459",
				Period.of(0, 0, 20),Period.of(0, 3, 2)));	
		 Calendar c =(Calendar) Calendar.getInstance(); 
		retailInventoryDTO.add(
				new RetailerInventoryDTO("IN11", 1, "P11", "PU11",LocalDate.now().minusDays(5),LocalDate.now(),LocalDate.now().minusDays(15) ));
		retailInventoryDTO.add(
				new RetailerInventoryDTO("IN12", 2, "P12", "PU12",LocalDate.now().minusDays(7),LocalDate.now(),LocalDate.now().minusDays(12) ));
		retailInventoryDTO.add(
				new RetailerInventoryDTO("IN13", 3, "P13", "PU13",LocalDate.now().minusDays(2),LocalDate.now(),LocalDate.now().minusDays(17) ));
		retailInventoryDTO.add(
				new RetailerInventoryDTO("IN14", 4, "P14", "PU14",LocalDate.now().minusDays(8),LocalDate.now(),LocalDate.now().minusDays(11) ));
		retailInventoryDTO.add(
				new RetailerInventoryDTO("IN15", 5, "P15", "PU15",LocalDate.now().minusDays(9),LocalDate.now(),LocalDate.now().minusDays(10) ));
	}

	public static List<RetailerInventoryBean> getRetailInventory() {
		return retailInventory;
	}
	

}
