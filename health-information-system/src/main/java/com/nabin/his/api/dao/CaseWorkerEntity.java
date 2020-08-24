package com.nabin.his.api.dao;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;

@Entity
@Table(name = "Case_WORKER")
@Data
public class CaseWorkerEntity {
	
	@Id
	@Column(name = "ID")
	@SequenceGenerator(name = "case_worker_id",sequenceName = "Case_WORKER_SEQ",allocationSize = 1)
	@GeneratedValue(generator = "case_worker_id",strategy = GenerationType.SEQUENCE)
	private String caseWorkerId;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "GENDER")
	private String gender;
	
//	@Column(name = "ROLES")
//	private List<String> roles;
	
	

}
