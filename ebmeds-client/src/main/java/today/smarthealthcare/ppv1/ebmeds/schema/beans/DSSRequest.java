
package today.smarthealthcare.ppv1.ebmeds.schema.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Patient">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Properties">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PatientID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BirthTimeStamp">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="Month" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                             &lt;maxInclusive value="12"/>
 *                                             &lt;minInclusive value="00"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="Day" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                             &lt;maxInclusive value="31"/>
 *                                             &lt;minInclusive value="00"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="Hour" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                             &lt;totalDigits value="2"/>
 *                                             &lt;maxInclusive value="23"/>
 *                                             &lt;minInclusive value="00"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="Minute" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                             &lt;totalDigits value="2"/>
 *                                             &lt;maxInclusive value="59"/>
 *                                             &lt;minInclusive value="00"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Gender">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="M"/>
 *                                   &lt;enumeration value="F"/>
 *                                   &lt;enumeration value="U"/>
 *                                   &lt;enumeration value="N"/>
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                   &lt;enumeration value="9"/>
 *                                   &lt;enumeration value="0"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Ethnicity" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;group ref="{}CodeGroup"/>
 *                                       &lt;element name="EthnicityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Professions" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Profession" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;group ref="{}CodeGroup"/>
 *                                                 &lt;group ref="{}TimeStampsGroup"/>
 *                                                 &lt;element name="ProfessionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Risks" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DrugsToAvoid" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DrugToAvoid" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;group ref="{}CodeGroup"/>
 *                                                 &lt;element name="ReasonsForAvoiding" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="ReasonForAvoiding" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;group ref="{}CodeGroup"/>
 *                                                                     &lt;group ref="{}TimeStampsGroup"/>
 *                                                                     &lt;element name="RiskLevel" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;group ref="{}CodeGroup"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Smoking" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="SmokingStatus" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;group ref="{}CodeGroup"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="DailyCigaretteConsumption" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                       &lt;element name="SmokingPackYears" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="AlcoholConsumption" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="WeeklyDrinkEquivalents" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Pregnancy" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Pregnant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="ExpectedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Lactation" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Lactating" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="FamilialDiseases" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="FamilialDisease" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;group ref="{}CodeGroup"/>
 *                                                 &lt;element name="DegreeOfKinship" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                                 &lt;element name="FamilialDiseaseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="NonDrugHypersensitivities" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="NonDrugHypersensitivity" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;group ref="{}CodeGroup"/>
 *                                                 &lt;element name="HypersensitivityReaction" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;group ref="{}CodeGroup"/>
 *                                                           &lt;group ref="{}TimeStampsGroup"/>
 *                                                           &lt;element name="RiskLevel" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;group ref="{}CodeGroup"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="HypersensitivityReactionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="AllergenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Problems" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Diagnoses" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Diagnosis" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;group ref="{}CodeGroup"/>
 *                                                 &lt;group ref="{}TimeStampsGroup"/>
 *                                                 &lt;element name="DiagnosisStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                                 &lt;element name="DiagnosisName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Investigations" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Measurements" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Measurement" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;group ref="{}CodeGroup"/>
 *                                                 &lt;group ref="{}TimeStampsGroup"/>
 *                                                 &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                                 &lt;element name="Result" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="UpperNormalLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                           &lt;element name="LowerNormalLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="MeasurementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ImagingInvestigations" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ImagingInvestigation" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;group ref="{}CodeGroup"/>
 *                                                 &lt;group ref="{}TimeStampsGroup"/>
 *                                                 &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                                 &lt;element name="ImagingInvestigationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Questionnaires" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice>
 *                                       &lt;element name="Questionnaire" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;group ref="{}CodeGroup"/>
 *                                                 &lt;group ref="{}TimeStampsGroup"/>
 *                                                 &lt;element name="Questions" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Question" maxOccurs="unbounded">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="QuestionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="AnswerString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="TotalPoints" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                                 &lt;element name="QuestionnaireName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/choice>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Interventions" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Medication" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Drug" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;group ref="{}CodeGroup" maxOccurs="unbounded"/>
 *                                                 &lt;group ref="{}TimeStampsGroup"/>
 *                                                 &lt;element name="Strength" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                 &lt;element name="StrengthUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="AdministrationRoute" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;group ref="{}CodeGroup"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="DailyDose" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                 &lt;element name="Dosage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="DrugStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                                 &lt;element name="LastPrescription" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;group ref="{}TimeStampsGroup"/>
 *                                                           &lt;element name="PackageAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Vaccinations" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Vaccine" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;group ref="{}CodeGroup"/>
 *                                                 &lt;group ref="{}TimeStampsGroup"/>
 *                                                 &lt;element name="Strength" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                 &lt;element name="StrengthUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="Dose" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                 &lt;element name="VaccinationStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                                 &lt;element name="VaccineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Procedures" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Procedure" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;group ref="{}CodeGroup"/>
 *                                                 &lt;group ref="{}TimeStampsGroup"/>
 *                                                 &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                                 &lt;element name="AnatomicalTarget" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;group ref="{}CodeGroup"/>
 *                                                           &lt;element name="AnatomicalTargetName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="MaterialsAndImplants" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Material" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;group ref="{}CodeGroup"/>
 *                                                                     &lt;element name="MaterialName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="Implant" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;group ref="{}CodeGroup"/>
 *                                                                     &lt;element name="ImplantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="ProcedureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Therapies" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Therapy" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;group ref="{}CodeGroup"/>
 *                                                 &lt;group ref="{}TimeStampsGroup"/>
 *                                                 &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                                 &lt;element name="TherapyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="SelfCareInterventions" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="SelfCareIntervention" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;group ref="{}CodeGroup"/>
 *                                                 &lt;group ref="{}TimeStampsGroup"/>
 *                                                 &lt;element name="SelfCareName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="HealthCareEncounters" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="HealthCareEncounter" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;group ref="{}CodeGroup"/>
 *                                       &lt;group ref="{}TimeStampsGroup"/>
 *                                       &lt;element name="HealthCareUnitType" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;group ref="{}CodeGroup"/>
 *                                                 &lt;element name="HealthCareUnitTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="HealthCareProfessionalType" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;group ref="{}CodeGroup"/>
 *                                                 &lt;element name="HealthCareProfessionalTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                       &lt;element name="ReasonForEncounter" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;group ref="{}CodeGroup"/>
 *                                                 &lt;element name="ReasonForEncounterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="EncounterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Documents" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Document" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DocumentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;group ref="{}CodeGroup"/>
 *                                       &lt;group ref="{}TimeStampsGroup"/>
 *                                       &lt;element name="DocumentReason" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;group ref="{}CodeGroup" minOccurs="0"/>
 *                                                 &lt;element name="ReasonForDocumentName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="DocumentAction" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                       &lt;element name="DocumentStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="System">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="User">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="UserID" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;group ref="{}CodeGroup" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="HealthCareRole" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="Physician"/>
 *                                   &lt;enumeration value="Nurse"/>
 *                                   &lt;enumeration value="Pharmacist"/>
 *                                   &lt;enumeration value="Citizen"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="HealthCareOrganization" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence maxOccurs="unbounded">
 *                                       &lt;group ref="{}CodeGroup"/>
 *                                       &lt;element name="HealthCareOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="HealthCareSpecialty" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;group ref="{}CodeGroup" maxOccurs="unbounded"/>
 *                                       &lt;element name="HealthCareSpecialtyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Language">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;group ref="{}CodeGroup"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Nation">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;group ref="{}CodeGroup"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Application">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ApplicationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ApplicationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ApplicationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="QueryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DSSVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ScriptSelection" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ScriptsToRun" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Script" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="ScriptID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="ReminderID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ScriptsToBlock" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Script" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="ScriptID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="ReminderID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="FeedbackType">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="0"/>
 *                                   &lt;enumeration value="C"/>
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                   &lt;enumeration value="S"/>
 *                                   &lt;enumeration value="Q"/>
 *                                   &lt;enumeration value="L"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CheckMoment" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CheckDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;element name="CheckTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="EventTypes" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="EventType" maxOccurs="unbounded">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="onOpenRecord"/>
 *                                             &lt;enumeration value="onCloseRecord"/>
 *                                             &lt;enumeration value="onNewDiagnosis"/>
 *                                             &lt;enumeration value="onNewDrug"/>
 *                                             &lt;enumeration value="onNewProcedure"/>
 *                                             &lt;enumeration value="onNewConsultation"/>
 *                                             &lt;enumeration value="onNewForm"/>
 *                                             &lt;enumeration value="onVirtualHealthCheck"/>
 *                                             &lt;enumeration value="onDemand"/>
 *                                             &lt;enumeration value="onNewOrder"/>
 *                                             &lt;enumeration value="onNewResult"/>
 *                                             &lt;enumeration value="onActiveDiagnosis"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="VirtualHealthCheckName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Exceptions" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Exception" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ExperimentalDataSets" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ExperimentalDataSet" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DataSetName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;group ref="{}CodeGroup"/>
 *                             &lt;group ref="{}TimeStampsGroup"/>
 *                             &lt;element name="DataSetText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DataEHRName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "patient",
    "system",
    "experimentalDataSets"
})
@XmlRootElement(name = "DSSRequest")
public class DSSRequest {

    @XmlElement(name = "Patient", required = true)
    protected DSSRequest.Patient patient;
    @XmlElement(name = "System", required = true)
    protected DSSRequest.System system;
    @XmlElement(name = "ExperimentalDataSets")
    protected DSSRequest.ExperimentalDataSets experimentalDataSets;

    /**
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link DSSRequest.Patient }
     *     
     */
    public DSSRequest.Patient getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSSRequest.Patient }
     *     
     */
    public void setPatient(DSSRequest.Patient value) {
        this.patient = value;
    }

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link DSSRequest.System }
     *     
     */
    public DSSRequest.System getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSSRequest.System }
     *     
     */
    public void setSystem(DSSRequest.System value) {
        this.system = value;
    }

    /**
     * Gets the value of the experimentalDataSets property.
     * 
     * @return
     *     possible object is
     *     {@link DSSRequest.ExperimentalDataSets }
     *     
     */
    public DSSRequest.ExperimentalDataSets getExperimentalDataSets() {
        return experimentalDataSets;
    }

    /**
     * Sets the value of the experimentalDataSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSSRequest.ExperimentalDataSets }
     *     
     */
    public void setExperimentalDataSets(DSSRequest.ExperimentalDataSets value) {
        this.experimentalDataSets = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ExperimentalDataSet" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DataSetName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;group ref="{}CodeGroup"/>
     *                   &lt;group ref="{}TimeStampsGroup"/>
     *                   &lt;element name="DataSetText" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DataEHRName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "experimentalDataSet"
    })
    public static class ExperimentalDataSets {

        @XmlElement(name = "ExperimentalDataSet", required = true)
        protected List<DSSRequest.ExperimentalDataSets.ExperimentalDataSet> experimentalDataSet;

        /**
         * Gets the value of the experimentalDataSet property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the experimentalDataSet property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExperimentalDataSet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DSSRequest.ExperimentalDataSets.ExperimentalDataSet }
         * 
         * 
         */
        public List<DSSRequest.ExperimentalDataSets.ExperimentalDataSet> getExperimentalDataSet() {
            if (experimentalDataSet == null) {
                experimentalDataSet = new ArrayList<DSSRequest.ExperimentalDataSets.ExperimentalDataSet>();
            }
            return this.experimentalDataSet;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="DataSetName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;group ref="{}CodeGroup"/>
         *         &lt;group ref="{}TimeStampsGroup"/>
         *         &lt;element name="DataSetText" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DataEHRName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "dataSetName",
            "codeValue",
            "codeSystem",
            "codeSystemVersion",
            "startStamp",
            "endStamp",
            "pointStamp",
            "dataSetText",
            "dataEHRName"
        })
        public static class ExperimentalDataSet {

            @XmlElement(name = "DataSetName", required = true)
            protected String dataSetName;
            @XmlElement(name = "CodeValue", required = true)
            protected String codeValue;
            @XmlElement(name = "CodeSystem", required = true)
            protected String codeSystem;
            @XmlElement(name = "CodeSystemVersion")
            protected String codeSystemVersion;
            @XmlElement(name = "StartStamp")
            protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp startStamp;
            @XmlElement(name = "EndStamp")
            protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp endStamp;
            @XmlElement(name = "PointStamp")
            protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp pointStamp;
            @XmlElement(name = "DataSetText", required = true)
            protected String dataSetText;
            @XmlElement(name = "DataEHRName")
            protected String dataEHRName;

            /**
             * Gets the value of the dataSetName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDataSetName() {
                return dataSetName;
            }

            /**
             * Sets the value of the dataSetName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDataSetName(String value) {
                this.dataSetName = value;
            }

            /**
             * Gets the value of the codeValue property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeValue() {
                return codeValue;
            }

            /**
             * Sets the value of the codeValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeValue(String value) {
                this.codeValue = value;
            }

            /**
             * Gets the value of the codeSystem property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeSystem() {
                return codeSystem;
            }

            /**
             * Sets the value of the codeSystem property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeSystem(String value) {
                this.codeSystem = value;
            }

            /**
             * Gets the value of the codeSystemVersion property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeSystemVersion() {
                return codeSystemVersion;
            }

            /**
             * Sets the value of the codeSystemVersion property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeSystemVersion(String value) {
                this.codeSystemVersion = value;
            }

            /**
             * Gets the value of the startStamp property.
             * 
             * @return
             *     possible object is
             *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
             *     
             */
            public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp getStartStamp() {
                return startStamp;
            }

            /**
             * Sets the value of the startStamp property.
             * 
             * @param value
             *     allowed object is
             *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
             *     
             */
            public void setStartStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp value) {
                this.startStamp = value;
            }

            /**
             * Gets the value of the endStamp property.
             * 
             * @return
             *     possible object is
             *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
             *     
             */
            public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp getEndStamp() {
                return endStamp;
            }

            /**
             * Sets the value of the endStamp property.
             * 
             * @param value
             *     allowed object is
             *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
             *     
             */
            public void setEndStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp value) {
                this.endStamp = value;
            }

            /**
             * Gets the value of the pointStamp property.
             * 
             * @return
             *     possible object is
             *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
             *     
             */
            public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp getPointStamp() {
                return pointStamp;
            }

            /**
             * Sets the value of the pointStamp property.
             * 
             * @param value
             *     allowed object is
             *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
             *     
             */
            public void setPointStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp value) {
                this.pointStamp = value;
            }

            /**
             * Gets the value of the dataSetText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDataSetText() {
                return dataSetText;
            }

            /**
             * Sets the value of the dataSetText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDataSetText(String value) {
                this.dataSetText = value;
            }

            /**
             * Gets the value of the dataEHRName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDataEHRName() {
                return dataEHRName;
            }

            /**
             * Sets the value of the dataEHRName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDataEHRName(String value) {
                this.dataEHRName = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Properties">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PatientID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BirthTimeStamp">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="Month" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                                   &lt;maxInclusive value="12"/>
     *                                   &lt;minInclusive value="00"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="Day" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                                   &lt;maxInclusive value="31"/>
     *                                   &lt;minInclusive value="00"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="Hour" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                                   &lt;totalDigits value="2"/>
     *                                   &lt;maxInclusive value="23"/>
     *                                   &lt;minInclusive value="00"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="Minute" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                                   &lt;totalDigits value="2"/>
     *                                   &lt;maxInclusive value="59"/>
     *                                   &lt;minInclusive value="00"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Gender">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="M"/>
     *                         &lt;enumeration value="F"/>
     *                         &lt;enumeration value="U"/>
     *                         &lt;enumeration value="N"/>
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                         &lt;enumeration value="9"/>
     *                         &lt;enumeration value="0"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Ethnicity" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;group ref="{}CodeGroup"/>
     *                             &lt;element name="EthnicityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Professions" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Profession" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;group ref="{}CodeGroup"/>
     *                                       &lt;group ref="{}TimeStampsGroup"/>
     *                                       &lt;element name="ProfessionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Risks" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DrugsToAvoid" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="DrugToAvoid" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;group ref="{}CodeGroup"/>
     *                                       &lt;element name="ReasonsForAvoiding" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="ReasonForAvoiding" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;group ref="{}CodeGroup"/>
     *                                                           &lt;group ref="{}TimeStampsGroup"/>
     *                                                           &lt;element name="RiskLevel" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;group ref="{}CodeGroup"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Smoking" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="SmokingStatus" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;group ref="{}CodeGroup"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="DailyCigaretteConsumption" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="SmokingPackYears" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="AlcoholConsumption" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="WeeklyDrinkEquivalents" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Pregnancy" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Pregnant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="ExpectedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Lactation" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Lactating" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="FamilialDiseases" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="FamilialDisease" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;group ref="{}CodeGroup"/>
     *                                       &lt;element name="DegreeOfKinship" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                                       &lt;element name="FamilialDiseaseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="NonDrugHypersensitivities" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="NonDrugHypersensitivity" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;group ref="{}CodeGroup"/>
     *                                       &lt;element name="HypersensitivityReaction" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;group ref="{}CodeGroup"/>
     *                                                 &lt;group ref="{}TimeStampsGroup"/>
     *                                                 &lt;element name="RiskLevel" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;group ref="{}CodeGroup"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="HypersensitivityReactionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="AllergenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Problems" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Diagnoses" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Diagnosis" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;group ref="{}CodeGroup"/>
     *                                       &lt;group ref="{}TimeStampsGroup"/>
     *                                       &lt;element name="DiagnosisStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                                       &lt;element name="DiagnosisName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Investigations" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Measurements" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Measurement" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;group ref="{}CodeGroup"/>
     *                                       &lt;group ref="{}TimeStampsGroup"/>
     *                                       &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                                       &lt;element name="Result" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="UpperNormalLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                 &lt;element name="LowerNormalLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="MeasurementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ImagingInvestigations" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ImagingInvestigation" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;group ref="{}CodeGroup"/>
     *                                       &lt;group ref="{}TimeStampsGroup"/>
     *                                       &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                                       &lt;element name="ImagingInvestigationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Questionnaires" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;choice>
     *                             &lt;element name="Questionnaire" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;group ref="{}CodeGroup"/>
     *                                       &lt;group ref="{}TimeStampsGroup"/>
     *                                       &lt;element name="Questions" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Question" maxOccurs="unbounded">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="QuestionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="AnswerString" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="TotalPoints" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                                       &lt;element name="QuestionnaireName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/choice>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Interventions" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Medication" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Drug" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;group ref="{}CodeGroup" maxOccurs="unbounded"/>
     *                                       &lt;group ref="{}TimeStampsGroup"/>
     *                                       &lt;element name="Strength" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                       &lt;element name="StrengthUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="AdministrationRoute" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;group ref="{}CodeGroup"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="DailyDose" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                       &lt;element name="Dosage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="DrugStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                                       &lt;element name="LastPrescription" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;group ref="{}TimeStampsGroup"/>
     *                                                 &lt;element name="PackageAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Vaccinations" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Vaccine" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;group ref="{}CodeGroup"/>
     *                                       &lt;group ref="{}TimeStampsGroup"/>
     *                                       &lt;element name="Strength" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                       &lt;element name="StrengthUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Dose" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                       &lt;element name="VaccinationStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                                       &lt;element name="VaccineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Procedures" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Procedure" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;group ref="{}CodeGroup"/>
     *                                       &lt;group ref="{}TimeStampsGroup"/>
     *                                       &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                                       &lt;element name="AnatomicalTarget" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;group ref="{}CodeGroup"/>
     *                                                 &lt;element name="AnatomicalTargetName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="MaterialsAndImplants" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Material" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;group ref="{}CodeGroup"/>
     *                                                           &lt;element name="MaterialName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="Implant" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;group ref="{}CodeGroup"/>
     *                                                           &lt;element name="ImplantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="ProcedureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Therapies" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Therapy" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;group ref="{}CodeGroup"/>
     *                                       &lt;group ref="{}TimeStampsGroup"/>
     *                                       &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                                       &lt;element name="TherapyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="SelfCareInterventions" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="SelfCareIntervention" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;group ref="{}CodeGroup"/>
     *                                       &lt;group ref="{}TimeStampsGroup"/>
     *                                       &lt;element name="SelfCareName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="HealthCareEncounters" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="HealthCareEncounter" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;group ref="{}CodeGroup"/>
     *                             &lt;group ref="{}TimeStampsGroup"/>
     *                             &lt;element name="HealthCareUnitType" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;group ref="{}CodeGroup"/>
     *                                       &lt;element name="HealthCareUnitTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="HealthCareProfessionalType" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;group ref="{}CodeGroup"/>
     *                                       &lt;element name="HealthCareProfessionalTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                             &lt;element name="ReasonForEncounter" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;group ref="{}CodeGroup"/>
     *                                       &lt;element name="ReasonForEncounterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="EncounterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Documents" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Document" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="DocumentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;group ref="{}CodeGroup"/>
     *                             &lt;group ref="{}TimeStampsGroup"/>
     *                             &lt;element name="DocumentReason" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;group ref="{}CodeGroup" minOccurs="0"/>
     *                                       &lt;element name="ReasonForDocumentName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="DocumentAction" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                             &lt;element name="DocumentStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "properties",
        "risks",
        "problems",
        "investigations",
        "interventions",
        "healthCareEncounters",
        "documents"
    })
    public static class Patient {

        @XmlElement(name = "Properties", required = true)
        protected DSSRequest.Patient.Properties properties;
        @XmlElement(name = "Risks")
        protected DSSRequest.Patient.Risks risks;
        @XmlElement(name = "Problems")
        protected DSSRequest.Patient.Problems problems;
        @XmlElement(name = "Investigations")
        protected DSSRequest.Patient.Investigations investigations;
        @XmlElement(name = "Interventions")
        protected DSSRequest.Patient.Interventions interventions;
        @XmlElement(name = "HealthCareEncounters")
        protected DSSRequest.Patient.HealthCareEncounters healthCareEncounters;
        @XmlElement(name = "Documents")
        protected DSSRequest.Patient.Documents documents;

        /**
         * Gets the value of the properties property.
         * 
         * @return
         *     possible object is
         *     {@link DSSRequest.Patient.Properties }
         *     
         */
        public DSSRequest.Patient.Properties getProperties() {
            return properties;
        }

        /**
         * Sets the value of the properties property.
         * 
         * @param value
         *     allowed object is
         *     {@link DSSRequest.Patient.Properties }
         *     
         */
        public void setProperties(DSSRequest.Patient.Properties value) {
            this.properties = value;
        }

        /**
         * Gets the value of the risks property.
         * 
         * @return
         *     possible object is
         *     {@link DSSRequest.Patient.Risks }
         *     
         */
        public DSSRequest.Patient.Risks getRisks() {
            return risks;
        }

        /**
         * Sets the value of the risks property.
         * 
         * @param value
         *     allowed object is
         *     {@link DSSRequest.Patient.Risks }
         *     
         */
        public void setRisks(DSSRequest.Patient.Risks value) {
            this.risks = value;
        }

        /**
         * Gets the value of the problems property.
         * 
         * @return
         *     possible object is
         *     {@link DSSRequest.Patient.Problems }
         *     
         */
        public DSSRequest.Patient.Problems getProblems() {
            return problems;
        }

        /**
         * Sets the value of the problems property.
         * 
         * @param value
         *     allowed object is
         *     {@link DSSRequest.Patient.Problems }
         *     
         */
        public void setProblems(DSSRequest.Patient.Problems value) {
            this.problems = value;
        }

        /**
         * Gets the value of the investigations property.
         * 
         * @return
         *     possible object is
         *     {@link DSSRequest.Patient.Investigations }
         *     
         */
        public DSSRequest.Patient.Investigations getInvestigations() {
            return investigations;
        }

        /**
         * Sets the value of the investigations property.
         * 
         * @param value
         *     allowed object is
         *     {@link DSSRequest.Patient.Investigations }
         *     
         */
        public void setInvestigations(DSSRequest.Patient.Investigations value) {
            this.investigations = value;
        }

        /**
         * Gets the value of the interventions property.
         * 
         * @return
         *     possible object is
         *     {@link DSSRequest.Patient.Interventions }
         *     
         */
        public DSSRequest.Patient.Interventions getInterventions() {
            return interventions;
        }

        /**
         * Sets the value of the interventions property.
         * 
         * @param value
         *     allowed object is
         *     {@link DSSRequest.Patient.Interventions }
         *     
         */
        public void setInterventions(DSSRequest.Patient.Interventions value) {
            this.interventions = value;
        }

        /**
         * Gets the value of the healthCareEncounters property.
         * 
         * @return
         *     possible object is
         *     {@link DSSRequest.Patient.HealthCareEncounters }
         *     
         */
        public DSSRequest.Patient.HealthCareEncounters getHealthCareEncounters() {
            return healthCareEncounters;
        }

        /**
         * Sets the value of the healthCareEncounters property.
         * 
         * @param value
         *     allowed object is
         *     {@link DSSRequest.Patient.HealthCareEncounters }
         *     
         */
        public void setHealthCareEncounters(DSSRequest.Patient.HealthCareEncounters value) {
            this.healthCareEncounters = value;
        }

        /**
         * Gets the value of the documents property.
         * 
         * @return
         *     possible object is
         *     {@link DSSRequest.Patient.Documents }
         *     
         */
        public DSSRequest.Patient.Documents getDocuments() {
            return documents;
        }

        /**
         * Sets the value of the documents property.
         * 
         * @param value
         *     allowed object is
         *     {@link DSSRequest.Patient.Documents }
         *     
         */
        public void setDocuments(DSSRequest.Patient.Documents value) {
            this.documents = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Document" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="DocumentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;group ref="{}CodeGroup"/>
         *                   &lt;group ref="{}TimeStampsGroup"/>
         *                   &lt;element name="DocumentReason" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;group ref="{}CodeGroup" minOccurs="0"/>
         *                             &lt;element name="ReasonForDocumentName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="DocumentAction" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="DocumentStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "document"
        })
        public static class Documents {

            @XmlElement(name = "Document", required = true)
            protected List<DSSRequest.Patient.Documents.Document> document;

            /**
             * Gets the value of the document property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the document property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDocument().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DSSRequest.Patient.Documents.Document }
             * 
             * 
             */
            public List<DSSRequest.Patient.Documents.Document> getDocument() {
                if (document == null) {
                    document = new ArrayList<DSSRequest.Patient.Documents.Document>();
                }
                return this.document;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="DocumentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;group ref="{}CodeGroup"/>
             *         &lt;group ref="{}TimeStampsGroup"/>
             *         &lt;element name="DocumentReason" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;group ref="{}CodeGroup" minOccurs="0"/>
             *                   &lt;element name="ReasonForDocumentName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="DocumentAction" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="DocumentStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "documentType",
                "codeValue",
                "codeSystem",
                "codeSystemVersion",
                "startStamp",
                "endStamp",
                "pointStamp",
                "documentReason",
                "documentAction",
                "documentStatus"
            })
            public static class Document {

                @XmlElement(name = "DocumentType")
                protected String documentType;
                @XmlElement(name = "CodeValue", required = true)
                protected String codeValue;
                @XmlElement(name = "CodeSystem", required = true)
                protected String codeSystem;
                @XmlElement(name = "CodeSystemVersion")
                protected String codeSystemVersion;
                @XmlElement(name = "StartStamp")
                protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp startStamp;
                @XmlElement(name = "EndStamp")
                protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp endStamp;
                @XmlElement(name = "PointStamp")
                protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp pointStamp;
                @XmlElement(name = "DocumentReason")
                protected DSSRequest.Patient.Documents.Document.DocumentReason documentReason;
                @XmlElement(name = "DocumentAction")
                protected Integer documentAction;
                @XmlElement(name = "DocumentStatus")
                protected Integer documentStatus;

                /**
                 * Gets the value of the documentType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDocumentType() {
                    return documentType;
                }

                /**
                 * Sets the value of the documentType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDocumentType(String value) {
                    this.documentType = value;
                }

                /**
                 * Gets the value of the codeValue property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeValue() {
                    return codeValue;
                }

                /**
                 * Sets the value of the codeValue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeValue(String value) {
                    this.codeValue = value;
                }

                /**
                 * Gets the value of the codeSystem property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeSystem() {
                    return codeSystem;
                }

                /**
                 * Sets the value of the codeSystem property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeSystem(String value) {
                    this.codeSystem = value;
                }

                /**
                 * Gets the value of the codeSystemVersion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeSystemVersion() {
                    return codeSystemVersion;
                }

                /**
                 * Sets the value of the codeSystemVersion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeSystemVersion(String value) {
                    this.codeSystemVersion = value;
                }

                /**
                 * Gets the value of the startStamp property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                 *     
                 */
                public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp getStartStamp() {
                    return startStamp;
                }

                /**
                 * Sets the value of the startStamp property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                 *     
                 */
                public void setStartStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp value) {
                    this.startStamp = value;
                }

                /**
                 * Gets the value of the endStamp property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                 *     
                 */
                public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp getEndStamp() {
                    return endStamp;
                }

                /**
                 * Sets the value of the endStamp property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                 *     
                 */
                public void setEndStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp value) {
                    this.endStamp = value;
                }

                /**
                 * Gets the value of the pointStamp property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                 *     
                 */
                public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp getPointStamp() {
                    return pointStamp;
                }

                /**
                 * Sets the value of the pointStamp property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                 *     
                 */
                public void setPointStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp value) {
                    this.pointStamp = value;
                }

                /**
                 * Gets the value of the documentReason property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DSSRequest.Patient.Documents.Document.DocumentReason }
                 *     
                 */
                public DSSRequest.Patient.Documents.Document.DocumentReason getDocumentReason() {
                    return documentReason;
                }

                /**
                 * Sets the value of the documentReason property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DSSRequest.Patient.Documents.Document.DocumentReason }
                 *     
                 */
                public void setDocumentReason(DSSRequest.Patient.Documents.Document.DocumentReason value) {
                    this.documentReason = value;
                }

                /**
                 * Gets the value of the documentAction property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getDocumentAction() {
                    return documentAction;
                }

                /**
                 * Sets the value of the documentAction property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setDocumentAction(Integer value) {
                    this.documentAction = value;
                }

                /**
                 * Gets the value of the documentStatus property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getDocumentStatus() {
                    return documentStatus;
                }

                /**
                 * Sets the value of the documentStatus property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setDocumentStatus(Integer value) {
                    this.documentStatus = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;group ref="{}CodeGroup" minOccurs="0"/>
                 *         &lt;element name="ReasonForDocumentName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "codeValue",
                    "codeSystem",
                    "codeSystemVersion",
                    "reasonForDocumentName"
                })
                public static class DocumentReason {

                    @XmlElement(name = "CodeValue")
                    protected String codeValue;
                    @XmlElement(name = "CodeSystem")
                    protected String codeSystem;
                    @XmlElement(name = "CodeSystemVersion")
                    protected String codeSystemVersion;
                    @XmlElement(name = "ReasonForDocumentName")
                    protected List<String> reasonForDocumentName;

                    /**
                     * Gets the value of the codeValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeValue() {
                        return codeValue;
                    }

                    /**
                     * Sets the value of the codeValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeValue(String value) {
                        this.codeValue = value;
                    }

                    /**
                     * Gets the value of the codeSystem property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystem() {
                        return codeSystem;
                    }

                    /**
                     * Sets the value of the codeSystem property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystem(String value) {
                        this.codeSystem = value;
                    }

                    /**
                     * Gets the value of the codeSystemVersion property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystemVersion() {
                        return codeSystemVersion;
                    }

                    /**
                     * Sets the value of the codeSystemVersion property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystemVersion(String value) {
                        this.codeSystemVersion = value;
                    }

                    /**
                     * Gets the value of the reasonForDocumentName property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the reasonForDocumentName property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getReasonForDocumentName().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getReasonForDocumentName() {
                        if (reasonForDocumentName == null) {
                            reasonForDocumentName = new ArrayList<String>();
                        }
                        return this.reasonForDocumentName;
                    }

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="HealthCareEncounter" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;group ref="{}CodeGroup"/>
         *                   &lt;group ref="{}TimeStampsGroup"/>
         *                   &lt;element name="HealthCareUnitType" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;group ref="{}CodeGroup"/>
         *                             &lt;element name="HealthCareUnitTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="HealthCareProfessionalType" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;group ref="{}CodeGroup"/>
         *                             &lt;element name="HealthCareProfessionalTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="ReasonForEncounter" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;group ref="{}CodeGroup"/>
         *                             &lt;element name="ReasonForEncounterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="EncounterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "healthCareEncounter"
        })
        public static class HealthCareEncounters {

            @XmlElement(name = "HealthCareEncounter", required = true)
            protected List<DSSRequest.Patient.HealthCareEncounters.HealthCareEncounter> healthCareEncounter;

            /**
             * Gets the value of the healthCareEncounter property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the healthCareEncounter property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getHealthCareEncounter().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DSSRequest.Patient.HealthCareEncounters.HealthCareEncounter }
             * 
             * 
             */
            public List<DSSRequest.Patient.HealthCareEncounters.HealthCareEncounter> getHealthCareEncounter() {
                if (healthCareEncounter == null) {
                    healthCareEncounter = new ArrayList<DSSRequest.Patient.HealthCareEncounters.HealthCareEncounter>();
                }
                return this.healthCareEncounter;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;group ref="{}CodeGroup"/>
             *         &lt;group ref="{}TimeStampsGroup"/>
             *         &lt;element name="HealthCareUnitType" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;group ref="{}CodeGroup"/>
             *                   &lt;element name="HealthCareUnitTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="HealthCareProfessionalType" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;group ref="{}CodeGroup"/>
             *                   &lt;element name="HealthCareProfessionalTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *         &lt;element name="ReasonForEncounter" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;group ref="{}CodeGroup"/>
             *                   &lt;element name="ReasonForEncounterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="EncounterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "codeValue",
                "codeSystem",
                "codeSystemVersion",
                "startStamp",
                "endStamp",
                "pointStamp",
                "healthCareUnitType",
                "healthCareProfessionalType",
                "ordered",
                "reasonForEncounter",
                "encounterName"
            })
            public static class HealthCareEncounter {

                @XmlElement(name = "CodeValue", required = true)
                protected String codeValue;
                @XmlElement(name = "CodeSystem", required = true)
                protected String codeSystem;
                @XmlElement(name = "CodeSystemVersion")
                protected String codeSystemVersion;
                @XmlElement(name = "StartStamp")
                protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp startStamp;
                @XmlElement(name = "EndStamp")
                protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp endStamp;
                @XmlElement(name = "PointStamp")
                protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp pointStamp;
                @XmlElement(name = "HealthCareUnitType")
                protected DSSRequest.Patient.HealthCareEncounters.HealthCareEncounter.HealthCareUnitType healthCareUnitType;
                @XmlElement(name = "HealthCareProfessionalType")
                protected DSSRequest.Patient.HealthCareEncounters.HealthCareEncounter.HealthCareProfessionalType healthCareProfessionalType;
                @XmlElement(name = "Ordered")
                protected Boolean ordered;
                @XmlElement(name = "ReasonForEncounter")
                protected List<DSSRequest.Patient.HealthCareEncounters.HealthCareEncounter.ReasonForEncounter> reasonForEncounter;
                @XmlElement(name = "EncounterName")
                protected String encounterName;

                /**
                 * Gets the value of the codeValue property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeValue() {
                    return codeValue;
                }

                /**
                 * Sets the value of the codeValue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeValue(String value) {
                    this.codeValue = value;
                }

                /**
                 * Gets the value of the codeSystem property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeSystem() {
                    return codeSystem;
                }

                /**
                 * Sets the value of the codeSystem property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeSystem(String value) {
                    this.codeSystem = value;
                }

                /**
                 * Gets the value of the codeSystemVersion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeSystemVersion() {
                    return codeSystemVersion;
                }

                /**
                 * Sets the value of the codeSystemVersion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeSystemVersion(String value) {
                    this.codeSystemVersion = value;
                }

                /**
                 * Gets the value of the startStamp property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                 *     
                 */
                public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp getStartStamp() {
                    return startStamp;
                }

                /**
                 * Sets the value of the startStamp property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                 *     
                 */
                public void setStartStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp value) {
                    this.startStamp = value;
                }

                /**
                 * Gets the value of the endStamp property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                 *     
                 */
                public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp getEndStamp() {
                    return endStamp;
                }

                /**
                 * Sets the value of the endStamp property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                 *     
                 */
                public void setEndStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp value) {
                    this.endStamp = value;
                }

                /**
                 * Gets the value of the pointStamp property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                 *     
                 */
                public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp getPointStamp() {
                    return pointStamp;
                }

                /**
                 * Sets the value of the pointStamp property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                 *     
                 */
                public void setPointStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp value) {
                    this.pointStamp = value;
                }

                /**
                 * Gets the value of the healthCareUnitType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DSSRequest.Patient.HealthCareEncounters.HealthCareEncounter.HealthCareUnitType }
                 *     
                 */
                public DSSRequest.Patient.HealthCareEncounters.HealthCareEncounter.HealthCareUnitType getHealthCareUnitType() {
                    return healthCareUnitType;
                }

                /**
                 * Sets the value of the healthCareUnitType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DSSRequest.Patient.HealthCareEncounters.HealthCareEncounter.HealthCareUnitType }
                 *     
                 */
                public void setHealthCareUnitType(DSSRequest.Patient.HealthCareEncounters.HealthCareEncounter.HealthCareUnitType value) {
                    this.healthCareUnitType = value;
                }

                /**
                 * Gets the value of the healthCareProfessionalType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DSSRequest.Patient.HealthCareEncounters.HealthCareEncounter.HealthCareProfessionalType }
                 *     
                 */
                public DSSRequest.Patient.HealthCareEncounters.HealthCareEncounter.HealthCareProfessionalType getHealthCareProfessionalType() {
                    return healthCareProfessionalType;
                }

                /**
                 * Sets the value of the healthCareProfessionalType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DSSRequest.Patient.HealthCareEncounters.HealthCareEncounter.HealthCareProfessionalType }
                 *     
                 */
                public void setHealthCareProfessionalType(DSSRequest.Patient.HealthCareEncounters.HealthCareEncounter.HealthCareProfessionalType value) {
                    this.healthCareProfessionalType = value;
                }

                /**
                 * Gets the value of the ordered property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isOrdered() {
                    return ordered;
                }

                /**
                 * Sets the value of the ordered property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setOrdered(Boolean value) {
                    this.ordered = value;
                }

                /**
                 * Gets the value of the reasonForEncounter property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the reasonForEncounter property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getReasonForEncounter().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DSSRequest.Patient.HealthCareEncounters.HealthCareEncounter.ReasonForEncounter }
                 * 
                 * 
                 */
                public List<DSSRequest.Patient.HealthCareEncounters.HealthCareEncounter.ReasonForEncounter> getReasonForEncounter() {
                    if (reasonForEncounter == null) {
                        reasonForEncounter = new ArrayList<DSSRequest.Patient.HealthCareEncounters.HealthCareEncounter.ReasonForEncounter>();
                    }
                    return this.reasonForEncounter;
                }

                /**
                 * Gets the value of the encounterName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEncounterName() {
                    return encounterName;
                }

                /**
                 * Sets the value of the encounterName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEncounterName(String value) {
                    this.encounterName = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;group ref="{}CodeGroup"/>
                 *         &lt;element name="HealthCareProfessionalTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "codeValue",
                    "codeSystem",
                    "codeSystemVersion",
                    "healthCareProfessionalTypeName"
                })
                public static class HealthCareProfessionalType {

                    @XmlElement(name = "CodeValue", required = true)
                    protected String codeValue;
                    @XmlElement(name = "CodeSystem", required = true)
                    protected String codeSystem;
                    @XmlElement(name = "CodeSystemVersion")
                    protected String codeSystemVersion;
                    @XmlElement(name = "HealthCareProfessionalTypeName")
                    protected String healthCareProfessionalTypeName;

                    /**
                     * Gets the value of the codeValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeValue() {
                        return codeValue;
                    }

                    /**
                     * Sets the value of the codeValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeValue(String value) {
                        this.codeValue = value;
                    }

                    /**
                     * Gets the value of the codeSystem property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystem() {
                        return codeSystem;
                    }

                    /**
                     * Sets the value of the codeSystem property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystem(String value) {
                        this.codeSystem = value;
                    }

                    /**
                     * Gets the value of the codeSystemVersion property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystemVersion() {
                        return codeSystemVersion;
                    }

                    /**
                     * Sets the value of the codeSystemVersion property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystemVersion(String value) {
                        this.codeSystemVersion = value;
                    }

                    /**
                     * Gets the value of the healthCareProfessionalTypeName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getHealthCareProfessionalTypeName() {
                        return healthCareProfessionalTypeName;
                    }

                    /**
                     * Sets the value of the healthCareProfessionalTypeName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setHealthCareProfessionalTypeName(String value) {
                        this.healthCareProfessionalTypeName = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;group ref="{}CodeGroup"/>
                 *         &lt;element name="HealthCareUnitTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "codeValue",
                    "codeSystem",
                    "codeSystemVersion",
                    "healthCareUnitTypeName"
                })
                public static class HealthCareUnitType {

                    @XmlElement(name = "CodeValue", required = true)
                    protected String codeValue;
                    @XmlElement(name = "CodeSystem", required = true)
                    protected String codeSystem;
                    @XmlElement(name = "CodeSystemVersion")
                    protected String codeSystemVersion;
                    @XmlElement(name = "HealthCareUnitTypeName")
                    protected String healthCareUnitTypeName;

                    /**
                     * Gets the value of the codeValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeValue() {
                        return codeValue;
                    }

                    /**
                     * Sets the value of the codeValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeValue(String value) {
                        this.codeValue = value;
                    }

                    /**
                     * Gets the value of the codeSystem property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystem() {
                        return codeSystem;
                    }

                    /**
                     * Sets the value of the codeSystem property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystem(String value) {
                        this.codeSystem = value;
                    }

                    /**
                     * Gets the value of the codeSystemVersion property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystemVersion() {
                        return codeSystemVersion;
                    }

                    /**
                     * Sets the value of the codeSystemVersion property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystemVersion(String value) {
                        this.codeSystemVersion = value;
                    }

                    /**
                     * Gets the value of the healthCareUnitTypeName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getHealthCareUnitTypeName() {
                        return healthCareUnitTypeName;
                    }

                    /**
                     * Sets the value of the healthCareUnitTypeName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setHealthCareUnitTypeName(String value) {
                        this.healthCareUnitTypeName = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;group ref="{}CodeGroup"/>
                 *         &lt;element name="ReasonForEncounterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "codeValue",
                    "codeSystem",
                    "codeSystemVersion",
                    "reasonForEncounterName"
                })
                public static class ReasonForEncounter {

                    @XmlElement(name = "CodeValue", required = true)
                    protected String codeValue;
                    @XmlElement(name = "CodeSystem", required = true)
                    protected String codeSystem;
                    @XmlElement(name = "CodeSystemVersion")
                    protected String codeSystemVersion;
                    @XmlElement(name = "ReasonForEncounterName")
                    protected String reasonForEncounterName;

                    /**
                     * Gets the value of the codeValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeValue() {
                        return codeValue;
                    }

                    /**
                     * Sets the value of the codeValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeValue(String value) {
                        this.codeValue = value;
                    }

                    /**
                     * Gets the value of the codeSystem property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystem() {
                        return codeSystem;
                    }

                    /**
                     * Sets the value of the codeSystem property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystem(String value) {
                        this.codeSystem = value;
                    }

                    /**
                     * Gets the value of the codeSystemVersion property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystemVersion() {
                        return codeSystemVersion;
                    }

                    /**
                     * Sets the value of the codeSystemVersion property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystemVersion(String value) {
                        this.codeSystemVersion = value;
                    }

                    /**
                     * Gets the value of the reasonForEncounterName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getReasonForEncounterName() {
                        return reasonForEncounterName;
                    }

                    /**
                     * Sets the value of the reasonForEncounterName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setReasonForEncounterName(String value) {
                        this.reasonForEncounterName = value;
                    }

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Medication" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Drug" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;group ref="{}CodeGroup" maxOccurs="unbounded"/>
         *                             &lt;group ref="{}TimeStampsGroup"/>
         *                             &lt;element name="Strength" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                             &lt;element name="StrengthUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="AdministrationRoute" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;group ref="{}CodeGroup"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="DailyDose" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                             &lt;element name="Dosage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="DrugStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                             &lt;element name="LastPrescription" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;group ref="{}TimeStampsGroup"/>
         *                                       &lt;element name="PackageAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Vaccinations" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Vaccine" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;group ref="{}CodeGroup"/>
         *                             &lt;group ref="{}TimeStampsGroup"/>
         *                             &lt;element name="Strength" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                             &lt;element name="StrengthUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Dose" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                             &lt;element name="VaccinationStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                             &lt;element name="VaccineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Procedures" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Procedure" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;group ref="{}CodeGroup"/>
         *                             &lt;group ref="{}TimeStampsGroup"/>
         *                             &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                             &lt;element name="AnatomicalTarget" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;group ref="{}CodeGroup"/>
         *                                       &lt;element name="AnatomicalTargetName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="MaterialsAndImplants" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Material" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;group ref="{}CodeGroup"/>
         *                                                 &lt;element name="MaterialName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="Implant" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;group ref="{}CodeGroup"/>
         *                                                 &lt;element name="ImplantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="ProcedureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Therapies" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Therapy" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;group ref="{}CodeGroup"/>
         *                             &lt;group ref="{}TimeStampsGroup"/>
         *                             &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                             &lt;element name="TherapyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="SelfCareInterventions" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="SelfCareIntervention" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;group ref="{}CodeGroup"/>
         *                             &lt;group ref="{}TimeStampsGroup"/>
         *                             &lt;element name="SelfCareName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "medication",
            "vaccinations",
            "procedures",
            "therapies",
            "selfCareInterventions"
        })
        public static class Interventions {

            @XmlElement(name = "Medication")
            protected DSSRequest.Patient.Interventions.Medication medication;
            @XmlElement(name = "Vaccinations")
            protected DSSRequest.Patient.Interventions.Vaccinations vaccinations;
            @XmlElement(name = "Procedures")
            protected DSSRequest.Patient.Interventions.Procedures procedures;
            @XmlElement(name = "Therapies")
            protected DSSRequest.Patient.Interventions.Therapies therapies;
            @XmlElement(name = "SelfCareInterventions")
            protected DSSRequest.Patient.Interventions.SelfCareInterventions selfCareInterventions;

            /**
             * Gets the value of the medication property.
             * 
             * @return
             *     possible object is
             *     {@link DSSRequest.Patient.Interventions.Medication }
             *     
             */
            public DSSRequest.Patient.Interventions.Medication getMedication() {
                return medication;
            }

            /**
             * Sets the value of the medication property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSRequest.Patient.Interventions.Medication }
             *     
             */
            public void setMedication(DSSRequest.Patient.Interventions.Medication value) {
                this.medication = value;
            }

            /**
             * Gets the value of the vaccinations property.
             * 
             * @return
             *     possible object is
             *     {@link DSSRequest.Patient.Interventions.Vaccinations }
             *     
             */
            public DSSRequest.Patient.Interventions.Vaccinations getVaccinations() {
                return vaccinations;
            }

            /**
             * Sets the value of the vaccinations property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSRequest.Patient.Interventions.Vaccinations }
             *     
             */
            public void setVaccinations(DSSRequest.Patient.Interventions.Vaccinations value) {
                this.vaccinations = value;
            }

            /**
             * Gets the value of the procedures property.
             * 
             * @return
             *     possible object is
             *     {@link DSSRequest.Patient.Interventions.Procedures }
             *     
             */
            public DSSRequest.Patient.Interventions.Procedures getProcedures() {
                return procedures;
            }

            /**
             * Sets the value of the procedures property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSRequest.Patient.Interventions.Procedures }
             *     
             */
            public void setProcedures(DSSRequest.Patient.Interventions.Procedures value) {
                this.procedures = value;
            }

            /**
             * Gets the value of the therapies property.
             * 
             * @return
             *     possible object is
             *     {@link DSSRequest.Patient.Interventions.Therapies }
             *     
             */
            public DSSRequest.Patient.Interventions.Therapies getTherapies() {
                return therapies;
            }

            /**
             * Sets the value of the therapies property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSRequest.Patient.Interventions.Therapies }
             *     
             */
            public void setTherapies(DSSRequest.Patient.Interventions.Therapies value) {
                this.therapies = value;
            }

            /**
             * Gets the value of the selfCareInterventions property.
             * 
             * @return
             *     possible object is
             *     {@link DSSRequest.Patient.Interventions.SelfCareInterventions }
             *     
             */
            public DSSRequest.Patient.Interventions.SelfCareInterventions getSelfCareInterventions() {
                return selfCareInterventions;
            }

            /**
             * Sets the value of the selfCareInterventions property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSRequest.Patient.Interventions.SelfCareInterventions }
             *     
             */
            public void setSelfCareInterventions(DSSRequest.Patient.Interventions.SelfCareInterventions value) {
                this.selfCareInterventions = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Drug" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;group ref="{}CodeGroup" maxOccurs="unbounded"/>
             *                   &lt;group ref="{}TimeStampsGroup"/>
             *                   &lt;element name="Strength" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                   &lt;element name="StrengthUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="AdministrationRoute" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;group ref="{}CodeGroup"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="DailyDose" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                   &lt;element name="Dosage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="DrugStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *                   &lt;element name="LastPrescription" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;group ref="{}TimeStampsGroup"/>
             *                             &lt;element name="PackageAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "drug"
            })
            public static class Medication {

                @XmlElement(name = "Drug", required = true)
                protected List<DSSRequest.Patient.Interventions.Medication.Drug> drug;

                /**
                 * Gets the value of the drug property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the drug property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDrug().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DSSRequest.Patient.Interventions.Medication.Drug }
                 * 
                 * 
                 */
                public List<DSSRequest.Patient.Interventions.Medication.Drug> getDrug() {
                    if (drug == null) {
                        drug = new ArrayList<DSSRequest.Patient.Interventions.Medication.Drug>();
                    }
                    return this.drug;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;group ref="{}CodeGroup" maxOccurs="unbounded"/>
                 *         &lt;group ref="{}TimeStampsGroup"/>
                 *         &lt;element name="Strength" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *         &lt;element name="StrengthUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="AdministrationRoute" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;group ref="{}CodeGroup"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="DailyDose" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *         &lt;element name="Dosage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="DrugStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
                 *         &lt;element name="LastPrescription" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;group ref="{}TimeStampsGroup"/>
                 *                   &lt;element name="PackageAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "codeGroup",
                    "startStamp",
                    "endStamp",
                    "pointStamp",
                    "strength",
                    "strengthUnit",
                    "administrationRoute",
                    "dailyDose",
                    "dosage",
                    "drugStatus",
                    "lastPrescription",
                    "drugName"
                })
                public static class Drug {

                    @XmlElementRefs({
                        @XmlElementRef(name = "CodeSystem", type = JAXBElement.class),
                        @XmlElementRef(name = "CodeSystemVersion", type = JAXBElement.class),
                        @XmlElementRef(name = "CodeValue", type = JAXBElement.class)
                    })
                    protected List<JAXBElement<String>> codeGroup;
                    @XmlElement(name = "StartStamp")
                    protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp startStamp;
                    @XmlElement(name = "EndStamp")
                    protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp endStamp;
                    @XmlElement(name = "PointStamp")
                    protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp pointStamp;
                    @XmlElementRef(name = "Strength", type = JAXBElement.class, required = false)
                    protected JAXBElement<BigDecimal> strength;
                    @XmlElement(name = "StrengthUnit")
                    protected String strengthUnit;
                    @XmlElement(name = "AdministrationRoute")
                    protected DSSRequest.Patient.Interventions.Medication.Drug.AdministrationRoute administrationRoute;
                    @XmlElementRef(name = "DailyDose", type = JAXBElement.class, required = false)
                    protected JAXBElement<BigDecimal> dailyDose;
                    @XmlElement(name = "Dosage")
                    protected String dosage;
                    @XmlElement(name = "DrugStatus")
                    protected Integer drugStatus;
                    @XmlElement(name = "LastPrescription")
                    protected DSSRequest.Patient.Interventions.Medication.Drug.LastPrescription lastPrescription;
                    @XmlElement(name = "DrugName")
                    protected String drugName;

                    /**
                     * Coding system groups: medication. Cardinality changed to "1..*" in version 1.11 to allow multiple coding of drugs (e.g. for adequate interaction checks including data for drug administration route) Gets the value of the codeGroup property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the codeGroup property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getCodeGroup().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link JAXBElement }{@code <}{@link String }{@code >}
                     * {@link JAXBElement }{@code <}{@link String }{@code >}
                     * {@link JAXBElement }{@code <}{@link String }{@code >}
                     * 
                     * 
                     */
                    public List<JAXBElement<String>> getCodeGroup() {
                        if (codeGroup == null) {
                            codeGroup = new ArrayList<JAXBElement<String>>();
                        }
                        return this.codeGroup;
                    }

                    /**
                     * Gets the value of the startStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                     *     
                     */
                    public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp getStartStamp() {
                        return startStamp;
                    }

                    /**
                     * Sets the value of the startStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                     *     
                     */
                    public void setStartStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp value) {
                        this.startStamp = value;
                    }

                    /**
                     * Gets the value of the endStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                     *     
                     */
                    public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp getEndStamp() {
                        return endStamp;
                    }

                    /**
                     * Sets the value of the endStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                     *     
                     */
                    public void setEndStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp value) {
                        this.endStamp = value;
                    }

                    /**
                     * Gets the value of the pointStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                     *     
                     */
                    public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp getPointStamp() {
                        return pointStamp;
                    }

                    /**
                     * Sets the value of the pointStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                     *     
                     */
                    public void setPointStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp value) {
                        this.pointStamp = value;
                    }

                    /**
                     * Gets the value of the strength property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                     *     
                     */
                    public JAXBElement<BigDecimal> getStrength() {
                        return strength;
                    }

                    /**
                     * Sets the value of the strength property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                     *     
                     */
                    public void setStrength(JAXBElement<BigDecimal> value) {
                        this.strength = value;
                    }

                    /**
                     * Gets the value of the strengthUnit property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getStrengthUnit() {
                        return strengthUnit;
                    }

                    /**
                     * Sets the value of the strengthUnit property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setStrengthUnit(String value) {
                        this.strengthUnit = value;
                    }

                    /**
                     * Gets the value of the administrationRoute property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DSSRequest.Patient.Interventions.Medication.Drug.AdministrationRoute }
                     *     
                     */
                    public DSSRequest.Patient.Interventions.Medication.Drug.AdministrationRoute getAdministrationRoute() {
                        return administrationRoute;
                    }

                    /**
                     * Sets the value of the administrationRoute property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DSSRequest.Patient.Interventions.Medication.Drug.AdministrationRoute }
                     *     
                     */
                    public void setAdministrationRoute(DSSRequest.Patient.Interventions.Medication.Drug.AdministrationRoute value) {
                        this.administrationRoute = value;
                    }

                    /**
                     * Gets the value of the dailyDose property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                     *     
                     */
                    public JAXBElement<BigDecimal> getDailyDose() {
                        return dailyDose;
                    }

                    /**
                     * Sets the value of the dailyDose property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                     *     
                     */
                    public void setDailyDose(JAXBElement<BigDecimal> value) {
                        this.dailyDose = value;
                    }

                    /**
                     * Gets the value of the dosage property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDosage() {
                        return dosage;
                    }

                    /**
                     * Sets the value of the dosage property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDosage(String value) {
                        this.dosage = value;
                    }

                    /**
                     * Gets the value of the drugStatus property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getDrugStatus() {
                        return drugStatus;
                    }

                    /**
                     * Sets the value of the drugStatus property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setDrugStatus(Integer value) {
                        this.drugStatus = value;
                    }

                    /**
                     * Gets the value of the lastPrescription property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DSSRequest.Patient.Interventions.Medication.Drug.LastPrescription }
                     *     
                     */
                    public DSSRequest.Patient.Interventions.Medication.Drug.LastPrescription getLastPrescription() {
                        return lastPrescription;
                    }

                    /**
                     * Sets the value of the lastPrescription property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DSSRequest.Patient.Interventions.Medication.Drug.LastPrescription }
                     *     
                     */
                    public void setLastPrescription(DSSRequest.Patient.Interventions.Medication.Drug.LastPrescription value) {
                        this.lastPrescription = value;
                    }

                    /**
                     * Gets the value of the drugName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDrugName() {
                        return drugName;
                    }

                    /**
                     * Sets the value of the drugName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDrugName(String value) {
                        this.drugName = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;group ref="{}CodeGroup"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "codeValue",
                        "codeSystem",
                        "codeSystemVersion"
                    })
                    public static class AdministrationRoute {

                        @XmlElement(name = "CodeValue", required = true)
                        protected String codeValue;
                        @XmlElement(name = "CodeSystem", required = true)
                        protected String codeSystem;
                        @XmlElement(name = "CodeSystemVersion")
                        protected String codeSystemVersion;

                        /**
                         * Gets the value of the codeValue property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCodeValue() {
                            return codeValue;
                        }

                        /**
                         * Sets the value of the codeValue property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCodeValue(String value) {
                            this.codeValue = value;
                        }

                        /**
                         * Gets the value of the codeSystem property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCodeSystem() {
                            return codeSystem;
                        }

                        /**
                         * Sets the value of the codeSystem property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCodeSystem(String value) {
                            this.codeSystem = value;
                        }

                        /**
                         * Gets the value of the codeSystemVersion property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCodeSystemVersion() {
                            return codeSystemVersion;
                        }

                        /**
                         * Sets the value of the codeSystemVersion property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCodeSystemVersion(String value) {
                            this.codeSystemVersion = value;
                        }

                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;group ref="{}TimeStampsGroup"/>
                     *         &lt;element name="PackageAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "startStamp",
                        "endStamp",
                        "pointStamp",
                        "packageAmount"
                    })
                    public static class LastPrescription {

                        @XmlElement(name = "StartStamp")
                        protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp startStamp;
                        @XmlElement(name = "EndStamp")
                        protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp endStamp;
                        @XmlElement(name = "PointStamp")
                        protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp pointStamp;
                        @XmlElement(name = "PackageAmount")
                        protected int packageAmount;

                        /**
                         * Gets the value of the startStamp property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                         *     
                         */
                        public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp getStartStamp() {
                            return startStamp;
                        }

                        /**
                         * Sets the value of the startStamp property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                         *     
                         */
                        public void setStartStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp value) {
                            this.startStamp = value;
                        }

                        /**
                         * Gets the value of the endStamp property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                         *     
                         */
                        public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp getEndStamp() {
                            return endStamp;
                        }

                        /**
                         * Sets the value of the endStamp property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                         *     
                         */
                        public void setEndStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp value) {
                            this.endStamp = value;
                        }

                        /**
                         * Gets the value of the pointStamp property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                         *     
                         */
                        public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp getPointStamp() {
                            return pointStamp;
                        }

                        /**
                         * Sets the value of the pointStamp property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                         *     
                         */
                        public void setPointStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp value) {
                            this.pointStamp = value;
                        }

                        /**
                         * Gets the value of the packageAmount property.
                         * 
                         */
                        public int getPackageAmount() {
                            return packageAmount;
                        }

                        /**
                         * Sets the value of the packageAmount property.
                         * 
                         */
                        public void setPackageAmount(int value) {
                            this.packageAmount = value;
                        }

                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Procedure" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;group ref="{}CodeGroup"/>
             *                   &lt;group ref="{}TimeStampsGroup"/>
             *                   &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *                   &lt;element name="AnatomicalTarget" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;group ref="{}CodeGroup"/>
             *                             &lt;element name="AnatomicalTargetName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="MaterialsAndImplants" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Material" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;group ref="{}CodeGroup"/>
             *                                       &lt;element name="MaterialName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="Implant" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;group ref="{}CodeGroup"/>
             *                                       &lt;element name="ImplantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="ProcedureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "procedure"
            })
            public static class Procedures {

                @XmlElement(name = "Procedure", required = true)
                protected List<DSSRequest.Patient.Interventions.Procedures.Procedure> procedure;

                /**
                 * Gets the value of the procedure property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the procedure property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getProcedure().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DSSRequest.Patient.Interventions.Procedures.Procedure }
                 * 
                 * 
                 */
                public List<DSSRequest.Patient.Interventions.Procedures.Procedure> getProcedure() {
                    if (procedure == null) {
                        procedure = new ArrayList<DSSRequest.Patient.Interventions.Procedures.Procedure>();
                    }
                    return this.procedure;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;group ref="{}CodeGroup"/>
                 *         &lt;group ref="{}TimeStampsGroup"/>
                 *         &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
                 *         &lt;element name="AnatomicalTarget" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;group ref="{}CodeGroup"/>
                 *                   &lt;element name="AnatomicalTargetName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="MaterialsAndImplants" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Material" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;group ref="{}CodeGroup"/>
                 *                             &lt;element name="MaterialName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="Implant" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;group ref="{}CodeGroup"/>
                 *                             &lt;element name="ImplantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="ProcedureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "codeValue",
                    "codeSystem",
                    "codeSystemVersion",
                    "startStamp",
                    "endStamp",
                    "pointStamp",
                    "ordered",
                    "anatomicalTarget",
                    "materialsAndImplants",
                    "procedureName"
                })
                public static class Procedure {

                    @XmlElement(name = "CodeValue", required = true)
                    protected String codeValue;
                    @XmlElement(name = "CodeSystem", required = true)
                    protected String codeSystem;
                    @XmlElement(name = "CodeSystemVersion")
                    protected String codeSystemVersion;
                    @XmlElement(name = "StartStamp")
                    protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp startStamp;
                    @XmlElement(name = "EndStamp")
                    protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp endStamp;
                    @XmlElement(name = "PointStamp")
                    protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp pointStamp;
                    @XmlElement(name = "Ordered")
                    protected Boolean ordered;
                    @XmlElement(name = "AnatomicalTarget")
                    protected DSSRequest.Patient.Interventions.Procedures.Procedure.AnatomicalTarget anatomicalTarget;
                    @XmlElement(name = "MaterialsAndImplants")
                    protected DSSRequest.Patient.Interventions.Procedures.Procedure.MaterialsAndImplants materialsAndImplants;
                    @XmlElement(name = "ProcedureName")
                    protected String procedureName;

                    /**
                     * Gets the value of the codeValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeValue() {
                        return codeValue;
                    }

                    /**
                     * Sets the value of the codeValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeValue(String value) {
                        this.codeValue = value;
                    }

                    /**
                     * Gets the value of the codeSystem property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystem() {
                        return codeSystem;
                    }

                    /**
                     * Sets the value of the codeSystem property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystem(String value) {
                        this.codeSystem = value;
                    }

                    /**
                     * Gets the value of the codeSystemVersion property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystemVersion() {
                        return codeSystemVersion;
                    }

                    /**
                     * Sets the value of the codeSystemVersion property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystemVersion(String value) {
                        this.codeSystemVersion = value;
                    }

                    /**
                     * Gets the value of the startStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                     *     
                     */
                    public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp getStartStamp() {
                        return startStamp;
                    }

                    /**
                     * Sets the value of the startStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                     *     
                     */
                    public void setStartStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp value) {
                        this.startStamp = value;
                    }

                    /**
                     * Gets the value of the endStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                     *     
                     */
                    public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp getEndStamp() {
                        return endStamp;
                    }

                    /**
                     * Sets the value of the endStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                     *     
                     */
                    public void setEndStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp value) {
                        this.endStamp = value;
                    }

                    /**
                     * Gets the value of the pointStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                     *     
                     */
                    public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp getPointStamp() {
                        return pointStamp;
                    }

                    /**
                     * Sets the value of the pointStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                     *     
                     */
                    public void setPointStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp value) {
                        this.pointStamp = value;
                    }

                    /**
                     * Gets the value of the ordered property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isOrdered() {
                        return ordered;
                    }

                    /**
                     * Sets the value of the ordered property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setOrdered(Boolean value) {
                        this.ordered = value;
                    }

                    /**
                     * Gets the value of the anatomicalTarget property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DSSRequest.Patient.Interventions.Procedures.Procedure.AnatomicalTarget }
                     *     
                     */
                    public DSSRequest.Patient.Interventions.Procedures.Procedure.AnatomicalTarget getAnatomicalTarget() {
                        return anatomicalTarget;
                    }

                    /**
                     * Sets the value of the anatomicalTarget property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DSSRequest.Patient.Interventions.Procedures.Procedure.AnatomicalTarget }
                     *     
                     */
                    public void setAnatomicalTarget(DSSRequest.Patient.Interventions.Procedures.Procedure.AnatomicalTarget value) {
                        this.anatomicalTarget = value;
                    }

                    /**
                     * Gets the value of the materialsAndImplants property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DSSRequest.Patient.Interventions.Procedures.Procedure.MaterialsAndImplants }
                     *     
                     */
                    public DSSRequest.Patient.Interventions.Procedures.Procedure.MaterialsAndImplants getMaterialsAndImplants() {
                        return materialsAndImplants;
                    }

                    /**
                     * Sets the value of the materialsAndImplants property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DSSRequest.Patient.Interventions.Procedures.Procedure.MaterialsAndImplants }
                     *     
                     */
                    public void setMaterialsAndImplants(DSSRequest.Patient.Interventions.Procedures.Procedure.MaterialsAndImplants value) {
                        this.materialsAndImplants = value;
                    }

                    /**
                     * Gets the value of the procedureName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getProcedureName() {
                        return procedureName;
                    }

                    /**
                     * Sets the value of the procedureName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setProcedureName(String value) {
                        this.procedureName = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;group ref="{}CodeGroup"/>
                     *         &lt;element name="AnatomicalTargetName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "codeValue",
                        "codeSystem",
                        "codeSystemVersion",
                        "anatomicalTargetName"
                    })
                    public static class AnatomicalTarget {

                        @XmlElement(name = "CodeValue", required = true)
                        protected String codeValue;
                        @XmlElement(name = "CodeSystem", required = true)
                        protected String codeSystem;
                        @XmlElement(name = "CodeSystemVersion")
                        protected String codeSystemVersion;
                        @XmlElement(name = "AnatomicalTargetName", required = true)
                        protected String anatomicalTargetName;

                        /**
                         * Gets the value of the codeValue property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCodeValue() {
                            return codeValue;
                        }

                        /**
                         * Sets the value of the codeValue property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCodeValue(String value) {
                            this.codeValue = value;
                        }

                        /**
                         * Gets the value of the codeSystem property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCodeSystem() {
                            return codeSystem;
                        }

                        /**
                         * Sets the value of the codeSystem property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCodeSystem(String value) {
                            this.codeSystem = value;
                        }

                        /**
                         * Gets the value of the codeSystemVersion property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCodeSystemVersion() {
                            return codeSystemVersion;
                        }

                        /**
                         * Sets the value of the codeSystemVersion property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCodeSystemVersion(String value) {
                            this.codeSystemVersion = value;
                        }

                        /**
                         * Gets the value of the anatomicalTargetName property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAnatomicalTargetName() {
                            return anatomicalTargetName;
                        }

                        /**
                         * Sets the value of the anatomicalTargetName property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAnatomicalTargetName(String value) {
                            this.anatomicalTargetName = value;
                        }

                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="Material" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;group ref="{}CodeGroup"/>
                     *                   &lt;element name="MaterialName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="Implant" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;group ref="{}CodeGroup"/>
                     *                   &lt;element name="ImplantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "material",
                        "implant"
                    })
                    public static class MaterialsAndImplants {

                        @XmlElement(name = "Material")
                        protected List<DSSRequest.Patient.Interventions.Procedures.Procedure.MaterialsAndImplants.Material> material;
                        @XmlElement(name = "Implant")
                        protected List<DSSRequest.Patient.Interventions.Procedures.Procedure.MaterialsAndImplants.Implant> implant;

                        /**
                         * Gets the value of the material property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the material property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getMaterial().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link DSSRequest.Patient.Interventions.Procedures.Procedure.MaterialsAndImplants.Material }
                         * 
                         * 
                         */
                        public List<DSSRequest.Patient.Interventions.Procedures.Procedure.MaterialsAndImplants.Material> getMaterial() {
                            if (material == null) {
                                material = new ArrayList<DSSRequest.Patient.Interventions.Procedures.Procedure.MaterialsAndImplants.Material>();
                            }
                            return this.material;
                        }

                        /**
                         * Gets the value of the implant property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the implant property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getImplant().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link DSSRequest.Patient.Interventions.Procedures.Procedure.MaterialsAndImplants.Implant }
                         * 
                         * 
                         */
                        public List<DSSRequest.Patient.Interventions.Procedures.Procedure.MaterialsAndImplants.Implant> getImplant() {
                            if (implant == null) {
                                implant = new ArrayList<DSSRequest.Patient.Interventions.Procedures.Procedure.MaterialsAndImplants.Implant>();
                            }
                            return this.implant;
                        }


                        /**
                         * <p>Java class for anonymous complex type.
                         * 
                         * <p>The following schema fragment specifies the expected content contained within this class.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;group ref="{}CodeGroup"/>
                         *         &lt;element name="ImplantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "codeValue",
                            "codeSystem",
                            "codeSystemVersion",
                            "implantName"
                        })
                        public static class Implant {

                            @XmlElement(name = "CodeValue", required = true)
                            protected String codeValue;
                            @XmlElement(name = "CodeSystem", required = true)
                            protected String codeSystem;
                            @XmlElement(name = "CodeSystemVersion")
                            protected String codeSystemVersion;
                            @XmlElement(name = "ImplantName")
                            protected String implantName;

                            /**
                             * Gets the value of the codeValue property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCodeValue() {
                                return codeValue;
                            }

                            /**
                             * Sets the value of the codeValue property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCodeValue(String value) {
                                this.codeValue = value;
                            }

                            /**
                             * Gets the value of the codeSystem property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCodeSystem() {
                                return codeSystem;
                            }

                            /**
                             * Sets the value of the codeSystem property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCodeSystem(String value) {
                                this.codeSystem = value;
                            }

                            /**
                             * Gets the value of the codeSystemVersion property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCodeSystemVersion() {
                                return codeSystemVersion;
                            }

                            /**
                             * Sets the value of the codeSystemVersion property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCodeSystemVersion(String value) {
                                this.codeSystemVersion = value;
                            }

                            /**
                             * Gets the value of the implantName property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getImplantName() {
                                return implantName;
                            }

                            /**
                             * Sets the value of the implantName property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setImplantName(String value) {
                                this.implantName = value;
                            }

                        }


                        /**
                         * <p>Java class for anonymous complex type.
                         * 
                         * <p>The following schema fragment specifies the expected content contained within this class.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;group ref="{}CodeGroup"/>
                         *         &lt;element name="MaterialName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "codeValue",
                            "codeSystem",
                            "codeSystemVersion",
                            "materialName"
                        })
                        public static class Material {

                            @XmlElement(name = "CodeValue", required = true)
                            protected String codeValue;
                            @XmlElement(name = "CodeSystem", required = true)
                            protected String codeSystem;
                            @XmlElement(name = "CodeSystemVersion")
                            protected String codeSystemVersion;
                            @XmlElement(name = "MaterialName")
                            protected String materialName;

                            /**
                             * Gets the value of the codeValue property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCodeValue() {
                                return codeValue;
                            }

                            /**
                             * Sets the value of the codeValue property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCodeValue(String value) {
                                this.codeValue = value;
                            }

                            /**
                             * Gets the value of the codeSystem property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCodeSystem() {
                                return codeSystem;
                            }

                            /**
                             * Sets the value of the codeSystem property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCodeSystem(String value) {
                                this.codeSystem = value;
                            }

                            /**
                             * Gets the value of the codeSystemVersion property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCodeSystemVersion() {
                                return codeSystemVersion;
                            }

                            /**
                             * Sets the value of the codeSystemVersion property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCodeSystemVersion(String value) {
                                this.codeSystemVersion = value;
                            }

                            /**
                             * Gets the value of the materialName property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getMaterialName() {
                                return materialName;
                            }

                            /**
                             * Sets the value of the materialName property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setMaterialName(String value) {
                                this.materialName = value;
                            }

                        }

                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="SelfCareIntervention" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;group ref="{}CodeGroup"/>
             *                   &lt;group ref="{}TimeStampsGroup"/>
             *                   &lt;element name="SelfCareName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "selfCareIntervention"
            })
            public static class SelfCareInterventions {

                @XmlElement(name = "SelfCareIntervention", required = true)
                protected List<DSSRequest.Patient.Interventions.SelfCareInterventions.SelfCareIntervention> selfCareIntervention;

                /**
                 * Gets the value of the selfCareIntervention property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the selfCareIntervention property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSelfCareIntervention().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DSSRequest.Patient.Interventions.SelfCareInterventions.SelfCareIntervention }
                 * 
                 * 
                 */
                public List<DSSRequest.Patient.Interventions.SelfCareInterventions.SelfCareIntervention> getSelfCareIntervention() {
                    if (selfCareIntervention == null) {
                        selfCareIntervention = new ArrayList<DSSRequest.Patient.Interventions.SelfCareInterventions.SelfCareIntervention>();
                    }
                    return this.selfCareIntervention;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;group ref="{}CodeGroup"/>
                 *         &lt;group ref="{}TimeStampsGroup"/>
                 *         &lt;element name="SelfCareName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "codeValue",
                    "codeSystem",
                    "codeSystemVersion",
                    "startStamp",
                    "endStamp",
                    "pointStamp",
                    "selfCareName"
                })
                public static class SelfCareIntervention {

                    @XmlElement(name = "CodeValue", required = true)
                    protected String codeValue;
                    @XmlElement(name = "CodeSystem", required = true)
                    protected String codeSystem;
                    @XmlElement(name = "CodeSystemVersion")
                    protected String codeSystemVersion;
                    @XmlElement(name = "StartStamp")
                    protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp startStamp;
                    @XmlElement(name = "EndStamp")
                    protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp endStamp;
                    @XmlElement(name = "PointStamp")
                    protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp pointStamp;
                    @XmlElement(name = "SelfCareName")
                    protected String selfCareName;

                    /**
                     * Gets the value of the codeValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeValue() {
                        return codeValue;
                    }

                    /**
                     * Sets the value of the codeValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeValue(String value) {
                        this.codeValue = value;
                    }

                    /**
                     * Gets the value of the codeSystem property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystem() {
                        return codeSystem;
                    }

                    /**
                     * Sets the value of the codeSystem property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystem(String value) {
                        this.codeSystem = value;
                    }

                    /**
                     * Gets the value of the codeSystemVersion property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystemVersion() {
                        return codeSystemVersion;
                    }

                    /**
                     * Sets the value of the codeSystemVersion property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystemVersion(String value) {
                        this.codeSystemVersion = value;
                    }

                    /**
                     * Gets the value of the startStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                     *     
                     */
                    public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp getStartStamp() {
                        return startStamp;
                    }

                    /**
                     * Sets the value of the startStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                     *     
                     */
                    public void setStartStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp value) {
                        this.startStamp = value;
                    }

                    /**
                     * Gets the value of the endStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                     *     
                     */
                    public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp getEndStamp() {
                        return endStamp;
                    }

                    /**
                     * Sets the value of the endStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                     *     
                     */
                    public void setEndStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp value) {
                        this.endStamp = value;
                    }

                    /**
                     * Gets the value of the pointStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                     *     
                     */
                    public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp getPointStamp() {
                        return pointStamp;
                    }

                    /**
                     * Sets the value of the pointStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                     *     
                     */
                    public void setPointStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp value) {
                        this.pointStamp = value;
                    }

                    /**
                     * Gets the value of the selfCareName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSelfCareName() {
                        return selfCareName;
                    }

                    /**
                     * Sets the value of the selfCareName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSelfCareName(String value) {
                        this.selfCareName = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Therapy" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;group ref="{}CodeGroup"/>
             *                   &lt;group ref="{}TimeStampsGroup"/>
             *                   &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *                   &lt;element name="TherapyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "therapy"
            })
            public static class Therapies {

                @XmlElement(name = "Therapy", required = true)
                protected List<DSSRequest.Patient.Interventions.Therapies.Therapy> therapy;

                /**
                 * Gets the value of the therapy property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the therapy property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTherapy().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DSSRequest.Patient.Interventions.Therapies.Therapy }
                 * 
                 * 
                 */
                public List<DSSRequest.Patient.Interventions.Therapies.Therapy> getTherapy() {
                    if (therapy == null) {
                        therapy = new ArrayList<DSSRequest.Patient.Interventions.Therapies.Therapy>();
                    }
                    return this.therapy;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;group ref="{}CodeGroup"/>
                 *         &lt;group ref="{}TimeStampsGroup"/>
                 *         &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
                 *         &lt;element name="TherapyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "codeValue",
                    "codeSystem",
                    "codeSystemVersion",
                    "startStamp",
                    "endStamp",
                    "pointStamp",
                    "ordered",
                    "therapyName"
                })
                public static class Therapy {

                    @XmlElement(name = "CodeValue", required = true)
                    protected String codeValue;
                    @XmlElement(name = "CodeSystem", required = true)
                    protected String codeSystem;
                    @XmlElement(name = "CodeSystemVersion")
                    protected String codeSystemVersion;
                    @XmlElement(name = "StartStamp")
                    protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp startStamp;
                    @XmlElement(name = "EndStamp")
                    protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp endStamp;
                    @XmlElement(name = "PointStamp")
                    protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp pointStamp;
                    @XmlElement(name = "Ordered")
                    protected Boolean ordered;
                    @XmlElement(name = "TherapyName")
                    protected String therapyName;

                    /**
                     * Gets the value of the codeValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeValue() {
                        return codeValue;
                    }

                    /**
                     * Sets the value of the codeValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeValue(String value) {
                        this.codeValue = value;
                    }

                    /**
                     * Gets the value of the codeSystem property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystem() {
                        return codeSystem;
                    }

                    /**
                     * Sets the value of the codeSystem property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystem(String value) {
                        this.codeSystem = value;
                    }

                    /**
                     * Gets the value of the codeSystemVersion property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystemVersion() {
                        return codeSystemVersion;
                    }

                    /**
                     * Sets the value of the codeSystemVersion property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystemVersion(String value) {
                        this.codeSystemVersion = value;
                    }

                    /**
                     * Gets the value of the startStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                     *     
                     */
                    public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp getStartStamp() {
                        return startStamp;
                    }

                    /**
                     * Sets the value of the startStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                     *     
                     */
                    public void setStartStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp value) {
                        this.startStamp = value;
                    }

                    /**
                     * Gets the value of the endStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                     *     
                     */
                    public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp getEndStamp() {
                        return endStamp;
                    }

                    /**
                     * Sets the value of the endStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                     *     
                     */
                    public void setEndStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp value) {
                        this.endStamp = value;
                    }

                    /**
                     * Gets the value of the pointStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                     *     
                     */
                    public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp getPointStamp() {
                        return pointStamp;
                    }

                    /**
                     * Sets the value of the pointStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                     *     
                     */
                    public void setPointStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp value) {
                        this.pointStamp = value;
                    }

                    /**
                     * Gets the value of the ordered property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isOrdered() {
                        return ordered;
                    }

                    /**
                     * Sets the value of the ordered property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setOrdered(Boolean value) {
                        this.ordered = value;
                    }

                    /**
                     * Gets the value of the therapyName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTherapyName() {
                        return therapyName;
                    }

                    /**
                     * Sets the value of the therapyName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTherapyName(String value) {
                        this.therapyName = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Vaccine" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;group ref="{}CodeGroup"/>
             *                   &lt;group ref="{}TimeStampsGroup"/>
             *                   &lt;element name="Strength" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                   &lt;element name="StrengthUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Dose" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                   &lt;element name="VaccinationStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *                   &lt;element name="VaccineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "vaccine"
            })
            public static class Vaccinations {

                @XmlElement(name = "Vaccine", required = true)
                protected List<DSSRequest.Patient.Interventions.Vaccinations.Vaccine> vaccine;

                /**
                 * Gets the value of the vaccine property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the vaccine property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getVaccine().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DSSRequest.Patient.Interventions.Vaccinations.Vaccine }
                 * 
                 * 
                 */
                public List<DSSRequest.Patient.Interventions.Vaccinations.Vaccine> getVaccine() {
                    if (vaccine == null) {
                        vaccine = new ArrayList<DSSRequest.Patient.Interventions.Vaccinations.Vaccine>();
                    }
                    return this.vaccine;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;group ref="{}CodeGroup"/>
                 *         &lt;group ref="{}TimeStampsGroup"/>
                 *         &lt;element name="Strength" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *         &lt;element name="StrengthUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Dose" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *         &lt;element name="VaccinationStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
                 *         &lt;element name="VaccineName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "codeValue",
                    "codeSystem",
                    "codeSystemVersion",
                    "startStamp",
                    "endStamp",
                    "pointStamp",
                    "strength",
                    "strengthUnit",
                    "dose",
                    "vaccinationStatus",
                    "vaccineName"
                })
                public static class Vaccine {

                    @XmlElement(name = "CodeValue", required = true)
                    protected String codeValue;
                    @XmlElement(name = "CodeSystem", required = true)
                    protected String codeSystem;
                    @XmlElement(name = "CodeSystemVersion")
                    protected String codeSystemVersion;
                    @XmlElement(name = "StartStamp")
                    protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp startStamp;
                    @XmlElement(name = "EndStamp")
                    protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp endStamp;
                    @XmlElement(name = "PointStamp")
                    protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp pointStamp;
                    @XmlElement(name = "Strength")
                    protected BigDecimal strength;
                    @XmlElement(name = "StrengthUnit")
                    protected String strengthUnit;
                    @XmlElement(name = "Dose")
                    protected BigDecimal dose;
                    @XmlElement(name = "VaccinationStatus")
                    protected Integer vaccinationStatus;
                    @XmlElement(name = "VaccineName")
                    protected String vaccineName;

                    /**
                     * Gets the value of the codeValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeValue() {
                        return codeValue;
                    }

                    /**
                     * Sets the value of the codeValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeValue(String value) {
                        this.codeValue = value;
                    }

                    /**
                     * Gets the value of the codeSystem property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystem() {
                        return codeSystem;
                    }

                    /**
                     * Sets the value of the codeSystem property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystem(String value) {
                        this.codeSystem = value;
                    }

                    /**
                     * Gets the value of the codeSystemVersion property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystemVersion() {
                        return codeSystemVersion;
                    }

                    /**
                     * Sets the value of the codeSystemVersion property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystemVersion(String value) {
                        this.codeSystemVersion = value;
                    }

                    /**
                     * Gets the value of the startStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                     *     
                     */
                    public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp getStartStamp() {
                        return startStamp;
                    }

                    /**
                     * Sets the value of the startStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                     *     
                     */
                    public void setStartStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp value) {
                        this.startStamp = value;
                    }

                    /**
                     * Gets the value of the endStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                     *     
                     */
                    public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp getEndStamp() {
                        return endStamp;
                    }

                    /**
                     * Sets the value of the endStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                     *     
                     */
                    public void setEndStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp value) {
                        this.endStamp = value;
                    }

                    /**
                     * Gets the value of the pointStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                     *     
                     */
                    public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp getPointStamp() {
                        return pointStamp;
                    }

                    /**
                     * Sets the value of the pointStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                     *     
                     */
                    public void setPointStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp value) {
                        this.pointStamp = value;
                    }

                    /**
                     * Gets the value of the strength property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getStrength() {
                        return strength;
                    }

                    /**
                     * Sets the value of the strength property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setStrength(BigDecimal value) {
                        this.strength = value;
                    }

                    /**
                     * Gets the value of the strengthUnit property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getStrengthUnit() {
                        return strengthUnit;
                    }

                    /**
                     * Sets the value of the strengthUnit property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setStrengthUnit(String value) {
                        this.strengthUnit = value;
                    }

                    /**
                     * Gets the value of the dose property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getDose() {
                        return dose;
                    }

                    /**
                     * Sets the value of the dose property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setDose(BigDecimal value) {
                        this.dose = value;
                    }

                    /**
                     * Gets the value of the vaccinationStatus property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getVaccinationStatus() {
                        return vaccinationStatus;
                    }

                    /**
                     * Sets the value of the vaccinationStatus property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setVaccinationStatus(Integer value) {
                        this.vaccinationStatus = value;
                    }

                    /**
                     * Gets the value of the vaccineName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVaccineName() {
                        return vaccineName;
                    }

                    /**
                     * Sets the value of the vaccineName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVaccineName(String value) {
                        this.vaccineName = value;
                    }

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Measurements" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Measurement" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;group ref="{}CodeGroup"/>
         *                             &lt;group ref="{}TimeStampsGroup"/>
         *                             &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                             &lt;element name="Result" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="UpperNormalLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                       &lt;element name="LowerNormalLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="MeasurementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ImagingInvestigations" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ImagingInvestigation" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;group ref="{}CodeGroup"/>
         *                             &lt;group ref="{}TimeStampsGroup"/>
         *                             &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                             &lt;element name="ImagingInvestigationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Questionnaires" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;choice>
         *                   &lt;element name="Questionnaire" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;group ref="{}CodeGroup"/>
         *                             &lt;group ref="{}TimeStampsGroup"/>
         *                             &lt;element name="Questions" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Question" maxOccurs="unbounded">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="QuestionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="AnswerString" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="TotalPoints" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                             &lt;element name="QuestionnaireName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/choice>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "measurements",
            "imagingInvestigations",
            "questionnaires"
        })
        public static class Investigations {

            @XmlElement(name = "Measurements")
            protected DSSRequest.Patient.Investigations.Measurements measurements;
            @XmlElement(name = "ImagingInvestigations")
            protected DSSRequest.Patient.Investigations.ImagingInvestigations imagingInvestigations;
            @XmlElement(name = "Questionnaires")
            protected DSSRequest.Patient.Investigations.Questionnaires questionnaires;

            /**
             * Gets the value of the measurements property.
             * 
             * @return
             *     possible object is
             *     {@link DSSRequest.Patient.Investigations.Measurements }
             *     
             */
            public DSSRequest.Patient.Investigations.Measurements getMeasurements() {
                return measurements;
            }

            /**
             * Sets the value of the measurements property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSRequest.Patient.Investigations.Measurements }
             *     
             */
            public void setMeasurements(DSSRequest.Patient.Investigations.Measurements value) {
                this.measurements = value;
            }

            /**
             * Gets the value of the imagingInvestigations property.
             * 
             * @return
             *     possible object is
             *     {@link DSSRequest.Patient.Investigations.ImagingInvestigations }
             *     
             */
            public DSSRequest.Patient.Investigations.ImagingInvestigations getImagingInvestigations() {
                return imagingInvestigations;
            }

            /**
             * Sets the value of the imagingInvestigations property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSRequest.Patient.Investigations.ImagingInvestigations }
             *     
             */
            public void setImagingInvestigations(DSSRequest.Patient.Investigations.ImagingInvestigations value) {
                this.imagingInvestigations = value;
            }

            /**
             * Gets the value of the questionnaires property.
             * 
             * @return
             *     possible object is
             *     {@link DSSRequest.Patient.Investigations.Questionnaires }
             *     
             */
            public DSSRequest.Patient.Investigations.Questionnaires getQuestionnaires() {
                return questionnaires;
            }

            /**
             * Sets the value of the questionnaires property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSRequest.Patient.Investigations.Questionnaires }
             *     
             */
            public void setQuestionnaires(DSSRequest.Patient.Investigations.Questionnaires value) {
                this.questionnaires = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="ImagingInvestigation" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;group ref="{}CodeGroup"/>
             *                   &lt;group ref="{}TimeStampsGroup"/>
             *                   &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *                   &lt;element name="ImagingInvestigationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "imagingInvestigation"
            })
            public static class ImagingInvestigations {

                @XmlElement(name = "ImagingInvestigation", required = true)
                protected List<DSSRequest.Patient.Investigations.ImagingInvestigations.ImagingInvestigation> imagingInvestigation;

                /**
                 * Gets the value of the imagingInvestigation property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the imagingInvestigation property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getImagingInvestigation().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DSSRequest.Patient.Investigations.ImagingInvestigations.ImagingInvestigation }
                 * 
                 * 
                 */
                public List<DSSRequest.Patient.Investigations.ImagingInvestigations.ImagingInvestigation> getImagingInvestigation() {
                    if (imagingInvestigation == null) {
                        imagingInvestigation = new ArrayList<DSSRequest.Patient.Investigations.ImagingInvestigations.ImagingInvestigation>();
                    }
                    return this.imagingInvestigation;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;group ref="{}CodeGroup"/>
                 *         &lt;group ref="{}TimeStampsGroup"/>
                 *         &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
                 *         &lt;element name="ImagingInvestigationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "codeValue",
                    "codeSystem",
                    "codeSystemVersion",
                    "startStamp",
                    "endStamp",
                    "pointStamp",
                    "ordered",
                    "imagingInvestigationName"
                })
                public static class ImagingInvestigation {

                    @XmlElement(name = "CodeValue", required = true)
                    protected String codeValue;
                    @XmlElement(name = "CodeSystem", required = true)
                    protected String codeSystem;
                    @XmlElement(name = "CodeSystemVersion")
                    protected String codeSystemVersion;
                    @XmlElement(name = "StartStamp")
                    protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp startStamp;
                    @XmlElement(name = "EndStamp")
                    protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp endStamp;
                    @XmlElement(name = "PointStamp")
                    protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp pointStamp;
                    @XmlElement(name = "Ordered")
                    protected Boolean ordered;
                    @XmlElement(name = "ImagingInvestigationName")
                    protected String imagingInvestigationName;

                    /**
                     * Gets the value of the codeValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeValue() {
                        return codeValue;
                    }

                    /**
                     * Sets the value of the codeValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeValue(String value) {
                        this.codeValue = value;
                    }

                    /**
                     * Gets the value of the codeSystem property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystem() {
                        return codeSystem;
                    }

                    /**
                     * Sets the value of the codeSystem property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystem(String value) {
                        this.codeSystem = value;
                    }

                    /**
                     * Gets the value of the codeSystemVersion property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystemVersion() {
                        return codeSystemVersion;
                    }

                    /**
                     * Sets the value of the codeSystemVersion property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystemVersion(String value) {
                        this.codeSystemVersion = value;
                    }

                    /**
                     * Gets the value of the startStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                     *     
                     */
                    public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp getStartStamp() {
                        return startStamp;
                    }

                    /**
                     * Sets the value of the startStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                     *     
                     */
                    public void setStartStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp value) {
                        this.startStamp = value;
                    }

                    /**
                     * Gets the value of the endStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                     *     
                     */
                    public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp getEndStamp() {
                        return endStamp;
                    }

                    /**
                     * Sets the value of the endStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                     *     
                     */
                    public void setEndStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp value) {
                        this.endStamp = value;
                    }

                    /**
                     * Gets the value of the pointStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                     *     
                     */
                    public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp getPointStamp() {
                        return pointStamp;
                    }

                    /**
                     * Sets the value of the pointStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                     *     
                     */
                    public void setPointStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp value) {
                        this.pointStamp = value;
                    }

                    /**
                     * Gets the value of the ordered property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isOrdered() {
                        return ordered;
                    }

                    /**
                     * Sets the value of the ordered property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setOrdered(Boolean value) {
                        this.ordered = value;
                    }

                    /**
                     * Gets the value of the imagingInvestigationName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getImagingInvestigationName() {
                        return imagingInvestigationName;
                    }

                    /**
                     * Sets the value of the imagingInvestigationName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setImagingInvestigationName(String value) {
                        this.imagingInvestigationName = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Measurement" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;group ref="{}CodeGroup"/>
             *                   &lt;group ref="{}TimeStampsGroup"/>
             *                   &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *                   &lt;element name="Result" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="UpperNormalLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                             &lt;element name="LowerNormalLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="MeasurementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "measurement"
            })
            public static class Measurements {

                @XmlElement(name = "Measurement", required = true)
                protected List<DSSRequest.Patient.Investigations.Measurements.Measurement> measurement;

                /**
                 * Gets the value of the measurement property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the measurement property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getMeasurement().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DSSRequest.Patient.Investigations.Measurements.Measurement }
                 * 
                 * 
                 */
                public List<DSSRequest.Patient.Investigations.Measurements.Measurement> getMeasurement() {
                    if (measurement == null) {
                        measurement = new ArrayList<DSSRequest.Patient.Investigations.Measurements.Measurement>();
                    }
                    return this.measurement;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;group ref="{}CodeGroup"/>
                 *         &lt;group ref="{}TimeStampsGroup"/>
                 *         &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
                 *         &lt;element name="Result" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="UpperNormalLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                   &lt;element name="LowerNormalLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="MeasurementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "codeValue",
                    "codeSystem",
                    "codeSystemVersion",
                    "startStamp",
                    "endStamp",
                    "pointStamp",
                    "ordered",
                    "result",
                    "measurementName"
                })
                public static class Measurement {

                    @XmlElement(name = "CodeValue", required = true)
                    protected String codeValue;
                    @XmlElement(name = "CodeSystem", required = true)
                    protected String codeSystem;
                    @XmlElement(name = "CodeSystemVersion")
                    protected String codeSystemVersion;
                    @XmlElement(name = "StartStamp")
                    protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp startStamp;
                    @XmlElement(name = "EndStamp")
                    protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp endStamp;
                    @XmlElement(name = "PointStamp")
                    protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp pointStamp;
                    @XmlElement(name = "Ordered")
                    protected Boolean ordered;
                    @XmlElement(name = "Result")
                    protected DSSRequest.Patient.Investigations.Measurements.Measurement.Result result;
                    @XmlElement(name = "MeasurementName")
                    protected String measurementName;

                    /**
                     * Gets the value of the codeValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeValue() {
                        return codeValue;
                    }

                    /**
                     * Sets the value of the codeValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeValue(String value) {
                        this.codeValue = value;
                    }

                    /**
                     * Gets the value of the codeSystem property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystem() {
                        return codeSystem;
                    }

                    /**
                     * Sets the value of the codeSystem property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystem(String value) {
                        this.codeSystem = value;
                    }

                    /**
                     * Gets the value of the codeSystemVersion property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystemVersion() {
                        return codeSystemVersion;
                    }

                    /**
                     * Sets the value of the codeSystemVersion property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystemVersion(String value) {
                        this.codeSystemVersion = value;
                    }

                    /**
                     * Gets the value of the startStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                     *     
                     */
                    public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp getStartStamp() {
                        return startStamp;
                    }

                    /**
                     * Sets the value of the startStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                     *     
                     */
                    public void setStartStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp value) {
                        this.startStamp = value;
                    }

                    /**
                     * Gets the value of the endStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                     *     
                     */
                    public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp getEndStamp() {
                        return endStamp;
                    }

                    /**
                     * Sets the value of the endStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                     *     
                     */
                    public void setEndStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp value) {
                        this.endStamp = value;
                    }

                    /**
                     * Gets the value of the pointStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                     *     
                     */
                    public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp getPointStamp() {
                        return pointStamp;
                    }

                    /**
                     * Sets the value of the pointStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                     *     
                     */
                    public void setPointStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp value) {
                        this.pointStamp = value;
                    }

                    /**
                     * Gets the value of the ordered property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isOrdered() {
                        return ordered;
                    }

                    /**
                     * Sets the value of the ordered property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setOrdered(Boolean value) {
                        this.ordered = value;
                    }

                    /**
                     * Gets the value of the result property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DSSRequest.Patient.Investigations.Measurements.Measurement.Result }
                     *     
                     */
                    public DSSRequest.Patient.Investigations.Measurements.Measurement.Result getResult() {
                        return result;
                    }

                    /**
                     * Sets the value of the result property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DSSRequest.Patient.Investigations.Measurements.Measurement.Result }
                     *     
                     */
                    public void setResult(DSSRequest.Patient.Investigations.Measurements.Measurement.Result value) {
                        this.result = value;
                    }

                    /**
                     * Gets the value of the measurementName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMeasurementName() {
                        return measurementName;
                    }

                    /**
                     * Sets the value of the measurementName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMeasurementName(String value) {
                        this.measurementName = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="UpperNormalLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *         &lt;element name="LowerNormalLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "value",
                        "unit",
                        "upperNormalLimit",
                        "lowerNormalLimit"
                    })
                    public static class Result {

                        @XmlElement(name = "Value")
                        protected String value;
                        @XmlElement(name = "Unit")
                        protected String unit;
                        @XmlElement(name = "UpperNormalLimit")
                        protected BigDecimal upperNormalLimit;
                        @XmlElement(name = "LowerNormalLimit")
                        protected BigDecimal lowerNormalLimit;

                        /**
                         * Gets the value of the value property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getValue() {
                            return value;
                        }

                        /**
                         * Sets the value of the value property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setValue(String value) {
                            this.value = value;
                        }

                        /**
                         * Gets the value of the unit property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUnit() {
                            return unit;
                        }

                        /**
                         * Sets the value of the unit property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUnit(String value) {
                            this.unit = value;
                        }

                        /**
                         * Gets the value of the upperNormalLimit property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getUpperNormalLimit() {
                            return upperNormalLimit;
                        }

                        /**
                         * Sets the value of the upperNormalLimit property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setUpperNormalLimit(BigDecimal value) {
                            this.upperNormalLimit = value;
                        }

                        /**
                         * Gets the value of the lowerNormalLimit property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getLowerNormalLimit() {
                            return lowerNormalLimit;
                        }

                        /**
                         * Sets the value of the lowerNormalLimit property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setLowerNormalLimit(BigDecimal value) {
                            this.lowerNormalLimit = value;
                        }

                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;choice>
             *         &lt;element name="Questionnaire" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;group ref="{}CodeGroup"/>
             *                   &lt;group ref="{}TimeStampsGroup"/>
             *                   &lt;element name="Questions" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Question" maxOccurs="unbounded">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="QuestionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="AnswerString" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="TotalPoints" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *                   &lt;element name="QuestionnaireName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/choice>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "questionnaire"
            })
            public static class Questionnaires {

                @XmlElement(name = "Questionnaire")
                protected List<DSSRequest.Patient.Investigations.Questionnaires.Questionnaire> questionnaire;

                /**
                 * Gets the value of the questionnaire property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the questionnaire property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getQuestionnaire().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DSSRequest.Patient.Investigations.Questionnaires.Questionnaire }
                 * 
                 * 
                 */
                public List<DSSRequest.Patient.Investigations.Questionnaires.Questionnaire> getQuestionnaire() {
                    if (questionnaire == null) {
                        questionnaire = new ArrayList<DSSRequest.Patient.Investigations.Questionnaires.Questionnaire>();
                    }
                    return this.questionnaire;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;group ref="{}CodeGroup"/>
                 *         &lt;group ref="{}TimeStampsGroup"/>
                 *         &lt;element name="Questions" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Question" maxOccurs="unbounded">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="QuestionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="AnswerString" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="TotalPoints" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
                 *         &lt;element name="QuestionnaireName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "codeValue",
                    "codeSystem",
                    "codeSystemVersion",
                    "startStamp",
                    "endStamp",
                    "pointStamp",
                    "questions",
                    "totalPoints",
                    "questionnaireName"
                })
                public static class Questionnaire {

                    @XmlElement(name = "CodeValue", required = true)
                    protected String codeValue;
                    @XmlElement(name = "CodeSystem", required = true)
                    protected String codeSystem;
                    @XmlElement(name = "CodeSystemVersion")
                    protected String codeSystemVersion;
                    @XmlElement(name = "StartStamp")
                    protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp startStamp;
                    @XmlElement(name = "EndStamp")
                    protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp endStamp;
                    @XmlElement(name = "PointStamp")
                    protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp pointStamp;
                    @XmlElement(name = "Questions")
                    protected DSSRequest.Patient.Investigations.Questionnaires.Questionnaire.Questions questions;
                    @XmlElement(name = "TotalPoints")
                    protected Integer totalPoints;
                    @XmlElement(name = "QuestionnaireName")
                    protected String questionnaireName;

                    /**
                     * Gets the value of the codeValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeValue() {
                        return codeValue;
                    }

                    /**
                     * Sets the value of the codeValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeValue(String value) {
                        this.codeValue = value;
                    }

                    /**
                     * Gets the value of the codeSystem property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystem() {
                        return codeSystem;
                    }

                    /**
                     * Sets the value of the codeSystem property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystem(String value) {
                        this.codeSystem = value;
                    }

                    /**
                     * Gets the value of the codeSystemVersion property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystemVersion() {
                        return codeSystemVersion;
                    }

                    /**
                     * Sets the value of the codeSystemVersion property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystemVersion(String value) {
                        this.codeSystemVersion = value;
                    }

                    /**
                     * Gets the value of the startStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                     *     
                     */
                    public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp getStartStamp() {
                        return startStamp;
                    }

                    /**
                     * Sets the value of the startStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                     *     
                     */
                    public void setStartStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp value) {
                        this.startStamp = value;
                    }

                    /**
                     * Gets the value of the endStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                     *     
                     */
                    public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp getEndStamp() {
                        return endStamp;
                    }

                    /**
                     * Sets the value of the endStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                     *     
                     */
                    public void setEndStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp value) {
                        this.endStamp = value;
                    }

                    /**
                     * Gets the value of the pointStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                     *     
                     */
                    public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp getPointStamp() {
                        return pointStamp;
                    }

                    /**
                     * Sets the value of the pointStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                     *     
                     */
                    public void setPointStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp value) {
                        this.pointStamp = value;
                    }

                    /**
                     * Gets the value of the questions property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DSSRequest.Patient.Investigations.Questionnaires.Questionnaire.Questions }
                     *     
                     */
                    public DSSRequest.Patient.Investigations.Questionnaires.Questionnaire.Questions getQuestions() {
                        return questions;
                    }

                    /**
                     * Sets the value of the questions property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DSSRequest.Patient.Investigations.Questionnaires.Questionnaire.Questions }
                     *     
                     */
                    public void setQuestions(DSSRequest.Patient.Investigations.Questionnaires.Questionnaire.Questions value) {
                        this.questions = value;
                    }

                    /**
                     * Gets the value of the totalPoints property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getTotalPoints() {
                        return totalPoints;
                    }

                    /**
                     * Sets the value of the totalPoints property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setTotalPoints(Integer value) {
                        this.totalPoints = value;
                    }

                    /**
                     * Gets the value of the questionnaireName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getQuestionnaireName() {
                        return questionnaireName;
                    }

                    /**
                     * Sets the value of the questionnaireName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setQuestionnaireName(String value) {
                        this.questionnaireName = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="Question" maxOccurs="unbounded">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="QuestionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="AnswerString" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "question"
                    })
                    public static class Questions {

                        @XmlElement(name = "Question", required = true)
                        protected List<DSSRequest.Patient.Investigations.Questionnaires.Questionnaire.Questions.Question> question;

                        /**
                         * Gets the value of the question property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the question property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getQuestion().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link DSSRequest.Patient.Investigations.Questionnaires.Questionnaire.Questions.Question }
                         * 
                         * 
                         */
                        public List<DSSRequest.Patient.Investigations.Questionnaires.Questionnaire.Questions.Question> getQuestion() {
                            if (question == null) {
                                question = new ArrayList<DSSRequest.Patient.Investigations.Questionnaires.Questionnaire.Questions.Question>();
                            }
                            return this.question;
                        }


                        /**
                         * <p>Java class for anonymous complex type.
                         * 
                         * <p>The following schema fragment specifies the expected content contained within this class.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="QuestionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="AnswerString" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "questionID",
                            "answerString"
                        })
                        public static class Question {

                            @XmlElement(name = "QuestionID", required = true)
                            protected String questionID;
                            @XmlElement(name = "AnswerString", required = true)
                            protected String answerString;

                            /**
                             * Gets the value of the questionID property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getQuestionID() {
                                return questionID;
                            }

                            /**
                             * Sets the value of the questionID property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setQuestionID(String value) {
                                this.questionID = value;
                            }

                            /**
                             * Gets the value of the answerString property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getAnswerString() {
                                return answerString;
                            }

                            /**
                             * Sets the value of the answerString property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setAnswerString(String value) {
                                this.answerString = value;
                            }

                        }

                    }

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Diagnoses" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Diagnosis" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;group ref="{}CodeGroup"/>
         *                             &lt;group ref="{}TimeStampsGroup"/>
         *                             &lt;element name="DiagnosisStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                             &lt;element name="DiagnosisName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "diagnoses"
        })
        public static class Problems {

            @XmlElement(name = "Diagnoses")
            protected DSSRequest.Patient.Problems.Diagnoses diagnoses;

            /**
             * Gets the value of the diagnoses property.
             * 
             * @return
             *     possible object is
             *     {@link DSSRequest.Patient.Problems.Diagnoses }
             *     
             */
            public DSSRequest.Patient.Problems.Diagnoses getDiagnoses() {
                return diagnoses;
            }

            /**
             * Sets the value of the diagnoses property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSRequest.Patient.Problems.Diagnoses }
             *     
             */
            public void setDiagnoses(DSSRequest.Patient.Problems.Diagnoses value) {
                this.diagnoses = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Diagnosis" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;group ref="{}CodeGroup"/>
             *                   &lt;group ref="{}TimeStampsGroup"/>
             *                   &lt;element name="DiagnosisStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *                   &lt;element name="DiagnosisName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "diagnosis"
            })
            public static class Diagnoses {

                @XmlElement(name = "Diagnosis", required = true)
                protected List<DSSRequest.Patient.Problems.Diagnoses.Diagnosis> diagnosis;

                /**
                 * Gets the value of the diagnosis property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the diagnosis property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDiagnosis().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DSSRequest.Patient.Problems.Diagnoses.Diagnosis }
                 * 
                 * 
                 */
                public List<DSSRequest.Patient.Problems.Diagnoses.Diagnosis> getDiagnosis() {
                    if (diagnosis == null) {
                        diagnosis = new ArrayList<DSSRequest.Patient.Problems.Diagnoses.Diagnosis>();
                    }
                    return this.diagnosis;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;group ref="{}CodeGroup"/>
                 *         &lt;group ref="{}TimeStampsGroup"/>
                 *         &lt;element name="DiagnosisStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
                 *         &lt;element name="DiagnosisName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "codeValue",
                    "codeSystem",
                    "codeSystemVersion",
                    "startStamp",
                    "endStamp",
                    "pointStamp",
                    "diagnosisStatus",
                    "diagnosisName"
                })
                public static class Diagnosis {

                    @XmlElement(name = "CodeValue", required = true)
                    protected String codeValue;
                    @XmlElement(name = "CodeSystem", required = true)
                    protected String codeSystem;
                    @XmlElement(name = "CodeSystemVersion")
                    protected String codeSystemVersion;
                    @XmlElement(name = "StartStamp")
                    protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp startStamp;
                    @XmlElement(name = "EndStamp")
                    protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp endStamp;
                    @XmlElement(name = "PointStamp")
                    protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp pointStamp;
                    @XmlElement(name = "DiagnosisStatus")
                    protected Integer diagnosisStatus;
                    @XmlElement(name = "DiagnosisName")
                    protected String diagnosisName;

                    /**
                     * Gets the value of the codeValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeValue() {
                        return codeValue;
                    }

                    /**
                     * Sets the value of the codeValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeValue(String value) {
                        this.codeValue = value;
                    }

                    /**
                     * Gets the value of the codeSystem property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystem() {
                        return codeSystem;
                    }

                    /**
                     * Sets the value of the codeSystem property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystem(String value) {
                        this.codeSystem = value;
                    }

                    /**
                     * Gets the value of the codeSystemVersion property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystemVersion() {
                        return codeSystemVersion;
                    }

                    /**
                     * Sets the value of the codeSystemVersion property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystemVersion(String value) {
                        this.codeSystemVersion = value;
                    }

                    /**
                     * Gets the value of the startStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                     *     
                     */
                    public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp getStartStamp() {
                        return startStamp;
                    }

                    /**
                     * Sets the value of the startStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                     *     
                     */
                    public void setStartStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp value) {
                        this.startStamp = value;
                    }

                    /**
                     * Gets the value of the endStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                     *     
                     */
                    public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp getEndStamp() {
                        return endStamp;
                    }

                    /**
                     * Sets the value of the endStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                     *     
                     */
                    public void setEndStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp value) {
                        this.endStamp = value;
                    }

                    /**
                     * Gets the value of the pointStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                     *     
                     */
                    public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp getPointStamp() {
                        return pointStamp;
                    }

                    /**
                     * Sets the value of the pointStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                     *     
                     */
                    public void setPointStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp value) {
                        this.pointStamp = value;
                    }

                    /**
                     * Gets the value of the diagnosisStatus property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getDiagnosisStatus() {
                        return diagnosisStatus;
                    }

                    /**
                     * Sets the value of the diagnosisStatus property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setDiagnosisStatus(Integer value) {
                        this.diagnosisStatus = value;
                    }

                    /**
                     * Gets the value of the diagnosisName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDiagnosisName() {
                        return diagnosisName;
                    }

                    /**
                     * Sets the value of the diagnosisName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDiagnosisName(String value) {
                        this.diagnosisName = value;
                    }

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="PatientID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BirthTimeStamp">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="Month" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *                         &lt;maxInclusive value="12"/>
         *                         &lt;minInclusive value="00"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="Day" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *                         &lt;maxInclusive value="31"/>
         *                         &lt;minInclusive value="00"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="Hour" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *                         &lt;totalDigits value="2"/>
         *                         &lt;maxInclusive value="23"/>
         *                         &lt;minInclusive value="00"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="Minute" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *                         &lt;totalDigits value="2"/>
         *                         &lt;maxInclusive value="59"/>
         *                         &lt;minInclusive value="00"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Gender">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="M"/>
         *               &lt;enumeration value="F"/>
         *               &lt;enumeration value="U"/>
         *               &lt;enumeration value="N"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="9"/>
         *               &lt;enumeration value="0"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Ethnicity" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;group ref="{}CodeGroup"/>
         *                   &lt;element name="EthnicityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Professions" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Profession" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;group ref="{}CodeGroup"/>
         *                             &lt;group ref="{}TimeStampsGroup"/>
         *                             &lt;element name="ProfessionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "patientID",
            "birthTimeStamp",
            "gender",
            "ethnicity",
            "professions"
        })
        public static class Properties {

            @XmlElement(name = "PatientID")
            protected String patientID;
            @XmlElement(name = "BirthTimeStamp", required = true)
            protected DSSRequest.Patient.Properties.BirthTimeStamp birthTimeStamp;
            @XmlElement(name = "Gender", required = true)
            protected String gender;
            @XmlElement(name = "Ethnicity")
            protected DSSRequest.Patient.Properties.Ethnicity ethnicity;
            @XmlElement(name = "Professions")
            protected DSSRequest.Patient.Properties.Professions professions;

            /**
             * Gets the value of the patientID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPatientID() {
                return patientID;
            }

            /**
             * Sets the value of the patientID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPatientID(String value) {
                this.patientID = value;
            }

            /**
             * Gets the value of the birthTimeStamp property.
             * 
             * @return
             *     possible object is
             *     {@link DSSRequest.Patient.Properties.BirthTimeStamp }
             *     
             */
            public DSSRequest.Patient.Properties.BirthTimeStamp getBirthTimeStamp() {
                return birthTimeStamp;
            }

            /**
             * Sets the value of the birthTimeStamp property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSRequest.Patient.Properties.BirthTimeStamp }
             *     
             */
            public void setBirthTimeStamp(DSSRequest.Patient.Properties.BirthTimeStamp value) {
                this.birthTimeStamp = value;
            }

            /**
             * Gets the value of the gender property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGender() {
                return gender;
            }

            /**
             * Sets the value of the gender property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGender(String value) {
                this.gender = value;
            }

            /**
             * Gets the value of the ethnicity property.
             * 
             * @return
             *     possible object is
             *     {@link DSSRequest.Patient.Properties.Ethnicity }
             *     
             */
            public DSSRequest.Patient.Properties.Ethnicity getEthnicity() {
                return ethnicity;
            }

            /**
             * Sets the value of the ethnicity property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSRequest.Patient.Properties.Ethnicity }
             *     
             */
            public void setEthnicity(DSSRequest.Patient.Properties.Ethnicity value) {
                this.ethnicity = value;
            }

            /**
             * Gets the value of the professions property.
             * 
             * @return
             *     possible object is
             *     {@link DSSRequest.Patient.Properties.Professions }
             *     
             */
            public DSSRequest.Patient.Properties.Professions getProfessions() {
                return professions;
            }

            /**
             * Sets the value of the professions property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSRequest.Patient.Properties.Professions }
             *     
             */
            public void setProfessions(DSSRequest.Patient.Properties.Professions value) {
                this.professions = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="Month" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
             *               &lt;maxInclusive value="12"/>
             *               &lt;minInclusive value="00"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="Day" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
             *               &lt;maxInclusive value="31"/>
             *               &lt;minInclusive value="00"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="Hour" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
             *               &lt;totalDigits value="2"/>
             *               &lt;maxInclusive value="23"/>
             *               &lt;minInclusive value="00"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="Minute" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
             *               &lt;totalDigits value="2"/>
             *               &lt;maxInclusive value="59"/>
             *               &lt;minInclusive value="00"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "year",
                "month",
                "day",
                "hour",
                "minute"
            })
            public static class BirthTimeStamp {

                @XmlElement(name = "Year")
                protected int year;
                @XmlElement(name = "Month")
                protected Integer month;
                @XmlElement(name = "Day")
                protected Integer day;
                @XmlElement(name = "Hour")
                protected Integer hour;
                @XmlElement(name = "Minute")
                protected Integer minute;

                /**
                 * Gets the value of the year property.
                 * 
                 */
                public int getYear() {
                    return year;
                }

                /**
                 * Sets the value of the year property.
                 * 
                 */
                public void setYear(int value) {
                    this.year = value;
                }

                /**
                 * Gets the value of the month property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getMonth() {
                    return month;
                }

                /**
                 * Sets the value of the month property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setMonth(Integer value) {
                    this.month = value;
                }

                /**
                 * Gets the value of the day property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getDay() {
                    return day;
                }

                /**
                 * Sets the value of the day property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setDay(Integer value) {
                    this.day = value;
                }

                /**
                 * Gets the value of the hour property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getHour() {
                    return hour;
                }

                /**
                 * Sets the value of the hour property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setHour(Integer value) {
                    this.hour = value;
                }

                /**
                 * Gets the value of the minute property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getMinute() {
                    return minute;
                }

                /**
                 * Sets the value of the minute property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setMinute(Integer value) {
                    this.minute = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;group ref="{}CodeGroup"/>
             *         &lt;element name="EthnicityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "codeValue",
                "codeSystem",
                "codeSystemVersion",
                "ethnicityName"
            })
            public static class Ethnicity {

                @XmlElement(name = "CodeValue", required = true)
                protected String codeValue;
                @XmlElement(name = "CodeSystem", required = true)
                protected String codeSystem;
                @XmlElement(name = "CodeSystemVersion")
                protected String codeSystemVersion;
                @XmlElement(name = "EthnicityName")
                protected String ethnicityName;

                /**
                 * Gets the value of the codeValue property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeValue() {
                    return codeValue;
                }

                /**
                 * Sets the value of the codeValue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeValue(String value) {
                    this.codeValue = value;
                }

                /**
                 * Gets the value of the codeSystem property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeSystem() {
                    return codeSystem;
                }

                /**
                 * Sets the value of the codeSystem property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeSystem(String value) {
                    this.codeSystem = value;
                }

                /**
                 * Gets the value of the codeSystemVersion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeSystemVersion() {
                    return codeSystemVersion;
                }

                /**
                 * Sets the value of the codeSystemVersion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeSystemVersion(String value) {
                    this.codeSystemVersion = value;
                }

                /**
                 * Gets the value of the ethnicityName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEthnicityName() {
                    return ethnicityName;
                }

                /**
                 * Sets the value of the ethnicityName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEthnicityName(String value) {
                    this.ethnicityName = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Profession" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;group ref="{}CodeGroup"/>
             *                   &lt;group ref="{}TimeStampsGroup"/>
             *                   &lt;element name="ProfessionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "profession"
            })
            public static class Professions {

                @XmlElement(name = "Profession", required = true)
                protected List<DSSRequest.Patient.Properties.Professions.Profession> profession;

                /**
                 * Gets the value of the profession property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the profession property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getProfession().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DSSRequest.Patient.Properties.Professions.Profession }
                 * 
                 * 
                 */
                public List<DSSRequest.Patient.Properties.Professions.Profession> getProfession() {
                    if (profession == null) {
                        profession = new ArrayList<DSSRequest.Patient.Properties.Professions.Profession>();
                    }
                    return this.profession;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;group ref="{}CodeGroup"/>
                 *         &lt;group ref="{}TimeStampsGroup"/>
                 *         &lt;element name="ProfessionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "codeValue",
                    "codeSystem",
                    "codeSystemVersion",
                    "startStamp",
                    "endStamp",
                    "pointStamp",
                    "professionName"
                })
                public static class Profession {

                    @XmlElement(name = "CodeValue", required = true)
                    protected String codeValue;
                    @XmlElement(name = "CodeSystem", required = true)
                    protected String codeSystem;
                    @XmlElement(name = "CodeSystemVersion")
                    protected String codeSystemVersion;
                    @XmlElement(name = "StartStamp")
                    protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp startStamp;
                    @XmlElement(name = "EndStamp")
                    protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp endStamp;
                    @XmlElement(name = "PointStamp")
                    protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp pointStamp;
                    @XmlElement(name = "ProfessionName")
                    protected String professionName;

                    /**
                     * Gets the value of the codeValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeValue() {
                        return codeValue;
                    }

                    /**
                     * Sets the value of the codeValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeValue(String value) {
                        this.codeValue = value;
                    }

                    /**
                     * Gets the value of the codeSystem property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystem() {
                        return codeSystem;
                    }

                    /**
                     * Sets the value of the codeSystem property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystem(String value) {
                        this.codeSystem = value;
                    }

                    /**
                     * Gets the value of the codeSystemVersion property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystemVersion() {
                        return codeSystemVersion;
                    }

                    /**
                     * Sets the value of the codeSystemVersion property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystemVersion(String value) {
                        this.codeSystemVersion = value;
                    }

                    /**
                     * Gets the value of the startStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                     *     
                     */
                    public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp getStartStamp() {
                        return startStamp;
                    }

                    /**
                     * Sets the value of the startStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                     *     
                     */
                    public void setStartStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp value) {
                        this.startStamp = value;
                    }

                    /**
                     * Gets the value of the endStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                     *     
                     */
                    public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp getEndStamp() {
                        return endStamp;
                    }

                    /**
                     * Sets the value of the endStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                     *     
                     */
                    public void setEndStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp value) {
                        this.endStamp = value;
                    }

                    /**
                     * Gets the value of the pointStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                     *     
                     */
                    public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp getPointStamp() {
                        return pointStamp;
                    }

                    /**
                     * Sets the value of the pointStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                     *     
                     */
                    public void setPointStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp value) {
                        this.pointStamp = value;
                    }

                    /**
                     * Gets the value of the professionName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getProfessionName() {
                        return professionName;
                    }

                    /**
                     * Sets the value of the professionName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setProfessionName(String value) {
                        this.professionName = value;
                    }

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="DrugsToAvoid" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="DrugToAvoid" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;group ref="{}CodeGroup"/>
         *                             &lt;element name="ReasonsForAvoiding" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="ReasonForAvoiding" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;group ref="{}CodeGroup"/>
         *                                                 &lt;group ref="{}TimeStampsGroup"/>
         *                                                 &lt;element name="RiskLevel" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;group ref="{}CodeGroup"/>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Smoking" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="SmokingStatus" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;group ref="{}CodeGroup"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="DailyCigaretteConsumption" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                   &lt;element name="SmokingPackYears" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="AlcoholConsumption" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="WeeklyDrinkEquivalents" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Pregnancy" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Pregnant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   &lt;element name="ExpectedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Lactation" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Lactating" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="FamilialDiseases" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="FamilialDisease" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;group ref="{}CodeGroup"/>
         *                             &lt;element name="DegreeOfKinship" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                             &lt;element name="FamilialDiseaseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="NonDrugHypersensitivities" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="NonDrugHypersensitivity" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;group ref="{}CodeGroup"/>
         *                             &lt;element name="HypersensitivityReaction" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;group ref="{}CodeGroup"/>
         *                                       &lt;group ref="{}TimeStampsGroup"/>
         *                                       &lt;element name="RiskLevel" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;group ref="{}CodeGroup"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="HypersensitivityReactionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="AllergenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "drugsToAvoid",
            "smoking",
            "alcoholConsumption",
            "pregnancy",
            "lactation",
            "familialDiseases",
            "nonDrugHypersensitivities"
        })
        public static class Risks {

            @XmlElement(name = "DrugsToAvoid")
            protected DSSRequest.Patient.Risks.DrugsToAvoid drugsToAvoid;
            @XmlElement(name = "Smoking")
            protected DSSRequest.Patient.Risks.Smoking smoking;
            @XmlElement(name = "AlcoholConsumption")
            protected DSSRequest.Patient.Risks.AlcoholConsumption alcoholConsumption;
            @XmlElement(name = "Pregnancy")
            protected DSSRequest.Patient.Risks.Pregnancy pregnancy;
            @XmlElement(name = "Lactation")
            protected DSSRequest.Patient.Risks.Lactation lactation;
            @XmlElement(name = "FamilialDiseases")
            protected DSSRequest.Patient.Risks.FamilialDiseases familialDiseases;
            @XmlElement(name = "NonDrugHypersensitivities")
            protected DSSRequest.Patient.Risks.NonDrugHypersensitivities nonDrugHypersensitivities;

            /**
             * Gets the value of the drugsToAvoid property.
             * 
             * @return
             *     possible object is
             *     {@link DSSRequest.Patient.Risks.DrugsToAvoid }
             *     
             */
            public DSSRequest.Patient.Risks.DrugsToAvoid getDrugsToAvoid() {
                return drugsToAvoid;
            }

            /**
             * Sets the value of the drugsToAvoid property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSRequest.Patient.Risks.DrugsToAvoid }
             *     
             */
            public void setDrugsToAvoid(DSSRequest.Patient.Risks.DrugsToAvoid value) {
                this.drugsToAvoid = value;
            }

            /**
             * Gets the value of the smoking property.
             * 
             * @return
             *     possible object is
             *     {@link DSSRequest.Patient.Risks.Smoking }
             *     
             */
            public DSSRequest.Patient.Risks.Smoking getSmoking() {
                return smoking;
            }

            /**
             * Sets the value of the smoking property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSRequest.Patient.Risks.Smoking }
             *     
             */
            public void setSmoking(DSSRequest.Patient.Risks.Smoking value) {
                this.smoking = value;
            }

            /**
             * Gets the value of the alcoholConsumption property.
             * 
             * @return
             *     possible object is
             *     {@link DSSRequest.Patient.Risks.AlcoholConsumption }
             *     
             */
            public DSSRequest.Patient.Risks.AlcoholConsumption getAlcoholConsumption() {
                return alcoholConsumption;
            }

            /**
             * Sets the value of the alcoholConsumption property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSRequest.Patient.Risks.AlcoholConsumption }
             *     
             */
            public void setAlcoholConsumption(DSSRequest.Patient.Risks.AlcoholConsumption value) {
                this.alcoholConsumption = value;
            }

            /**
             * Gets the value of the pregnancy property.
             * 
             * @return
             *     possible object is
             *     {@link DSSRequest.Patient.Risks.Pregnancy }
             *     
             */
            public DSSRequest.Patient.Risks.Pregnancy getPregnancy() {
                return pregnancy;
            }

            /**
             * Sets the value of the pregnancy property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSRequest.Patient.Risks.Pregnancy }
             *     
             */
            public void setPregnancy(DSSRequest.Patient.Risks.Pregnancy value) {
                this.pregnancy = value;
            }

            /**
             * Gets the value of the lactation property.
             * 
             * @return
             *     possible object is
             *     {@link DSSRequest.Patient.Risks.Lactation }
             *     
             */
            public DSSRequest.Patient.Risks.Lactation getLactation() {
                return lactation;
            }

            /**
             * Sets the value of the lactation property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSRequest.Patient.Risks.Lactation }
             *     
             */
            public void setLactation(DSSRequest.Patient.Risks.Lactation value) {
                this.lactation = value;
            }

            /**
             * Gets the value of the familialDiseases property.
             * 
             * @return
             *     possible object is
             *     {@link DSSRequest.Patient.Risks.FamilialDiseases }
             *     
             */
            public DSSRequest.Patient.Risks.FamilialDiseases getFamilialDiseases() {
                return familialDiseases;
            }

            /**
             * Sets the value of the familialDiseases property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSRequest.Patient.Risks.FamilialDiseases }
             *     
             */
            public void setFamilialDiseases(DSSRequest.Patient.Risks.FamilialDiseases value) {
                this.familialDiseases = value;
            }

            /**
             * Gets the value of the nonDrugHypersensitivities property.
             * 
             * @return
             *     possible object is
             *     {@link DSSRequest.Patient.Risks.NonDrugHypersensitivities }
             *     
             */
            public DSSRequest.Patient.Risks.NonDrugHypersensitivities getNonDrugHypersensitivities() {
                return nonDrugHypersensitivities;
            }

            /**
             * Sets the value of the nonDrugHypersensitivities property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSRequest.Patient.Risks.NonDrugHypersensitivities }
             *     
             */
            public void setNonDrugHypersensitivities(DSSRequest.Patient.Risks.NonDrugHypersensitivities value) {
                this.nonDrugHypersensitivities = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="WeeklyDrinkEquivalents" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "weeklyDrinkEquivalents"
            })
            public static class AlcoholConsumption {

                @XmlElement(name = "WeeklyDrinkEquivalents")
                protected Integer weeklyDrinkEquivalents;

                /**
                 * Gets the value of the weeklyDrinkEquivalents property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getWeeklyDrinkEquivalents() {
                    return weeklyDrinkEquivalents;
                }

                /**
                 * Sets the value of the weeklyDrinkEquivalents property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setWeeklyDrinkEquivalents(Integer value) {
                    this.weeklyDrinkEquivalents = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="DrugToAvoid" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;group ref="{}CodeGroup"/>
             *                   &lt;element name="ReasonsForAvoiding" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="ReasonForAvoiding" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;group ref="{}CodeGroup"/>
             *                                       &lt;group ref="{}TimeStampsGroup"/>
             *                                       &lt;element name="RiskLevel" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;group ref="{}CodeGroup"/>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "drugToAvoid"
            })
            public static class DrugsToAvoid {

                @XmlElement(name = "DrugToAvoid", required = true)
                protected List<DSSRequest.Patient.Risks.DrugsToAvoid.DrugToAvoid> drugToAvoid;

                /**
                 * Gets the value of the drugToAvoid property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the drugToAvoid property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDrugToAvoid().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DSSRequest.Patient.Risks.DrugsToAvoid.DrugToAvoid }
                 * 
                 * 
                 */
                public List<DSSRequest.Patient.Risks.DrugsToAvoid.DrugToAvoid> getDrugToAvoid() {
                    if (drugToAvoid == null) {
                        drugToAvoid = new ArrayList<DSSRequest.Patient.Risks.DrugsToAvoid.DrugToAvoid>();
                    }
                    return this.drugToAvoid;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;group ref="{}CodeGroup"/>
                 *         &lt;element name="ReasonsForAvoiding" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="ReasonForAvoiding" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;group ref="{}CodeGroup"/>
                 *                             &lt;group ref="{}TimeStampsGroup"/>
                 *                             &lt;element name="RiskLevel" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;group ref="{}CodeGroup"/>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "codeValue",
                    "codeSystem",
                    "codeSystemVersion",
                    "reasonsForAvoiding",
                    "drugName"
                })
                public static class DrugToAvoid {

                    @XmlElement(name = "CodeValue", required = true)
                    protected String codeValue;
                    @XmlElement(name = "CodeSystem", required = true)
                    protected String codeSystem;
                    @XmlElement(name = "CodeSystemVersion")
                    protected String codeSystemVersion;
                    @XmlElement(name = "ReasonsForAvoiding")
                    protected DSSRequest.Patient.Risks.DrugsToAvoid.DrugToAvoid.ReasonsForAvoiding reasonsForAvoiding;
                    @XmlElement(name = "DrugName")
                    protected String drugName;

                    /**
                     * Gets the value of the codeValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeValue() {
                        return codeValue;
                    }

                    /**
                     * Sets the value of the codeValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeValue(String value) {
                        this.codeValue = value;
                    }

                    /**
                     * Gets the value of the codeSystem property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystem() {
                        return codeSystem;
                    }

                    /**
                     * Sets the value of the codeSystem property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystem(String value) {
                        this.codeSystem = value;
                    }

                    /**
                     * Gets the value of the codeSystemVersion property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystemVersion() {
                        return codeSystemVersion;
                    }

                    /**
                     * Sets the value of the codeSystemVersion property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystemVersion(String value) {
                        this.codeSystemVersion = value;
                    }

                    /**
                     * Gets the value of the reasonsForAvoiding property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DSSRequest.Patient.Risks.DrugsToAvoid.DrugToAvoid.ReasonsForAvoiding }
                     *     
                     */
                    public DSSRequest.Patient.Risks.DrugsToAvoid.DrugToAvoid.ReasonsForAvoiding getReasonsForAvoiding() {
                        return reasonsForAvoiding;
                    }

                    /**
                     * Sets the value of the reasonsForAvoiding property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DSSRequest.Patient.Risks.DrugsToAvoid.DrugToAvoid.ReasonsForAvoiding }
                     *     
                     */
                    public void setReasonsForAvoiding(DSSRequest.Patient.Risks.DrugsToAvoid.DrugToAvoid.ReasonsForAvoiding value) {
                        this.reasonsForAvoiding = value;
                    }

                    /**
                     * Gets the value of the drugName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDrugName() {
                        return drugName;
                    }

                    /**
                     * Sets the value of the drugName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDrugName(String value) {
                        this.drugName = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="ReasonForAvoiding" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;group ref="{}CodeGroup"/>
                     *                   &lt;group ref="{}TimeStampsGroup"/>
                     *                   &lt;element name="RiskLevel" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;group ref="{}CodeGroup"/>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "reasonForAvoiding"
                    })
                    public static class ReasonsForAvoiding {

                        @XmlElement(name = "ReasonForAvoiding")
                        protected List<DSSRequest.Patient.Risks.DrugsToAvoid.DrugToAvoid.ReasonsForAvoiding.ReasonForAvoiding> reasonForAvoiding;

                        /**
                         * Gets the value of the reasonForAvoiding property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the reasonForAvoiding property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getReasonForAvoiding().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link DSSRequest.Patient.Risks.DrugsToAvoid.DrugToAvoid.ReasonsForAvoiding.ReasonForAvoiding }
                         * 
                         * 
                         */
                        public List<DSSRequest.Patient.Risks.DrugsToAvoid.DrugToAvoid.ReasonsForAvoiding.ReasonForAvoiding> getReasonForAvoiding() {
                            if (reasonForAvoiding == null) {
                                reasonForAvoiding = new ArrayList<DSSRequest.Patient.Risks.DrugsToAvoid.DrugToAvoid.ReasonsForAvoiding.ReasonForAvoiding>();
                            }
                            return this.reasonForAvoiding;
                        }


                        /**
                         * <p>Java class for anonymous complex type.
                         * 
                         * <p>The following schema fragment specifies the expected content contained within this class.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;group ref="{}CodeGroup"/>
                         *         &lt;group ref="{}TimeStampsGroup"/>
                         *         &lt;element name="RiskLevel" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;group ref="{}CodeGroup"/>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "codeValue",
                            "codeSystem",
                            "codeSystemVersion",
                            "startStamp",
                            "endStamp",
                            "pointStamp",
                            "riskLevel"
                        })
                        public static class ReasonForAvoiding {

                            @XmlElement(name = "CodeValue", required = true)
                            protected String codeValue;
                            @XmlElement(name = "CodeSystem", required = true)
                            protected String codeSystem;
                            @XmlElement(name = "CodeSystemVersion")
                            protected String codeSystemVersion;
                            @XmlElement(name = "StartStamp")
                            protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp startStamp;
                            @XmlElement(name = "EndStamp")
                            protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp endStamp;
                            @XmlElement(name = "PointStamp")
                            protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp pointStamp;
                            @XmlElement(name = "RiskLevel")
                            protected DSSRequest.Patient.Risks.DrugsToAvoid.DrugToAvoid.ReasonsForAvoiding.ReasonForAvoiding.RiskLevel riskLevel;

                            /**
                             * Gets the value of the codeValue property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCodeValue() {
                                return codeValue;
                            }

                            /**
                             * Sets the value of the codeValue property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCodeValue(String value) {
                                this.codeValue = value;
                            }

                            /**
                             * Gets the value of the codeSystem property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCodeSystem() {
                                return codeSystem;
                            }

                            /**
                             * Sets the value of the codeSystem property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCodeSystem(String value) {
                                this.codeSystem = value;
                            }

                            /**
                             * Gets the value of the codeSystemVersion property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCodeSystemVersion() {
                                return codeSystemVersion;
                            }

                            /**
                             * Sets the value of the codeSystemVersion property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCodeSystemVersion(String value) {
                                this.codeSystemVersion = value;
                            }

                            /**
                             * Gets the value of the startStamp property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                             *     
                             */
                            public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp getStartStamp() {
                                return startStamp;
                            }

                            /**
                             * Sets the value of the startStamp property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                             *     
                             */
                            public void setStartStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp value) {
                                this.startStamp = value;
                            }

                            /**
                             * Gets the value of the endStamp property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                             *     
                             */
                            public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp getEndStamp() {
                                return endStamp;
                            }

                            /**
                             * Sets the value of the endStamp property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                             *     
                             */
                            public void setEndStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp value) {
                                this.endStamp = value;
                            }

                            /**
                             * Gets the value of the pointStamp property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                             *     
                             */
                            public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp getPointStamp() {
                                return pointStamp;
                            }

                            /**
                             * Sets the value of the pointStamp property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                             *     
                             */
                            public void setPointStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp value) {
                                this.pointStamp = value;
                            }

                            /**
                             * Gets the value of the riskLevel property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link DSSRequest.Patient.Risks.DrugsToAvoid.DrugToAvoid.ReasonsForAvoiding.ReasonForAvoiding.RiskLevel }
                             *     
                             */
                            public DSSRequest.Patient.Risks.DrugsToAvoid.DrugToAvoid.ReasonsForAvoiding.ReasonForAvoiding.RiskLevel getRiskLevel() {
                                return riskLevel;
                            }

                            /**
                             * Sets the value of the riskLevel property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link DSSRequest.Patient.Risks.DrugsToAvoid.DrugToAvoid.ReasonsForAvoiding.ReasonForAvoiding.RiskLevel }
                             *     
                             */
                            public void setRiskLevel(DSSRequest.Patient.Risks.DrugsToAvoid.DrugToAvoid.ReasonsForAvoiding.ReasonForAvoiding.RiskLevel value) {
                                this.riskLevel = value;
                            }


                            /**
                             * <p>Java class for anonymous complex type.
                             * 
                             * <p>The following schema fragment specifies the expected content contained within this class.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;group ref="{}CodeGroup"/>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "codeValue",
                                "codeSystem",
                                "codeSystemVersion"
                            })
                            public static class RiskLevel {

                                @XmlElement(name = "CodeValue", required = true)
                                protected String codeValue;
                                @XmlElement(name = "CodeSystem", required = true)
                                protected String codeSystem;
                                @XmlElement(name = "CodeSystemVersion")
                                protected String codeSystemVersion;

                                /**
                                 * Gets the value of the codeValue property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCodeValue() {
                                    return codeValue;
                                }

                                /**
                                 * Sets the value of the codeValue property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCodeValue(String value) {
                                    this.codeValue = value;
                                }

                                /**
                                 * Gets the value of the codeSystem property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCodeSystem() {
                                    return codeSystem;
                                }

                                /**
                                 * Sets the value of the codeSystem property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCodeSystem(String value) {
                                    this.codeSystem = value;
                                }

                                /**
                                 * Gets the value of the codeSystemVersion property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCodeSystemVersion() {
                                    return codeSystemVersion;
                                }

                                /**
                                 * Sets the value of the codeSystemVersion property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCodeSystemVersion(String value) {
                                    this.codeSystemVersion = value;
                                }

                            }

                        }

                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="FamilialDisease" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;group ref="{}CodeGroup"/>
             *                   &lt;element name="DegreeOfKinship" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *                   &lt;element name="FamilialDiseaseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "familialDisease"
            })
            public static class FamilialDiseases {

                @XmlElement(name = "FamilialDisease", required = true)
                protected List<DSSRequest.Patient.Risks.FamilialDiseases.FamilialDisease> familialDisease;

                /**
                 * Gets the value of the familialDisease property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the familialDisease property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFamilialDisease().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DSSRequest.Patient.Risks.FamilialDiseases.FamilialDisease }
                 * 
                 * 
                 */
                public List<DSSRequest.Patient.Risks.FamilialDiseases.FamilialDisease> getFamilialDisease() {
                    if (familialDisease == null) {
                        familialDisease = new ArrayList<DSSRequest.Patient.Risks.FamilialDiseases.FamilialDisease>();
                    }
                    return this.familialDisease;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;group ref="{}CodeGroup"/>
                 *         &lt;element name="DegreeOfKinship" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
                 *         &lt;element name="FamilialDiseaseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "codeValue",
                    "codeSystem",
                    "codeSystemVersion",
                    "degreeOfKinship",
                    "familialDiseaseName"
                })
                public static class FamilialDisease {

                    @XmlElement(name = "CodeValue", required = true)
                    protected String codeValue;
                    @XmlElement(name = "CodeSystem", required = true)
                    protected String codeSystem;
                    @XmlElement(name = "CodeSystemVersion")
                    protected String codeSystemVersion;
                    @XmlElement(name = "DegreeOfKinship")
                    protected Integer degreeOfKinship;
                    @XmlElement(name = "FamilialDiseaseName")
                    protected String familialDiseaseName;

                    /**
                     * Gets the value of the codeValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeValue() {
                        return codeValue;
                    }

                    /**
                     * Sets the value of the codeValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeValue(String value) {
                        this.codeValue = value;
                    }

                    /**
                     * Gets the value of the codeSystem property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystem() {
                        return codeSystem;
                    }

                    /**
                     * Sets the value of the codeSystem property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystem(String value) {
                        this.codeSystem = value;
                    }

                    /**
                     * Gets the value of the codeSystemVersion property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystemVersion() {
                        return codeSystemVersion;
                    }

                    /**
                     * Sets the value of the codeSystemVersion property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystemVersion(String value) {
                        this.codeSystemVersion = value;
                    }

                    /**
                     * Gets the value of the degreeOfKinship property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getDegreeOfKinship() {
                        return degreeOfKinship;
                    }

                    /**
                     * Sets the value of the degreeOfKinship property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setDegreeOfKinship(Integer value) {
                        this.degreeOfKinship = value;
                    }

                    /**
                     * Gets the value of the familialDiseaseName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFamilialDiseaseName() {
                        return familialDiseaseName;
                    }

                    /**
                     * Sets the value of the familialDiseaseName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFamilialDiseaseName(String value) {
                        this.familialDiseaseName = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Lactating" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "lactating"
            })
            public static class Lactation {

                @XmlElement(name = "Lactating")
                protected Boolean lactating;

                /**
                 * Gets the value of the lactating property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isLactating() {
                    return lactating;
                }

                /**
                 * Sets the value of the lactating property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setLactating(Boolean value) {
                    this.lactating = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="NonDrugHypersensitivity" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;group ref="{}CodeGroup"/>
             *                   &lt;element name="HypersensitivityReaction" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;group ref="{}CodeGroup"/>
             *                             &lt;group ref="{}TimeStampsGroup"/>
             *                             &lt;element name="RiskLevel" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;group ref="{}CodeGroup"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="HypersensitivityReactionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="AllergenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "nonDrugHypersensitivity"
            })
            public static class NonDrugHypersensitivities {

                @XmlElement(name = "NonDrugHypersensitivity", required = true)
                protected List<DSSRequest.Patient.Risks.NonDrugHypersensitivities.NonDrugHypersensitivity> nonDrugHypersensitivity;

                /**
                 * Gets the value of the nonDrugHypersensitivity property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the nonDrugHypersensitivity property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getNonDrugHypersensitivity().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DSSRequest.Patient.Risks.NonDrugHypersensitivities.NonDrugHypersensitivity }
                 * 
                 * 
                 */
                public List<DSSRequest.Patient.Risks.NonDrugHypersensitivities.NonDrugHypersensitivity> getNonDrugHypersensitivity() {
                    if (nonDrugHypersensitivity == null) {
                        nonDrugHypersensitivity = new ArrayList<DSSRequest.Patient.Risks.NonDrugHypersensitivities.NonDrugHypersensitivity>();
                    }
                    return this.nonDrugHypersensitivity;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;group ref="{}CodeGroup"/>
                 *         &lt;element name="HypersensitivityReaction" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;group ref="{}CodeGroup"/>
                 *                   &lt;group ref="{}TimeStampsGroup"/>
                 *                   &lt;element name="RiskLevel" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;group ref="{}CodeGroup"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="HypersensitivityReactionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="AllergenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "codeValue",
                    "codeSystem",
                    "codeSystemVersion",
                    "hypersensitivityReaction",
                    "allergenName"
                })
                public static class NonDrugHypersensitivity {

                    @XmlElement(name = "CodeValue", required = true)
                    protected String codeValue;
                    @XmlElement(name = "CodeSystem", required = true)
                    protected String codeSystem;
                    @XmlElement(name = "CodeSystemVersion")
                    protected String codeSystemVersion;
                    @XmlElement(name = "HypersensitivityReaction")
                    protected DSSRequest.Patient.Risks.NonDrugHypersensitivities.NonDrugHypersensitivity.HypersensitivityReaction hypersensitivityReaction;
                    @XmlElement(name = "AllergenName")
                    protected String allergenName;

                    /**
                     * Gets the value of the codeValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeValue() {
                        return codeValue;
                    }

                    /**
                     * Sets the value of the codeValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeValue(String value) {
                        this.codeValue = value;
                    }

                    /**
                     * Gets the value of the codeSystem property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystem() {
                        return codeSystem;
                    }

                    /**
                     * Sets the value of the codeSystem property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystem(String value) {
                        this.codeSystem = value;
                    }

                    /**
                     * Gets the value of the codeSystemVersion property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeSystemVersion() {
                        return codeSystemVersion;
                    }

                    /**
                     * Sets the value of the codeSystemVersion property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeSystemVersion(String value) {
                        this.codeSystemVersion = value;
                    }

                    /**
                     * Gets the value of the hypersensitivityReaction property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DSSRequest.Patient.Risks.NonDrugHypersensitivities.NonDrugHypersensitivity.HypersensitivityReaction }
                     *     
                     */
                    public DSSRequest.Patient.Risks.NonDrugHypersensitivities.NonDrugHypersensitivity.HypersensitivityReaction getHypersensitivityReaction() {
                        return hypersensitivityReaction;
                    }

                    /**
                     * Sets the value of the hypersensitivityReaction property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DSSRequest.Patient.Risks.NonDrugHypersensitivities.NonDrugHypersensitivity.HypersensitivityReaction }
                     *     
                     */
                    public void setHypersensitivityReaction(DSSRequest.Patient.Risks.NonDrugHypersensitivities.NonDrugHypersensitivity.HypersensitivityReaction value) {
                        this.hypersensitivityReaction = value;
                    }

                    /**
                     * Gets the value of the allergenName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAllergenName() {
                        return allergenName;
                    }

                    /**
                     * Sets the value of the allergenName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAllergenName(String value) {
                        this.allergenName = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;group ref="{}CodeGroup"/>
                     *         &lt;group ref="{}TimeStampsGroup"/>
                     *         &lt;element name="RiskLevel" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;group ref="{}CodeGroup"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="HypersensitivityReactionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "codeValue",
                        "codeSystem",
                        "codeSystemVersion",
                        "startStamp",
                        "endStamp",
                        "pointStamp",
                        "riskLevel",
                        "hypersensitivityReactionName"
                    })
                    public static class HypersensitivityReaction {

                        @XmlElement(name = "CodeValue", required = true)
                        protected String codeValue;
                        @XmlElement(name = "CodeSystem", required = true)
                        protected String codeSystem;
                        @XmlElement(name = "CodeSystemVersion")
                        protected String codeSystemVersion;
                        @XmlElement(name = "StartStamp")
                        protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp startStamp;
                        @XmlElement(name = "EndStamp")
                        protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp endStamp;
                        @XmlElement(name = "PointStamp")
                        protected today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp pointStamp;
                        @XmlElement(name = "RiskLevel")
                        protected DSSRequest.Patient.Risks.NonDrugHypersensitivities.NonDrugHypersensitivity.HypersensitivityReaction.RiskLevel riskLevel;
                        @XmlElement(name = "HypersensitivityReactionName")
                        protected String hypersensitivityReactionName;

                        /**
                         * Gets the value of the codeValue property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCodeValue() {
                            return codeValue;
                        }

                        /**
                         * Sets the value of the codeValue property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCodeValue(String value) {
                            this.codeValue = value;
                        }

                        /**
                         * Gets the value of the codeSystem property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCodeSystem() {
                            return codeSystem;
                        }

                        /**
                         * Sets the value of the codeSystem property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCodeSystem(String value) {
                            this.codeSystem = value;
                        }

                        /**
                         * Gets the value of the codeSystemVersion property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCodeSystemVersion() {
                            return codeSystemVersion;
                        }

                        /**
                         * Sets the value of the codeSystemVersion property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCodeSystemVersion(String value) {
                            this.codeSystemVersion = value;
                        }

                        /**
                         * Gets the value of the startStamp property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                         *     
                         */
                        public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp getStartStamp() {
                            return startStamp;
                        }

                        /**
                         * Sets the value of the startStamp property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                         *     
                         */
                        public void setStartStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp value) {
                            this.startStamp = value;
                        }

                        /**
                         * Gets the value of the endStamp property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                         *     
                         */
                        public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp getEndStamp() {
                            return endStamp;
                        }

                        /**
                         * Sets the value of the endStamp property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                         *     
                         */
                        public void setEndStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp value) {
                            this.endStamp = value;
                        }

                        /**
                         * Gets the value of the pointStamp property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                         *     
                         */
                        public today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp getPointStamp() {
                            return pointStamp;
                        }

                        /**
                         * Sets the value of the pointStamp property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                         *     
                         */
                        public void setPointStamp(today.smarthealthcare.ppv1.ebmeds.schema.beans.DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp value) {
                            this.pointStamp = value;
                        }

                        /**
                         * Gets the value of the riskLevel property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link DSSRequest.Patient.Risks.NonDrugHypersensitivities.NonDrugHypersensitivity.HypersensitivityReaction.RiskLevel }
                         *     
                         */
                        public DSSRequest.Patient.Risks.NonDrugHypersensitivities.NonDrugHypersensitivity.HypersensitivityReaction.RiskLevel getRiskLevel() {
                            return riskLevel;
                        }

                        /**
                         * Sets the value of the riskLevel property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link DSSRequest.Patient.Risks.NonDrugHypersensitivities.NonDrugHypersensitivity.HypersensitivityReaction.RiskLevel }
                         *     
                         */
                        public void setRiskLevel(DSSRequest.Patient.Risks.NonDrugHypersensitivities.NonDrugHypersensitivity.HypersensitivityReaction.RiskLevel value) {
                            this.riskLevel = value;
                        }

                        /**
                         * Gets the value of the hypersensitivityReactionName property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getHypersensitivityReactionName() {
                            return hypersensitivityReactionName;
                        }

                        /**
                         * Sets the value of the hypersensitivityReactionName property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setHypersensitivityReactionName(String value) {
                            this.hypersensitivityReactionName = value;
                        }


                        /**
                         * <p>Java class for anonymous complex type.
                         * 
                         * <p>The following schema fragment specifies the expected content contained within this class.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;group ref="{}CodeGroup"/>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "codeValue",
                            "codeSystem",
                            "codeSystemVersion"
                        })
                        public static class RiskLevel {

                            @XmlElement(name = "CodeValue", required = true)
                            protected String codeValue;
                            @XmlElement(name = "CodeSystem", required = true)
                            protected String codeSystem;
                            @XmlElement(name = "CodeSystemVersion")
                            protected String codeSystemVersion;

                            /**
                             * Gets the value of the codeValue property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCodeValue() {
                                return codeValue;
                            }

                            /**
                             * Sets the value of the codeValue property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCodeValue(String value) {
                                this.codeValue = value;
                            }

                            /**
                             * Gets the value of the codeSystem property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCodeSystem() {
                                return codeSystem;
                            }

                            /**
                             * Sets the value of the codeSystem property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCodeSystem(String value) {
                                this.codeSystem = value;
                            }

                            /**
                             * Gets the value of the codeSystemVersion property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getCodeSystemVersion() {
                                return codeSystemVersion;
                            }

                            /**
                             * Sets the value of the codeSystemVersion property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setCodeSystemVersion(String value) {
                                this.codeSystemVersion = value;
                            }

                        }

                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Pregnant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
             *         &lt;element name="ExpectedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "pregnant",
                "expectedDeliveryDate"
            })
            public static class Pregnancy {

                @XmlElement(name = "Pregnant")
                protected Boolean pregnant;
                @XmlElement(name = "ExpectedDeliveryDate")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar expectedDeliveryDate;

                /**
                 * Gets the value of the pregnant property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isPregnant() {
                    return pregnant;
                }

                /**
                 * Sets the value of the pregnant property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setPregnant(Boolean value) {
                    this.pregnant = value;
                }

                /**
                 * Gets the value of the expectedDeliveryDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getExpectedDeliveryDate() {
                    return expectedDeliveryDate;
                }

                /**
                 * Sets the value of the expectedDeliveryDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setExpectedDeliveryDate(XMLGregorianCalendar value) {
                    this.expectedDeliveryDate = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="SmokingStatus" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;group ref="{}CodeGroup"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="DailyCigaretteConsumption" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *         &lt;element name="SmokingPackYears" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "smokingStatus",
                "dailyCigaretteConsumption",
                "smokingPackYears"
            })
            public static class Smoking {

                @XmlElement(name = "SmokingStatus")
                protected DSSRequest.Patient.Risks.Smoking.SmokingStatus smokingStatus;
                @XmlElement(name = "DailyCigaretteConsumption")
                protected Integer dailyCigaretteConsumption;
                @XmlElement(name = "SmokingPackYears")
                protected Integer smokingPackYears;

                /**
                 * Gets the value of the smokingStatus property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DSSRequest.Patient.Risks.Smoking.SmokingStatus }
                 *     
                 */
                public DSSRequest.Patient.Risks.Smoking.SmokingStatus getSmokingStatus() {
                    return smokingStatus;
                }

                /**
                 * Sets the value of the smokingStatus property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DSSRequest.Patient.Risks.Smoking.SmokingStatus }
                 *     
                 */
                public void setSmokingStatus(DSSRequest.Patient.Risks.Smoking.SmokingStatus value) {
                    this.smokingStatus = value;
                }

                /**
                 * Gets the value of the dailyCigaretteConsumption property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getDailyCigaretteConsumption() {
                    return dailyCigaretteConsumption;
                }

                /**
                 * Sets the value of the dailyCigaretteConsumption property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setDailyCigaretteConsumption(Integer value) {
                    this.dailyCigaretteConsumption = value;
                }

                /**
                 * Gets the value of the smokingPackYears property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getSmokingPackYears() {
                    return smokingPackYears;
                }

                /**
                 * Sets the value of the smokingPackYears property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setSmokingPackYears(Integer value) {
                    this.smokingPackYears = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;group ref="{}CodeGroup"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "content"
                })
                public static class SmokingStatus {

                    @XmlElementRefs({
                        @XmlElementRef(name = "CodeSystemVersion", type = JAXBElement.class),
                        @XmlElementRef(name = "CodeSystem", type = JAXBElement.class),
                        @XmlElementRef(name = "CodeValue", type = JAXBElement.class)
                    })
                    @XmlMixed
                    protected List<Serializable> content;

                    /**
                     * Gets the value of the content property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the content property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getContent().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link JAXBElement }{@code <}{@link String }{@code >}
                     * {@link JAXBElement }{@code <}{@link String }{@code >}
                     * {@link String }
                     * {@link JAXBElement }{@code <}{@link String }{@code >}
                     * 
                     * 
                     */
                    public List<Serializable> getContent() {
                        if (content == null) {
                            content = new ArrayList<Serializable>();
                        }
                        return this.content;
                    }

                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="User">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="UserID" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;group ref="{}CodeGroup" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="HealthCareRole" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="Physician"/>
     *                         &lt;enumeration value="Nurse"/>
     *                         &lt;enumeration value="Pharmacist"/>
     *                         &lt;enumeration value="Citizen"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="HealthCareOrganization" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence maxOccurs="unbounded">
     *                             &lt;group ref="{}CodeGroup"/>
     *                             &lt;element name="HealthCareOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="HealthCareSpecialty" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;group ref="{}CodeGroup" maxOccurs="unbounded"/>
     *                             &lt;element name="HealthCareSpecialtyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Language">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;group ref="{}CodeGroup"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Nation">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;group ref="{}CodeGroup"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Application">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ApplicationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ApplicationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ApplicationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="QueryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DSSVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ScriptSelection" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ScriptsToRun" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Script" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="ScriptID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="ReminderID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ScriptsToBlock" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Script" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="ScriptID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="ReminderID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="FeedbackType">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="0"/>
     *                         &lt;enumeration value="C"/>
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                         &lt;enumeration value="S"/>
     *                         &lt;enumeration value="Q"/>
     *                         &lt;enumeration value="L"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CheckMoment" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CheckDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element name="CheckTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="EventTypes" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="EventType" maxOccurs="unbounded">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="onOpenRecord"/>
     *                                   &lt;enumeration value="onCloseRecord"/>
     *                                   &lt;enumeration value="onNewDiagnosis"/>
     *                                   &lt;enumeration value="onNewDrug"/>
     *                                   &lt;enumeration value="onNewProcedure"/>
     *                                   &lt;enumeration value="onNewConsultation"/>
     *                                   &lt;enumeration value="onNewForm"/>
     *                                   &lt;enumeration value="onVirtualHealthCheck"/>
     *                                   &lt;enumeration value="onDemand"/>
     *                                   &lt;enumeration value="onNewOrder"/>
     *                                   &lt;enumeration value="onNewResult"/>
     *                                   &lt;enumeration value="onActiveDiagnosis"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="VirtualHealthCheckName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Exceptions" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Exception" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "user",
        "application"
    })
    public static class System {

        @XmlElement(name = "User", required = true)
        protected DSSRequest.System.User user;
        @XmlElement(name = "Application", required = true)
        protected DSSRequest.System.Application application;

        /**
         * Gets the value of the user property.
         * 
         * @return
         *     possible object is
         *     {@link DSSRequest.System.User }
         *     
         */
        public DSSRequest.System.User getUser() {
            return user;
        }

        /**
         * Sets the value of the user property.
         * 
         * @param value
         *     allowed object is
         *     {@link DSSRequest.System.User }
         *     
         */
        public void setUser(DSSRequest.System.User value) {
            this.user = value;
        }

        /**
         * Gets the value of the application property.
         * 
         * @return
         *     possible object is
         *     {@link DSSRequest.System.Application }
         *     
         */
        public DSSRequest.System.Application getApplication() {
            return application;
        }

        /**
         * Sets the value of the application property.
         * 
         * @param value
         *     allowed object is
         *     {@link DSSRequest.System.Application }
         *     
         */
        public void setApplication(DSSRequest.System.Application value) {
            this.application = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ApplicationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ApplicationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ApplicationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="QueryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DSSVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ScriptSelection" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ScriptsToRun" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Script" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="ScriptID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="ReminderID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ScriptsToBlock" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Script" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="ScriptID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="ReminderID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="FeedbackType">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="C"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="S"/>
         *               &lt;enumeration value="Q"/>
         *               &lt;enumeration value="L"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CheckMoment" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CheckDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element name="CheckTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="EventTypes" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="EventType" maxOccurs="unbounded">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value="onOpenRecord"/>
         *                         &lt;enumeration value="onCloseRecord"/>
         *                         &lt;enumeration value="onNewDiagnosis"/>
         *                         &lt;enumeration value="onNewDrug"/>
         *                         &lt;enumeration value="onNewProcedure"/>
         *                         &lt;enumeration value="onNewConsultation"/>
         *                         &lt;enumeration value="onNewForm"/>
         *                         &lt;enumeration value="onVirtualHealthCheck"/>
         *                         &lt;enumeration value="onDemand"/>
         *                         &lt;enumeration value="onNewOrder"/>
         *                         &lt;enumeration value="onNewResult"/>
         *                         &lt;enumeration value="onActiveDiagnosis"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="VirtualHealthCheckName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Exceptions" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Exception" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "applicationType",
            "applicationName",
            "applicationVersion",
            "queryID",
            "dssVersion",
            "scriptSelection",
            "feedbackType",
            "checkMoment",
            "eventTypes",
            "virtualHealthCheckName",
            "exceptions"
        })
        public static class Application {

            @XmlElement(name = "ApplicationType")
            protected String applicationType;
            @XmlElement(name = "ApplicationName")
            protected String applicationName;
            @XmlElement(name = "ApplicationVersion")
            protected String applicationVersion;
            @XmlElement(name = "QueryID")
            protected String queryID;
            @XmlElement(name = "DSSVersion", required = true)
            protected String dssVersion;
            @XmlElement(name = "ScriptSelection")
            protected DSSRequest.System.Application.ScriptSelection scriptSelection;
            @XmlElement(name = "FeedbackType", required = true)
            protected String feedbackType;
            @XmlElement(name = "CheckMoment")
            protected DSSRequest.System.Application.CheckMoment checkMoment;
            @XmlElement(name = "EventTypes")
            protected DSSRequest.System.Application.EventTypes eventTypes;
            @XmlElement(name = "VirtualHealthCheckName")
            protected String virtualHealthCheckName;
            @XmlElement(name = "Exceptions")
            protected DSSRequest.System.Application.Exceptions exceptions;

            /**
             * Gets the value of the applicationType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplicationType() {
                return applicationType;
            }

            /**
             * Sets the value of the applicationType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplicationType(String value) {
                this.applicationType = value;
            }

            /**
             * Gets the value of the applicationName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplicationName() {
                return applicationName;
            }

            /**
             * Sets the value of the applicationName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplicationName(String value) {
                this.applicationName = value;
            }

            /**
             * Gets the value of the applicationVersion property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplicationVersion() {
                return applicationVersion;
            }

            /**
             * Sets the value of the applicationVersion property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplicationVersion(String value) {
                this.applicationVersion = value;
            }

            /**
             * Gets the value of the queryID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQueryID() {
                return queryID;
            }

            /**
             * Sets the value of the queryID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQueryID(String value) {
                this.queryID = value;
            }

            /**
             * Gets the value of the dssVersion property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDSSVersion() {
                return dssVersion;
            }

            /**
             * Sets the value of the dssVersion property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDSSVersion(String value) {
                this.dssVersion = value;
            }

            /**
             * Gets the value of the scriptSelection property.
             * 
             * @return
             *     possible object is
             *     {@link DSSRequest.System.Application.ScriptSelection }
             *     
             */
            public DSSRequest.System.Application.ScriptSelection getScriptSelection() {
                return scriptSelection;
            }

            /**
             * Sets the value of the scriptSelection property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSRequest.System.Application.ScriptSelection }
             *     
             */
            public void setScriptSelection(DSSRequest.System.Application.ScriptSelection value) {
                this.scriptSelection = value;
            }

            /**
             * Gets the value of the feedbackType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFeedbackType() {
                return feedbackType;
            }

            /**
             * Sets the value of the feedbackType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFeedbackType(String value) {
                this.feedbackType = value;
            }

            /**
             * Gets the value of the checkMoment property.
             * 
             * @return
             *     possible object is
             *     {@link DSSRequest.System.Application.CheckMoment }
             *     
             */
            public DSSRequest.System.Application.CheckMoment getCheckMoment() {
                return checkMoment;
            }

            /**
             * Sets the value of the checkMoment property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSRequest.System.Application.CheckMoment }
             *     
             */
            public void setCheckMoment(DSSRequest.System.Application.CheckMoment value) {
                this.checkMoment = value;
            }

            /**
             * Gets the value of the eventTypes property.
             * 
             * @return
             *     possible object is
             *     {@link DSSRequest.System.Application.EventTypes }
             *     
             */
            public DSSRequest.System.Application.EventTypes getEventTypes() {
                return eventTypes;
            }

            /**
             * Sets the value of the eventTypes property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSRequest.System.Application.EventTypes }
             *     
             */
            public void setEventTypes(DSSRequest.System.Application.EventTypes value) {
                this.eventTypes = value;
            }

            /**
             * Gets the value of the virtualHealthCheckName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVirtualHealthCheckName() {
                return virtualHealthCheckName;
            }

            /**
             * Sets the value of the virtualHealthCheckName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVirtualHealthCheckName(String value) {
                this.virtualHealthCheckName = value;
            }

            /**
             * Gets the value of the exceptions property.
             * 
             * @return
             *     possible object is
             *     {@link DSSRequest.System.Application.Exceptions }
             *     
             */
            public DSSRequest.System.Application.Exceptions getExceptions() {
                return exceptions;
            }

            /**
             * Sets the value of the exceptions property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSRequest.System.Application.Exceptions }
             *     
             */
            public void setExceptions(DSSRequest.System.Application.Exceptions value) {
                this.exceptions = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="CheckDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="CheckTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "checkDate",
                "checkTime"
            })
            public static class CheckMoment {

                @XmlElement(name = "CheckDate", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar checkDate;
                @XmlElement(name = "CheckTime", required = true)
                @XmlSchemaType(name = "time")
                protected XMLGregorianCalendar checkTime;

                /**
                 * Gets the value of the checkDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getCheckDate() {
                    return checkDate;
                }

                /**
                 * Sets the value of the checkDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setCheckDate(XMLGregorianCalendar value) {
                    this.checkDate = value;
                }

                /**
                 * Gets the value of the checkTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getCheckTime() {
                    return checkTime;
                }

                /**
                 * Sets the value of the checkTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setCheckTime(XMLGregorianCalendar value) {
                    this.checkTime = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="EventType" maxOccurs="unbounded">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;enumeration value="onOpenRecord"/>
             *               &lt;enumeration value="onCloseRecord"/>
             *               &lt;enumeration value="onNewDiagnosis"/>
             *               &lt;enumeration value="onNewDrug"/>
             *               &lt;enumeration value="onNewProcedure"/>
             *               &lt;enumeration value="onNewConsultation"/>
             *               &lt;enumeration value="onNewForm"/>
             *               &lt;enumeration value="onVirtualHealthCheck"/>
             *               &lt;enumeration value="onDemand"/>
             *               &lt;enumeration value="onNewOrder"/>
             *               &lt;enumeration value="onNewResult"/>
             *               &lt;enumeration value="onActiveDiagnosis"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "eventType"
            })
            public static class EventTypes {

                @XmlElement(name = "EventType", required = true)
                protected List<String> eventType;

                /**
                 * Gets the value of the eventType property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the eventType property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getEventType().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getEventType() {
                    if (eventType == null) {
                        eventType = new ArrayList<String>();
                    }
                    return this.eventType;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Exception" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "exception"
            })
            public static class Exceptions {

                @XmlElement(name = "Exception", type = Integer.class)
                protected List<Integer> exception;

                /**
                 * Gets the value of the exception property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the exception property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getException().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Integer }
                 * 
                 * 
                 */
                public List<Integer> getException() {
                    if (exception == null) {
                        exception = new ArrayList<Integer>();
                    }
                    return this.exception;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="ScriptsToRun" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Script" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="ScriptID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="ReminderID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ScriptsToBlock" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Script" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="ScriptID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="ReminderID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "scriptsToRun",
                "scriptsToBlock"
            })
            public static class ScriptSelection {

                @XmlElement(name = "ScriptsToRun")
                protected DSSRequest.System.Application.ScriptSelection.ScriptsToRun scriptsToRun;
                @XmlElement(name = "ScriptsToBlock")
                protected DSSRequest.System.Application.ScriptSelection.ScriptsToBlock scriptsToBlock;

                /**
                 * Gets the value of the scriptsToRun property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DSSRequest.System.Application.ScriptSelection.ScriptsToRun }
                 *     
                 */
                public DSSRequest.System.Application.ScriptSelection.ScriptsToRun getScriptsToRun() {
                    return scriptsToRun;
                }

                /**
                 * Sets the value of the scriptsToRun property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DSSRequest.System.Application.ScriptSelection.ScriptsToRun }
                 *     
                 */
                public void setScriptsToRun(DSSRequest.System.Application.ScriptSelection.ScriptsToRun value) {
                    this.scriptsToRun = value;
                }

                /**
                 * Gets the value of the scriptsToBlock property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DSSRequest.System.Application.ScriptSelection.ScriptsToBlock }
                 *     
                 */
                public DSSRequest.System.Application.ScriptSelection.ScriptsToBlock getScriptsToBlock() {
                    return scriptsToBlock;
                }

                /**
                 * Sets the value of the scriptsToBlock property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DSSRequest.System.Application.ScriptSelection.ScriptsToBlock }
                 *     
                 */
                public void setScriptsToBlock(DSSRequest.System.Application.ScriptSelection.ScriptsToBlock value) {
                    this.scriptsToBlock = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Script" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="ScriptID" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="ReminderID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "script"
                })
                public static class ScriptsToBlock {

                    @XmlElement(name = "Script", required = true)
                    protected List<DSSRequest.System.Application.ScriptSelection.ScriptsToBlock.Script> script;

                    /**
                     * Gets the value of the script property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the script property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getScript().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link DSSRequest.System.Application.ScriptSelection.ScriptsToBlock.Script }
                     * 
                     * 
                     */
                    public List<DSSRequest.System.Application.ScriptSelection.ScriptsToBlock.Script> getScript() {
                        if (script == null) {
                            script = new ArrayList<DSSRequest.System.Application.ScriptSelection.ScriptsToBlock.Script>();
                        }
                        return this.script;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="ScriptID" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="ReminderID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "scriptID",
                        "reminderID"
                    })
                    public static class Script {

                        @XmlElement(name = "ScriptID", required = true)
                        protected String scriptID;
                        @XmlElement(name = "ReminderID")
                        protected List<String> reminderID;

                        /**
                         * Gets the value of the scriptID property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getScriptID() {
                            return scriptID;
                        }

                        /**
                         * Sets the value of the scriptID property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setScriptID(String value) {
                            this.scriptID = value;
                        }

                        /**
                         * Gets the value of the reminderID property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the reminderID property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getReminderID().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link String }
                         * 
                         * 
                         */
                        public List<String> getReminderID() {
                            if (reminderID == null) {
                                reminderID = new ArrayList<String>();
                            }
                            return this.reminderID;
                        }

                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Script" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="ScriptID" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="ReminderID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "script"
                })
                public static class ScriptsToRun {

                    @XmlElement(name = "Script", required = true)
                    protected List<DSSRequest.System.Application.ScriptSelection.ScriptsToRun.Script> script;

                    /**
                     * Gets the value of the script property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the script property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getScript().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link DSSRequest.System.Application.ScriptSelection.ScriptsToRun.Script }
                     * 
                     * 
                     */
                    public List<DSSRequest.System.Application.ScriptSelection.ScriptsToRun.Script> getScript() {
                        if (script == null) {
                            script = new ArrayList<DSSRequest.System.Application.ScriptSelection.ScriptsToRun.Script>();
                        }
                        return this.script;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="ScriptID" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="ReminderID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "scriptID",
                        "reminderID"
                    })
                    public static class Script {

                        @XmlElement(name = "ScriptID", required = true)
                        protected String scriptID;
                        @XmlElement(name = "ReminderID")
                        protected List<String> reminderID;

                        /**
                         * Gets the value of the scriptID property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getScriptID() {
                            return scriptID;
                        }

                        /**
                         * Sets the value of the scriptID property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setScriptID(String value) {
                            this.scriptID = value;
                        }

                        /**
                         * Gets the value of the reminderID property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the reminderID property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getReminderID().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link String }
                         * 
                         * 
                         */
                        public List<String> getReminderID() {
                            if (reminderID == null) {
                                reminderID = new ArrayList<String>();
                            }
                            return this.reminderID;
                        }

                    }

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="UserID" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;group ref="{}CodeGroup" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="HealthCareRole" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="Physician"/>
         *               &lt;enumeration value="Nurse"/>
         *               &lt;enumeration value="Pharmacist"/>
         *               &lt;enumeration value="Citizen"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="HealthCareOrganization" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence maxOccurs="unbounded">
         *                   &lt;group ref="{}CodeGroup"/>
         *                   &lt;element name="HealthCareOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="HealthCareSpecialty" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;group ref="{}CodeGroup" maxOccurs="unbounded"/>
         *                   &lt;element name="HealthCareSpecialtyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Language">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;group ref="{}CodeGroup"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Nation">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;group ref="{}CodeGroup"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "userID",
            "healthCareRole",
            "healthCareOrganization",
            "healthCareSpecialty",
            "language",
            "nation"
        })
        public static class User {

            @XmlElement(name = "UserID")
            protected DSSRequest.System.User.UserID userID;
            @XmlElement(name = "HealthCareRole")
            protected String healthCareRole;
            @XmlElement(name = "HealthCareOrganization")
            protected DSSRequest.System.User.HealthCareOrganization healthCareOrganization;
            @XmlElement(name = "HealthCareSpecialty")
            protected DSSRequest.System.User.HealthCareSpecialty healthCareSpecialty;
            @XmlElement(name = "Language", required = true)
            protected DSSRequest.System.User.Language language;
            @XmlElement(name = "Nation", required = true)
            protected DSSRequest.System.User.Nation nation;

            /**
             * Gets the value of the userID property.
             * 
             * @return
             *     possible object is
             *     {@link DSSRequest.System.User.UserID }
             *     
             */
            public DSSRequest.System.User.UserID getUserID() {
                return userID;
            }

            /**
             * Sets the value of the userID property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSRequest.System.User.UserID }
             *     
             */
            public void setUserID(DSSRequest.System.User.UserID value) {
                this.userID = value;
            }

            /**
             * Gets the value of the healthCareRole property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHealthCareRole() {
                return healthCareRole;
            }

            /**
             * Sets the value of the healthCareRole property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHealthCareRole(String value) {
                this.healthCareRole = value;
            }

            /**
             * Gets the value of the healthCareOrganization property.
             * 
             * @return
             *     possible object is
             *     {@link DSSRequest.System.User.HealthCareOrganization }
             *     
             */
            public DSSRequest.System.User.HealthCareOrganization getHealthCareOrganization() {
                return healthCareOrganization;
            }

            /**
             * Sets the value of the healthCareOrganization property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSRequest.System.User.HealthCareOrganization }
             *     
             */
            public void setHealthCareOrganization(DSSRequest.System.User.HealthCareOrganization value) {
                this.healthCareOrganization = value;
            }

            /**
             * Gets the value of the healthCareSpecialty property.
             * 
             * @return
             *     possible object is
             *     {@link DSSRequest.System.User.HealthCareSpecialty }
             *     
             */
            public DSSRequest.System.User.HealthCareSpecialty getHealthCareSpecialty() {
                return healthCareSpecialty;
            }

            /**
             * Sets the value of the healthCareSpecialty property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSRequest.System.User.HealthCareSpecialty }
             *     
             */
            public void setHealthCareSpecialty(DSSRequest.System.User.HealthCareSpecialty value) {
                this.healthCareSpecialty = value;
            }

            /**
             * Gets the value of the language property.
             * 
             * @return
             *     possible object is
             *     {@link DSSRequest.System.User.Language }
             *     
             */
            public DSSRequest.System.User.Language getLanguage() {
                return language;
            }

            /**
             * Sets the value of the language property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSRequest.System.User.Language }
             *     
             */
            public void setLanguage(DSSRequest.System.User.Language value) {
                this.language = value;
            }

            /**
             * Gets the value of the nation property.
             * 
             * @return
             *     possible object is
             *     {@link DSSRequest.System.User.Nation }
             *     
             */
            public DSSRequest.System.User.Nation getNation() {
                return nation;
            }

            /**
             * Sets the value of the nation property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSRequest.System.User.Nation }
             *     
             */
            public void setNation(DSSRequest.System.User.Nation value) {
                this.nation = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence maxOccurs="unbounded">
             *         &lt;group ref="{}CodeGroup"/>
             *         &lt;element name="HealthCareOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "codeValueAndCodeSystemAndCodeSystemVersion"
            })
            public static class HealthCareOrganization {

                @XmlElementRefs({
                    @XmlElementRef(name = "HealthCareOrganizationName", type = JAXBElement.class),
                    @XmlElementRef(name = "CodeSystem", type = JAXBElement.class),
                    @XmlElementRef(name = "CodeValue", type = JAXBElement.class),
                    @XmlElementRef(name = "CodeSystemVersion", type = JAXBElement.class)
                })
                protected List<JAXBElement<String>> codeValueAndCodeSystemAndCodeSystemVersion;

                /**
                 * Gets the value of the codeValueAndCodeSystemAndCodeSystemVersion property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the codeValueAndCodeSystemAndCodeSystemVersion property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCodeValueAndCodeSystemAndCodeSystemVersion().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * 
                 * 
                 */
                public List<JAXBElement<String>> getCodeValueAndCodeSystemAndCodeSystemVersion() {
                    if (codeValueAndCodeSystemAndCodeSystemVersion == null) {
                        codeValueAndCodeSystemAndCodeSystemVersion = new ArrayList<JAXBElement<String>>();
                    }
                    return this.codeValueAndCodeSystemAndCodeSystemVersion;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;group ref="{}CodeGroup" maxOccurs="unbounded"/>
             *         &lt;element name="HealthCareSpecialtyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "codeGroup",
                "healthCareSpecialtyName"
            })
            public static class HealthCareSpecialty {

                @XmlElementRefs({
                    @XmlElementRef(name = "CodeSystem", type = JAXBElement.class),
                    @XmlElementRef(name = "CodeSystemVersion", type = JAXBElement.class),
                    @XmlElementRef(name = "CodeValue", type = JAXBElement.class)
                })
                protected List<JAXBElement<String>> codeGroup;
                @XmlElement(name = "HealthCareSpecialtyName")
                protected String healthCareSpecialtyName;

                /**
                 * Coding system groups: health care specialties Gets the value of the codeGroup property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the codeGroup property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCodeGroup().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * 
                 * 
                 */
                public List<JAXBElement<String>> getCodeGroup() {
                    if (codeGroup == null) {
                        codeGroup = new ArrayList<JAXBElement<String>>();
                    }
                    return this.codeGroup;
                }

                /**
                 * Gets the value of the healthCareSpecialtyName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHealthCareSpecialtyName() {
                    return healthCareSpecialtyName;
                }

                /**
                 * Sets the value of the healthCareSpecialtyName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHealthCareSpecialtyName(String value) {
                    this.healthCareSpecialtyName = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;group ref="{}CodeGroup"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "codeValue",
                "codeSystem",
                "codeSystemVersion"
            })
            public static class Language {

                @XmlElement(name = "CodeValue", required = true)
                protected String codeValue;
                @XmlElement(name = "CodeSystem", required = true)
                protected String codeSystem;
                @XmlElement(name = "CodeSystemVersion")
                protected String codeSystemVersion;

                /**
                 * Gets the value of the codeValue property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeValue() {
                    return codeValue;
                }

                /**
                 * Sets the value of the codeValue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeValue(String value) {
                    this.codeValue = value;
                }

                /**
                 * Gets the value of the codeSystem property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeSystem() {
                    return codeSystem;
                }

                /**
                 * Sets the value of the codeSystem property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeSystem(String value) {
                    this.codeSystem = value;
                }

                /**
                 * Gets the value of the codeSystemVersion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeSystemVersion() {
                    return codeSystemVersion;
                }

                /**
                 * Sets the value of the codeSystemVersion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeSystemVersion(String value) {
                    this.codeSystemVersion = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;group ref="{}CodeGroup"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "codeValue",
                "codeSystem",
                "codeSystemVersion"
            })
            public static class Nation {

                @XmlElement(name = "CodeValue", required = true)
                protected String codeValue;
                @XmlElement(name = "CodeSystem", required = true)
                protected String codeSystem;
                @XmlElement(name = "CodeSystemVersion")
                protected String codeSystemVersion;

                /**
                 * Gets the value of the codeValue property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeValue() {
                    return codeValue;
                }

                /**
                 * Sets the value of the codeValue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeValue(String value) {
                    this.codeValue = value;
                }

                /**
                 * Gets the value of the codeSystem property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeSystem() {
                    return codeSystem;
                }

                /**
                 * Sets the value of the codeSystem property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeSystem(String value) {
                    this.codeSystem = value;
                }

                /**
                 * Gets the value of the codeSystemVersion property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeSystemVersion() {
                    return codeSystemVersion;
                }

                /**
                 * Sets the value of the codeSystemVersion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeSystemVersion(String value) {
                    this.codeSystemVersion = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;group ref="{}CodeGroup" maxOccurs="unbounded"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "codeGroup"
            })
            public static class UserID {

                @XmlElementRefs({
                    @XmlElementRef(name = "CodeValue", type = JAXBElement.class),
                    @XmlElementRef(name = "CodeSystem", type = JAXBElement.class),
                    @XmlElementRef(name = "CodeSystemVersion", type = JAXBElement.class)
                })
                protected List<JAXBElement<String>> codeGroup;

                /**
                 * Coding system groups: end-user IDs. Element added in version 1.2 Gets the value of the codeGroup property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the codeGroup property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCodeGroup().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * 
                 * 
                 */
                public List<JAXBElement<String>> getCodeGroup() {
                    if (codeGroup == null) {
                        codeGroup = new ArrayList<JAXBElement<String>>();
                    }
                    return this.codeGroup;
                }

            }

        }

    }

}
