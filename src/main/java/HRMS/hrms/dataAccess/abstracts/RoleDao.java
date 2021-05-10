package HRMS.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMS.hrms.entities.concretes.Role;

public interface RoleDao extends JpaRepository<Role,Integer> {

}
