package today.smarthealthcare.ppv1.persistence.model.patient;

import today.smarthealthcare.ppv1.dto.user.UserRole;
import today.smarthealthcare.ppv1.persistence.model.classifier.MedicationClassifier;
import com.google.common.base.MoreObjects;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import today.smarthealthcare.ppv1.dto.user.UserRole;
import today.smarthealthcare.ppv1.persistence.model.classifier.MedicationClassifier;

/**
 * Patient DB entity
 *
 * @author: Vadim Nesmashnov
 */
@Entity
@Table(name = "PATIENTS")
public class Patient {
    @Id
    @GeneratedValue
    private Long id;
    private String legalCode;
    private String name;
    private String surname;
    private String address;
    private String phone;
    private String email;
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDate;
    @Column(columnDefinition = "enum('MALE','FEMALE')")
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private Boolean smoking;
    private Boolean pregnancy;
    private Boolean lactation;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserRole role;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PatientMeasurement> measurements = new HashSet<>();
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PatientDiagnosis> diagnoses = new HashSet<>();
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PatientMedication> medications = new HashSet<>();
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PatientProcedure> procedures = new HashSet<>();
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PatientVaccination> vaccinations = new HashSet<>();
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "PATIENTDRUGSTOAVOID",
            joinColumns = {@JoinColumn(name = "patient_id")},
            inverseJoinColumns = {@JoinColumn(name = "medicationclassifier_code"), @JoinColumn(name = "medicationclassifier_name")})
    private Set<MedicationClassifier> drugsToAvoid = new HashSet<>();

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

    public Boolean getSmoking() {
        return smoking;
    }

    public void setSmoking(Boolean smoking) {
        this.smoking = smoking;
    }

    public Boolean getPregnancy() {
        return pregnancy;
    }

    public void setPregnancy(Boolean pregnancy) {
        this.pregnancy = pregnancy;
    }

    public Boolean getLactation() {
        return lactation;
    }

    public void setLactation(Boolean lactation) {
        this.lactation = lactation;
    }

    public Set<PatientMeasurement> getMeasurements() {
        return measurements;
    }

    public Set<PatientDiagnosis> getDiagnoses() {
        return diagnoses;
    }

    public void setDiagnoses(Set<PatientDiagnosis> diagnoses) {
        this.diagnoses = diagnoses;
    }

    public Set<PatientMedication> getMedications() {
        return medications;
    }

    public Set<PatientProcedure> getProcedures() {
        return procedures;
    }

    public Set<PatientVaccination> getVaccinations() {
        return vaccinations;
    }

    public Set<MedicationClassifier> getDrugsToAvoid() {
        return drugsToAvoid;
    }

    public void setDrugsToAvoid(Set<MedicationClassifier> drugsToAvoid) {
        this.drugsToAvoid = drugsToAvoid;
    }

    public void setMeasurements(Set<PatientMeasurement> measurements) {
        this.measurements = measurements;
    }

    public void setMedications(Set<PatientMedication> medications) {
        this.medications = medications;
    }

    public void setProcedures(Set<PatientProcedure> procedures) {
        this.procedures = procedures;
    }

    public void setVaccinations(Set<PatientVaccination> vaccinations) {
        this.vaccinations = vaccinations;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Patient patient = (Patient) o;

        if (id != null ? !id.equals(patient.id) : patient.id != null) return false;
        if (!legalCode.equals(patient.legalCode)) return false;
        if (!name.equals(patient.name)) return false;
        if (!surname.equals(patient.surname)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + legalCode.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + surname.hashCode();
        return result;
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
                .add("password", password)
                .add("role", role)
                .toString();
    }
}
