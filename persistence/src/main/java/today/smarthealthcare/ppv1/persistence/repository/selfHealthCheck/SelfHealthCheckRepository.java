package today.smarthealthcare.ppv1.persistence.repository.selfHealthCheck;

import today.smarthealthcare.ppv1.persistence.model.selfHealthCheck.SelfHealthCheck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

/**
 * @author: Vadim Nesmashnov
 */
public interface SelfHealthCheckRepository extends JpaRepository<SelfHealthCheck, Long> {

    @Query(value = "SELECT * FROM SELFHEALTHCHECK shc " +
            "WHERE shc.patient_id = :patientId " +
            "AND shc.date >= :startDate " +
            "AND shc.date <= :endDate " +
            "ORDER BY shc.date asc",
            nativeQuery = true)
    List<SelfHealthCheck> findByPatientIdAndDateRange(@Param("patientId")Long patientId,
                                                      @Param("startDate")Date startDate,
                                                      @Param("endDate")Date endDate);
}
