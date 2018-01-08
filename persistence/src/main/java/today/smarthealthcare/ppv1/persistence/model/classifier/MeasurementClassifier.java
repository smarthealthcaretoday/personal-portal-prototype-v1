package today.smarthealthcare.ppv1.persistence.model.classifier;


import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Measurement classifier
 *
 * @author: Vadim Nesmashnov
 */
@Entity
@Table(name = "MEASUREMENTCLASSIFIERS")
public class MeasurementClassifier extends ClassifierWithUnit {

}
