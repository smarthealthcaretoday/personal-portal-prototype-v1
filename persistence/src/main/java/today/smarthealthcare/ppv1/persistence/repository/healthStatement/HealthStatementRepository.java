package today.smarthealthcare.ppv1.persistence.repository.healthStatement;

import today.smarthealthcare.ppv1.persistence.model.healthStatement.HealthStatement;
import org.springframework.data.jpa.repository.JpaRepository;

import today.smarthealthcare.ppv1.persistence.model.healthStatement.HealthStatement;

/**
 * @author: Vadim Nesmashnov
 */
public interface HealthStatementRepository extends JpaRepository<HealthStatement, Long> {
    HealthStatement findByPatientId(Long patientId);
}
