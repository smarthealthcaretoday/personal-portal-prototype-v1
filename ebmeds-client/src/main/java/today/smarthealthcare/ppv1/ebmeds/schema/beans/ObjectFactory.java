
package today.smarthealthcare.ppv1.ebmeds.schema.beans;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.smarthealthcare.ppv1.ebmeds.schema.beans package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DSSRequestSystemUserHealthCareSpecialtyCodeValue_QNAME = new QName("", "CodeValue");
    private final static QName _DSSRequestSystemUserHealthCareSpecialtyCodeSystem_QNAME = new QName("", "CodeSystem");
    private final static QName _DSSRequestSystemUserHealthCareSpecialtyCodeSystemVersion_QNAME = new QName("", "CodeSystemVersion");
    private final static QName _DSSResponseRemindersReminderSuggestedActionsSuggestedActionPointStampPointDate_QNAME = new QName("", "PointDate");
    private final static QName _DSSResponseRemindersReminderSuggestedActionsSuggestedActionPointStampPointTime_QNAME = new QName("", "PointTime");
    private final static QName _DSSResponseRemindersReminderReminderShortA_QNAME = new QName("", "a");
    private final static QName _DSSRequestPatientInterventionsMedicationDrugStrength_QNAME = new QName("", "Strength");
    private final static QName _DSSRequestPatientInterventionsMedicationDrugDailyDose_QNAME = new QName("", "DailyDose");
    private final static QName _DSSResponseRemindersReminderSuggestedActionsSuggestedActionEndStampEndDate_QNAME = new QName("", "EndDate");
    private final static QName _DSSResponseRemindersReminderSuggestedActionsSuggestedActionEndStampEndTime_QNAME = new QName("", "EndTime");
    private final static QName _DSSResponseRemindersReminderSuggestedActionsSuggestedActionStartStampStartDate_QNAME = new QName("", "StartDate");
    private final static QName _DSSResponseRemindersReminderSuggestedActionsSuggestedActionStartStampStartTime_QNAME = new QName("", "StartTime");
    private final static QName _DSSRequestSystemUserHealthCareOrganizationHealthCareOrganizationName_QNAME = new QName("", "HealthCareOrganizationName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.smarthealthcare.ppv1.ebmeds.schema.beans
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DSSRequest }
     * 
     */
    public DSSRequest createDSSRequest() {
        return new DSSRequest();
    }

    /**
     * Create an instance of {@link DSSResponse }
     * 
     */
    public DSSResponse createDSSResponse() {
        return new DSSResponse();
    }

    /**
     * Create an instance of {@link DSSResponse.ExperimentalDataSets }
     * 
     */
    public DSSResponse.ExperimentalDataSets createDSSResponseExperimentalDataSets() {
        return new DSSResponse.ExperimentalDataSets();
    }

    /**
     * Create an instance of {@link DSSResponse.System }
     * 
     */
    public DSSResponse.System createDSSResponseSystem() {
        return new DSSResponse.System();
    }

    /**
     * Create an instance of {@link DSSResponse.RelevantBreakPoints }
     * 
     */
    public DSSResponse.RelevantBreakPoints createDSSResponseRelevantBreakPoints() {
        return new DSSResponse.RelevantBreakPoints();
    }

    /**
     * Create an instance of {@link DSSResponse.GuidelineLinks }
     * 
     */
    public DSSResponse.GuidelineLinks createDSSResponseGuidelineLinks() {
        return new DSSResponse.GuidelineLinks();
    }

    /**
     * Create an instance of {@link DSSResponse.Indications }
     * 
     */
    public DSSResponse.Indications createDSSResponseIndications() {
        return new DSSResponse.Indications();
    }

    /**
     * Create an instance of {@link DSSResponse.Indications.Indication }
     * 
     */
    public DSSResponse.Indications.Indication createDSSResponseIndicationsIndication() {
        return new DSSResponse.Indications.Indication();
    }

    /**
     * Create an instance of {@link DSSResponse.DrugsToAvoid }
     * 
     */
    public DSSResponse.DrugsToAvoid createDSSResponseDrugsToAvoid() {
        return new DSSResponse.DrugsToAvoid();
    }

    /**
     * Create an instance of {@link DSSResponse.DrugsAndPregnancyOrLactation }
     * 
     */
    public DSSResponse.DrugsAndPregnancyOrLactation createDSSResponseDrugsAndPregnancyOrLactation() {
        return new DSSResponse.DrugsAndPregnancyOrLactation();
    }

    /**
     * Create an instance of {@link DSSResponse.DrugsAndPregnancyOrLactation.DrugAndPregnancyOrLactation }
     * 
     */
    public DSSResponse.DrugsAndPregnancyOrLactation.DrugAndPregnancyOrLactation createDSSResponseDrugsAndPregnancyOrLactationDrugAndPregnancyOrLactation() {
        return new DSSResponse.DrugsAndPregnancyOrLactation.DrugAndPregnancyOrLactation();
    }

    /**
     * Create an instance of {@link DSSResponse.DrugsAndRenalFunction }
     * 
     */
    public DSSResponse.DrugsAndRenalFunction createDSSResponseDrugsAndRenalFunction() {
        return new DSSResponse.DrugsAndRenalFunction();
    }

    /**
     * Create an instance of {@link DSSResponse.DrugsAndRenalFunction.DrugAndRenalFunction }
     * 
     */
    public DSSResponse.DrugsAndRenalFunction.DrugAndRenalFunction createDSSResponseDrugsAndRenalFunctionDrugAndRenalFunction() {
        return new DSSResponse.DrugsAndRenalFunction.DrugAndRenalFunction();
    }

    /**
     * Create an instance of {@link DSSResponse.Contraindications }
     * 
     */
    public DSSResponse.Contraindications createDSSResponseContraindications() {
        return new DSSResponse.Contraindications();
    }

    /**
     * Create an instance of {@link DSSResponse.Contraindications.Contraindication }
     * 
     */
    public DSSResponse.Contraindications.Contraindication createDSSResponseContraindicationsContraindication() {
        return new DSSResponse.Contraindications.Contraindication();
    }

    /**
     * Create an instance of {@link DSSResponse.Interactions }
     * 
     */
    public DSSResponse.Interactions createDSSResponseInteractions() {
        return new DSSResponse.Interactions();
    }

    /**
     * Create an instance of {@link DSSResponse.Interactions.Interaction }
     * 
     */
    public DSSResponse.Interactions.Interaction createDSSResponseInteractionsInteraction() {
        return new DSSResponse.Interactions.Interaction();
    }

    /**
     * Create an instance of {@link DSSResponse.Reminders }
     * 
     */
    public DSSResponse.Reminders createDSSResponseReminders() {
        return new DSSResponse.Reminders();
    }

    /**
     * Create an instance of {@link DSSResponse.Reminders.Reminder }
     * 
     */
    public DSSResponse.Reminders.Reminder createDSSResponseRemindersReminder() {
        return new DSSResponse.Reminders.Reminder();
    }

    /**
     * Create an instance of {@link DSSResponse.Reminders.Reminder.SuggestedActions }
     * 
     */
    public DSSResponse.Reminders.Reminder.SuggestedActions createDSSResponseRemindersReminderSuggestedActions() {
        return new DSSResponse.Reminders.Reminder.SuggestedActions();
    }

    /**
     * Create an instance of {@link DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction }
     * 
     */
    public DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction createDSSResponseRemindersReminderSuggestedActionsSuggestedAction() {
        return new DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction();
    }

    /**
     * Create an instance of {@link DSSResponse.Reminders.Reminder.ReminderPatient }
     * 
     */
    public DSSResponse.Reminders.Reminder.ReminderPatient createDSSResponseRemindersReminderReminderPatient() {
        return new DSSResponse.Reminders.Reminder.ReminderPatient();
    }

    /**
     * Create an instance of {@link DSSResponse.Reminders.Reminder.ReminderNurse }
     * 
     */
    public DSSResponse.Reminders.Reminder.ReminderNurse createDSSResponseRemindersReminderReminderNurse() {
        return new DSSResponse.Reminders.Reminder.ReminderNurse();
    }

    /**
     * Create an instance of {@link DSSResponse.Reminders.Reminder.ReminderLong }
     * 
     */
    public DSSResponse.Reminders.Reminder.ReminderLong createDSSResponseRemindersReminderReminderLong() {
        return new DSSResponse.Reminders.Reminder.ReminderLong();
    }

    /**
     * Create an instance of {@link DSSResponse.Reminders.Reminder.ReminderShort }
     * 
     */
    public DSSResponse.Reminders.Reminder.ReminderShort createDSSResponseRemindersReminderReminderShort() {
        return new DSSResponse.Reminders.Reminder.ReminderShort();
    }

    /**
     * Create an instance of {@link DSSRequest.ExperimentalDataSets }
     * 
     */
    public DSSRequest.ExperimentalDataSets createDSSRequestExperimentalDataSets() {
        return new DSSRequest.ExperimentalDataSets();
    }

    /**
     * Create an instance of {@link DSSRequest.System }
     * 
     */
    public DSSRequest.System createDSSRequestSystem() {
        return new DSSRequest.System();
    }

    /**
     * Create an instance of {@link DSSRequest.System.Application }
     * 
     */
    public DSSRequest.System.Application createDSSRequestSystemApplication() {
        return new DSSRequest.System.Application();
    }

    /**
     * Create an instance of {@link DSSRequest.System.Application.ScriptSelection }
     * 
     */
    public DSSRequest.System.Application.ScriptSelection createDSSRequestSystemApplicationScriptSelection() {
        return new DSSRequest.System.Application.ScriptSelection();
    }

    /**
     * Create an instance of {@link DSSRequest.System.Application.ScriptSelection.ScriptsToBlock }
     * 
     */
    public DSSRequest.System.Application.ScriptSelection.ScriptsToBlock createDSSRequestSystemApplicationScriptSelectionScriptsToBlock() {
        return new DSSRequest.System.Application.ScriptSelection.ScriptsToBlock();
    }

    /**
     * Create an instance of {@link DSSRequest.System.Application.ScriptSelection.ScriptsToRun }
     * 
     */
    public DSSRequest.System.Application.ScriptSelection.ScriptsToRun createDSSRequestSystemApplicationScriptSelectionScriptsToRun() {
        return new DSSRequest.System.Application.ScriptSelection.ScriptsToRun();
    }

    /**
     * Create an instance of {@link DSSRequest.System.User }
     * 
     */
    public DSSRequest.System.User createDSSRequestSystemUser() {
        return new DSSRequest.System.User();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient }
     * 
     */
    public DSSRequest.Patient createDSSRequestPatient() {
        return new DSSRequest.Patient();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Documents }
     * 
     */
    public DSSRequest.Patient.Documents createDSSRequestPatientDocuments() {
        return new DSSRequest.Patient.Documents();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Documents.Document }
     * 
     */
    public DSSRequest.Patient.Documents.Document createDSSRequestPatientDocumentsDocument() {
        return new DSSRequest.Patient.Documents.Document();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.HealthCareEncounters }
     * 
     */
    public DSSRequest.Patient.HealthCareEncounters createDSSRequestPatientHealthCareEncounters() {
        return new DSSRequest.Patient.HealthCareEncounters();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.HealthCareEncounters.HealthCareEncounter }
     * 
     */
    public DSSRequest.Patient.HealthCareEncounters.HealthCareEncounter createDSSRequestPatientHealthCareEncountersHealthCareEncounter() {
        return new DSSRequest.Patient.HealthCareEncounters.HealthCareEncounter();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Interventions }
     * 
     */
    public DSSRequest.Patient.Interventions createDSSRequestPatientInterventions() {
        return new DSSRequest.Patient.Interventions();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Interventions.SelfCareInterventions }
     * 
     */
    public DSSRequest.Patient.Interventions.SelfCareInterventions createDSSRequestPatientInterventionsSelfCareInterventions() {
        return new DSSRequest.Patient.Interventions.SelfCareInterventions();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Interventions.Therapies }
     * 
     */
    public DSSRequest.Patient.Interventions.Therapies createDSSRequestPatientInterventionsTherapies() {
        return new DSSRequest.Patient.Interventions.Therapies();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Interventions.Procedures }
     * 
     */
    public DSSRequest.Patient.Interventions.Procedures createDSSRequestPatientInterventionsProcedures() {
        return new DSSRequest.Patient.Interventions.Procedures();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Interventions.Procedures.Procedure }
     * 
     */
    public DSSRequest.Patient.Interventions.Procedures.Procedure createDSSRequestPatientInterventionsProceduresProcedure() {
        return new DSSRequest.Patient.Interventions.Procedures.Procedure();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Interventions.Procedures.Procedure.MaterialsAndImplants }
     * 
     */
    public DSSRequest.Patient.Interventions.Procedures.Procedure.MaterialsAndImplants createDSSRequestPatientInterventionsProceduresProcedureMaterialsAndImplants() {
        return new DSSRequest.Patient.Interventions.Procedures.Procedure.MaterialsAndImplants();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Interventions.Vaccinations }
     * 
     */
    public DSSRequest.Patient.Interventions.Vaccinations createDSSRequestPatientInterventionsVaccinations() {
        return new DSSRequest.Patient.Interventions.Vaccinations();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Interventions.Medication }
     * 
     */
    public DSSRequest.Patient.Interventions.Medication createDSSRequestPatientInterventionsMedication() {
        return new DSSRequest.Patient.Interventions.Medication();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Interventions.Medication.Drug }
     * 
     */
    public DSSRequest.Patient.Interventions.Medication.Drug createDSSRequestPatientInterventionsMedicationDrug() {
        return new DSSRequest.Patient.Interventions.Medication.Drug();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Investigations }
     * 
     */
    public DSSRequest.Patient.Investigations createDSSRequestPatientInvestigations() {
        return new DSSRequest.Patient.Investigations();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Investigations.Questionnaires }
     * 
     */
    public DSSRequest.Patient.Investigations.Questionnaires createDSSRequestPatientInvestigationsQuestionnaires() {
        return new DSSRequest.Patient.Investigations.Questionnaires();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Investigations.Questionnaires.Questionnaire }
     * 
     */
    public DSSRequest.Patient.Investigations.Questionnaires.Questionnaire createDSSRequestPatientInvestigationsQuestionnairesQuestionnaire() {
        return new DSSRequest.Patient.Investigations.Questionnaires.Questionnaire();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Investigations.Questionnaires.Questionnaire.Questions }
     * 
     */
    public DSSRequest.Patient.Investigations.Questionnaires.Questionnaire.Questions createDSSRequestPatientInvestigationsQuestionnairesQuestionnaireQuestions() {
        return new DSSRequest.Patient.Investigations.Questionnaires.Questionnaire.Questions();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Investigations.ImagingInvestigations }
     * 
     */
    public DSSRequest.Patient.Investigations.ImagingInvestigations createDSSRequestPatientInvestigationsImagingInvestigations() {
        return new DSSRequest.Patient.Investigations.ImagingInvestigations();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Investigations.Measurements }
     * 
     */
    public DSSRequest.Patient.Investigations.Measurements createDSSRequestPatientInvestigationsMeasurements() {
        return new DSSRequest.Patient.Investigations.Measurements();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Investigations.Measurements.Measurement }
     * 
     */
    public DSSRequest.Patient.Investigations.Measurements.Measurement createDSSRequestPatientInvestigationsMeasurementsMeasurement() {
        return new DSSRequest.Patient.Investigations.Measurements.Measurement();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Problems }
     * 
     */
    public DSSRequest.Patient.Problems createDSSRequestPatientProblems() {
        return new DSSRequest.Patient.Problems();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Problems.Diagnoses }
     * 
     */
    public DSSRequest.Patient.Problems.Diagnoses createDSSRequestPatientProblemsDiagnoses() {
        return new DSSRequest.Patient.Problems.Diagnoses();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Risks }
     * 
     */
    public DSSRequest.Patient.Risks createDSSRequestPatientRisks() {
        return new DSSRequest.Patient.Risks();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Risks.NonDrugHypersensitivities }
     * 
     */
    public DSSRequest.Patient.Risks.NonDrugHypersensitivities createDSSRequestPatientRisksNonDrugHypersensitivities() {
        return new DSSRequest.Patient.Risks.NonDrugHypersensitivities();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Risks.NonDrugHypersensitivities.NonDrugHypersensitivity }
     * 
     */
    public DSSRequest.Patient.Risks.NonDrugHypersensitivities.NonDrugHypersensitivity createDSSRequestPatientRisksNonDrugHypersensitivitiesNonDrugHypersensitivity() {
        return new DSSRequest.Patient.Risks.NonDrugHypersensitivities.NonDrugHypersensitivity();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Risks.NonDrugHypersensitivities.NonDrugHypersensitivity.HypersensitivityReaction }
     * 
     */
    public DSSRequest.Patient.Risks.NonDrugHypersensitivities.NonDrugHypersensitivity.HypersensitivityReaction createDSSRequestPatientRisksNonDrugHypersensitivitiesNonDrugHypersensitivityHypersensitivityReaction() {
        return new DSSRequest.Patient.Risks.NonDrugHypersensitivities.NonDrugHypersensitivity.HypersensitivityReaction();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Risks.FamilialDiseases }
     * 
     */
    public DSSRequest.Patient.Risks.FamilialDiseases createDSSRequestPatientRisksFamilialDiseases() {
        return new DSSRequest.Patient.Risks.FamilialDiseases();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Risks.Smoking }
     * 
     */
    public DSSRequest.Patient.Risks.Smoking createDSSRequestPatientRisksSmoking() {
        return new DSSRequest.Patient.Risks.Smoking();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Risks.DrugsToAvoid }
     * 
     */
    public DSSRequest.Patient.Risks.DrugsToAvoid createDSSRequestPatientRisksDrugsToAvoid() {
        return new DSSRequest.Patient.Risks.DrugsToAvoid();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Risks.DrugsToAvoid.DrugToAvoid }
     * 
     */
    public DSSRequest.Patient.Risks.DrugsToAvoid.DrugToAvoid createDSSRequestPatientRisksDrugsToAvoidDrugToAvoid() {
        return new DSSRequest.Patient.Risks.DrugsToAvoid.DrugToAvoid();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Risks.DrugsToAvoid.DrugToAvoid.ReasonsForAvoiding }
     * 
     */
    public DSSRequest.Patient.Risks.DrugsToAvoid.DrugToAvoid.ReasonsForAvoiding createDSSRequestPatientRisksDrugsToAvoidDrugToAvoidReasonsForAvoiding() {
        return new DSSRequest.Patient.Risks.DrugsToAvoid.DrugToAvoid.ReasonsForAvoiding();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Risks.DrugsToAvoid.DrugToAvoid.ReasonsForAvoiding.ReasonForAvoiding }
     * 
     */
    public DSSRequest.Patient.Risks.DrugsToAvoid.DrugToAvoid.ReasonsForAvoiding.ReasonForAvoiding createDSSRequestPatientRisksDrugsToAvoidDrugToAvoidReasonsForAvoidingReasonForAvoiding() {
        return new DSSRequest.Patient.Risks.DrugsToAvoid.DrugToAvoid.ReasonsForAvoiding.ReasonForAvoiding();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Properties }
     * 
     */
    public DSSRequest.Patient.Properties createDSSRequestPatientProperties() {
        return new DSSRequest.Patient.Properties();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Properties.Professions }
     * 
     */
    public DSSRequest.Patient.Properties.Professions createDSSRequestPatientPropertiesProfessions() {
        return new DSSRequest.Patient.Properties.Professions();
    }

    /**
     * Create an instance of {@link DSSResponse.ExperimentalDataSets.ExperimentalDataSet }
     * 
     */
    public DSSResponse.ExperimentalDataSets.ExperimentalDataSet createDSSResponseExperimentalDataSetsExperimentalDataSet() {
        return new DSSResponse.ExperimentalDataSets.ExperimentalDataSet();
    }

    /**
     * Create an instance of {@link DSSResponse.System.DebugMessages }
     * 
     */
    public DSSResponse.System.DebugMessages createDSSResponseSystemDebugMessages() {
        return new DSSResponse.System.DebugMessages();
    }

    /**
     * Create an instance of {@link DSSResponse.System.Exceptions }
     * 
     */
    public DSSResponse.System.Exceptions createDSSResponseSystemExceptions() {
        return new DSSResponse.System.Exceptions();
    }

    /**
     * Create an instance of {@link DSSResponse.RelevantBreakPoints.RelevantBreakPoint }
     * 
     */
    public DSSResponse.RelevantBreakPoints.RelevantBreakPoint createDSSResponseRelevantBreakPointsRelevantBreakPoint() {
        return new DSSResponse.RelevantBreakPoints.RelevantBreakPoint();
    }

    /**
     * Create an instance of {@link DSSResponse.GuidelineLinks.GuidelineLink }
     * 
     */
    public DSSResponse.GuidelineLinks.GuidelineLink createDSSResponseGuidelineLinksGuidelineLink() {
        return new DSSResponse.GuidelineLinks.GuidelineLink();
    }

    /**
     * Create an instance of {@link DSSResponse.Indications.Indication.Drug }
     * 
     */
    public DSSResponse.Indications.Indication.Drug createDSSResponseIndicationsIndicationDrug() {
        return new DSSResponse.Indications.Indication.Drug();
    }

    /**
     * Create an instance of {@link DSSResponse.Indications.Indication.Diagnosis }
     * 
     */
    public DSSResponse.Indications.Indication.Diagnosis createDSSResponseIndicationsIndicationDiagnosis() {
        return new DSSResponse.Indications.Indication.Diagnosis();
    }

    /**
     * Create an instance of {@link DSSResponse.DrugsToAvoid.DrugToAvoid }
     * 
     */
    public DSSResponse.DrugsToAvoid.DrugToAvoid createDSSResponseDrugsToAvoidDrugToAvoid() {
        return new DSSResponse.DrugsToAvoid.DrugToAvoid();
    }

    /**
     * Create an instance of {@link DSSResponse.DrugsAndPregnancyOrLactation.DrugAndPregnancyOrLactation.Drug }
     * 
     */
    public DSSResponse.DrugsAndPregnancyOrLactation.DrugAndPregnancyOrLactation.Drug createDSSResponseDrugsAndPregnancyOrLactationDrugAndPregnancyOrLactationDrug() {
        return new DSSResponse.DrugsAndPregnancyOrLactation.DrugAndPregnancyOrLactation.Drug();
    }

    /**
     * Create an instance of {@link DSSResponse.DrugsAndRenalFunction.DrugAndRenalFunction.Drug }
     * 
     */
    public DSSResponse.DrugsAndRenalFunction.DrugAndRenalFunction.Drug createDSSResponseDrugsAndRenalFunctionDrugAndRenalFunctionDrug() {
        return new DSSResponse.DrugsAndRenalFunction.DrugAndRenalFunction.Drug();
    }

    /**
     * Create an instance of {@link DSSResponse.Contraindications.Contraindication.Drug }
     * 
     */
    public DSSResponse.Contraindications.Contraindication.Drug createDSSResponseContraindicationsContraindicationDrug() {
        return new DSSResponse.Contraindications.Contraindication.Drug();
    }

    /**
     * Create an instance of {@link DSSResponse.Contraindications.Contraindication.Diagnosis }
     * 
     */
    public DSSResponse.Contraindications.Contraindication.Diagnosis createDSSResponseContraindicationsContraindicationDiagnosis() {
        return new DSSResponse.Contraindications.Contraindication.Diagnosis();
    }

    /**
     * Create an instance of {@link DSSResponse.Interactions.Interaction.Drug1 }
     * 
     */
    public DSSResponse.Interactions.Interaction.Drug1 createDSSResponseInteractionsInteractionDrug1() {
        return new DSSResponse.Interactions.Interaction.Drug1();
    }

    /**
     * Create an instance of {@link DSSResponse.Interactions.Interaction.Drug2 }
     * 
     */
    public DSSResponse.Interactions.Interaction.Drug2 createDSSResponseInteractionsInteractionDrug2() {
        return new DSSResponse.Interactions.Interaction.Drug2();
    }

    /**
     * Create an instance of {@link DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
     * 
     */
    public DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp createDSSResponseRemindersReminderSuggestedActionsSuggestedActionStartStamp() {
        return new DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp();
    }

    /**
     * Create an instance of {@link DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
     * 
     */
    public DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp createDSSResponseRemindersReminderSuggestedActionsSuggestedActionEndStamp() {
        return new DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp();
    }

    /**
     * Create an instance of {@link DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
     * 
     */
    public DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp createDSSResponseRemindersReminderSuggestedActionsSuggestedActionPointStamp() {
        return new DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp();
    }

    /**
     * Create an instance of {@link DSSResponse.Reminders.Reminder.ReminderPatient.A }
     * 
     */
    public DSSResponse.Reminders.Reminder.ReminderPatient.A createDSSResponseRemindersReminderReminderPatientA() {
        return new DSSResponse.Reminders.Reminder.ReminderPatient.A();
    }

    /**
     * Create an instance of {@link DSSResponse.Reminders.Reminder.ReminderNurse.A }
     * 
     */
    public DSSResponse.Reminders.Reminder.ReminderNurse.A createDSSResponseRemindersReminderReminderNurseA() {
        return new DSSResponse.Reminders.Reminder.ReminderNurse.A();
    }

    /**
     * Create an instance of {@link DSSResponse.Reminders.Reminder.ReminderLong.A }
     * 
     */
    public DSSResponse.Reminders.Reminder.ReminderLong.A createDSSResponseRemindersReminderReminderLongA() {
        return new DSSResponse.Reminders.Reminder.ReminderLong.A();
    }

    /**
     * Create an instance of {@link DSSResponse.Reminders.Reminder.ReminderShort.A }
     * 
     */
    public DSSResponse.Reminders.Reminder.ReminderShort.A createDSSResponseRemindersReminderReminderShortA() {
        return new DSSResponse.Reminders.Reminder.ReminderShort.A();
    }

    /**
     * Create an instance of {@link DSSRequest.ExperimentalDataSets.ExperimentalDataSet }
     * 
     */
    public DSSRequest.ExperimentalDataSets.ExperimentalDataSet createDSSRequestExperimentalDataSetsExperimentalDataSet() {
        return new DSSRequest.ExperimentalDataSets.ExperimentalDataSet();
    }

    /**
     * Create an instance of {@link DSSRequest.System.Application.CheckMoment }
     * 
     */
    public DSSRequest.System.Application.CheckMoment createDSSRequestSystemApplicationCheckMoment() {
        return new DSSRequest.System.Application.CheckMoment();
    }

    /**
     * Create an instance of {@link DSSRequest.System.Application.EventTypes }
     * 
     */
    public DSSRequest.System.Application.EventTypes createDSSRequestSystemApplicationEventTypes() {
        return new DSSRequest.System.Application.EventTypes();
    }

    /**
     * Create an instance of {@link DSSRequest.System.Application.Exceptions }
     * 
     */
    public DSSRequest.System.Application.Exceptions createDSSRequestSystemApplicationExceptions() {
        return new DSSRequest.System.Application.Exceptions();
    }

    /**
     * Create an instance of {@link DSSRequest.System.Application.ScriptSelection.ScriptsToBlock.Script }
     * 
     */
    public DSSRequest.System.Application.ScriptSelection.ScriptsToBlock.Script createDSSRequestSystemApplicationScriptSelectionScriptsToBlockScript() {
        return new DSSRequest.System.Application.ScriptSelection.ScriptsToBlock.Script();
    }

    /**
     * Create an instance of {@link DSSRequest.System.Application.ScriptSelection.ScriptsToRun.Script }
     * 
     */
    public DSSRequest.System.Application.ScriptSelection.ScriptsToRun.Script createDSSRequestSystemApplicationScriptSelectionScriptsToRunScript() {
        return new DSSRequest.System.Application.ScriptSelection.ScriptsToRun.Script();
    }

    /**
     * Create an instance of {@link DSSRequest.System.User.UserID }
     * 
     */
    public DSSRequest.System.User.UserID createDSSRequestSystemUserUserID() {
        return new DSSRequest.System.User.UserID();
    }

    /**
     * Create an instance of {@link DSSRequest.System.User.HealthCareOrganization }
     * 
     */
    public DSSRequest.System.User.HealthCareOrganization createDSSRequestSystemUserHealthCareOrganization() {
        return new DSSRequest.System.User.HealthCareOrganization();
    }

    /**
     * Create an instance of {@link DSSRequest.System.User.HealthCareSpecialty }
     * 
     */
    public DSSRequest.System.User.HealthCareSpecialty createDSSRequestSystemUserHealthCareSpecialty() {
        return new DSSRequest.System.User.HealthCareSpecialty();
    }

    /**
     * Create an instance of {@link DSSRequest.System.User.Language }
     * 
     */
    public DSSRequest.System.User.Language createDSSRequestSystemUserLanguage() {
        return new DSSRequest.System.User.Language();
    }

    /**
     * Create an instance of {@link DSSRequest.System.User.Nation }
     * 
     */
    public DSSRequest.System.User.Nation createDSSRequestSystemUserNation() {
        return new DSSRequest.System.User.Nation();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Documents.Document.DocumentReason }
     * 
     */
    public DSSRequest.Patient.Documents.Document.DocumentReason createDSSRequestPatientDocumentsDocumentDocumentReason() {
        return new DSSRequest.Patient.Documents.Document.DocumentReason();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.HealthCareEncounters.HealthCareEncounter.HealthCareUnitType }
     * 
     */
    public DSSRequest.Patient.HealthCareEncounters.HealthCareEncounter.HealthCareUnitType createDSSRequestPatientHealthCareEncountersHealthCareEncounterHealthCareUnitType() {
        return new DSSRequest.Patient.HealthCareEncounters.HealthCareEncounter.HealthCareUnitType();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.HealthCareEncounters.HealthCareEncounter.HealthCareProfessionalType }
     * 
     */
    public DSSRequest.Patient.HealthCareEncounters.HealthCareEncounter.HealthCareProfessionalType createDSSRequestPatientHealthCareEncountersHealthCareEncounterHealthCareProfessionalType() {
        return new DSSRequest.Patient.HealthCareEncounters.HealthCareEncounter.HealthCareProfessionalType();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.HealthCareEncounters.HealthCareEncounter.ReasonForEncounter }
     * 
     */
    public DSSRequest.Patient.HealthCareEncounters.HealthCareEncounter.ReasonForEncounter createDSSRequestPatientHealthCareEncountersHealthCareEncounterReasonForEncounter() {
        return new DSSRequest.Patient.HealthCareEncounters.HealthCareEncounter.ReasonForEncounter();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Interventions.SelfCareInterventions.SelfCareIntervention }
     * 
     */
    public DSSRequest.Patient.Interventions.SelfCareInterventions.SelfCareIntervention createDSSRequestPatientInterventionsSelfCareInterventionsSelfCareIntervention() {
        return new DSSRequest.Patient.Interventions.SelfCareInterventions.SelfCareIntervention();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Interventions.Therapies.Therapy }
     * 
     */
    public DSSRequest.Patient.Interventions.Therapies.Therapy createDSSRequestPatientInterventionsTherapiesTherapy() {
        return new DSSRequest.Patient.Interventions.Therapies.Therapy();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Interventions.Procedures.Procedure.AnatomicalTarget }
     * 
     */
    public DSSRequest.Patient.Interventions.Procedures.Procedure.AnatomicalTarget createDSSRequestPatientInterventionsProceduresProcedureAnatomicalTarget() {
        return new DSSRequest.Patient.Interventions.Procedures.Procedure.AnatomicalTarget();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Interventions.Procedures.Procedure.MaterialsAndImplants.Material }
     * 
     */
    public DSSRequest.Patient.Interventions.Procedures.Procedure.MaterialsAndImplants.Material createDSSRequestPatientInterventionsProceduresProcedureMaterialsAndImplantsMaterial() {
        return new DSSRequest.Patient.Interventions.Procedures.Procedure.MaterialsAndImplants.Material();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Interventions.Procedures.Procedure.MaterialsAndImplants.Implant }
     * 
     */
    public DSSRequest.Patient.Interventions.Procedures.Procedure.MaterialsAndImplants.Implant createDSSRequestPatientInterventionsProceduresProcedureMaterialsAndImplantsImplant() {
        return new DSSRequest.Patient.Interventions.Procedures.Procedure.MaterialsAndImplants.Implant();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Interventions.Vaccinations.Vaccine }
     * 
     */
    public DSSRequest.Patient.Interventions.Vaccinations.Vaccine createDSSRequestPatientInterventionsVaccinationsVaccine() {
        return new DSSRequest.Patient.Interventions.Vaccinations.Vaccine();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Interventions.Medication.Drug.AdministrationRoute }
     * 
     */
    public DSSRequest.Patient.Interventions.Medication.Drug.AdministrationRoute createDSSRequestPatientInterventionsMedicationDrugAdministrationRoute() {
        return new DSSRequest.Patient.Interventions.Medication.Drug.AdministrationRoute();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Interventions.Medication.Drug.LastPrescription }
     * 
     */
    public DSSRequest.Patient.Interventions.Medication.Drug.LastPrescription createDSSRequestPatientInterventionsMedicationDrugLastPrescription() {
        return new DSSRequest.Patient.Interventions.Medication.Drug.LastPrescription();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Investigations.Questionnaires.Questionnaire.Questions.Question }
     * 
     */
    public DSSRequest.Patient.Investigations.Questionnaires.Questionnaire.Questions.Question createDSSRequestPatientInvestigationsQuestionnairesQuestionnaireQuestionsQuestion() {
        return new DSSRequest.Patient.Investigations.Questionnaires.Questionnaire.Questions.Question();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Investigations.ImagingInvestigations.ImagingInvestigation }
     * 
     */
    public DSSRequest.Patient.Investigations.ImagingInvestigations.ImagingInvestigation createDSSRequestPatientInvestigationsImagingInvestigationsImagingInvestigation() {
        return new DSSRequest.Patient.Investigations.ImagingInvestigations.ImagingInvestigation();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Investigations.Measurements.Measurement.Result }
     * 
     */
    public DSSRequest.Patient.Investigations.Measurements.Measurement.Result createDSSRequestPatientInvestigationsMeasurementsMeasurementResult() {
        return new DSSRequest.Patient.Investigations.Measurements.Measurement.Result();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Problems.Diagnoses.Diagnosis }
     * 
     */
    public DSSRequest.Patient.Problems.Diagnoses.Diagnosis createDSSRequestPatientProblemsDiagnosesDiagnosis() {
        return new DSSRequest.Patient.Problems.Diagnoses.Diagnosis();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Risks.AlcoholConsumption }
     * 
     */
    public DSSRequest.Patient.Risks.AlcoholConsumption createDSSRequestPatientRisksAlcoholConsumption() {
        return new DSSRequest.Patient.Risks.AlcoholConsumption();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Risks.Pregnancy }
     * 
     */
    public DSSRequest.Patient.Risks.Pregnancy createDSSRequestPatientRisksPregnancy() {
        return new DSSRequest.Patient.Risks.Pregnancy();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Risks.Lactation }
     * 
     */
    public DSSRequest.Patient.Risks.Lactation createDSSRequestPatientRisksLactation() {
        return new DSSRequest.Patient.Risks.Lactation();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Risks.NonDrugHypersensitivities.NonDrugHypersensitivity.HypersensitivityReaction.RiskLevel }
     * 
     */
    public DSSRequest.Patient.Risks.NonDrugHypersensitivities.NonDrugHypersensitivity.HypersensitivityReaction.RiskLevel createDSSRequestPatientRisksNonDrugHypersensitivitiesNonDrugHypersensitivityHypersensitivityReactionRiskLevel() {
        return new DSSRequest.Patient.Risks.NonDrugHypersensitivities.NonDrugHypersensitivity.HypersensitivityReaction.RiskLevel();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Risks.FamilialDiseases.FamilialDisease }
     * 
     */
    public DSSRequest.Patient.Risks.FamilialDiseases.FamilialDisease createDSSRequestPatientRisksFamilialDiseasesFamilialDisease() {
        return new DSSRequest.Patient.Risks.FamilialDiseases.FamilialDisease();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Risks.Smoking.SmokingStatus }
     * 
     */
    public DSSRequest.Patient.Risks.Smoking.SmokingStatus createDSSRequestPatientRisksSmokingSmokingStatus() {
        return new DSSRequest.Patient.Risks.Smoking.SmokingStatus();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Risks.DrugsToAvoid.DrugToAvoid.ReasonsForAvoiding.ReasonForAvoiding.RiskLevel }
     * 
     */
    public DSSRequest.Patient.Risks.DrugsToAvoid.DrugToAvoid.ReasonsForAvoiding.ReasonForAvoiding.RiskLevel createDSSRequestPatientRisksDrugsToAvoidDrugToAvoidReasonsForAvoidingReasonForAvoidingRiskLevel() {
        return new DSSRequest.Patient.Risks.DrugsToAvoid.DrugToAvoid.ReasonsForAvoiding.ReasonForAvoiding.RiskLevel();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Properties.BirthTimeStamp }
     * 
     */
    public DSSRequest.Patient.Properties.BirthTimeStamp createDSSRequestPatientPropertiesBirthTimeStamp() {
        return new DSSRequest.Patient.Properties.BirthTimeStamp();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Properties.Ethnicity }
     * 
     */
    public DSSRequest.Patient.Properties.Ethnicity createDSSRequestPatientPropertiesEthnicity() {
        return new DSSRequest.Patient.Properties.Ethnicity();
    }

    /**
     * Create an instance of {@link DSSRequest.Patient.Properties.Professions.Profession }
     * 
     */
    public DSSRequest.Patient.Properties.Professions.Profession createDSSRequestPatientPropertiesProfessionsProfession() {
        return new DSSRequest.Patient.Properties.Professions.Profession();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodeValue", scope = DSSRequest.System.User.HealthCareSpecialty.class)
    public JAXBElement<String> createDSSRequestSystemUserHealthCareSpecialtyCodeValue(String value) {
        return new JAXBElement<String>(_DSSRequestSystemUserHealthCareSpecialtyCodeValue_QNAME, String.class, DSSRequest.System.User.HealthCareSpecialty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodeSystem", scope = DSSRequest.System.User.HealthCareSpecialty.class)
    public JAXBElement<String> createDSSRequestSystemUserHealthCareSpecialtyCodeSystem(String value) {
        return new JAXBElement<String>(_DSSRequestSystemUserHealthCareSpecialtyCodeSystem_QNAME, String.class, DSSRequest.System.User.HealthCareSpecialty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodeSystemVersion", scope = DSSRequest.System.User.HealthCareSpecialty.class)
    public JAXBElement<String> createDSSRequestSystemUserHealthCareSpecialtyCodeSystemVersion(String value) {
        return new JAXBElement<String>(_DSSRequestSystemUserHealthCareSpecialtyCodeSystemVersion_QNAME, String.class, DSSRequest.System.User.HealthCareSpecialty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PointDate", scope = DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp.class)
    public JAXBElement<XMLGregorianCalendar> createDSSResponseRemindersReminderSuggestedActionsSuggestedActionPointStampPointDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DSSResponseRemindersReminderSuggestedActionsSuggestedActionPointStampPointDate_QNAME, XMLGregorianCalendar.class, DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PointTime", scope = DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp.class)
    public JAXBElement<XMLGregorianCalendar> createDSSResponseRemindersReminderSuggestedActionsSuggestedActionPointStampPointTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DSSResponseRemindersReminderSuggestedActionsSuggestedActionPointStampPointTime_QNAME, XMLGregorianCalendar.class, DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodeValue", scope = DSSRequest.System.User.UserID.class)
    public JAXBElement<String> createDSSRequestSystemUserUserIDCodeValue(String value) {
        return new JAXBElement<String>(_DSSRequestSystemUserHealthCareSpecialtyCodeValue_QNAME, String.class, DSSRequest.System.User.UserID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodeSystem", scope = DSSRequest.System.User.UserID.class)
    public JAXBElement<String> createDSSRequestSystemUserUserIDCodeSystem(String value) {
        return new JAXBElement<String>(_DSSRequestSystemUserHealthCareSpecialtyCodeSystem_QNAME, String.class, DSSRequest.System.User.UserID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodeSystemVersion", scope = DSSRequest.System.User.UserID.class)
    public JAXBElement<String> createDSSRequestSystemUserUserIDCodeSystemVersion(String value) {
        return new JAXBElement<String>(_DSSRequestSystemUserHealthCareSpecialtyCodeSystemVersion_QNAME, String.class, DSSRequest.System.User.UserID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSSResponse.Reminders.Reminder.ReminderShort.A }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "a", scope = DSSResponse.Reminders.Reminder.ReminderShort.class)
    public JAXBElement<DSSResponse.Reminders.Reminder.ReminderShort.A> createDSSResponseRemindersReminderReminderShortA(DSSResponse.Reminders.Reminder.ReminderShort.A value) {
        return new JAXBElement<DSSResponse.Reminders.Reminder.ReminderShort.A>(_DSSResponseRemindersReminderReminderShortA_QNAME, DSSResponse.Reminders.Reminder.ReminderShort.A.class, DSSResponse.Reminders.Reminder.ReminderShort.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Strength", scope = DSSRequest.Patient.Interventions.Medication.Drug.class)
    public JAXBElement<BigDecimal> createDSSRequestPatientInterventionsMedicationDrugStrength(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DSSRequestPatientInterventionsMedicationDrugStrength_QNAME, BigDecimal.class, DSSRequest.Patient.Interventions.Medication.Drug.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodeValue", scope = DSSRequest.Patient.Interventions.Medication.Drug.class)
    public JAXBElement<String> createDSSRequestPatientInterventionsMedicationDrugCodeValue(String value) {
        return new JAXBElement<String>(_DSSRequestSystemUserHealthCareSpecialtyCodeValue_QNAME, String.class, DSSRequest.Patient.Interventions.Medication.Drug.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DailyDose", scope = DSSRequest.Patient.Interventions.Medication.Drug.class)
    public JAXBElement<BigDecimal> createDSSRequestPatientInterventionsMedicationDrugDailyDose(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DSSRequestPatientInterventionsMedicationDrugDailyDose_QNAME, BigDecimal.class, DSSRequest.Patient.Interventions.Medication.Drug.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodeSystem", scope = DSSRequest.Patient.Interventions.Medication.Drug.class)
    public JAXBElement<String> createDSSRequestPatientInterventionsMedicationDrugCodeSystem(String value) {
        return new JAXBElement<String>(_DSSRequestSystemUserHealthCareSpecialtyCodeSystem_QNAME, String.class, DSSRequest.Patient.Interventions.Medication.Drug.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodeSystemVersion", scope = DSSRequest.Patient.Interventions.Medication.Drug.class)
    public JAXBElement<String> createDSSRequestPatientInterventionsMedicationDrugCodeSystemVersion(String value) {
        return new JAXBElement<String>(_DSSRequestSystemUserHealthCareSpecialtyCodeSystemVersion_QNAME, String.class, DSSRequest.Patient.Interventions.Medication.Drug.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EndDate", scope = DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp.class)
    public JAXBElement<XMLGregorianCalendar> createDSSResponseRemindersReminderSuggestedActionsSuggestedActionEndStampEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DSSResponseRemindersReminderSuggestedActionsSuggestedActionEndStampEndDate_QNAME, XMLGregorianCalendar.class, DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EndTime", scope = DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp.class)
    public JAXBElement<XMLGregorianCalendar> createDSSResponseRemindersReminderSuggestedActionsSuggestedActionEndStampEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DSSResponseRemindersReminderSuggestedActionsSuggestedActionEndStampEndTime_QNAME, XMLGregorianCalendar.class, DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSSResponse.Reminders.Reminder.ReminderPatient.A }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "a", scope = DSSResponse.Reminders.Reminder.ReminderPatient.class)
    public JAXBElement<DSSResponse.Reminders.Reminder.ReminderPatient.A> createDSSResponseRemindersReminderReminderPatientA(DSSResponse.Reminders.Reminder.ReminderPatient.A value) {
        return new JAXBElement<DSSResponse.Reminders.Reminder.ReminderPatient.A>(_DSSResponseRemindersReminderReminderShortA_QNAME, DSSResponse.Reminders.Reminder.ReminderPatient.A.class, DSSResponse.Reminders.Reminder.ReminderPatient.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSSResponse.Reminders.Reminder.ReminderLong.A }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "a", scope = DSSResponse.Reminders.Reminder.ReminderLong.class)
    public JAXBElement<DSSResponse.Reminders.Reminder.ReminderLong.A> createDSSResponseRemindersReminderReminderLongA(DSSResponse.Reminders.Reminder.ReminderLong.A value) {
        return new JAXBElement<DSSResponse.Reminders.Reminder.ReminderLong.A>(_DSSResponseRemindersReminderReminderShortA_QNAME, DSSResponse.Reminders.Reminder.ReminderLong.A.class, DSSResponse.Reminders.Reminder.ReminderLong.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "StartDate", scope = DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp.class)
    public JAXBElement<XMLGregorianCalendar> createDSSResponseRemindersReminderSuggestedActionsSuggestedActionStartStampStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DSSResponseRemindersReminderSuggestedActionsSuggestedActionStartStampStartDate_QNAME, XMLGregorianCalendar.class, DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "StartTime", scope = DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp.class)
    public JAXBElement<XMLGregorianCalendar> createDSSResponseRemindersReminderSuggestedActionsSuggestedActionStartStampStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DSSResponseRemindersReminderSuggestedActionsSuggestedActionStartStampStartTime_QNAME, XMLGregorianCalendar.class, DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HealthCareOrganizationName", scope = DSSRequest.System.User.HealthCareOrganization.class)
    public JAXBElement<String> createDSSRequestSystemUserHealthCareOrganizationHealthCareOrganizationName(String value) {
        return new JAXBElement<String>(_DSSRequestSystemUserHealthCareOrganizationHealthCareOrganizationName_QNAME, String.class, DSSRequest.System.User.HealthCareOrganization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodeValue", scope = DSSRequest.System.User.HealthCareOrganization.class)
    public JAXBElement<String> createDSSRequestSystemUserHealthCareOrganizationCodeValue(String value) {
        return new JAXBElement<String>(_DSSRequestSystemUserHealthCareSpecialtyCodeValue_QNAME, String.class, DSSRequest.System.User.HealthCareOrganization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodeSystem", scope = DSSRequest.System.User.HealthCareOrganization.class)
    public JAXBElement<String> createDSSRequestSystemUserHealthCareOrganizationCodeSystem(String value) {
        return new JAXBElement<String>(_DSSRequestSystemUserHealthCareSpecialtyCodeSystem_QNAME, String.class, DSSRequest.System.User.HealthCareOrganization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodeSystemVersion", scope = DSSRequest.System.User.HealthCareOrganization.class)
    public JAXBElement<String> createDSSRequestSystemUserHealthCareOrganizationCodeSystemVersion(String value) {
        return new JAXBElement<String>(_DSSRequestSystemUserHealthCareSpecialtyCodeSystemVersion_QNAME, String.class, DSSRequest.System.User.HealthCareOrganization.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodeValue", scope = DSSRequest.Patient.Risks.Smoking.SmokingStatus.class)
    public JAXBElement<String> createDSSRequestPatientRisksSmokingSmokingStatusCodeValue(String value) {
        return new JAXBElement<String>(_DSSRequestSystemUserHealthCareSpecialtyCodeValue_QNAME, String.class, DSSRequest.Patient.Risks.Smoking.SmokingStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodeSystem", scope = DSSRequest.Patient.Risks.Smoking.SmokingStatus.class)
    public JAXBElement<String> createDSSRequestPatientRisksSmokingSmokingStatusCodeSystem(String value) {
        return new JAXBElement<String>(_DSSRequestSystemUserHealthCareSpecialtyCodeSystem_QNAME, String.class, DSSRequest.Patient.Risks.Smoking.SmokingStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CodeSystemVersion", scope = DSSRequest.Patient.Risks.Smoking.SmokingStatus.class)
    public JAXBElement<String> createDSSRequestPatientRisksSmokingSmokingStatusCodeSystemVersion(String value) {
        return new JAXBElement<String>(_DSSRequestSystemUserHealthCareSpecialtyCodeSystemVersion_QNAME, String.class, DSSRequest.Patient.Risks.Smoking.SmokingStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSSResponse.Reminders.Reminder.ReminderNurse.A }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "a", scope = DSSResponse.Reminders.Reminder.ReminderNurse.class)
    public JAXBElement<DSSResponse.Reminders.Reminder.ReminderNurse.A> createDSSResponseRemindersReminderReminderNurseA(DSSResponse.Reminders.Reminder.ReminderNurse.A value) {
        return new JAXBElement<DSSResponse.Reminders.Reminder.ReminderNurse.A>(_DSSResponseRemindersReminderReminderShortA_QNAME, DSSResponse.Reminders.Reminder.ReminderNurse.A.class, DSSResponse.Reminders.Reminder.ReminderNurse.class, value);
    }

}
