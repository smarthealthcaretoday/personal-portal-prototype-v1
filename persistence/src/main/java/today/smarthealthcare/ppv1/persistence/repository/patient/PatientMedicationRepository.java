package today.smarthealthcare.ppv1.persistence.repository.patient;

import today.smarthealthcare.ppv1.persistence.model.patient.PatientMedication;
import org.springframework.data.jpa.repository.JpaRepository;

import today.smarthealthcare.ppv1.persistence.model.patient.PatientMedication;

/**
 * @author: Vadim Nesmashnov
 */
public interface PatientMedicationRepository extends JpaRepository<PatientMedication, Long> {
}
