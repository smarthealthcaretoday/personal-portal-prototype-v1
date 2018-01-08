package today.smarthealthcare.ppv1.controllers;

import java.util.ArrayList;
import java.util.List;

import today.smarthealthcare.ppv1.persistence.service.IClassifierPersistenceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import today.smarthealthcare.ppv1.dto.classifier.DiagnosisClassifierDto;
import today.smarthealthcare.ppv1.dto.classifier.MeasurementClassifierDto;
import today.smarthealthcare.ppv1.dto.classifier.MedicationClassifierDto;
import today.smarthealthcare.ppv1.dto.classifier.VaccineClassifierDto;

/**
 * Responsible for populating autocomplete lists
 *
 * @author: Vadim Nesmashnov
 */
@RestController
public class AutocompleteController {
    @Autowired
    private IClassifierPersistenceService classifierPersistenceService;

	private final static Logger LOGGER = LoggerFactory.getLogger(AutocompleteController.class);

	@RequestMapping(value = "classifiers/diagnoses", method = RequestMethod.GET)
	public List<DiagnosisClassifierDto> getDiagnosesList(@RequestParam(value = "query") String query) {

        return classifierPersistenceService.findDiagnosisClassifiers(query);
    }

	@RequestMapping(value = "classifiers/medications", method = RequestMethod.GET)
	public List<MedicationClassifierDto> getMedicationsList(@RequestParam(value = "query") String query) {

        return classifierPersistenceService.findMedicationClassifiers(query);
    }

	@RequestMapping(value = "classifiers/measurements", method = RequestMethod.GET)
	public List<MeasurementClassifierDto> getMeasurementsList(@RequestParam(value = "query") String query) {

        return classifierPersistenceService.findMeasurementClassifiers(query);
    }

	@RequestMapping(value = "classifiers/vaccinations", method = RequestMethod.GET)
	public List<VaccineClassifierDto> getVaccinationsList(@RequestParam(value = "query") String query) {

        return classifierPersistenceService.findVaccineClassifiers(query);
    }
}
