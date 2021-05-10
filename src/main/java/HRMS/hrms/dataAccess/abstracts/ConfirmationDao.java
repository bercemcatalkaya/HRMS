package HRMS.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMS.hrms.entities.concretes.Confirmation;

public interface ConfirmationDao extends JpaRepository<Confirmation,Integer> {

}
