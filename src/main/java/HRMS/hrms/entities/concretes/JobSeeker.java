package HRMS.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="job_seekers")
public class JobSeeker {
	@Id
	@GeneratedValue
	@Column(name="id")
	int id;
	
	@Column(name="user_id")
	int userId;
	
	@Column(name="name")
	String name;
	
	@Column(name="surname")
	String surname;
	
	@Column(name="identity_number")
	String identityNumber;
	
	@Column(name="birth_year")
	int birthYear;
}
