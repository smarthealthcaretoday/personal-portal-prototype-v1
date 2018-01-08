package today.smarthealthcare.ppv1.dto.patient;

import today.smarthealthcare.ppv1.dto.user.UserRole;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.base.MoreObjects;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Patient DTO
 *
 * @author: Vadim Nesmashnov
 */
public class PatientDto implements Serializable {

    private Long id;
    private String legalCode;
    private String name;
    private String surname;
    private String address;
    private String phone;
    private String email;
    private Date birthDate;
    private Gender gender;
    private boolean smoking;
    private boolean pregnancy;
    private boolean lactation;
    private String password;
    private UserRole role;
    private String confirmPassword;
    private List<PatientMeasurementDto> measurements;
    private List<PatientDiagnosisDto> diagnoses;
    private List<PatientMedicationDto> medications;
    private List<PatientProcedureDto> procedures;
    private List<PatientVaccinationDto> vaccinations;
    private List<PatientDrugToAvoidDto> drugsToAvoid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLegalCode() {
        return legalCode;
    }

    public void setLegalCode(String legalCode) {
        this.legalCode = legalCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public boolean isSmoking() {
        return smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }

    public boolean isPregnancy() {
        return pregnancy;
    }

    public void setPregnancy(boolean pregnancy) {
        this.pregnancy = pregnancy;
    }

    public boolean isLactation() {
        return lactation;
    }

    public void setLactation(boolean lactation) {
        this.lactation = lactation;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public List<PatientMeasurementDto> getMeasurements() {
        return measurements;
    }

    public void setMeasurements(List<PatientMeasurementDto> measurements) {
        this.measurements = measurements;
    }

    public List<PatientDiagnosisDto> getDiagnoses() {
        return diagnoses;
    }

    public void setDiagnoses(List<PatientDiagnosisDto> diagnoses) {
        this.diagnoses = diagnoses;
    }

    public List<PatientMedicationDto> getMedications() {
        return medications;
    }

    public void setMedications(List<PatientMedicationDto> medications) {
        this.medications = medications;
    }

    public List<PatientProcedureDto> getProcedures() {
        return procedures;
    }

    public void setProcedures(List<PatientProcedureDto> procedures) {
        this.procedures = procedures;
    }

    public List<PatientVaccinationDto> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(List<PatientVaccinationDto> vaccinations) {
        this.vaccinations = vaccinations;
    }

    public List<PatientDrugToAvoidDto> getDrugsToAvoid() {
        return drugsToAvoid;
    }

    public void setDrugsToAvoid(List<PatientDrugToAvoidDto> drugsToAvoid) {
        this.drugsToAvoid = drugsToAvoid;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    @JsonIgnore
    public String getFullName() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PatientDto patientDto = (PatientDto) o;

        if (!id.equals(patientDto.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("legalCode", legalCode)
                .add("name", name)
                .add("surname", surname)
                .add("address", address)
                .add("phone", phone)
                .add("email", email)
                .add("birthDate", birthDate)
                .add("gender", gender)
                .add("smoking", smoking)
                .add("pregnancy", pregnancy)
                .add("lactation", lactation)
                .add("measurements", measurements)
                .add("diagnoses", diagnoses)
                .add("medications", medications)
                .add("procedures", procedures)
                .add("vaccinations", vaccinations)
                .add("drugsToAvoid", drugsToAvoid)
                .toString();
    }
}
