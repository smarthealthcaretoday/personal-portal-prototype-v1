package today.smarthealthcare.ppv1.persistence.model.healthStatement;

import javax.persistence.*;
import java.util.Objects;

/**
 * Personal health statement
 *
 * @author: Vadim Nesmashnov
 */
@Entity
@Table(name = "HEALTHSTATEMENT")
public class HealthStatement {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "PATIENT_ID")
    private Long patientId;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private LifeStyle lifeStyle;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private MedicalDevices medicalDevices;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private CardiovascularCondition cardiovascularCondition;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private WorkingEnvironment workingEnvironment;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Allergies allergies;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private BloodProblems bloodProblems;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private BonesJointsMuscles bonesJointsMuscles;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private DigestiveOrgans digestiveOrgans;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private EarNoseThroat earNoseThroat;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private EyesAndVision eyesAndVision;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private InfectiousDiseases infectiousDiseases;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private MentalHealth mentalHealth;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private MetabolicDisorders metabolicDisorders;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private NervousSystem nervousSystem;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private OtherChronicDiseases otherChronicDiseases;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private RespiratorySystem respiratorySystem;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private SkinDisorders skinDisorders;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Traumas traumas;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private TreatmentUpToNow treatmentUpToNow;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private UrogenitalSystem urogenitalSystem;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public HealthStatement() {
    }

    public HealthStatement(Long patientId) {
        this.patientId = patientId;
        this.lifeStyle = new LifeStyle();
        this.medicalDevices = new MedicalDevices();
        this.cardiovascularCondition = new CardiovascularCondition();
        this.workingEnvironment = new WorkingEnvironment();
        this.allergies = new Allergies();
        this.bloodProblems = new BloodProblems();
        this.bonesJointsMuscles = new BonesJointsMuscles();
        this.digestiveOrgans = new DigestiveOrgans();
        this.earNoseThroat = new EarNoseThroat();
        this.eyesAndVision = new EyesAndVision();
        this.infectiousDiseases = new InfectiousDiseases();
        this.mentalHealth = new MentalHealth();
        this.metabolicDisorders = new MetabolicDisorders();
        this.nervousSystem = new NervousSystem();
        this.otherChronicDiseases = new OtherChronicDiseases();
        this.respiratorySystem = new RespiratorySystem();
        this.skinDisorders = new SkinDisorders();
        this.traumas = new Traumas();
        this.treatmentUpToNow = new TreatmentUpToNow();
        this.urogenitalSystem = new UrogenitalSystem();
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public LifeStyle getLifeStyle() {
        return lifeStyle;
    }

    public void setLifeStyle(LifeStyle lifeStyle) {
        this.lifeStyle = lifeStyle;
    }

    public MedicalDevices getMedicalDevices() {
        return medicalDevices;
    }

    public void setMedicalDevices(MedicalDevices medicalDevices) {
        this.medicalDevices = medicalDevices;
    }

    public CardiovascularCondition getCardiovascularCondition() {
        return cardiovascularCondition;
    }

    public void setCardiovascularCondition(CardiovascularCondition cardiovascularCondition) {
        this.cardiovascularCondition = cardiovascularCondition;
    }

    public WorkingEnvironment getWorkingEnvironment() {
        return workingEnvironment;
    }

    public void setWorkingEnvironment(WorkingEnvironment workingEnvironment) {
        this.workingEnvironment = workingEnvironment;
    }

    public Allergies getAllergies() {
        return allergies;
    }

    public void setAllergies(Allergies allergies) {
        this.allergies = allergies;
    }

    public BloodProblems getBloodProblems() {
        return bloodProblems;
    }

    public void setBloodProblems(BloodProblems bloodProblems) {
        this.bloodProblems = bloodProblems;
    }

    public BonesJointsMuscles getBonesJointsMuscles() {
        return bonesJointsMuscles;
    }

    public void setBonesJointsMuscles(BonesJointsMuscles bonesJointsMuscles) {
        this.bonesJointsMuscles = bonesJointsMuscles;
    }

    public DigestiveOrgans getDigestiveOrgans() {
        return digestiveOrgans;
    }

    public void setDigestiveOrgans(DigestiveOrgans digestiveOrgans) {
        this.digestiveOrgans = digestiveOrgans;
    }

    public EarNoseThroat getEarNoseThroat() {
        return earNoseThroat;
    }

    public void setEarNoseThroat(EarNoseThroat earNoseThroat) {
        this.earNoseThroat = earNoseThroat;
    }

    public EyesAndVision getEyesAndVision() {
        return eyesAndVision;
    }

    public void setEyesAndVision(EyesAndVision eyesAndVision) {
        this.eyesAndVision = eyesAndVision;
    }

    public InfectiousDiseases getInfectiousDiseases() {
        return infectiousDiseases;
    }

    public void setInfectiousDiseases(InfectiousDiseases infectiousDiseases) {
        this.infectiousDiseases = infectiousDiseases;
    }

    public MentalHealth getMentalHealth() {
        return mentalHealth;
    }

    public void setMentalHealth(MentalHealth mentalHealth) {
        this.mentalHealth = mentalHealth;
    }

    public MetabolicDisorders getMetabolicDisorders() {
        return metabolicDisorders;
    }

    public void setMetabolicDisorders(MetabolicDisorders metabolicDisorders) {
        this.metabolicDisorders = metabolicDisorders;
    }

    public NervousSystem getNervousSystem() {
        return nervousSystem;
    }

    public void setNervousSystem(NervousSystem nervousSystem) {
        this.nervousSystem = nervousSystem;
    }

    public OtherChronicDiseases getOtherChronicDiseases() {
        return otherChronicDiseases;
    }

    public void setOtherChronicDiseases(OtherChronicDiseases otherChronicDiseases) {
        this.otherChronicDiseases = otherChronicDiseases;
    }

    public RespiratorySystem getRespiratorySystem() {
        return respiratorySystem;
    }

    public void setRespiratorySystem(RespiratorySystem respiratorySystem) {
        this.respiratorySystem = respiratorySystem;
    }

    public SkinDisorders getSkinDisorders() {
        return skinDisorders;
    }

    public void setSkinDisorders(SkinDisorders skinDisorders) {
        this.skinDisorders = skinDisorders;
    }

    public Traumas getTraumas() {
        return traumas;
    }

    public void setTraumas(Traumas traumas) {
        this.traumas = traumas;
    }

    public TreatmentUpToNow getTreatmentUpToNow() {
        return treatmentUpToNow;
    }

    public void setTreatmentUpToNow(TreatmentUpToNow treatmentUpToNow) {
        this.treatmentUpToNow = treatmentUpToNow;
    }

    public UrogenitalSystem getUrogenitalSystem() {
        return urogenitalSystem;
    }

    public void setUrogenitalSystem(UrogenitalSystem urogenitalSystem) {
        this.urogenitalSystem = urogenitalSystem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HealthStatement that = (HealthStatement) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
