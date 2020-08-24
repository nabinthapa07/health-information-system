package com.nabin.his.api.service;

import java.util.List;

import com.nabin.his.api.model.CaseWorker;

public interface CaseWorkerService {
	
	public boolean saveCaseWorker(CaseWorker caseWorker);
	
	public List<CaseWorker> getAllCaseWorkers();
	
	public CaseWorker getCaseWorkerById(Integer id);
	
	public boolean deleteCaseWorkerById(Integer id);
	
	

}
