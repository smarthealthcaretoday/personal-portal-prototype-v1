package today.smarthealthcare.ppv1.persistence.repository.patient;

import today.smarthealthcare.ppv1.persistence.model.patient.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import today.smarthealthcare.ppv1.persistence.model.patient.Patient;

/**
 * @author: Vadim Nesmashnov
 */
public interface PatientRepository extends JpaRepository<Patient, Long> {
    Patient findByEmail(String email);
}
