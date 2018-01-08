package today.smarthealthcare.ppv1.persistence.repository.classifier;

import today.smarthealthcare.ppv1.persistence.model.classifier.MedicationClassifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

import today.smarthealthcare.ppv1.persistence.model.classifier.MedicationClassifier;

/**
 * @author: Vadim Nesmashnov
 */
public interface MedicationClassifierRepository extends JpaRepository<MedicationClassifier, String> {
    @Query(
            value = "SELECT * FROM MEDICATIONCLASSIFIERS WHERE NAME LIKE :name%",
            nativeQuery = true
    )
    public List<MedicationClassifier> findByName(@Param("name") String name);
}
