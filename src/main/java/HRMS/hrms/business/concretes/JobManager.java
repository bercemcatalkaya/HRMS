package HRMS.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS.hrms.business.abstracts.JobService;
import HRMS.hrms.dataAccess.abstracts.JobDao;
import HRMS.hrms.entities.concretes.Job;

@Service
public class JobManager implements JobService {
	private JobDao jobDao;
	
	@Autowired	
	public JobManager(JobDao jobDao) {
		this.jobDao = jobDao;
	}
	
	@Override
	public List<Job> getAll() {
		return this.jobDao.findAll();
	}
}
