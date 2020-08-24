package com.nabin.his.api.model;

import java.util.List;


import lombok.Data;
@Data
public class CaseWorker {
	
private String caseWorkerId;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String gender;
	
	private List<String> roles;

}
