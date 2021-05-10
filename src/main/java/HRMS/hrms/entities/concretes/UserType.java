package HRMS.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="user_types")
public class UserType {
	@Id
	@GeneratedValue
	@Column(name="id")
	int userTypeId;
	
	@Column(name="name")
	String userName;
}
