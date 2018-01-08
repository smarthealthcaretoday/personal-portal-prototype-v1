package today.smarthealthcare.ppv1.persistence.repository.classifier;

import today.smarthealthcare.ppv1.persistence.model.classifier.VaccineClassifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

import today.smarthealthcare.ppv1.persistence.model.classifier.VaccineClassifier;

/**
 * @author: Vadim Nesmashnov
 */
public interface VaccineClassifierRepository extends JpaRepository<VaccineClassifier, String> {
    @Query(
            value = "SELECT * FROM VACCINECLASSIFIERS WHERE NAME LIKE :name%",
            nativeQuery = true
    )
    public List<VaccineClassifier> findByName(@Param("name") String name);
}
