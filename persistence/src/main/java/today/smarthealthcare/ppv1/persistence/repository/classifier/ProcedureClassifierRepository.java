package today.smarthealthcare.ppv1.persistence.repository.classifier;

import today.smarthealthcare.ppv1.persistence.model.classifier.ProcedureClassifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

import today.smarthealthcare.ppv1.persistence.model.classifier.ProcedureClassifier;

/**
 * @author: Vadim Nesmashnov
 */
public interface ProcedureClassifierRepository extends JpaRepository<ProcedureClassifier, String> {
    @Query(
            value = "SELECT * FROM PROCEDURECLASSIFIERS WHERE NAME LIKE :name%",
            nativeQuery = true
    )
    public List<ProcedureClassifier> findByName(@Param("name") String name);
}
