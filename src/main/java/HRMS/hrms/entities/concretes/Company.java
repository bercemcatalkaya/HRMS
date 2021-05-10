package HRMS.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="companies")
public class Company {
	@Id
	@GeneratedValue
	@Column(name="id")
	int companyId;
	
	@Column(name="company_name")
	String companyName;
	
	@Column(name="company_telephone")
	String companyTelephone;
}
