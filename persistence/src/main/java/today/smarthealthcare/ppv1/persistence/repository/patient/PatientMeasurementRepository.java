package today.smarthealthcare.ppv1.persistence.repository.patient;

import today.smarthealthcare.ppv1.persistence.model.classifier.MeasurementClassifier;
import today.smarthealthcare.ppv1.persistence.model.patient.Patient;
import today.smarthealthcare.ppv1.persistence.model.patient.PatientMeasurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

import today.smarthealthcare.ppv1.persistence.model.classifier.MeasurementClassifier;
import today.smarthealthcare.ppv1.persistence.model.patient.Patient;
import today.smarthealthcare.ppv1.persistence.model.patient.PatientMeasurement;

/**
 * @author: Vadim Nesmashnov
 */
public interface PatientMeasurementRepository extends JpaRepository<PatientMeasurement, Long> {

    @Query("select pm from PatientMeasurement pm where pm.patient = :patient " +
            "and pm.classifier = :classifier " +
            "and pm.date = :date")
    PatientMeasurement findByPatientAndClassifierAndDate(@Param("patient")Patient patient,
                                                         @Param("classifier")MeasurementClassifier classifier,
                                                         @Param("date")Date date);

    @Query(value = "SELECT * FROM PATIENTMEASUREMENTS pm " +
            "WHERE pm.patient_id = :patientId " +
            "AND pm.measurementclassifier_code IN :measurementCodes " +
            "AND pm.date >= :startDate " +
            "AND pm.date <= :endDate " +
            "ORDER BY pm.date asc",
            nativeQuery = true)
    List<PatientMeasurement> findByPatientIdAndClassifierCodeAndDateRange(@Param("patientId")Long patientId,
                                                                          @Param("measurementCodes")List<String> measurementCodes,
                                                                          @Param("startDate")Date startDate,
                                                                          @Param("endDate")Date endDate);
}
