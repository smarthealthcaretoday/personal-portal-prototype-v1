package today.smarthealthcare.ppv1.persistence.repository.patient;

import today.smarthealthcare.ppv1.persistence.model.patient.PatientDiagnosis;
import org.springframework.data.jpa.repository.JpaRepository;

import today.smarthealthcare.ppv1.persistence.model.patient.PatientDiagnosis;

/**
 * @author: Vadim Nesmashnov
 */
public interface PatientDiagnosisRepository extends JpaRepository<PatientDiagnosis, Long> {
}
