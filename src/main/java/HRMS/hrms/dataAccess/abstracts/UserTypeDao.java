package HRMS.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMS.hrms.entities.concretes.UserType;

public interface UserTypeDao extends JpaRepository<UserType,Integer> {

}
