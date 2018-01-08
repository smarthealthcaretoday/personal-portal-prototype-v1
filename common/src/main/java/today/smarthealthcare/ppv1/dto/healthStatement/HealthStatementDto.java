package today.smarthealthcare.ppv1.dto.healthStatement;

/**
 * Personal health statement DTO
 *
 * @author: Vadim Nesmashnov
 */
public class HealthStatementDto {
    private Long id;
    private Long patientId;
    private LifeStyleDto lifeStyle;
    private MedicalDevicesDto medicalDevices;
    private CardiovascularConditionDto cardiovascularCondition;
    private WorkingEnvironmentDto workingEnvironment;
    private AllergiesDto allergies;
    private BloodProblemsDto bloodProblems;
    private BonesJointsMusclesDto bonesJointsMuscles;
    private DigestiveOrgansDto digestiveOrgans;
    private EarNoseThroatDto earNoseThroat;
    private EyesAndVisionDto eyesAndVision;
    private InfectiousDiseasesDto infectiousDiseases;
    private MentalHealthDto mentalHealth;
    private MetabolicDisordersDto metabolicDisorders;
    private NervousSystemDto nervousSystem;
    private OtherChronicDiseasesDto otherChronicDiseases;
    private RespiratorySystemDto respiratorySystem;
    private SkinDisordersDto skinDisorders;
    private TraumasDto traumas;
    private TreatmentUpToNowDto treatmentUpToNow;
    private UrogenitalSystemDto urogenitalSystem;

    public HealthStatementDto() {
    }

    public HealthStatementDto(Long patientId) {
        this.patientId = patientId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public LifeStyleDto getLifeStyle() {
        return lifeStyle;
    }

    public void setLifeStyle(LifeStyleDto lifeStyle) {
        this.lifeStyle = lifeStyle;
    }

    public MedicalDevicesDto getMedicalDevices() {
        return medicalDevices;
    }

    public void setMedicalDevices(MedicalDevicesDto medicalDevices) {
        this.medicalDevices = medicalDevices;
    }

    public CardiovascularConditionDto getCardiovascularCondition() {
        return cardiovascularCondition;
    }

    public void setCardiovascularCondition(CardiovascularConditionDto cardiovascularCondition) {
        this.cardiovascularCondition = cardiovascularCondition;
    }

    public WorkingEnvironmentDto getWorkingEnvironment() {
        return workingEnvironment;
    }

    public void setWorkingEnvironment(WorkingEnvironmentDto workingEnvironment) {
        this.workingEnvironment = workingEnvironment;
    }

    public AllergiesDto getAllergies() {
        return allergies;
    }

    public void setAllergies(AllergiesDto allergies) {
        this.allergies = allergies;
    }

    public BloodProblemsDto getBloodProblems() {
        return bloodProblems;
    }

    public void setBloodProblems(BloodProblemsDto bloodProblems) {
        this.bloodProblems = bloodProblems;
    }

    public BonesJointsMusclesDto getBonesJointsMuscles() {
        return bonesJointsMuscles;
    }

    public void setBonesJointsMuscles(BonesJointsMusclesDto bonesJointsMuscles) {
        this.bonesJointsMuscles = bonesJointsMuscles;
    }

    public DigestiveOrgansDto getDigestiveOrgans() {
        return digestiveOrgans;
    }

    public void setDigestiveOrgans(DigestiveOrgansDto digestiveOrgans) {
        this.digestiveOrgans = digestiveOrgans;
    }

    public EarNoseThroatDto getEarNoseThroat() {
        return earNoseThroat;
    }

    public void setEarNoseThroat(EarNoseThroatDto earNoseThroat) {
        this.earNoseThroat = earNoseThroat;
    }

    public EyesAndVisionDto getEyesAndVision() {
        return eyesAndVision;
    }

    public void setEyesAndVision(EyesAndVisionDto eyesAndVision) {
        this.eyesAndVision = eyesAndVision;
    }

    public InfectiousDiseasesDto getInfectiousDiseases() {
        return infectiousDiseases;
    }

    public void setInfectiousDiseases(InfectiousDiseasesDto infectiousDiseases) {
        this.infectiousDiseases = infectiousDiseases;
    }

    public MentalHealthDto getMentalHealth() {
        return mentalHealth;
    }

    public void setMentalHealth(MentalHealthDto mentalHealth) {
        this.mentalHealth = mentalHealth;
    }

    public MetabolicDisordersDto getMetabolicDisorders() {
        return metabolicDisorders;
    }

    public void setMetabolicDisorders(MetabolicDisordersDto metabolicDisorders) {
        this.metabolicDisorders = metabolicDisorders;
    }

    public NervousSystemDto getNervousSystem() {
        return nervousSystem;
    }

    public void setNervousSystem(NervousSystemDto nervousSystem) {
        this.nervousSystem = nervousSystem;
    }

    public OtherChronicDiseasesDto getOtherChronicDiseases() {
        return otherChronicDiseases;
    }

    public void setOtherChronicDiseases(OtherChronicDiseasesDto otherChronicDiseases) {
        this.otherChronicDiseases = otherChronicDiseases;
    }

    public RespiratorySystemDto getRespiratorySystem() {
        return respiratorySystem;
    }

    public void setRespiratorySystem(RespiratorySystemDto respiratorySystem) {
        this.respiratorySystem = respiratorySystem;
    }

    public SkinDisordersDto getSkinDisorders() {
        return skinDisorders;
    }

    public void setSkinDisorders(SkinDisordersDto skinDisorders) {
        this.skinDisorders = skinDisorders;
    }

    public TraumasDto getTraumas() {
        return traumas;
    }

    public void setTraumas(TraumasDto traumas) {
        this.traumas = traumas;
    }

    public TreatmentUpToNowDto getTreatmentUpToNow() {
        return treatmentUpToNow;
    }

    public void setTreatmentUpToNow(TreatmentUpToNowDto treatmentUpToNow) {
        this.treatmentUpToNow = treatmentUpToNow;
    }

    public UrogenitalSystemDto getUrogenitalSystem() {
        return urogenitalSystem;
    }

    public void setUrogenitalSystem(UrogenitalSystemDto urogenitalSystem) {
        this.urogenitalSystem = urogenitalSystem;
    }
}
