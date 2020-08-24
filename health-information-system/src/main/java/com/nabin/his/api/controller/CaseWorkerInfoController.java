package com.nabin.his.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nabin.his.api.model.CaseWorker;
import com.nabin.his.api.service.CaseWorkerService;

@Controller
public class CaseWorkerInfoController {
	
	@Autowired
	private CaseWorkerService caseWorkerService;
	
	@GetMapping(value = {"/","/addCaseWorker"})
	public String loadForm(Model model) {
		
		CaseWorker cw = new CaseWorker();
		model.addAttribute("caseWorker", cw);
		return "caseWorkerInfo";
		
	}
	
	@PostMapping("/saveCaseWorker")
	public String handleSubmitBtn(@ModelAttribute("caseWorker") CaseWorker caseWorker,Model model){
		boolean isSaved = caseWorkerService.saveCaseWorker(caseWorker);
		if(isSaved) {
			model.addAttribute("successMsg", "Successfully saved CaseWorker");
		}else
		{
			model.addAttribute("errorMsg", "Failed to save CaseWorker");
		}
		
		return "caseWorkerInfo";
	}
	
	@GetMapping("/allCaseWorkers")
	public String getAllCaseWorkers(Model model) {
		List<CaseWorker> cworkerss = caseWorkerService.getAllCaseWorkers();
		model.addAttribute("caseWorkers", cworkerss);
		return "viewCaseWorkers";
		
	}
	

}
