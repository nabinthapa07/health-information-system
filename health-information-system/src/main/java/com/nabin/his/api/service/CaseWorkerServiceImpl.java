package com.nabin.his.api.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nabin.his.api.dao.CaseWorkerEntity;
import com.nabin.his.api.dao.CaseWorkerRepository;
import com.nabin.his.api.model.CaseWorker;

@Service
public class CaseWorkerServiceImpl implements CaseWorkerService {
	
	@Autowired
	private CaseWorkerRepository caseworkerRepository;

	@Override
	public boolean saveCaseWorker(CaseWorker caseWorker) {
		CaseWorkerEntity caseWorkerEntity = new CaseWorkerEntity();
		BeanUtils.copyProperties(caseWorker, caseWorkerEntity);
		caseWorkerEntity = caseworkerRepository.save(caseWorkerEntity);
		
		return caseWorkerEntity.getCaseWorkerId()!=null;
	}

	@Override
	public List<CaseWorker> getAllCaseWorkers() {
		List<CaseWorkerEntity> caseWorkerEntities = caseworkerRepository.findAll();
		return caseWorkerEntities.stream().map(caseWorkerEntity ->{
			CaseWorker caseWorker = new CaseWorker();
			BeanUtils.copyProperties(caseWorkerEntity, caseWorker);
			return caseWorker;
		}).collect(Collectors.toList());
	}

	@Override
	public CaseWorker getCaseWorkerById(Integer id) {
		Optional<CaseWorkerEntity> findById = caseworkerRepository.findById(id);
		if(findById.isPresent()) {
			CaseWorkerEntity caseWorkerEntity = findById.get();
			CaseWorker caseWorker = new CaseWorker();
		BeanUtils.copyProperties(caseWorkerEntity, caseWorker);
		return caseWorker;
		}
		return null;
	}

	@Override
	public boolean deleteCaseWorkerById(Integer id) {
		caseworkerRepository.deleteById(id);
		return true;
	}

}
