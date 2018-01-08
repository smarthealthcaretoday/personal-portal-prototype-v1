package today.smarthealthcare.ppv1.persistence.model.classifier;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Vaccine classifier
 *
 * @author: Vadim Nesmashnov
 */
@Entity
@Table(name = "VACCINECLASSIFIERS")
public class VaccineClassifier extends ClassifierWithUnit {
}
