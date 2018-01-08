package today.smarthealthcare.ppv1.persistence.service.impl;

import today.smarthealthcare.ppv1.dto.classifier.DiagnosisClassifierDto;
import today.smarthealthcare.ppv1.dto.classifier.MeasurementClassifierDto;
import today.smarthealthcare.ppv1.dto.classifier.MedicationClassifierDto;
import today.smarthealthcare.ppv1.dto.classifier.VaccineClassifierDto;
import today.smarthealthcare.ppv1.persistence.model.classifier.DiagnosisClassifier;
import today.smarthealthcare.ppv1.persistence.model.classifier.MeasurementClassifier;
import today.smarthealthcare.ppv1.persistence.model.classifier.MedicationClassifier;
import today.smarthealthcare.ppv1.persistence.model.classifier.VaccineClassifier;
import today.smarthealthcare.ppv1.persistence.repository.classifier.DiagnosisClassifierRepository;
import today.smarthealthcare.ppv1.persistence.repository.classifier.MeasurementClassifierRepository;
import today.smarthealthcare.ppv1.persistence.repository.classifier.MedicationClassifierRepository;
import today.smarthealthcare.ppv1.persistence.repository.classifier.VaccineClassifierRepository;
import today.smarthealthcare.ppv1.persistence.service.IClassifierPersistenceService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import today.smarthealthcare.ppv1.persistence.model.classifier.DiagnosisClassifier;
import today.smarthealthcare.ppv1.persistence.model.classifier.MeasurementClassifier;
import today.smarthealthcare.ppv1.persistence.model.classifier.MedicationClassifier;
import today.smarthealthcare.ppv1.persistence.model.classifier.VaccineClassifier;
import today.smarthealthcare.ppv1.persistence.repository.classifier.DiagnosisClassifierRepository;
import today.smarthealthcare.ppv1.persistence.repository.classifier.MeasurementClassifierRepository;
import today.smarthealthcare.ppv1.persistence.repository.classifier.MedicationClassifierRepository;
import today.smarthealthcare.ppv1.persistence.repository.classifier.VaccineClassifierRepository;

/**
 * @author: Vadim Nesmashnov
 */
@Service
public class ClassifierPersistenceService implements IClassifierPersistenceService {
    @Autowired
    private DozerBeanMapper dozerBeanMapper;

    @Autowired
    private DiagnosisClassifierRepository diagnosisClassifierRepository;

    @Autowired
    private MeasurementClassifierRepository measurementClassifierRepository;

    @Autowired
    private MedicationClassifierRepository medicationClassifierRepository;

    @Autowired
    private VaccineClassifierRepository vaccineClassifierRepository;

    @Override
    public List<DiagnosisClassifierDto> findDiagnosisClassifiers(String name) {
        List<DiagnosisClassifierDto> result = new ArrayList<>();

        List<DiagnosisClassifier> persistedClassifiers = diagnosisClassifierRepository.findByName(name);

        for (DiagnosisClassifier persistedClassifier : persistedClassifiers) {
            result.add(dozerBeanMapper.map(persistedClassifier, DiagnosisClassifierDto.class));
        }

        return result;
    }

    @Override
    public List<MeasurementClassifierDto> findMeasurementClassifiers(String name) {
        List<MeasurementClassifierDto> result = new ArrayList<>();

        List<MeasurementClassifier> persistedClassifiers = measurementClassifierRepository.findByName(name);

        for (MeasurementClassifier persistedClassifier : persistedClassifiers) {
            result.add(dozerBeanMapper.map(persistedClassifier, MeasurementClassifierDto.class));
        }

        return result;
    }

    @Override
    public List<MedicationClassifierDto> findMedicationClassifiers(String name) {
        List<MedicationClassifierDto> result = new ArrayList<>();

        List<MedicationClassifier> persistedClassifiers = medicationClassifierRepository.findByName(name);

        for (MedicationClassifier persistedClassifier : persistedClassifiers) {
            result.add(dozerBeanMapper.map(persistedClassifier, MedicationClassifierDto.class));
        }

        return result;
    }

    @Override
    public List<VaccineClassifierDto> findVaccineClassifiers(String name) {
        List<VaccineClassifierDto> result = new ArrayList<>();

        List<VaccineClassifier> persistedClassifiers = vaccineClassifierRepository.findByName(name);

        for (VaccineClassifier persistedClassifier : persistedClassifiers) {
            result.add(dozerBeanMapper.map(persistedClassifier, VaccineClassifierDto.class));
        }

        return result;
    }

    @Override
    public MeasurementClassifier getMeasurementClassifierByCode(String code) {
        return measurementClassifierRepository.findByIdCode(code);
    }
}
