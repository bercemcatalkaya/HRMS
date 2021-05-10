package HRMS.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="jobs")
public class Job {
	@Id
	@GeneratedValue
	@Column(name="id")
	int jobId;

	@Column(name="name")
	String jobName;
	
	public Job() {
		
	}

	public Job(int jobId, String jobName) {
		this.jobId = jobId;
		this.jobName = jobName;
	}
}
