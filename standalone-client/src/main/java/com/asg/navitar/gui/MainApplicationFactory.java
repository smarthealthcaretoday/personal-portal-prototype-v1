package today.smarthealthcare.ppv1.gui;

import today.smarthealthcare.ppv1.gui.main.MainFormController;
import javafx.fxml.FXMLLoader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpComponentsHttpInvokerRequestExecutor;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

import java.io.IOException;

@Configuration
public class MainApplicationFactory {

//    @Bean
//    public PatientDataImporterFacade patientDataImporterService() {
//        String serverUrl = "http://localhost:8080/server/patient_data_importer.service";
//        HttpInvokerProxyFactoryBean factory = new HttpInvokerProxyFactoryBean();
//        factory.setServiceUrl(serverUrl);
//        factory.setServiceInterface(PatientDataImporterFacade.class);
//        factory.setHttpInvokerRequestExecutor(new HttpComponentsHttpInvokerRequestExecutor());
//        factory.afterPropertiesSet();
//        return (PatientDataImporterFacade) factory.getObject();
//    }
//
//    @Bean(initMethod = "init")
//    public MainFormController loadMainForm(){
//        return loadForm("/fxml/main.fxml");
//    }
//
//    private <T> T loadForm(String fxmlFile) {
//        FXMLLoader fxmlLoader = new FXMLLoader();
//        try {
//            fxmlLoader.load(getClass().getResourceAsStream(fxmlFile));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return (T) fxmlLoader.getController();
//    }
}
