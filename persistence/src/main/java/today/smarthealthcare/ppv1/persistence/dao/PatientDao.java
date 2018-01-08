package today.smarthealthcare.ppv1.persistence.dao;

import org.springframework.stereotype.Component;

/**
 * @author: Vadim Nesmashnov
 */
@Component
public class PatientDao extends AbstractDao {

    public void changePassword (Long patientId, String password) {
        String sql = "UPDATE PATIENTS SET password = ? WHERE ID = ?";

        jdbcTemplate.update(sql, new Object[] {password, patientId});
    }

}
