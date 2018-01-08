package today.smarthealthcare.ppv1.persistence.mapper;

import today.smarthealthcare.ppv1.persistence.model.classifier.ClassifierId;
import org.dozer.CustomConverter;

import today.smarthealthcare.ppv1.dto.classifier.MedicationClassifierDto;
import today.smarthealthcare.ppv1.dto.patient.PatientDrugToAvoidDto;
import today.smarthealthcare.ppv1.persistence.model.classifier.MedicationClassifier;

import today.smarthealthcare.ppv1.dto.patient.PatientDrugToAvoidDto;
import today.smarthealthcare.ppv1.persistence.model.classifier.ClassifierId;
import today.smarthealthcare.ppv1.persistence.model.classifier.MedicationClassifier;

/**
 * @author Vadim Nesmashnov
 */
public class PatientDrugToAvoidConverter implements CustomConverter {

	@Override
	public Object convert(Object destination, Object source, Class<?> destClass, Class<?> sourceClass) {
		if (source == null) {
			return null;
		}

		if (source instanceof PatientDrugToAvoidDto) {
			PatientDrugToAvoidDto patientDrugToAvoidDto = (PatientDrugToAvoidDto)source;
			if (patientDrugToAvoidDto.getClassifier() != null &&
					patientDrugToAvoidDto.getClassifier().getOriginalObject() != null) {

				MedicationClassifier medicationClassifier = new MedicationClassifier();
				ClassifierId classifierId = new ClassifierId(patientDrugToAvoidDto.getClassifier().getOriginalObject().getCode(), patientDrugToAvoidDto.getClassifier().getOriginalObject().getName());
				medicationClassifier.setId(classifierId);
				medicationClassifier.setUnit(patientDrugToAvoidDto.getClassifier().getUnit());

				return medicationClassifier;
			}
		} else if (source instanceof MedicationClassifier) {
			MedicationClassifier medicationClassifier = (MedicationClassifier)source;

			MedicationClassifierDto medicationClassifierDto = new MedicationClassifierDto();
			medicationClassifierDto.setCode(medicationClassifier.getId().getCode());
			medicationClassifierDto.setName(medicationClassifier.getId().getName());
			medicationClassifierDto.setUnit(medicationClassifier.getUnit());

			PatientDrugToAvoidDto patientDrugToAvoidDto = new PatientDrugToAvoidDto();
			patientDrugToAvoidDto.setClassifier(medicationClassifierDto);

			return patientDrugToAvoidDto;
		}

		return null;
	}
}
