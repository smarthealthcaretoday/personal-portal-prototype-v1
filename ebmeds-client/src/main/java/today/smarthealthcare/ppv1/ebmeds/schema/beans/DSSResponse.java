
package today.smarthealthcare.ppv1.ebmeds.schema.beans;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 *         &lt;element name="Reminders" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Reminder" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ScriptID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ReminderID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                             &lt;element name="ReminderShort">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="a" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                                               &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ReminderLong">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="a" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                                               &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ReminderNurse">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="a" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                                               &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ReminderPatient">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="a" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                                               &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ReminderLevel">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;enumeration value="0"/>
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ReminderType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="SuggestedActions" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="SuggestedAction" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;group ref="{}CodeGroup"/>
 *                                                 &lt;group ref="{}TimeStampsGroup"/>
 *                                                 &lt;element name="ActionType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="ActionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Interactions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Interaction" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="InteractionText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="InteractionLevel">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="C"/>
 *                                   &lt;enumeration value="D"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Drug1">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DrugCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Drug2">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DrugCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="InteractionLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="Contraindications" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Contraindication" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ContraindicationText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ContraindicationLevel">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                   &lt;enumeration value="0"/>
 *                                   &lt;enumeration value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Drug">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DrugCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Diagnosis">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="DrugsAndRenalFunction" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GFR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="DrugAndRenalFunction" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Drug">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DrugCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ActiveIngredientName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DrugAndRenalFunctionText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ContraindicationLevel">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="B"/>
 *                                   &lt;enumeration value="C"/>
 *                                   &lt;enumeration value="D"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DrugAndRenalFunctionLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="DrugsAndPregnancyOrLactation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DrugAndPregnancyOrLactation" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Drug">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DrugCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DrugAndPregnancyOrLactationText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ContraindicationLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DrugAndPregnancyOrLactationLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                             &lt;element name="DrugCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RiskLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
 *         &lt;element name="Indications" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Indication" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Drug">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DrugCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Diagnosis">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="DiagnosisName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="IndicationLevel">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;enumeration value="0"/>
 *                                   &lt;enumeration value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="IndicationText" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="GuidelineLinks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GuidelineLink" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="GuidelineURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="GuidelineTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="GuidelinePriority">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;enumeration value="0"/>
 *                                   &lt;enumeration value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="GuidelineID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *         &lt;element name="RelevantBreakPoints" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RelevantBreakPoint" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ScriptID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="MessageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="MessageID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
 *                   &lt;element name="DSSVersion" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="QueryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ElapsedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DebugMessages" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DebugMessage" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Exceptions" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Exception" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
 *                             &lt;element name="DataSetText" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "reminders",
    "interactions",
    "contraindications",
    "drugsAndRenalFunction",
    "drugsAndPregnancyOrLactation",
    "drugsToAvoid",
    "indications",
    "guidelineLinks",
    "relevantBreakPoints",
    "system",
    "experimentalDataSets"
})
@XmlRootElement(name = "DSSResponse")
public class DSSResponse {

    @XmlElement(name = "Reminders")
    protected DSSResponse.Reminders reminders;
    @XmlElement(name = "Interactions")
    protected DSSResponse.Interactions interactions;
    @XmlElement(name = "Contraindications")
    protected DSSResponse.Contraindications contraindications;
    @XmlElement(name = "DrugsAndRenalFunction")
    protected DSSResponse.DrugsAndRenalFunction drugsAndRenalFunction;
    @XmlElement(name = "DrugsAndPregnancyOrLactation")
    protected DSSResponse.DrugsAndPregnancyOrLactation drugsAndPregnancyOrLactation;
    @XmlElement(name = "DrugsToAvoid")
    protected DSSResponse.DrugsToAvoid drugsToAvoid;
    @XmlElement(name = "Indications")
    protected DSSResponse.Indications indications;
    @XmlElement(name = "GuidelineLinks")
    protected DSSResponse.GuidelineLinks guidelineLinks;
    @XmlElement(name = "RelevantBreakPoints")
    protected DSSResponse.RelevantBreakPoints relevantBreakPoints;
    @XmlElement(name = "System", required = true)
    protected DSSResponse.System system;
    @XmlElement(name = "ExperimentalDataSets")
    protected DSSResponse.ExperimentalDataSets experimentalDataSets;

    /**
     * Gets the value of the reminders property.
     * 
     * @return
     *     possible object is
     *     {@link DSSResponse.Reminders }
     *     
     */
    public DSSResponse.Reminders getReminders() {
        return reminders;
    }

    /**
     * Sets the value of the reminders property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSSResponse.Reminders }
     *     
     */
    public void setReminders(DSSResponse.Reminders value) {
        this.reminders = value;
    }

    /**
     * Gets the value of the interactions property.
     * 
     * @return
     *     possible object is
     *     {@link DSSResponse.Interactions }
     *     
     */
    public DSSResponse.Interactions getInteractions() {
        return interactions;
    }

    /**
     * Sets the value of the interactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSSResponse.Interactions }
     *     
     */
    public void setInteractions(DSSResponse.Interactions value) {
        this.interactions = value;
    }

    /**
     * Gets the value of the contraindications property.
     * 
     * @return
     *     possible object is
     *     {@link DSSResponse.Contraindications }
     *     
     */
    public DSSResponse.Contraindications getContraindications() {
        return contraindications;
    }

    /**
     * Sets the value of the contraindications property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSSResponse.Contraindications }
     *     
     */
    public void setContraindications(DSSResponse.Contraindications value) {
        this.contraindications = value;
    }

    /**
     * Gets the value of the drugsAndRenalFunction property.
     * 
     * @return
     *     possible object is
     *     {@link DSSResponse.DrugsAndRenalFunction }
     *     
     */
    public DSSResponse.DrugsAndRenalFunction getDrugsAndRenalFunction() {
        return drugsAndRenalFunction;
    }

    /**
     * Sets the value of the drugsAndRenalFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSSResponse.DrugsAndRenalFunction }
     *     
     */
    public void setDrugsAndRenalFunction(DSSResponse.DrugsAndRenalFunction value) {
        this.drugsAndRenalFunction = value;
    }

    /**
     * Gets the value of the drugsAndPregnancyOrLactation property.
     * 
     * @return
     *     possible object is
     *     {@link DSSResponse.DrugsAndPregnancyOrLactation }
     *     
     */
    public DSSResponse.DrugsAndPregnancyOrLactation getDrugsAndPregnancyOrLactation() {
        return drugsAndPregnancyOrLactation;
    }

    /**
     * Sets the value of the drugsAndPregnancyOrLactation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSSResponse.DrugsAndPregnancyOrLactation }
     *     
     */
    public void setDrugsAndPregnancyOrLactation(DSSResponse.DrugsAndPregnancyOrLactation value) {
        this.drugsAndPregnancyOrLactation = value;
    }

    /**
     * Gets the value of the drugsToAvoid property.
     * 
     * @return
     *     possible object is
     *     {@link DSSResponse.DrugsToAvoid }
     *     
     */
    public DSSResponse.DrugsToAvoid getDrugsToAvoid() {
        return drugsToAvoid;
    }

    /**
     * Sets the value of the drugsToAvoid property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSSResponse.DrugsToAvoid }
     *     
     */
    public void setDrugsToAvoid(DSSResponse.DrugsToAvoid value) {
        this.drugsToAvoid = value;
    }

    /**
     * Gets the value of the indications property.
     * 
     * @return
     *     possible object is
     *     {@link DSSResponse.Indications }
     *     
     */
    public DSSResponse.Indications getIndications() {
        return indications;
    }

    /**
     * Sets the value of the indications property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSSResponse.Indications }
     *     
     */
    public void setIndications(DSSResponse.Indications value) {
        this.indications = value;
    }

    /**
     * Gets the value of the guidelineLinks property.
     * 
     * @return
     *     possible object is
     *     {@link DSSResponse.GuidelineLinks }
     *     
     */
    public DSSResponse.GuidelineLinks getGuidelineLinks() {
        return guidelineLinks;
    }

    /**
     * Sets the value of the guidelineLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSSResponse.GuidelineLinks }
     *     
     */
    public void setGuidelineLinks(DSSResponse.GuidelineLinks value) {
        this.guidelineLinks = value;
    }

    /**
     * Gets the value of the relevantBreakPoints property.
     * 
     * @return
     *     possible object is
     *     {@link DSSResponse.RelevantBreakPoints }
     *     
     */
    public DSSResponse.RelevantBreakPoints getRelevantBreakPoints() {
        return relevantBreakPoints;
    }

    /**
     * Sets the value of the relevantBreakPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSSResponse.RelevantBreakPoints }
     *     
     */
    public void setRelevantBreakPoints(DSSResponse.RelevantBreakPoints value) {
        this.relevantBreakPoints = value;
    }

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link DSSResponse.System }
     *     
     */
    public DSSResponse.System getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSSResponse.System }
     *     
     */
    public void setSystem(DSSResponse.System value) {
        this.system = value;
    }

    /**
     * Gets the value of the experimentalDataSets property.
     * 
     * @return
     *     possible object is
     *     {@link DSSResponse.ExperimentalDataSets }
     *     
     */
    public DSSResponse.ExperimentalDataSets getExperimentalDataSets() {
        return experimentalDataSets;
    }

    /**
     * Sets the value of the experimentalDataSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSSResponse.ExperimentalDataSets }
     *     
     */
    public void setExperimentalDataSets(DSSResponse.ExperimentalDataSets value) {
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
     *         &lt;element name="Contraindication" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ContraindicationText" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ContraindicationLevel">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                         &lt;enumeration value="0"/>
     *                         &lt;enumeration value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Drug">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="DrugCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Diagnosis">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "contraindication"
    })
    public static class Contraindications {

        @XmlElement(name = "Contraindication", required = true)
        protected List<DSSResponse.Contraindications.Contraindication> contraindication;

        /**
         * Gets the value of the contraindication property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contraindication property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContraindication().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DSSResponse.Contraindications.Contraindication }
         * 
         * 
         */
        public List<DSSResponse.Contraindications.Contraindication> getContraindication() {
            if (contraindication == null) {
                contraindication = new ArrayList<DSSResponse.Contraindications.Contraindication>();
            }
            return this.contraindication;
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
         *         &lt;element name="ContraindicationText" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ContraindicationLevel">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Drug">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="DrugCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Diagnosis">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "contraindicationText",
            "contraindicationLevel",
            "drug",
            "diagnosis"
        })
        public static class Contraindication {

            @XmlElement(name = "ContraindicationText", required = true)
            protected String contraindicationText;
            @XmlElement(name = "ContraindicationLevel", required = true)
            protected BigInteger contraindicationLevel;
            @XmlElement(name = "Drug", required = true)
            protected DSSResponse.Contraindications.Contraindication.Drug drug;
            @XmlElement(name = "Diagnosis", required = true)
            protected DSSResponse.Contraindications.Contraindication.Diagnosis diagnosis;

            /**
             * Gets the value of the contraindicationText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContraindicationText() {
                return contraindicationText;
            }

            /**
             * Sets the value of the contraindicationText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContraindicationText(String value) {
                this.contraindicationText = value;
            }

            /**
             * Gets the value of the contraindicationLevel property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getContraindicationLevel() {
                return contraindicationLevel;
            }

            /**
             * Sets the value of the contraindicationLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setContraindicationLevel(BigInteger value) {
                this.contraindicationLevel = value;
            }

            /**
             * Gets the value of the drug property.
             * 
             * @return
             *     possible object is
             *     {@link DSSResponse.Contraindications.Contraindication.Drug }
             *     
             */
            public DSSResponse.Contraindications.Contraindication.Drug getDrug() {
                return drug;
            }

            /**
             * Sets the value of the drug property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSResponse.Contraindications.Contraindication.Drug }
             *     
             */
            public void setDrug(DSSResponse.Contraindications.Contraindication.Drug value) {
                this.drug = value;
            }

            /**
             * Gets the value of the diagnosis property.
             * 
             * @return
             *     possible object is
             *     {@link DSSResponse.Contraindications.Contraindication.Diagnosis }
             *     
             */
            public DSSResponse.Contraindications.Contraindication.Diagnosis getDiagnosis() {
                return diagnosis;
            }

            /**
             * Sets the value of the diagnosis property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSResponse.Contraindications.Contraindication.Diagnosis }
             *     
             */
            public void setDiagnosis(DSSResponse.Contraindications.Contraindication.Diagnosis value) {
                this.diagnosis = value;
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
             *         &lt;element name="DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "diagnosisCode",
                "diagnosisName"
            })
            public static class Diagnosis {

                @XmlElement(name = "DiagnosisCode", required = true)
                protected String diagnosisCode;
                @XmlElement(name = "DiagnosisName")
                protected String diagnosisName;

                /**
                 * Gets the value of the diagnosisCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDiagnosisCode() {
                    return diagnosisCode;
                }

                /**
                 * Sets the value of the diagnosisCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDiagnosisCode(String value) {
                    this.diagnosisCode = value;
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
             *         &lt;element name="DrugCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "drugCode",
                "drugName"
            })
            public static class Drug {

                @XmlElement(name = "DrugCode", required = true)
                protected String drugCode;
                @XmlElement(name = "DrugName")
                protected String drugName;

                /**
                 * Gets the value of the drugCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDrugCode() {
                    return drugCode;
                }

                /**
                 * Sets the value of the drugCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDrugCode(String value) {
                    this.drugCode = value;
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
     *         &lt;element name="DrugAndPregnancyOrLactation" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Drug">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="DrugCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DrugAndPregnancyOrLactationText" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ContraindicationLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DrugAndPregnancyOrLactationLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "drugAndPregnancyOrLactation"
    })
    public static class DrugsAndPregnancyOrLactation {

        @XmlElement(name = "DrugAndPregnancyOrLactation", required = true)
        protected List<DSSResponse.DrugsAndPregnancyOrLactation.DrugAndPregnancyOrLactation> drugAndPregnancyOrLactation;

        /**
         * Gets the value of the drugAndPregnancyOrLactation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the drugAndPregnancyOrLactation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDrugAndPregnancyOrLactation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DSSResponse.DrugsAndPregnancyOrLactation.DrugAndPregnancyOrLactation }
         * 
         * 
         */
        public List<DSSResponse.DrugsAndPregnancyOrLactation.DrugAndPregnancyOrLactation> getDrugAndPregnancyOrLactation() {
            if (drugAndPregnancyOrLactation == null) {
                drugAndPregnancyOrLactation = new ArrayList<DSSResponse.DrugsAndPregnancyOrLactation.DrugAndPregnancyOrLactation>();
            }
            return this.drugAndPregnancyOrLactation;
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
         *         &lt;element name="Drug">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="DrugCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DrugAndPregnancyOrLactationText" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ContraindicationLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DrugAndPregnancyOrLactationLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "drug",
            "drugAndPregnancyOrLactationText",
            "contraindicationLevel",
            "drugAndPregnancyOrLactationLink"
        })
        public static class DrugAndPregnancyOrLactation {

            @XmlElement(name = "Drug", required = true)
            protected DSSResponse.DrugsAndPregnancyOrLactation.DrugAndPregnancyOrLactation.Drug drug;
            @XmlElement(name = "DrugAndPregnancyOrLactationText", required = true)
            protected String drugAndPregnancyOrLactationText;
            @XmlElement(name = "ContraindicationLevel", required = true)
            protected String contraindicationLevel;
            @XmlElement(name = "DrugAndPregnancyOrLactationLink")
            protected String drugAndPregnancyOrLactationLink;

            /**
             * Gets the value of the drug property.
             * 
             * @return
             *     possible object is
             *     {@link DSSResponse.DrugsAndPregnancyOrLactation.DrugAndPregnancyOrLactation.Drug }
             *     
             */
            public DSSResponse.DrugsAndPregnancyOrLactation.DrugAndPregnancyOrLactation.Drug getDrug() {
                return drug;
            }

            /**
             * Sets the value of the drug property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSResponse.DrugsAndPregnancyOrLactation.DrugAndPregnancyOrLactation.Drug }
             *     
             */
            public void setDrug(DSSResponse.DrugsAndPregnancyOrLactation.DrugAndPregnancyOrLactation.Drug value) {
                this.drug = value;
            }

            /**
             * Gets the value of the drugAndPregnancyOrLactationText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDrugAndPregnancyOrLactationText() {
                return drugAndPregnancyOrLactationText;
            }

            /**
             * Sets the value of the drugAndPregnancyOrLactationText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDrugAndPregnancyOrLactationText(String value) {
                this.drugAndPregnancyOrLactationText = value;
            }

            /**
             * Gets the value of the contraindicationLevel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContraindicationLevel() {
                return contraindicationLevel;
            }

            /**
             * Sets the value of the contraindicationLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContraindicationLevel(String value) {
                this.contraindicationLevel = value;
            }

            /**
             * Gets the value of the drugAndPregnancyOrLactationLink property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDrugAndPregnancyOrLactationLink() {
                return drugAndPregnancyOrLactationLink;
            }

            /**
             * Sets the value of the drugAndPregnancyOrLactationLink property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDrugAndPregnancyOrLactationLink(String value) {
                this.drugAndPregnancyOrLactationLink = value;
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
             *         &lt;element name="DrugCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "drugCode",
                "drugName"
            })
            public static class Drug {

                @XmlElement(name = "DrugCode", required = true)
                protected String drugCode;
                @XmlElement(name = "DrugName")
                protected String drugName;

                /**
                 * Gets the value of the drugCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDrugCode() {
                    return drugCode;
                }

                /**
                 * Sets the value of the drugCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDrugCode(String value) {
                    this.drugCode = value;
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
     *         &lt;element name="GFR" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="DrugAndRenalFunction" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Drug">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="DrugCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ActiveIngredientName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DrugAndRenalFunctionText" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ContraindicationLevel">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="B"/>
     *                         &lt;enumeration value="C"/>
     *                         &lt;enumeration value="D"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DrugAndRenalFunctionLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "gfr",
        "drugAndRenalFunction"
    })
    public static class DrugsAndRenalFunction {

        @XmlElement(name = "GFR")
        protected int gfr;
        @XmlElement(name = "DrugAndRenalFunction", required = true)
        protected List<DSSResponse.DrugsAndRenalFunction.DrugAndRenalFunction> drugAndRenalFunction;

        /**
         * Gets the value of the gfr property.
         * 
         */
        public int getGFR() {
            return gfr;
        }

        /**
         * Sets the value of the gfr property.
         * 
         */
        public void setGFR(int value) {
            this.gfr = value;
        }

        /**
         * Gets the value of the drugAndRenalFunction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the drugAndRenalFunction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDrugAndRenalFunction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DSSResponse.DrugsAndRenalFunction.DrugAndRenalFunction }
         * 
         * 
         */
        public List<DSSResponse.DrugsAndRenalFunction.DrugAndRenalFunction> getDrugAndRenalFunction() {
            if (drugAndRenalFunction == null) {
                drugAndRenalFunction = new ArrayList<DSSResponse.DrugsAndRenalFunction.DrugAndRenalFunction>();
            }
            return this.drugAndRenalFunction;
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
         *         &lt;element name="Drug">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="DrugCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ActiveIngredientName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DrugAndRenalFunctionText" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ContraindicationLevel">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="B"/>
         *               &lt;enumeration value="C"/>
         *               &lt;enumeration value="D"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DrugAndRenalFunctionLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "drug",
            "drugAndRenalFunctionText",
            "contraindicationLevel",
            "drugAndRenalFunctionLink"
        })
        public static class DrugAndRenalFunction {

            @XmlElement(name = "Drug", required = true)
            protected DSSResponse.DrugsAndRenalFunction.DrugAndRenalFunction.Drug drug;
            @XmlElement(name = "DrugAndRenalFunctionText", required = true)
            protected String drugAndRenalFunctionText;
            @XmlElement(name = "ContraindicationLevel", required = true)
            protected String contraindicationLevel;
            @XmlElement(name = "DrugAndRenalFunctionLink")
            protected String drugAndRenalFunctionLink;

            /**
             * Gets the value of the drug property.
             * 
             * @return
             *     possible object is
             *     {@link DSSResponse.DrugsAndRenalFunction.DrugAndRenalFunction.Drug }
             *     
             */
            public DSSResponse.DrugsAndRenalFunction.DrugAndRenalFunction.Drug getDrug() {
                return drug;
            }

            /**
             * Sets the value of the drug property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSResponse.DrugsAndRenalFunction.DrugAndRenalFunction.Drug }
             *     
             */
            public void setDrug(DSSResponse.DrugsAndRenalFunction.DrugAndRenalFunction.Drug value) {
                this.drug = value;
            }

            /**
             * Gets the value of the drugAndRenalFunctionText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDrugAndRenalFunctionText() {
                return drugAndRenalFunctionText;
            }

            /**
             * Sets the value of the drugAndRenalFunctionText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDrugAndRenalFunctionText(String value) {
                this.drugAndRenalFunctionText = value;
            }

            /**
             * Gets the value of the contraindicationLevel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContraindicationLevel() {
                return contraindicationLevel;
            }

            /**
             * Sets the value of the contraindicationLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContraindicationLevel(String value) {
                this.contraindicationLevel = value;
            }

            /**
             * Gets the value of the drugAndRenalFunctionLink property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDrugAndRenalFunctionLink() {
                return drugAndRenalFunctionLink;
            }

            /**
             * Sets the value of the drugAndRenalFunctionLink property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDrugAndRenalFunctionLink(String value) {
                this.drugAndRenalFunctionLink = value;
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
             *         &lt;element name="DrugCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ActiveIngredientName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "drugCode",
                "drugName",
                "activeIngredientName"
            })
            public static class Drug {

                @XmlElement(name = "DrugCode", required = true)
                protected String drugCode;
                @XmlElement(name = "DrugName", required = true)
                protected String drugName;
                @XmlElement(name = "ActiveIngredientName", required = true)
                protected String activeIngredientName;

                /**
                 * Gets the value of the drugCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDrugCode() {
                    return drugCode;
                }

                /**
                 * Sets the value of the drugCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDrugCode(String value) {
                    this.drugCode = value;
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
                 * Gets the value of the activeIngredientName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getActiveIngredientName() {
                    return activeIngredientName;
                }

                /**
                 * Sets the value of the activeIngredientName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setActiveIngredientName(String value) {
                    this.activeIngredientName = value;
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
     *         &lt;element name="DrugToAvoid" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DrugCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RiskLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        protected List<DSSResponse.DrugsToAvoid.DrugToAvoid> drugToAvoid;

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
         * {@link DSSResponse.DrugsToAvoid.DrugToAvoid }
         * 
         * 
         */
        public List<DSSResponse.DrugsToAvoid.DrugToAvoid> getDrugToAvoid() {
            if (drugToAvoid == null) {
                drugToAvoid = new ArrayList<DSSResponse.DrugsToAvoid.DrugToAvoid>();
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
         *         &lt;element name="DrugCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RiskLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
            "drugCode",
            "drugName",
            "riskLevel"
        })
        public static class DrugToAvoid {

            @XmlElement(name = "DrugCode", required = true)
            protected String drugCode;
            @XmlElement(name = "DrugName")
            protected String drugName;
            @XmlElement(name = "RiskLevel")
            protected Integer riskLevel;

            /**
             * Gets the value of the drugCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDrugCode() {
                return drugCode;
            }

            /**
             * Sets the value of the drugCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDrugCode(String value) {
                this.drugCode = value;
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
             * Gets the value of the riskLevel property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getRiskLevel() {
                return riskLevel;
            }

            /**
             * Sets the value of the riskLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setRiskLevel(Integer value) {
                this.riskLevel = value;
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
     *         &lt;element name="ExperimentalDataSet" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DataSetName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DataSetText" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        protected List<DSSResponse.ExperimentalDataSets.ExperimentalDataSet> experimentalDataSet;

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
         * {@link DSSResponse.ExperimentalDataSets.ExperimentalDataSet }
         * 
         * 
         */
        public List<DSSResponse.ExperimentalDataSets.ExperimentalDataSet> getExperimentalDataSet() {
            if (experimentalDataSet == null) {
                experimentalDataSet = new ArrayList<DSSResponse.ExperimentalDataSets.ExperimentalDataSet>();
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
         *         &lt;element name="DataSetText" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "dataSetText"
        })
        public static class ExperimentalDataSet {

            @XmlElement(name = "DataSetName", required = true)
            protected String dataSetName;
            @XmlElement(name = "DataSetText", required = true)
            protected String dataSetText;

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
     *         &lt;element name="GuidelineLink" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="GuidelineURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="GuidelineTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="GuidelinePriority">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         &lt;enumeration value="0"/>
     *                         &lt;enumeration value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="GuidelineID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "guidelineLink"
    })
    public static class GuidelineLinks {

        @XmlElement(name = "GuidelineLink", required = true)
        protected List<DSSResponse.GuidelineLinks.GuidelineLink> guidelineLink;

        /**
         * Gets the value of the guidelineLink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guidelineLink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuidelineLink().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DSSResponse.GuidelineLinks.GuidelineLink }
         * 
         * 
         */
        public List<DSSResponse.GuidelineLinks.GuidelineLink> getGuidelineLink() {
            if (guidelineLink == null) {
                guidelineLink = new ArrayList<DSSResponse.GuidelineLinks.GuidelineLink>();
            }
            return this.guidelineLink;
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
         *         &lt;element name="GuidelineURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="GuidelineTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="GuidelinePriority">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="GuidelineID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "guidelineURL",
            "guidelineTitle",
            "guidelinePriority",
            "guidelineID",
            "diagnosisCode",
            "diagnosisName"
        })
        public static class GuidelineLink {

            @XmlElement(name = "GuidelineURL", required = true)
            protected String guidelineURL;
            @XmlElement(name = "GuidelineTitle", required = true)
            protected String guidelineTitle;
            @XmlElement(name = "GuidelinePriority")
            protected int guidelinePriority;
            @XmlElement(name = "GuidelineID", required = true)
            protected String guidelineID;
            @XmlElement(name = "DiagnosisCode", required = true)
            protected String diagnosisCode;
            @XmlElement(name = "DiagnosisName")
            protected String diagnosisName;

            /**
             * Gets the value of the guidelineURL property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGuidelineURL() {
                return guidelineURL;
            }

            /**
             * Sets the value of the guidelineURL property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGuidelineURL(String value) {
                this.guidelineURL = value;
            }

            /**
             * Gets the value of the guidelineTitle property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGuidelineTitle() {
                return guidelineTitle;
            }

            /**
             * Sets the value of the guidelineTitle property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGuidelineTitle(String value) {
                this.guidelineTitle = value;
            }

            /**
             * Gets the value of the guidelinePriority property.
             * 
             */
            public int getGuidelinePriority() {
                return guidelinePriority;
            }

            /**
             * Sets the value of the guidelinePriority property.
             * 
             */
            public void setGuidelinePriority(int value) {
                this.guidelinePriority = value;
            }

            /**
             * Gets the value of the guidelineID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGuidelineID() {
                return guidelineID;
            }

            /**
             * Sets the value of the guidelineID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGuidelineID(String value) {
                this.guidelineID = value;
            }

            /**
             * Gets the value of the diagnosisCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDiagnosisCode() {
                return diagnosisCode;
            }

            /**
             * Sets the value of the diagnosisCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDiagnosisCode(String value) {
                this.diagnosisCode = value;
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
     *         &lt;element name="Indication" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Drug">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="DrugCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Diagnosis">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="DiagnosisName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="IndicationLevel">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         &lt;enumeration value="0"/>
     *                         &lt;enumeration value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="IndicationText" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "indication"
    })
    public static class Indications {

        @XmlElement(name = "Indication", required = true)
        protected List<DSSResponse.Indications.Indication> indication;

        /**
         * Gets the value of the indication property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the indication property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIndication().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DSSResponse.Indications.Indication }
         * 
         * 
         */
        public List<DSSResponse.Indications.Indication> getIndication() {
            if (indication == null) {
                indication = new ArrayList<DSSResponse.Indications.Indication>();
            }
            return this.indication;
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
         *         &lt;element name="Drug">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="DrugCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Diagnosis">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="DiagnosisName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="IndicationLevel">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="IndicationText" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "drug",
            "diagnosis",
            "indicationLevel",
            "indicationText"
        })
        public static class Indication {

            @XmlElement(name = "Drug", required = true)
            protected DSSResponse.Indications.Indication.Drug drug;
            @XmlElement(name = "Diagnosis", required = true)
            protected DSSResponse.Indications.Indication.Diagnosis diagnosis;
            @XmlElement(name = "IndicationLevel")
            protected int indicationLevel;
            @XmlElement(name = "IndicationText", required = true)
            protected String indicationText;

            /**
             * Gets the value of the drug property.
             * 
             * @return
             *     possible object is
             *     {@link DSSResponse.Indications.Indication.Drug }
             *     
             */
            public DSSResponse.Indications.Indication.Drug getDrug() {
                return drug;
            }

            /**
             * Sets the value of the drug property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSResponse.Indications.Indication.Drug }
             *     
             */
            public void setDrug(DSSResponse.Indications.Indication.Drug value) {
                this.drug = value;
            }

            /**
             * Gets the value of the diagnosis property.
             * 
             * @return
             *     possible object is
             *     {@link DSSResponse.Indications.Indication.Diagnosis }
             *     
             */
            public DSSResponse.Indications.Indication.Diagnosis getDiagnosis() {
                return diagnosis;
            }

            /**
             * Sets the value of the diagnosis property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSResponse.Indications.Indication.Diagnosis }
             *     
             */
            public void setDiagnosis(DSSResponse.Indications.Indication.Diagnosis value) {
                this.diagnosis = value;
            }

            /**
             * Gets the value of the indicationLevel property.
             * 
             */
            public int getIndicationLevel() {
                return indicationLevel;
            }

            /**
             * Sets the value of the indicationLevel property.
             * 
             */
            public void setIndicationLevel(int value) {
                this.indicationLevel = value;
            }

            /**
             * Gets the value of the indicationText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIndicationText() {
                return indicationText;
            }

            /**
             * Sets the value of the indicationText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIndicationText(String value) {
                this.indicationText = value;
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
             *         &lt;element name="DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "diagnosisCode",
                "diagnosisName"
            })
            public static class Diagnosis {

                @XmlElement(name = "DiagnosisCode", required = true)
                protected String diagnosisCode;
                @XmlElement(name = "DiagnosisName")
                protected String diagnosisName;

                /**
                 * Gets the value of the diagnosisCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDiagnosisCode() {
                    return diagnosisCode;
                }

                /**
                 * Sets the value of the diagnosisCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDiagnosisCode(String value) {
                    this.diagnosisCode = value;
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
             *         &lt;element name="DrugCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "drugCode",
                "drugName"
            })
            public static class Drug {

                @XmlElement(name = "DrugCode", required = true)
                protected String drugCode;
                @XmlElement(name = "DrugName")
                protected String drugName;

                /**
                 * Gets the value of the drugCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDrugCode() {
                    return drugCode;
                }

                /**
                 * Sets the value of the drugCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDrugCode(String value) {
                    this.drugCode = value;
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
     *         &lt;element name="Interaction" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="InteractionText" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="InteractionLevel">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="C"/>
     *                         &lt;enumeration value="D"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Drug1">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="DrugCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Drug2">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="DrugCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="InteractionLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "interaction"
    })
    public static class Interactions {

        @XmlElement(name = "Interaction", required = true)
        protected List<DSSResponse.Interactions.Interaction> interaction;

        /**
         * Gets the value of the interaction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the interaction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInteraction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DSSResponse.Interactions.Interaction }
         * 
         * 
         */
        public List<DSSResponse.Interactions.Interaction> getInteraction() {
            if (interaction == null) {
                interaction = new ArrayList<DSSResponse.Interactions.Interaction>();
            }
            return this.interaction;
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
         *         &lt;element name="InteractionText" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="InteractionLevel">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="C"/>
         *               &lt;enumeration value="D"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Drug1">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="DrugCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Drug2">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="DrugCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="DrugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="InteractionLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "interactionText",
            "interactionLevel",
            "drug1",
            "drug2",
            "interactionLink"
        })
        public static class Interaction {

            @XmlElement(name = "InteractionText", required = true)
            protected String interactionText;
            @XmlElement(name = "InteractionLevel", required = true)
            protected String interactionLevel;
            @XmlElement(name = "Drug1", required = true)
            protected DSSResponse.Interactions.Interaction.Drug1 drug1;
            @XmlElement(name = "Drug2", required = true)
            protected DSSResponse.Interactions.Interaction.Drug2 drug2;
            @XmlElement(name = "InteractionLink")
            protected String interactionLink;

            /**
             * Gets the value of the interactionText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInteractionText() {
                return interactionText;
            }

            /**
             * Sets the value of the interactionText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInteractionText(String value) {
                this.interactionText = value;
            }

            /**
             * Gets the value of the interactionLevel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInteractionLevel() {
                return interactionLevel;
            }

            /**
             * Sets the value of the interactionLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInteractionLevel(String value) {
                this.interactionLevel = value;
            }

            /**
             * Gets the value of the drug1 property.
             * 
             * @return
             *     possible object is
             *     {@link DSSResponse.Interactions.Interaction.Drug1 }
             *     
             */
            public DSSResponse.Interactions.Interaction.Drug1 getDrug1() {
                return drug1;
            }

            /**
             * Sets the value of the drug1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSResponse.Interactions.Interaction.Drug1 }
             *     
             */
            public void setDrug1(DSSResponse.Interactions.Interaction.Drug1 value) {
                this.drug1 = value;
            }

            /**
             * Gets the value of the drug2 property.
             * 
             * @return
             *     possible object is
             *     {@link DSSResponse.Interactions.Interaction.Drug2 }
             *     
             */
            public DSSResponse.Interactions.Interaction.Drug2 getDrug2() {
                return drug2;
            }

            /**
             * Sets the value of the drug2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSResponse.Interactions.Interaction.Drug2 }
             *     
             */
            public void setDrug2(DSSResponse.Interactions.Interaction.Drug2 value) {
                this.drug2 = value;
            }

            /**
             * Gets the value of the interactionLink property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInteractionLink() {
                return interactionLink;
            }

            /**
             * Sets the value of the interactionLink property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInteractionLink(String value) {
                this.interactionLink = value;
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
             *         &lt;element name="DrugCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "drugCode",
                "drugName"
            })
            public static class Drug1 {

                @XmlElement(name = "DrugCode", required = true)
                protected String drugCode;
                @XmlElement(name = "DrugName")
                protected String drugName;

                /**
                 * Gets the value of the drugCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDrugCode() {
                    return drugCode;
                }

                /**
                 * Sets the value of the drugCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDrugCode(String value) {
                    this.drugCode = value;
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
             *         &lt;element name="DrugCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "drugCode",
                "drugName"
            })
            public static class Drug2 {

                @XmlElement(name = "DrugCode", required = true)
                protected String drugCode;
                @XmlElement(name = "DrugName")
                protected String drugName;

                /**
                 * Gets the value of the drugCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDrugCode() {
                    return drugCode;
                }

                /**
                 * Sets the value of the drugCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDrugCode(String value) {
                    this.drugCode = value;
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
     *         &lt;element name="RelevantBreakPoint" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ScriptID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="MessageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="MessageID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "relevantBreakPoint"
    })
    public static class RelevantBreakPoints {

        @XmlElement(name = "RelevantBreakPoint", required = true)
        protected List<DSSResponse.RelevantBreakPoints.RelevantBreakPoint> relevantBreakPoint;

        /**
         * Gets the value of the relevantBreakPoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the relevantBreakPoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRelevantBreakPoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DSSResponse.RelevantBreakPoints.RelevantBreakPoint }
         * 
         * 
         */
        public List<DSSResponse.RelevantBreakPoints.RelevantBreakPoint> getRelevantBreakPoint() {
            if (relevantBreakPoint == null) {
                relevantBreakPoint = new ArrayList<DSSResponse.RelevantBreakPoints.RelevantBreakPoint>();
            }
            return this.relevantBreakPoint;
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
         *         &lt;element name="MessageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="MessageID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
            "messageNumber",
            "messageID",
            "value"
        })
        public static class RelevantBreakPoint {

            @XmlElement(name = "ScriptID", required = true)
            protected String scriptID;
            @XmlElement(name = "MessageNumber")
            protected Integer messageNumber;
            @XmlElement(name = "MessageID")
            protected Integer messageID;
            @XmlElement(name = "Value")
            protected boolean value;

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
             * Gets the value of the messageNumber property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMessageNumber() {
                return messageNumber;
            }

            /**
             * Sets the value of the messageNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMessageNumber(Integer value) {
                this.messageNumber = value;
            }

            /**
             * Gets the value of the messageID property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMessageID() {
                return messageID;
            }

            /**
             * Sets the value of the messageID property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMessageID(Integer value) {
                this.messageID = value;
            }

            /**
             * Gets the value of the value property.
             * 
             */
            public boolean isValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(boolean value) {
                this.value = value;
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
     *         &lt;element name="Reminder" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ScriptID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ReminderID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                   &lt;element name="ReminderShort">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="a" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *                                     &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ReminderLong">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="a" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *                                     &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ReminderNurse">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="a" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *                                     &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ReminderPatient">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="a" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *                                     &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ReminderLevel">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         &lt;enumeration value="0"/>
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ReminderType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="SuggestedActions" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="SuggestedAction" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;group ref="{}CodeGroup"/>
     *                                       &lt;group ref="{}TimeStampsGroup"/>
     *                                       &lt;element name="ActionType" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="ActionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "reminder"
    })
    public static class Reminders {

        @XmlElement(name = "Reminder", required = true)
        protected List<DSSResponse.Reminders.Reminder> reminder;

        /**
         * Gets the value of the reminder property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reminder property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReminder().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DSSResponse.Reminders.Reminder }
         * 
         * 
         */
        public List<DSSResponse.Reminders.Reminder> getReminder() {
            if (reminder == null) {
                reminder = new ArrayList<DSSResponse.Reminders.Reminder>();
            }
            return this.reminder;
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
         *         &lt;element name="ScriptID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ReminderID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *         &lt;element name="ReminderShort">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="a" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
         *                           &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ReminderLong">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="a" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
         *                           &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ReminderNurse">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="a" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
         *                           &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ReminderPatient">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="a" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
         *                           &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ReminderLevel">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ReminderType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="SuggestedActions" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="SuggestedAction" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;group ref="{}CodeGroup"/>
         *                             &lt;group ref="{}TimeStampsGroup"/>
         *                             &lt;element name="ActionType" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="ActionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "scriptID",
            "reminderID",
            "reminderShort",
            "reminderLong",
            "reminderNurse",
            "reminderPatient",
            "reminderLevel",
            "reminderType",
            "suggestedActions"
        })
        public static class Reminder {

            @XmlElement(name = "ScriptID")
            protected String scriptID;
            @XmlElement(name = "ReminderID")
            protected BigInteger reminderID;
            @XmlElement(name = "ReminderShort", required = true)
            protected DSSResponse.Reminders.Reminder.ReminderShort reminderShort;
            @XmlElement(name = "ReminderLong", required = true)
            protected DSSResponse.Reminders.Reminder.ReminderLong reminderLong;
            @XmlElement(name = "ReminderNurse", required = true)
            protected DSSResponse.Reminders.Reminder.ReminderNurse reminderNurse;
            @XmlElement(name = "ReminderPatient", required = true)
            protected DSSResponse.Reminders.Reminder.ReminderPatient reminderPatient;
            @XmlElement(name = "ReminderLevel")
            protected int reminderLevel;
            @XmlElement(name = "ReminderType")
            protected Integer reminderType;
            @XmlElement(name = "SuggestedActions")
            protected DSSResponse.Reminders.Reminder.SuggestedActions suggestedActions;

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
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getReminderID() {
                return reminderID;
            }

            /**
             * Sets the value of the reminderID property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setReminderID(BigInteger value) {
                this.reminderID = value;
            }

            /**
             * Gets the value of the reminderShort property.
             * 
             * @return
             *     possible object is
             *     {@link DSSResponse.Reminders.Reminder.ReminderShort }
             *     
             */
            public DSSResponse.Reminders.Reminder.ReminderShort getReminderShort() {
                return reminderShort;
            }

            /**
             * Sets the value of the reminderShort property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSResponse.Reminders.Reminder.ReminderShort }
             *     
             */
            public void setReminderShort(DSSResponse.Reminders.Reminder.ReminderShort value) {
                this.reminderShort = value;
            }

            /**
             * Gets the value of the reminderLong property.
             * 
             * @return
             *     possible object is
             *     {@link DSSResponse.Reminders.Reminder.ReminderLong }
             *     
             */
            public DSSResponse.Reminders.Reminder.ReminderLong getReminderLong() {
                return reminderLong;
            }

            /**
             * Sets the value of the reminderLong property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSResponse.Reminders.Reminder.ReminderLong }
             *     
             */
            public void setReminderLong(DSSResponse.Reminders.Reminder.ReminderLong value) {
                this.reminderLong = value;
            }

            /**
             * Gets the value of the reminderNurse property.
             * 
             * @return
             *     possible object is
             *     {@link DSSResponse.Reminders.Reminder.ReminderNurse }
             *     
             */
            public DSSResponse.Reminders.Reminder.ReminderNurse getReminderNurse() {
                return reminderNurse;
            }

            /**
             * Sets the value of the reminderNurse property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSResponse.Reminders.Reminder.ReminderNurse }
             *     
             */
            public void setReminderNurse(DSSResponse.Reminders.Reminder.ReminderNurse value) {
                this.reminderNurse = value;
            }

            /**
             * Gets the value of the reminderPatient property.
             * 
             * @return
             *     possible object is
             *     {@link DSSResponse.Reminders.Reminder.ReminderPatient }
             *     
             */
            public DSSResponse.Reminders.Reminder.ReminderPatient getReminderPatient() {
                return reminderPatient;
            }

            /**
             * Sets the value of the reminderPatient property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSResponse.Reminders.Reminder.ReminderPatient }
             *     
             */
            public void setReminderPatient(DSSResponse.Reminders.Reminder.ReminderPatient value) {
                this.reminderPatient = value;
            }

            /**
             * Gets the value of the reminderLevel property.
             * 
             */
            public int getReminderLevel() {
                return reminderLevel;
            }

            /**
             * Sets the value of the reminderLevel property.
             * 
             */
            public void setReminderLevel(int value) {
                this.reminderLevel = value;
            }

            /**
             * Gets the value of the reminderType property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getReminderType() {
                return reminderType;
            }

            /**
             * Sets the value of the reminderType property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setReminderType(Integer value) {
                this.reminderType = value;
            }

            /**
             * Gets the value of the suggestedActions property.
             * 
             * @return
             *     possible object is
             *     {@link DSSResponse.Reminders.Reminder.SuggestedActions }
             *     
             */
            public DSSResponse.Reminders.Reminder.SuggestedActions getSuggestedActions() {
                return suggestedActions;
            }

            /**
             * Sets the value of the suggestedActions property.
             * 
             * @param value
             *     allowed object is
             *     {@link DSSResponse.Reminders.Reminder.SuggestedActions }
             *     
             */
            public void setSuggestedActions(DSSResponse.Reminders.Reminder.SuggestedActions value) {
                this.suggestedActions = value;
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
             *         &lt;element name="a" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
             *                 &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
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
                "content"
            })
            public static class ReminderLong {

                @XmlElementRef(name = "a", type = JAXBElement.class, required = false)
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
                 * {@link String }
                 * {@link JAXBElement }{@code <}{@link DSSResponse.Reminders.Reminder.ReminderLong.A }{@code >}
                 * 
                 * 
                 */
                public List<Serializable> getContent() {
                    if (content == null) {
                        content = new ArrayList<Serializable>();
                    }
                    return this.content;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
                 *       &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class A {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "href")
                    @XmlSchemaType(name = "anyURI")
                    protected String href;
                    @XmlAttribute(name = "target")
                    protected String target;

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
                     * Gets the value of the href property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getHref() {
                        return href;
                    }

                    /**
                     * Sets the value of the href property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setHref(String value) {
                        this.href = value;
                    }

                    /**
                     * Gets the value of the target property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTarget() {
                        return target;
                    }

                    /**
                     * Sets the value of the target property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTarget(String value) {
                        this.target = value;
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
             *         &lt;element name="a" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
             *                 &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
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
                "content"
            })
            public static class ReminderNurse {

                @XmlElementRef(name = "a", type = JAXBElement.class, required = false)
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
                 * {@link JAXBElement }{@code <}{@link DSSResponse.Reminders.Reminder.ReminderNurse.A }{@code >}
                 * {@link String }
                 * 
                 * 
                 */
                public List<Serializable> getContent() {
                    if (content == null) {
                        content = new ArrayList<Serializable>();
                    }
                    return this.content;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
                 *       &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class A {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "href")
                    @XmlSchemaType(name = "anyURI")
                    protected String href;
                    @XmlAttribute(name = "target")
                    protected String target;

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
                     * Gets the value of the href property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getHref() {
                        return href;
                    }

                    /**
                     * Sets the value of the href property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setHref(String value) {
                        this.href = value;
                    }

                    /**
                     * Gets the value of the target property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTarget() {
                        return target;
                    }

                    /**
                     * Sets the value of the target property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTarget(String value) {
                        this.target = value;
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
             *         &lt;element name="a" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
             *                 &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
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
                "content"
            })
            public static class ReminderPatient {

                @XmlElementRef(name = "a", type = JAXBElement.class, required = false)
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
                 * {@link JAXBElement }{@code <}{@link DSSResponse.Reminders.Reminder.ReminderPatient.A }{@code >}
                 * {@link String }
                 * 
                 * 
                 */
                public List<Serializable> getContent() {
                    if (content == null) {
                        content = new ArrayList<Serializable>();
                    }
                    return this.content;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
                 *       &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class A {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "href")
                    @XmlSchemaType(name = "anyURI")
                    protected String href;
                    @XmlAttribute(name = "target")
                    protected String target;

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
                     * Gets the value of the href property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getHref() {
                        return href;
                    }

                    /**
                     * Sets the value of the href property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setHref(String value) {
                        this.href = value;
                    }

                    /**
                     * Gets the value of the target property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTarget() {
                        return target;
                    }

                    /**
                     * Sets the value of the target property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTarget(String value) {
                        this.target = value;
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
             *         &lt;element name="a" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
             *                 &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
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
                "content"
            })
            public static class ReminderShort {

                @XmlElementRef(name = "a", type = JAXBElement.class, required = false)
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
                 * {@link JAXBElement }{@code <}{@link DSSResponse.Reminders.Reminder.ReminderShort.A }{@code >}
                 * {@link String }
                 * 
                 * 
                 */
                public List<Serializable> getContent() {
                    if (content == null) {
                        content = new ArrayList<Serializable>();
                    }
                    return this.content;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
                 *       &lt;attribute name="target" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class A {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "href")
                    @XmlSchemaType(name = "anyURI")
                    protected String href;
                    @XmlAttribute(name = "target")
                    protected String target;

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
                     * Gets the value of the href property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getHref() {
                        return href;
                    }

                    /**
                     * Sets the value of the href property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setHref(String value) {
                        this.href = value;
                    }

                    /**
                     * Gets the value of the target property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTarget() {
                        return target;
                    }

                    /**
                     * Sets the value of the target property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTarget(String value) {
                        this.target = value;
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
             *         &lt;element name="SuggestedAction" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;group ref="{}CodeGroup"/>
             *                   &lt;group ref="{}TimeStampsGroup"/>
             *                   &lt;element name="ActionType" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="ActionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "suggestedAction"
            })
            public static class SuggestedActions {

                @XmlElement(name = "SuggestedAction", required = true)
                protected List<DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction> suggestedAction;

                /**
                 * Gets the value of the suggestedAction property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the suggestedAction property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSuggestedAction().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction }
                 * 
                 * 
                 */
                public List<DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction> getSuggestedAction() {
                    if (suggestedAction == null) {
                        suggestedAction = new ArrayList<DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction>();
                    }
                    return this.suggestedAction;
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
                 *         &lt;element name="ActionType" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="ActionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "actionType",
                    "actionText"
                })
                public static class SuggestedAction {

                    @XmlElement(name = "CodeValue", required = true)
                    protected String codeValue;
                    @XmlElement(name = "CodeSystem", required = true)
                    protected String codeSystem;
                    @XmlElement(name = "CodeSystemVersion")
                    protected String codeSystemVersion;
                    @XmlElement(name = "StartStamp")
                    protected DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp startStamp;
                    @XmlElement(name = "EndStamp")
                    protected DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp endStamp;
                    @XmlElement(name = "PointStamp")
                    protected DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp pointStamp;
                    @XmlElement(name = "ActionType")
                    protected int actionType;
                    @XmlElement(name = "ActionText")
                    protected String actionText;

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
                     *     {@link DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                     *     
                     */
                    public DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp getStartStamp() {
                        return startStamp;
                    }

                    /**
                     * Sets the value of the startStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp }
                     *     
                     */
                    public void setStartStamp(DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.StartStamp value) {
                        this.startStamp = value;
                    }

                    /**
                     * Gets the value of the endStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                     *     
                     */
                    public DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp getEndStamp() {
                        return endStamp;
                    }

                    /**
                     * Sets the value of the endStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp }
                     *     
                     */
                    public void setEndStamp(DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.EndStamp value) {
                        this.endStamp = value;
                    }

                    /**
                     * Gets the value of the pointStamp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                     *     
                     */
                    public DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp getPointStamp() {
                        return pointStamp;
                    }

                    /**
                     * Sets the value of the pointStamp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp }
                     *     
                     */
                    public void setPointStamp(DSSResponse.Reminders.Reminder.SuggestedActions.SuggestedAction.PointStamp value) {
                        this.pointStamp = value;
                    }

                    /**
                     * Gets the value of the actionType property.
                     * 
                     */
                    public int getActionType() {
                        return actionType;
                    }

                    /**
                     * Sets the value of the actionType property.
                     * 
                     */
                    public void setActionType(int value) {
                        this.actionType = value;
                    }

                    /**
                     * Gets the value of the actionText property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getActionText() {
                        return actionText;
                    }

                    /**
                     * Sets the value of the actionText property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setActionText(String value) {
                        this.actionText = value;
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
                     *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                     *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
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
                        "endDate",
                        "endTime"
                    })
                    public static class EndStamp {

                        @XmlElementRef(name = "EndDate", type = JAXBElement.class, required = false)
                        protected JAXBElement<XMLGregorianCalendar> endDate;
                        @XmlElementRef(name = "EndTime", type = JAXBElement.class, required = false)
                        protected JAXBElement<XMLGregorianCalendar> endTime;

                        /**
                         * Gets the value of the endDate property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                         *     
                         */
                        public JAXBElement<XMLGregorianCalendar> getEndDate() {
                            return endDate;
                        }

                        /**
                         * Sets the value of the endDate property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                         *     
                         */
                        public void setEndDate(JAXBElement<XMLGregorianCalendar> value) {
                            this.endDate = value;
                        }

                        /**
                         * Gets the value of the endTime property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                         *     
                         */
                        public JAXBElement<XMLGregorianCalendar> getEndTime() {
                            return endTime;
                        }

                        /**
                         * Sets the value of the endTime property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                         *     
                         */
                        public void setEndTime(JAXBElement<XMLGregorianCalendar> value) {
                            this.endTime = value;
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
                     *         &lt;element name="PointDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                     *         &lt;element name="PointTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
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
                        "pointDate",
                        "pointTime"
                    })
                    public static class PointStamp {

                        @XmlElementRef(name = "PointDate", type = JAXBElement.class, required = false)
                        protected JAXBElement<XMLGregorianCalendar> pointDate;
                        @XmlElementRef(name = "PointTime", type = JAXBElement.class, required = false)
                        protected JAXBElement<XMLGregorianCalendar> pointTime;

                        /**
                         * Gets the value of the pointDate property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                         *     
                         */
                        public JAXBElement<XMLGregorianCalendar> getPointDate() {
                            return pointDate;
                        }

                        /**
                         * Sets the value of the pointDate property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                         *     
                         */
                        public void setPointDate(JAXBElement<XMLGregorianCalendar> value) {
                            this.pointDate = value;
                        }

                        /**
                         * Gets the value of the pointTime property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                         *     
                         */
                        public JAXBElement<XMLGregorianCalendar> getPointTime() {
                            return pointTime;
                        }

                        /**
                         * Sets the value of the pointTime property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                         *     
                         */
                        public void setPointTime(JAXBElement<XMLGregorianCalendar> value) {
                            this.pointTime = value;
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
                     *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                     *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
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
                        "startDate",
                        "startTime"
                    })
                    public static class StartStamp {

                        @XmlElementRef(name = "StartDate", type = JAXBElement.class, required = false)
                        protected JAXBElement<XMLGregorianCalendar> startDate;
                        @XmlElementRef(name = "StartTime", type = JAXBElement.class, required = false)
                        protected JAXBElement<XMLGregorianCalendar> startTime;

                        /**
                         * Gets the value of the startDate property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                         *     
                         */
                        public JAXBElement<XMLGregorianCalendar> getStartDate() {
                            return startDate;
                        }

                        /**
                         * Sets the value of the startDate property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                         *     
                         */
                        public void setStartDate(JAXBElement<XMLGregorianCalendar> value) {
                            this.startDate = value;
                        }

                        /**
                         * Gets the value of the startTime property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                         *     
                         */
                        public JAXBElement<XMLGregorianCalendar> getStartTime() {
                            return startTime;
                        }

                        /**
                         * Sets the value of the startTime property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                         *     
                         */
                        public void setStartTime(JAXBElement<XMLGregorianCalendar> value) {
                            this.startTime = value;
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
     *         &lt;element name="DSSVersion" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="QueryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ElapsedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DebugMessages" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DebugMessage" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Exceptions" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Exception" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "dssVersion",
        "queryID",
        "elapsedTime",
        "debugMessages",
        "exceptions"
    })
    public static class System {

        @XmlElement(name = "DSSVersion")
        protected Object dssVersion;
        @XmlElement(name = "QueryID")
        protected String queryID;
        @XmlElement(name = "ElapsedTime")
        protected String elapsedTime;
        @XmlElement(name = "DebugMessages")
        protected DSSResponse.System.DebugMessages debugMessages;
        @XmlElement(name = "Exceptions")
        protected DSSResponse.System.Exceptions exceptions;

        /**
         * Gets the value of the dssVersion property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getDSSVersion() {
            return dssVersion;
        }

        /**
         * Sets the value of the dssVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setDSSVersion(Object value) {
            this.dssVersion = value;
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
         * Gets the value of the elapsedTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getElapsedTime() {
            return elapsedTime;
        }

        /**
         * Sets the value of the elapsedTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setElapsedTime(String value) {
            this.elapsedTime = value;
        }

        /**
         * Gets the value of the debugMessages property.
         * 
         * @return
         *     possible object is
         *     {@link DSSResponse.System.DebugMessages }
         *     
         */
        public DSSResponse.System.DebugMessages getDebugMessages() {
            return debugMessages;
        }

        /**
         * Sets the value of the debugMessages property.
         * 
         * @param value
         *     allowed object is
         *     {@link DSSResponse.System.DebugMessages }
         *     
         */
        public void setDebugMessages(DSSResponse.System.DebugMessages value) {
            this.debugMessages = value;
        }

        /**
         * Gets the value of the exceptions property.
         * 
         * @return
         *     possible object is
         *     {@link DSSResponse.System.Exceptions }
         *     
         */
        public DSSResponse.System.Exceptions getExceptions() {
            return exceptions;
        }

        /**
         * Sets the value of the exceptions property.
         * 
         * @param value
         *     allowed object is
         *     {@link DSSResponse.System.Exceptions }
         *     
         */
        public void setExceptions(DSSResponse.System.Exceptions value) {
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
         *         &lt;element name="DebugMessage" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
            "debugMessage"
        })
        public static class DebugMessages {

            @XmlElement(name = "DebugMessage", required = true)
            protected List<String> debugMessage;

            /**
             * Gets the value of the debugMessage property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the debugMessage property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDebugMessage().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getDebugMessage() {
                if (debugMessage == null) {
                    debugMessage = new ArrayList<String>();
                }
                return this.debugMessage;
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
         *         &lt;element name="Exception" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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

            @XmlElement(name = "Exception", required = true)
            protected List<String> exception;

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
             * {@link String }
             * 
             * 
             */
            public List<String> getException() {
                if (exception == null) {
                    exception = new ArrayList<String>();
                }
                return this.exception;
            }

        }

    }

}
