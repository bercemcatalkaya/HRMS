package HRMS.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMS.hrms.business.abstracts.JobService;
import HRMS.hrms.entities.concretes.Job;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {

	@Autowired
	public JobsController(JobService jobService) {
		this.jobService = jobService;
	}
	private JobService jobService;

	@GetMapping("/getall")
	List<Job> getAllJobs(){
		return this.jobService.getAll();
	}
}
