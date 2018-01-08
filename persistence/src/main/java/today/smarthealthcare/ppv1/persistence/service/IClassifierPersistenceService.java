package today.smarthealthcare.ppv1.persistence.service;

import today.smarthealthcare.ppv1.dto.classifier.DiagnosisClassifierDto;
import today.smarthealthcare.ppv1.dto.classifier.MeasurementClassifierDto;
import today.smarthealthcare.ppv1.dto.classifier.MedicationClassifierDto;
import today.smarthealthcare.ppv1.dto.classifier.VaccineClassifierDto;
import today.smarthealthcare.ppv1.persistence.model.classifier.MeasurementClassifier;

import java.util.List;

import today.smarthealthcare.ppv1.persistence.model.classifier.MeasurementClassifier;

/**
 * Classifier persistence service
 *
 * @author: Vadim Nesmashnov
 */
public interface IClassifierPersistenceService {
    List<DiagnosisClassifierDto> findDiagnosisClassifiers(String name);

    List<MeasurementClassifierDto> findMeasurementClassifiers(String name);

    List<MedicationClassifierDto> findMedicationClassifiers(String name);

    List<VaccineClassifierDto> findVaccineClassifiers(String name);

    MeasurementClassifier getMeasurementClassifierByCode(String code);
}
