package HRMS.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMS.hrms.entities.concretes.Company;

public interface CompanyDao extends JpaRepository<Company,Integer> {

}
