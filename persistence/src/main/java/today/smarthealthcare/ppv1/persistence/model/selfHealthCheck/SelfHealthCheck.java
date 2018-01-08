package today.smarthealthcare.ppv1.persistence.model.selfHealthCheck;

import javax.persistence.*;
import java.util.Date;

/**
 * @author: Vadim Nesmashnov
 */
@Entity
@Table(name = "SELFHEALTHCHECK")
public class SelfHealthCheck {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "PATIENT_ID")
    private Long patientId;

    private boolean headache;
    private boolean painInBones;
    private boolean painInRespiratoryTract;
    private boolean stomachacheTop;
    private boolean stomachacheMiddle;
    private boolean stomachacheBottom;
    private boolean rheum;
    private boolean cough;
    private boolean painInThroat;
    private boolean painInLungs;
    private boolean rheumAndThroat;
    private boolean stitchesInHeartZone;
    private boolean stitchesInOtherBodyParts;
    private boolean cardiacRhythmDisorders;
    private boolean fever;
    private boolean vomiting;
    private boolean diarrhea;
    private boolean injury;
    private boolean inflammationVisible;
    private boolean inflammationNotVisible;
    private boolean urination;
    private boolean anxiety;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

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

    public boolean isHeadache() {
        return headache;
    }

    public void setHeadache(boolean headache) {
        this.headache = headache;
    }

    public boolean isPainInBones() {
        return painInBones;
    }

    public void setPainInBones(boolean painInBones) {
        this.painInBones = painInBones;
    }

    public boolean isPainInRespiratoryTract() {
        return painInRespiratoryTract;
    }

    public void setPainInRespiratoryTract(boolean painInRespiratoryTract) {
        this.painInRespiratoryTract = painInRespiratoryTract;
    }

    public boolean isStomachacheTop() {
        return stomachacheTop;
    }

    public void setStomachacheTop(boolean stomachacheTop) {
        this.stomachacheTop = stomachacheTop;
    }

    public boolean isStomachacheMiddle() {
        return stomachacheMiddle;
    }

    public void setStomachacheMiddle(boolean stomachacheMiddle) {
        this.stomachacheMiddle = stomachacheMiddle;
    }

    public boolean isStomachacheBottom() {
        return stomachacheBottom;
    }

    public void setStomachacheBottom(boolean stomachacheBottom) {
        this.stomachacheBottom = stomachacheBottom;
    }

    public boolean isRheum() {
        return rheum;
    }

    public void setRheum(boolean rheum) {
        this.rheum = rheum;
    }

    public boolean isCough() {
        return cough;
    }

    public void setCough(boolean cough) {
        this.cough = cough;
    }

    public boolean isPainInThroat() {
        return painInThroat;
    }

    public void setPainInThroat(boolean painInThroat) {
        this.painInThroat = painInThroat;
    }

    public boolean isPainInLungs() {
        return painInLungs;
    }

    public void setPainInLungs(boolean painInLungs) {
        this.painInLungs = painInLungs;
    }

    public boolean isRheumAndThroat() {
        return rheumAndThroat;
    }

    public void setRheumAndThroat(boolean rheumAndThroat) {
        this.rheumAndThroat = rheumAndThroat;
    }

    public boolean isStitchesInHeartZone() {
        return stitchesInHeartZone;
    }

    public void setStitchesInHeartZone(boolean stitchesInHeartZone) {
        this.stitchesInHeartZone = stitchesInHeartZone;
    }

    public boolean isStitchesInOtherBodyParts() {
        return stitchesInOtherBodyParts;
    }

    public void setStitchesInOtherBodyParts(boolean stitchesInOtherBodyParts) {
        this.stitchesInOtherBodyParts = stitchesInOtherBodyParts;
    }

    public boolean isCardiacRhythmDisorders() {
        return cardiacRhythmDisorders;
    }

    public void setCardiacRhythmDisorders(boolean cardiacRhythmDisorders) {
        this.cardiacRhythmDisorders = cardiacRhythmDisorders;
    }

    public boolean isFever() {
        return fever;
    }

    public void setFever(boolean fever) {
        this.fever = fever;
    }

    public boolean isVomiting() {
        return vomiting;
    }

    public void setVomiting(boolean vomiting) {
        this.vomiting = vomiting;
    }

    public boolean isDiarrhea() {
        return diarrhea;
    }

    public void setDiarrhea(boolean diarrhea) {
        this.diarrhea = diarrhea;
    }

    public boolean isInjury() {
        return injury;
    }

    public void setInjury(boolean injury) {
        this.injury = injury;
    }

    public boolean isInflammationVisible() {
        return inflammationVisible;
    }

    public void setInflammationVisible(boolean inflammationVisible) {
        this.inflammationVisible = inflammationVisible;
    }

    public boolean isInflammationNotVisible() {
        return inflammationNotVisible;
    }

    public void setInflammationNotVisible(boolean inflammationNotVisible) {
        this.inflammationNotVisible = inflammationNotVisible;
    }

    public boolean isUrination() {
        return urination;
    }

    public void setUrination(boolean urination) {
        this.urination = urination;
    }

    public boolean isAnxiety() {
        return anxiety;
    }

    public void setAnxiety(boolean anxiety) {
        this.anxiety = anxiety;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
