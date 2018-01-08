package today.smarthealthcare.ppv1.persistence.mapper;

import today.smarthealthcare.ppv1.dto.classifier.ClassifierDto;
import today.smarthealthcare.ppv1.dto.classifier.IClassifierWithUnit;
import today.smarthealthcare.ppv1.persistence.model.classifier.Classifier;
import today.smarthealthcare.ppv1.persistence.model.classifier.ClassifierId;
import today.smarthealthcare.ppv1.persistence.model.classifier.ClassifierWithUnit;
import org.dozer.DozerEventListener;
import org.dozer.event.DozerEvent;
import org.springframework.stereotype.Component;

import today.smarthealthcare.ppv1.persistence.model.classifier.Classifier;
import today.smarthealthcare.ppv1.persistence.model.classifier.ClassifierId;

/**
 * Dozer event listener for hacking classifier values
 *
 * @author: Vadim Nesmashnov
 */
@Component
public class ClassifierDoezerEventListener implements DozerEventListener {
    @Override
    public void mappingStarted(DozerEvent dozerEvent) {

    }

    @Override
    public void preWritingDestinationValue(DozerEvent dozerEvent) {

    }

    @Override
    public void postWritingDestinationValue(DozerEvent dozerEvent) {
        if (dozerEvent.getDestinationValue() instanceof Classifier) {
            ClassifierDto classifierDto = (ClassifierDto) dozerEvent.getFieldMap().getSrcFieldValue(dozerEvent.getSourceObject());
            if (classifierDto.getOriginalObject() != null && classifierDto.getOriginalObject().getCode() != null) {
                Classifier classifier = (Classifier) dozerEvent.getDestinationValue();
                ClassifierId classifierId = new ClassifierId(classifierDto.getOriginalObject().getCode(), classifierDto.getOriginalObject().getName());
                classifier.setId(classifierId);

//                if (dozerEvent.getDestinationValue() instanceof ClassifierWithUnit) {
//                    ClassifierWithUnit classifierWithUnit = (ClassifierWithUnit) dozerEvent.getDestinationValue();
//                    classifierWithUnit.setUnit(((IClassifierWithUnit)classifierDto.getOriginalObject()).getUnit());
//                }
            }
        }

    }

    @Override
    public void mappingFinished(DozerEvent dozerEvent) {
    }
}
