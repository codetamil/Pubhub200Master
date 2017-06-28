package com.revature.dto;

import lombok.Data;

@Data
public class DashboardDTO {

	private Integer noOfUsers;
	
	private Integer noOfOrders;
	
	private Long totalOrderAmount;
	
}
