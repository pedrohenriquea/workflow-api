package com.pedroamaral.workflowapi.domain;

import com.pedroamaral.workflowapi.core.workflow.StepWorkflow;
import com.pedroamaral.workflowapi.core.workflow.models.Context;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdicionarPeraStepWorkflow implements StepWorkflow<List<String>, Context, List<String>> {

    @Override
    public List<String> execute(List<String> input, Context context) {
        input.add("Pera");
        return input;
    }
}
