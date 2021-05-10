package HRMS.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue
	@Column(name="id")
	int userId;
	
	@Column(name="user_type_id")
	int userTypeId;
	
	@Column(name="email")
	String email;
	
	@Column(name="password")
	String password;
}
