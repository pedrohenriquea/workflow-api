package com.pedroamaral.workflowapi.domain;

import com.pedroamaral.workflowapi.core.workflow.StepWorkflow;
import com.pedroamaral.workflowapi.core.workflow.models.Context;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IniciarListaComprasStepWorkflow implements StepWorkflow<Void, Context, List<String>> {

    @Override
    public List<String> execute(Void input, Context context) {
        return new ArrayList<>();
    }
}
