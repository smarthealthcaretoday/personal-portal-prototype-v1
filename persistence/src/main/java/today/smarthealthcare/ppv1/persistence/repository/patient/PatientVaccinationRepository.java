package today.smarthealthcare.ppv1.persistence.repository.patient;

import today.smarthealthcare.ppv1.persistence.model.patient.PatientVaccination;
import org.springframework.data.jpa.repository.JpaRepository;

import today.smarthealthcare.ppv1.persistence.model.patient.PatientVaccination;

/**
 * @author: Vadim Nesmashnov
 */
public interface PatientVaccinationRepository extends JpaRepository<PatientVaccination, Long> {
}
