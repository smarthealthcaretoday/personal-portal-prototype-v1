package today.smarthealthcare.ppv1.dto.patient;

import java.io.Serializable;

import today.smarthealthcare.ppv1.dto.classifier.MedicationClassifierDto;

/**
 * @author <a href="mailto:vadim.nesmasnov@playtech.com"> Vadim Nesmashnov</a>
 * @since 28.01.2015
 */
public class PatientDrugToAvoidDto implements Serializable {

	private MedicationClassifierDto classifier;

	public MedicationClassifierDto getClassifier() {
		return classifier;
	}

	public void setClassifier(MedicationClassifierDto classifier) {
		this.classifier = classifier;
	}
}
