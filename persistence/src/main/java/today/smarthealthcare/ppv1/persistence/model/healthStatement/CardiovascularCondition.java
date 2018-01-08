package today.smarthealthcare.ppv1.persistence.model.healthStatement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

/**
 * Cardiovascular condition part of personal health statement
 *
 * @author: Vadim Nesmashnov
 */
@Entity
@Table(name = "HEALTHSTATEMENTCARDIOVASCULARCONDITION")
public class CardiovascularCondition {
    @Id
    @GeneratedValue
    private Long id;
    private boolean noComplains;
    private boolean chestPain;
    private String chestPainDetails;
    private boolean highBloodPressure;
    private String highBloodPressureDetails;
    private boolean heartAttack;
    private String heartAttackDetails;
    private boolean arrythmia;
    private String arrythmiaDetails;
    private boolean angioplasty;
    private String angioplastyDetails;
    private boolean pacemaker;
    private String pacemakerDetails;
    private boolean heartSurgery;
    private String heartSurgeryDetails;
    private boolean otherDisease;
    private String otherDiseaseDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isNoComplains() {
        return noComplains;
    }

    public void setNoComplains(boolean noComplains) {
        this.noComplains = noComplains;
    }

    public boolean isChestPain() {
        return chestPain;
    }

    public void setChestPain(boolean chestPain) {
        this.chestPain = chestPain;
    }

    public String getChestPainDetails() {
        return chestPainDetails;
    }

    public void setChestPainDetails(String chestPainDetails) {
        this.chestPainDetails = chestPainDetails;
    }

    public boolean isHighBloodPressure() {
        return highBloodPressure;
    }

    public void setHighBloodPressure(boolean highBloodPressure) {
        this.highBloodPressure = highBloodPressure;
    }

    public String getHighBloodPressureDetails() {
        return highBloodPressureDetails;
    }

    public void setHighBloodPressureDetails(String highBloodPressureDetails) {
        this.highBloodPressureDetails = highBloodPressureDetails;
    }

    public boolean isHeartAttack() {
        return heartAttack;
    }

    public void setHeartAttack(boolean heartAttack) {
        this.heartAttack = heartAttack;
    }

    public String getHeartAttackDetails() {
        return heartAttackDetails;
    }

    public void setHeartAttackDetails(String heartAttackDetails) {
        this.heartAttackDetails = heartAttackDetails;
    }

    public boolean isArrythmia() {
        return arrythmia;
    }

    public void setArrythmia(boolean arrythmia) {
        this.arrythmia = arrythmia;
    }

    public String getArrythmiaDetails() {
        return arrythmiaDetails;
    }

    public void setArrythmiaDetails(String arrythmiaDetails) {
        this.arrythmiaDetails = arrythmiaDetails;
    }

    public boolean isAngioplasty() {
        return angioplasty;
    }

    public void setAngioplasty(boolean angioplasty) {
        this.angioplasty = angioplasty;
    }

    public String getAngioplastyDetails() {
        return angioplastyDetails;
    }

    public void setAngioplastyDetails(String angioplastyDetails) {
        this.angioplastyDetails = angioplastyDetails;
    }

    public boolean isPacemaker() {
        return pacemaker;
    }

    public void setPacemaker(boolean pacemaker) {
        this.pacemaker = pacemaker;
    }

    public String getPacemakerDetails() {
        return pacemakerDetails;
    }

    public void setPacemakerDetails(String pacemakerDetails) {
        this.pacemakerDetails = pacemakerDetails;
    }

    public boolean isHeartSurgery() {
        return heartSurgery;
    }

    public void setHeartSurgery(boolean heartSurgery) {
        this.heartSurgery = heartSurgery;
    }

    public String getHeartSurgeryDetails() {
        return heartSurgeryDetails;
    }

    public void setHeartSurgeryDetails(String heartSurgeryDetails) {
        this.heartSurgeryDetails = heartSurgeryDetails;
    }

    public boolean isOtherDisease() {
        return otherDisease;
    }

    public void setOtherDisease(boolean otherDisease) {
        this.otherDisease = otherDisease;
    }

    public String getOtherDiseaseDetails() {
        return otherDiseaseDetails;
    }

    public void setOtherDiseaseDetails(String otherDiseaseDetails) {
        this.otherDiseaseDetails = otherDiseaseDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardiovascularCondition that = (CardiovascularCondition) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
