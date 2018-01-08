package today.smarthealthcare.ppv1.persistence.dao;

import today.smarthealthcare.ppv1.dto.log.ActionType;
import today.smarthealthcare.ppv1.dto.log.PatientActionDto;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import today.smarthealthcare.ppv1.dto.log.ActionType;
import today.smarthealthcare.ppv1.dto.log.PatientActionDto;

/**
 * @author: Vadim Nesmashnov
 */
@Component
public class PatientActionDao extends AbstractDao {


    public void storePatientAction(Long patientId, ActionType actionType, String data) {
        String sql = "INSERT INTO PATIENTACTIONS (DATE, PATIENT_ID, ACTIONTYPE, DATA) VALUES (?, ?, ?, ?)";

        jdbcTemplate.update(sql, new Object[] {new Date(), patientId, actionType.name(), data});
    }

    public List<PatientActionDto> getAllActions() {
        String sql = "SELECT PA.ID, PA.DATE, PA.ACTIONTYPE, CONCAT (P.NAME, ' ', P.SURNAME) AS PATIENTNAME, PA.DATA FROM PATIENTACTIONS PA, PATIENTS P WHERE PA.PATIENT_ID = P.ID";

        return jdbcTemplate.query(sql, new PatientActionMapper());
    }

    private class PatientActionMapper implements RowMapper<PatientActionDto> {

        @Override
        public PatientActionDto mapRow(ResultSet resultSet, int rowNum) throws SQLException {
            PatientActionDto patientAction = new PatientActionDto();

            patientAction.setId(resultSet.getLong("ID"));
            patientAction.setDate(resultSet.getDate("DATE"));
            patientAction.setActionType(ActionType.valueOf(resultSet.getString("ACTIONTYPE")));
            patientAction.setPatientName(resultSet.getString("PATIENTNAME"));
            patientAction.setDetails(resultSet.getString("DATA"));

            return patientAction;
        }
    }
}
