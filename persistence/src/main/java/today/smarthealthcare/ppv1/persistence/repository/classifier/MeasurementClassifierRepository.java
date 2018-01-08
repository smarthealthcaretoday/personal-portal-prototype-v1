package today.smarthealthcare.ppv1.persistence.repository.classifier;

import today.smarthealthcare.ppv1.persistence.model.classifier.MeasurementClassifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

import today.smarthealthcare.ppv1.persistence.model.classifier.MeasurementClassifier;

/**
 * @author: Vadim Nesmashnov
 */
public interface MeasurementClassifierRepository extends JpaRepository<MeasurementClassifier, String> {
    @Query(
            value = "SELECT * FROM MEASUREMENTCLASSIFIERS WHERE NAME LIKE :name%",
            nativeQuery = true
    )
    public List<MeasurementClassifier> findByName(@Param("name") String name);

    public MeasurementClassifier findByIdCode(String code);
}
