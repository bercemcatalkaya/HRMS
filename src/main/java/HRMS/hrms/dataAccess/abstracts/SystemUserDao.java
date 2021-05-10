package HRMS.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMS.hrms.entities.concretes.SystemUser;

public interface SystemUserDao extends JpaRepository<SystemUser,Integer>{

}
