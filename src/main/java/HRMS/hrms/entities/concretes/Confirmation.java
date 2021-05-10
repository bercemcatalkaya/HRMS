package HRMS.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="confirmations")
public class Confirmation {
	@Id
	@GeneratedValue
	@Column(name="id")
	int id;
	
	@Column(name="employer_id")
	int employerId;
	
	@Column(name="system_user_id")
	int systemUserId;
	
	@Column(name="confirmed_date")
	Date confirmedDate;	
}
