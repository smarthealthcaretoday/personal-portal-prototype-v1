package today.smarthealthcare.ppv1.persistence.repository.patient;

import today.smarthealthcare.ppv1.persistence.model.patient.Notes;
import org.springframework.data.jpa.repository.JpaRepository;

import today.smarthealthcare.ppv1.persistence.model.patient.Notes;

/**
 * @author: Vadim Nesmashnov
 */
public interface NotesRepository extends JpaRepository<Notes, Long> {
    Notes findByPatientId(Long patientId);
}
