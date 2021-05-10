package HRMS.hrms.business.abstracts;

import java.util.List;

import HRMS.hrms.entities.concretes.Job;

public interface JobService {
	List<Job> getAll();
}
