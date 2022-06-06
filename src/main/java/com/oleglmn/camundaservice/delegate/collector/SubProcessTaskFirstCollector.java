package com.oleglmn.camundaservice.delegate.collector;

import static com.oleglmn.camundaservice.delegate.CamundaVariables.CAMUNDA_GO_TO_TASK2_KEY;
import static com.oleglmn.camundaservice.delegate.CamundaVariables.CAMUNDA_MESSAGE_KEY;

import com.oleglmn.camundaservice.delegate.AbstractDelegate;
import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SubProcessTaskFirstCollector extends AbstractDelegate {

    @Override
    public void startExecute(DelegateExecution delegateExecution) {

        delegateExecution.setVariable(CAMUNDA_GO_TO_TASK2_KEY, false);
        delegateExecution.setVariable(CAMUNDA_MESSAGE_KEY, "Default");

    }
}
