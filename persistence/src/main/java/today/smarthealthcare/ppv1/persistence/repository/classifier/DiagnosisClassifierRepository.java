package today.smarthealthcare.ppv1.persistence.repository.classifier;

import today.smarthealthcare.ppv1.persistence.model.classifier.DiagnosisClassifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

import today.smarthealthcare.ppv1.persistence.model.classifier.DiagnosisClassifier;

/**
 * @author: Vadim Nesmashnov
 */
public interface DiagnosisClassifierRepository extends JpaRepository<DiagnosisClassifier, String> {
    @Query(
            value = "SELECT * FROM DIAGNOSISCLASSIFIERS WHERE NAME LIKE :name%",
            nativeQuery = true
    )
    public List<DiagnosisClassifier> findByName(@Param("name") String name);
}
