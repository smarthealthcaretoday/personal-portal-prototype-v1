package today.smarthealthcare.ppv1.persistence.repository.patient;

import today.smarthealthcare.ppv1.persistence.model.patient.PatientProcedure;
import org.springframework.data.jpa.repository.JpaRepository;

import today.smarthealthcare.ppv1.persistence.model.patient.PatientProcedure;

/**
 * @author: Vadim Nesmashnov
 */
public interface PatientProcedureRepository extends JpaRepository<PatientProcedure, Long> {
}
