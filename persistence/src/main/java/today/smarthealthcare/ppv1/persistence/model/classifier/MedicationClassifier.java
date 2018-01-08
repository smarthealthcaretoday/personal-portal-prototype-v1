package today.smarthealthcare.ppv1.persistence.model.classifier;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Medication classifier
 *
 * @author: Vadim Nesmashnov
 */
@Entity
@Table(name = "MEDICATIONCLASSIFIERS")
public class MedicationClassifier extends ClassifierWithUnit {

}
