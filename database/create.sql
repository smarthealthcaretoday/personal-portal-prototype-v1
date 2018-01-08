/**
  Patients
 */
CREATE TABLE PATIENTS (
  ID        BIGINT NOT NULL AUTO_INCREMENT,
  LEGALCODE VARCHAR(20),
  NAME      VARCHAR(255),
  SURNAME   VARCHAR(255),
  ADDRESS   VARCHAR(255),
  PHONE     VARCHAR(30),
  EMAIL     VARCHAR(50),
  BIRTHDATE DATETIME,
  GENDER    ENUM ('MALE', 'FEMALE'),
  SMOKING   TINYINT(1) DEFAULT 0,
  PREGNANCY TINYINT(1) DEFAULT 0,
  LACTATION TINYINT(1) DEFAULT 0,
  PASSWORD  VARCHAR(255),
  ROLE      VARCHAR(45),
  PRIMARY KEY (ID) USING BTREE
)
  ENGINE =InnoDB;

ALTER TABLE PATIENTS ADD UNIQUE INDEX patient_email (EMAIL);

/**
  Diagnosis classifiers
 */
CREATE TABLE DIAGNOSISCLASSIFIERS (
  CODE VARCHAR(50) NOT NULL,
  NAME VARCHAR(100),
  PRIMARY KEY (CODE) USING BTREE
)
  ENGINE =INNODB;

ALTER TABLE DIAGNOSISCLASSIFIERS ADD INDEX name (NAME);

/**
  Measurement classifiers
 */
CREATE TABLE MEASUREMENTCLASSIFIERS (
  CODE VARCHAR(50) NOT NULL,
  NAME VARCHAR(100),
  UNIT VARCHAR(30),
  PRIMARY KEY (CODE) USING BTREE
)
  ENGINE =INNODB;

ALTER TABLE MEASUREMENTCLASSIFIERS ADD INDEX name (NAME);

/**
  Medication classifiers
 */
CREATE TABLE MEDICATIONCLASSIFIERS (
  CODE VARCHAR(50) NOT NULL,
  NAME VARCHAR(100),
  UNIT VARCHAR(30),
  PRIMARY KEY (CODE) USING BTREE
)
  ENGINE =INNODB;

ALTER TABLE MEDICATIONCLASSIFIERS ADD INDEX name (NAME);

/*
  Procedure classifiers
 */
CREATE TABLE PROCEDURECLASSIFIERS (
  CODE VARCHAR(50) NOT NULL,
  NAME VARCHAR(100),
  PRIMARY KEY (CODE) USING BTREE
)
  ENGINE =INNODB;

ALTER TABLE PROCEDURECLASSIFIERS ADD INDEX name (NAME);

/**
  Vaccine classifiers
 */
CREATE TABLE VACCINECLASSIFIERS (
  CODE VARCHAR(50) NOT NULL,
  NAME VARCHAR(100),
  UNIT VARCHAR(30),
  PRIMARY KEY (CODE) USING BTREE
)
  ENGINE =INNODB;

ALTER TABLE VACCINECLASSIFIERS ADD INDEX name (NAME);

/**
  Patient diagnoses
 */
CREATE TABLE PATIENTDIAGNOSES (
  ID                       BIGINT NOT NULL AUTO_INCREMENT,
  PATIENT_ID               BIGINT,
  DIAGNOSISCLASSIFIER_CODE VARCHAR(50),
  STARTDATE                DATETIME,
  ENDDATE                  DATETIME,
  PRIMARY KEY (ID) USING BTREE,
  FOREIGN KEY (PATIENT_ID) REFERENCES PATIENTS (ID),
  FOREIGN KEY (DIAGNOSISCLASSIFIER_CODE) REFERENCES DIAGNOSISCLASSIFIERS (CODE)
)
  ENGINE =INNODB;

/**
  Patient measurements
 */
CREATE TABLE PATIENTMEASUREMENTS (
  ID                         BIGINT NOT NULL AUTO_INCREMENT,
  PATIENT_ID                 BIGINT,
  MEASUREMENTCLASSIFIER_CODE VARCHAR(50),
  VALUE                      DOUBLE,
  DATE                       DATETIME,
  PRIMARY KEY (ID) USING BTREE,
  FOREIGN KEY (PATIENT_ID) REFERENCES PATIENTS (ID),
  FOREIGN KEY (MEASUREMENTCLASSIFIER_CODE) REFERENCES MEASUREMENTCLASSIFIERS (CODE)
)
  ENGINE =INNODB;

/**
  Patient medications
 */
CREATE TABLE PATIENTMEDICATIONS (
  ID                        BIGINT NOT NULL AUTO_INCREMENT,
  PATIENT_ID                BIGINT,
  MEDICATIONCLASSIFIER_CODE VARCHAR(50),
  STARTDATE                 DATETIME,
  ENDDATE                   DATETIME,
  STRENGTH                  VARCHAR(50),
  DOSAGE                    VARCHAR(50),
  PRIMARY KEY (ID) USING BTREE,
  FOREIGN KEY (PATIENT_ID) REFERENCES PATIENTS (ID),
  FOREIGN KEY (MEDICATIONCLASSIFIER_CODE) REFERENCES MEDICATIONCLASSIFIERS (CODE)
)
  ENGINE =INNODB;

/**
  Patient procedures
 */
CREATE TABLE PATIENTPROCEDURES (
  ID                       BIGINT NOT NULL AUTO_INCREMENT,
  PATIENT_ID               BIGINT,
  PROCEDURECLASSIFIER_CODE VARCHAR(50),
  DATE                     DATETIME,
  PRIMARY KEY (ID) USING BTREE,
  FOREIGN KEY (PATIENT_ID) REFERENCES PATIENTS (ID),
  FOREIGN KEY (PROCEDURECLASSIFIER_CODE) REFERENCES PROCEDURECLASSIFIERS (CODE)
)
  ENGINE =INNODB;

/**
  Patient vaccinations
 */
CREATE TABLE PATIENTVACCINATIONS (
  ID                     BIGINT NOT NULL AUTO_INCREMENT,
  PATIENT_ID             BIGINT,
  VACCINECLASSIFIER_CODE VARCHAR(50),
  STARTDATE              DATETIME,
  ENDDATE                DATETIME,
  STRENGTH               VARCHAR(50),
  DOSE                   VARCHAR(50),
  PRIMARY KEY (ID) USING BTREE,
  FOREIGN KEY (PATIENT_ID) REFERENCES PATIENTS (ID),
  FOREIGN KEY (VACCINECLASSIFIER_CODE) REFERENCES VACCINECLASSIFIERS (CODE)
)
  ENGINE =INNODB;

/**
  Drugs to avoid for patient
 */
CREATE TABLE PATIENTDRUGSTOAVOID (
  PATIENT_ID                BIGINT,
  MEDICATIONCLASSIFIER_CODE VARCHAR(50),
  PRIMARY KEY (PATIENT_ID, MEDICATIONCLASSIFIER_CODE) USING BTREE,
  FOREIGN KEY (PATIENT_ID) REFERENCES PATIENTS (ID),
  FOREIGN KEY (MEDICATIONCLASSIFIER_CODE) REFERENCES MEDICATIONCLASSIFIERS (CODE)
)
  ENGINE =INNODB;

/**
  Patient actions
 */
CREATE TABLE PATIENTACTIONS (
  ID         BIGINT NOT NULL AUTO_INCREMENT,
  DATE       DATETIME,
  PATIENT_ID BIGINT,
  ACTIONTYPE VARCHAR(30),
  DATA       TEXT,
  PRIMARY KEY (ID) USING BTREE
)
  ENGINE =InnoDB;

ALTER TABLE PATIENTACTIONS ADD INDEX patient_id (PATIENT_ID);


/**
  Health statement life style
 */
CREATE TABLE HEALTHSTATEMENTLIFESTYLE (
  ID                                BIGINT NOT NULL AUTO_INCREMENT,
  ALCOHOL                           BOOLEAN DEFAULT FALSE,
  ALCOHOLUNITS                      VARCHAR(255),
  SMOKING                           BOOLEAN DEFAULT FALSE,
  CIGARETTESPERDAY                  VARCHAR(255),
  SMOKINGYEARS                      VARCHAR(255),
  WHENQUITSMOKING                   VARCHAR(255),
  DRUGS                             BOOLEAN DEFAULT FALSE,
  DRUGSHOWOFTEN                     VARCHAR(255),
  MEDICATIONSTHATAFFECTCOORDINATION BOOLEAN DEFAULT FALSE,
  SLEEPHABITS                       VARCHAR(255),
  PRIMARY KEY (ID) USING BTREE
)
  ENGINE = InnoDB;

/**
  Health statement medical devices
 */
CREATE TABLE HEALTHSTATEMENTMEDICALDEVICES (
  ID                    BIGINT NOT NULL AUTO_INCREMENT,
  GLASSES               BOOLEAN DEFAULT FALSE,
  CONTACTLENSES         BOOLEAN DEFAULT FALSE,
  HEARINGAID            BOOLEAN DEFAULT FALSE,
  LEGPROSTHESIS         BOOLEAN DEFAULT FALSE,
  ARMPROSTHESIS         BOOLEAN DEFAULT FALSE,
  MOBILITYSUPPORTDEVICE BOOLEAN DEFAULT FALSE,
  SURGERY               BOOLEAN DEFAULT FALSE,
  OTHER                 VARCHAR(255),
  PRIMARY KEY (ID) USING BTREE
)
  ENGINE = InnoDB;

/**
  Health statement cardiovascular condition
 */
CREATE TABLE HEALTHSTATEMENTCARDIOVASCULARCONDITION (
  ID                BIGINT NOT NULL AUTO_INCREMENT,
  CHESTPAIN         BOOLEAN DEFAULT FALSE,
  HIGHBLOODPRESSURE BOOLEAN DEFAULT FALSE,
  HEARTATTACK       BOOLEAN DEFAULT FALSE,
  ARRYTHMIA         BOOLEAN DEFAULT FALSE,
  ANGIOPLASTY       BOOLEAN DEFAULT FALSE,
  PACEMAKER         BOOLEAN DEFAULT FALSE,
  HEARTSURGERY      BOOLEAN DEFAULT FALSE,
  OTHER             VARCHAR(255),
  PRIMARY KEY (ID) USING BTREE
)
  ENGINE = InnoDB;

/**
  Health statement allergies
 */
CREATE TABLE HEALTHSTATEMENTALLERGIES (
  ID           BIGINT NOT NULL AUTO_INCREMENT,
  DRUGS        VARCHAR(255),
  FOOD         VARCHAR(255),
  DOMESTICPETS VARCHAR(255),
  POLLEN       VARCHAR(255),
  OTHER        VARCHAR(255),
  PRIMARY KEY (ID) USING BTREE
)
  ENGINE = InnoDB;

/**
  Health statement working environments
 */
CREATE TABLE HEALTHSTATEMENTWORKINGENVIRONMENT (
  ID                      BIGINT NOT NULL AUTO_INCREMENT,
  RESTRICTIONS            BOOLEAN DEFAULT FALSE,
  RESTRICTIONSDESCRIPTION VARCHAR(255),
  HEALTHPROBLEMS          BOOLEAN DEFAULT FALSE,
  PRIMARY KEY (ID) USING BTREE
)
  ENGINE = InnoDB;

/**
  Patient health statement 
 */
CREATE TABLE HEALTHSTATEMENT (
  ID                         BIGINT NOT NULL AUTO_INCREMENT,
  PATIENT_ID                 BIGINT,
  LIFESTYLE_ID               BIGINT,
  MEDICALDEVICES_ID          BIGINT,
  CARDIOVASCULARCONDITION_ID BIGINT,
  WORKINGENVIRONMENT_ID      BIGINT,
  ALLERGIES_ID               BIGINT,
  PRIMARY KEY (ID) USING BTREE,
  FOREIGN KEY (PATIENT_ID) REFERENCES PATIENTS (ID),
  FOREIGN KEY (LIFESTYLE_ID) REFERENCES HEALTHSTATEMENTLIFESTYLE (ID),
  FOREIGN KEY (MEDICALDEVICES_ID) REFERENCES HEALTHSTATEMENTMEDICALDEVICES (ID),
  FOREIGN KEY (CARDIOVASCULARCONDITION_ID) REFERENCES HEALTHSTATEMENTCARDIOVASCULARCONDITION (ID),
  FOREIGN KEY (WORKINGENVIRONMENT_ID) REFERENCES HEALTHSTATEMENTWORKINGENVIRONMENT (ID),
  FOREIGN KEY (ALLERGIES_ID) REFERENCES HEALTHSTATEMENTALLERGIES (ID)
)
  ENGINE =InnoDB;

/**
  Patient notes
 */
CREATE TABLE NOTES (
  ID         BIGINT NOT NULL AUTO_INCREMENT,
  PATIENT_ID BIGINT,
  NOTES      TEXT,
  PRIMARY KEY (ID) USING BTREE,
  FOREIGN KEY (PATIENT_ID) REFERENCES PATIENTS (ID)
)
  ENGINE =InnoDB;






