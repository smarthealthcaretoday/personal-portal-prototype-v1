package today.smarthealthcare.ppv1.persistence.repository.classifier;

import today.smarthealthcare.ppv1.persistence.BaseH2DBTest;
import today.smarthealthcare.ppv1.persistence.model.classifier.ClassifierId;
import today.smarthealthcare.ppv1.persistence.model.classifier.DiagnosisClassifier;
import junit.framework.Assert;
import today.smarthealthcare.ppv1.persistence.model.classifier.ClassifierId;
import today.smarthealthcare.ppv1.persistence.model.classifier.DiagnosisClassifier;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author: Vadim Nesmashnov
 */
public class DiagnosisClassifierRepositoryTest extends BaseH2DBTest {
    @Autowired
    private DiagnosisClassifierRepository diagnosisClassifierRepository;

    @Test
    public void testFindByName() throws Exception {
        DiagnosisClassifier classifier = new DiagnosisClassifier();
        ClassifierId classifierId = new ClassifierId("123", "Name");
        classifier.setId(classifierId);

        diagnosisClassifierRepository.saveAndFlush(classifier);

        List<DiagnosisClassifier> found = diagnosisClassifierRepository.findByName("am");

        Assert.assertEquals(1, found.size());

    }
}
