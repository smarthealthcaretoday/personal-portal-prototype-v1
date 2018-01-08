package today.smarthealthcare.ppv1.gui.main;


import today.smarthealthcare.ppv1.dto.patient.PatientDto;
import today.smarthealthcare.ppv1.dto.patient.PatientHealthRecordDto;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MainFormController {

//    @FXML
//    private Parent root;
//
//    @FXML
//    private Button getData;
//
//    @FXML
//    private TextArea results;
//
//    @FXML
//    private BorderPane contentArea;
//
//    @Autowired
//    private PatientDataImporterFacade patientDataImporterFacade;
//
//    public Parent getView() {
//        return root;
//    }
//
//    public void init() {
//        getData.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                List<PatientHealthRecordDto> phrs = patientDataImporterFacade.getPatientHealthRecords(new PatientDto());
//                String res = "";
//                for (PatientHealthRecordDto phr : phrs) {
//                    res += phr.getId() + ";" + phr.getName() + "\n";
//                }
//                results.setText(res);
//            }
//        });
//    }
}
